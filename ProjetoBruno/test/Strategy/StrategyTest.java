package Strategy;

import org.junit.Test;
import static org.junit.Assert.*;
import StrategyMTH.*;
import domain.Falha; 
import stubs.DadosFalhaStub;
import stubs.FalhaStub;

/**
 * Classe de testes unitários para priorização de falhas por categoria e grau de impacto.
 * Os testes verificam as falhas e seu impacto em cada estado e os delegam, garantindo que as regras de negócio das prioridades de falhas sejam respeitadas.
 * @since 2026-06-10
 * @version 1.0.1
 * @author Thalyson Gama
 */ 
public class StrategyTest {
    
    @Test
    public void deveRetornarNivelCritico() {
        FalhaStub falha = new FalhaStub(new DadosFalhaStub());
        falha.setMaquinaParada(true);
        
        Priorizacao impacto = new Impacto(falha); 
        PriorizarAutomatica motorImpacto = new PriorizarAutomatica(impacto);
        
        assertEquals("Nivel Critico", motorImpacto.retornarNivel());
    }
    
    @Test
    public void deveRetornarNivelAlto() {
        FalhaStub falha = new FalhaStub(new DadosFalhaStub());
        falha.setMaquinaParada(false); 
        
        Priorizacao impacto = new Impacto(falha); 
        PriorizarAutomatica motorImpacto = new PriorizarAutomatica(impacto);
        
        assertEquals("Nivel Alto", motorImpacto.retornarNivel());
    }
    
    @Test
    public void deveRetornarNivelCriticoPorSla(){
        FalhaStub falha = new FalhaStub(new DadosFalhaStub());
        falha.atualizarHorasRestantes(1); 
        
        Priorizacao sla = new PriorizacaoSLA(falha.getHorasRestantesSLA()); 
        PriorizarAutomatica motorSLA = new PriorizarAutomatica(sla);
        
        assertEquals("Nivel Critico", motorSLA.retornarNivel());
    }
    
    @Test
    public void deveRetornarNivelAltoPorSla(){
        FalhaStub falha = new FalhaStub(new DadosFalhaStub());
        
        falha.atualizarHorasRestantes(24); 
        
        Priorizacao sla = new PriorizacaoSLA(falha.getHorasRestantesSLA()); 
        PriorizarAutomatica motorSLA = new PriorizarAutomatica(sla);
        
        assertEquals("Nivel Alto", motorSLA.retornarNivel());
    }
    
    @Test
    public void deveRetornarNivelCriticoCategoria(){
        
        FalhaStub falha = new FalhaStub(new DadosFalhaStub("Eletrica"));
        
        Priorizacao categoria = new PriorizacaoCategoria(falha); 
        PriorizarAutomatica motorCategoria = new PriorizarAutomatica(categoria);
        
        assertEquals("Nivel Critico", motorCategoria.retornarNivel());
    }
    
     @Test
    public void deveRetornarNivelAltoCategoria(){
        
        FalhaStub falha = new FalhaStub(new DadosFalhaStub());
        
        Priorizacao categoria = new PriorizacaoCategoria(falha); 
        PriorizarAutomatica motorCategoria = new PriorizarAutomatica(categoria);
        
        assertEquals("Nivel Alto", motorCategoria.retornarNivel());
    }
}