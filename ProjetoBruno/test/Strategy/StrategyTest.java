package Strategy;

import org.junit.Test;
import static org.junit.Assert.*;
import StrategyMTH.*;
import domain.Falha;
import model.DadosFalha;

/**
 * Classe de testes unitários para prirização de falhas por categoria e grau de impacto.
 * Os testes verificam as falhas e seu impacto em cada estado e os delegam, garantindo que as regras de negócio das prioridades de falhas  sejam respeitadas
 * @since 2026-06-2026
 * @version 1.0.0
 * @author Thalyson Gama
 */ 
public class StrategyTest {
    
    @Test
    public void validandoAsTresEstrategias() {
        
        Falha falha = new Falha(new DadosFalha("Painel apagou", "Eletrica", 2));
        
       
        Priorizacao impacto = new Impacto(true); 
        PriorizarAutomatica motorImpacto = new PriorizarAutomatica(impacto);
       
        assertEquals("Nivel Critico", motorImpacto.retornarNivel());
        
        
        Priorizacao sla = new PriorizacaoSLA(1); 
        PriorizarAutomatica motorSLA = new PriorizarAutomatica(sla);
        assertEquals("Nivel Critico", motorSLA.retornarNivel());
        
        
        Priorizacao categoria = new PriorizacaoCategoria(falha); 
        PriorizarAutomatica motorCategoria = new PriorizarAutomatica(categoria);
        assertEquals("Nivel Critico", motorCategoria.retornarNivel());
    }
}