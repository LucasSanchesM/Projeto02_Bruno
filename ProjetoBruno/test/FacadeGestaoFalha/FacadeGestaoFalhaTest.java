package FacadeGestaoFalha;

import domain.Falha;
import org.junit.Test;                
import static org.junit.Assert.*;      
/**
 * Classe de testes unitarios estruturados para validação do fluxo de 
 * ciclo de vida de falhas através do padrão Facade.
 * * @author gabriel dias santiago
 * @version 1.0
 */

public class FacadeGestaoFalhaTest {
    
    /**
     *
     */
    public FacadeGestaoFalhaTest() {
    }
    
    /**
     * Caso de Teste: Validação de cenário válido de transição de estado
     * Verifica se o ciclo de vida da falha avança corretamente do estado inicial para o estado de análise técnica, ou seja, deve transitar de
     * ABERTO -> ANALISE.
     */
    
    @Test
    public void deveTransitarDeAbertoParaEmAnalise() {
        Falha falha = new Falha(new DadosFalha("Motor parouu", "Mêcanica", 1));
        falha.iniciarAnalise();
        
        assertEquals("EM_ANALISE", falha.getEstadoAtual());
        
    }
    
}