package strategyTest;

import services.Priorizacao;
import org.junit.Test;
import static org.junit.Assert.*;
import StrategyMTH.*;

import stubs.DadosFalhaStub;
import stubs.FalhaStub;

/**
 * Classe de testes unitários para priorização de falhas por categoria e grau de
 * impacto. Os testes verificam as falhas e seu impacto em cada estado e os
 * delegam, garantindo que as regras de negócio das prioridades de falhas sejam
 * respeitadas.
 *
 * @since 2026-06-10
 * @version 1.0.1
 * @author Thalyson Gama
 */
public class StrategyTest {

    /**
     * Testa se o nivel retornado por priorização de impacto de produção com a
     * maquina parada retorna critico
     */
    @Test
    public void ct05_deveRetornarNivelCritico() {
        FalhaStub falha = new FalhaStub(new DadosFalhaStub());
        falha.setMaquinaParada(true);

        Priorizacao impacto = new Impacto(falha);
        PriorizarAutomatica motorImpacto = new PriorizarAutomatica(impacto);

        assertEquals("Nivel Critico", motorImpacto.retornarNivel());
    }

    /**
     * Testa se o nivel retornado por priorização de impacto de produção com a
     * maquina funcionando retorna alto
     */
    @Test
    public void ct06_deveRetornarNivelAlto() {
        FalhaStub falha = new FalhaStub(new DadosFalhaStub());
        falha.setMaquinaParada(false);

        Priorizacao impacto = new Impacto(falha);
        PriorizarAutomatica motorImpacto = new PriorizarAutomatica(impacto);

        assertEquals("Nivel Alto", motorImpacto.retornarNivel());
    }

    /**
     * Testa se o nivel retornado por priorização por SLa com 1 hora restante
     * retorna critico
     */
    @Test
    public void ct07_deveRetornarNivelCriticoPorSla() {
        FalhaStub falha = new FalhaStub(new DadosFalhaStub());
        falha.atualizarHorasRestantes(1);

        Priorizacao sla = new PriorizacaoSLA(falha.getHorasRestantesSLA());
        PriorizarAutomatica motorSLA = new PriorizarAutomatica(sla);

        assertEquals("Nivel Critico", motorSLA.retornarNivel());
    }

    /**
     * Testa se o nivel retornado por priorização por SLa com 24 horas restante
     * retorna critico
     */
    @Test
    public void ct08_deveRetornarNivelAltoPorSla() {
        FalhaStub falha = new FalhaStub(new DadosFalhaStub());

        falha.atualizarHorasRestantes(24);

        Priorizacao sla = new PriorizacaoSLA(falha.getHorasRestantesSLA());
        PriorizarAutomatica motorSLA = new PriorizarAutomatica(sla);

        assertEquals("Nivel Alto", motorSLA.retornarNivel());
    }

    /**
     * Testa se o nivel retornado por categoria retorna critico quando o tipo da
     * falha é eletrica
     */
    @Test
    public void ct09_deveRetornarNivelCriticoCategoria() {

        FalhaStub falha = new FalhaStub(new DadosFalhaStub("Eletrica"));

        Priorizacao categoria = new PriorizacaoCategoria(falha);
        PriorizarAutomatica motorCategoria = new PriorizarAutomatica(categoria);

        assertEquals("Nivel Critico", motorCategoria.retornarNivel());
    }

    /**
     * Testa se o nivel retornado por categoria retorna critico quando o tipo da
     * falha NÂO é eletrica
     */
    @Test
    public void ct10_deveRetornarNivelAltoCategoria() {

        FalhaStub falha = new FalhaStub(new DadosFalhaStub());

        Priorizacao categoria = new PriorizacaoCategoria(falha);
        PriorizarAutomatica motorCategoria = new PriorizarAutomatica(categoria);

        assertEquals("Nivel Alto", motorCategoria.retornarNivel());
    }
}
