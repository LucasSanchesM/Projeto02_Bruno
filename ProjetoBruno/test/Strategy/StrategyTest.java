package Strategy;

import org.junit.Test;
import static org.junit.Assert.*;
import domain.Falha;
import model.DadosFalha;
import model.Prioridade;
import stubs.DadosFalhaStub;
import stubs.EstrategiaFake;
import stubs.FalhaStrategyStub;

/**
 * Classe de testes unitários para prirização de falhas por categoria e grau de impacto.
 * Os testes verificam as falhas e seu impacto em cada estado e os delegam, garantindo que as regras de negócio das prioridades de falhas  sejam respeitadas
 * @since 2026-06-2026
 * @version 1.0.0
 * @author Thalyson Gama
 */ 

public class StrategyTest {
    
   /**
     * CT-05: falha que interrompe a linha de producao deve ser CRITICA.
     */
    
    @Test
    public void ct05_impactoComMaquinaParadaDeveSerCritica() {
        
        FalhaStrategyStub falha = new FalhaStrategyStub(new DadosFalhaStub());
        falha.setMaquinaParada(true);

        Prioridade resultado = new PriorizacaoPorImpactoProducao().calcularPrioridade(falha);

        assertEquals(Prioridade.CRITICA, resultado);
    }
    
    /**
     * CT-06: janela de SLA abaixo do limite de seguranca deve ser ALTA.
     */
    
    @Test
    public void ct06_slaComPoucasHorasDeveSerAlta() {
        FalhaStrategyStub falha = new FalhaStrategyStub(new DadosFalhaStub());
        falha.setHorasRestantesSLAForcadas(1);

        Prioridade resultado = new PriorizacaoPorSLA().calcularPrioridade(falha);

        assertEquals(Prioridade.ALTA, resultado);
    }

     /**
     * CT-07: prova que a Falha DELEGA o calculo a estrategia injetada,
     * usando um spy (EstrategiaFake) que registra a chamada.
     */
    
    @Test
    public void ct07_falhaDeveDelegarCalculoParaEstrategiaInjetada() {
        FalhaStrategyStub falha = new FalhaStrategyStub(new DadosFalhaStub());
        EstrategiaFake fake = new EstrategiaFake();

        falha.setEstrategiaPriorizacao(fake);
        falha.aplicarPrioridadeAutomatica();

        assertTrue("A estrategia injetada deveria ter sido acionada",fake.isFoiChamada());
        assertEquals(Prioridade.MEDIA, falha.getPrioridade());
    }
    
    
    
}