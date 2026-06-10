package Strategy;

import org.junit.Test;
import static org.junit.Assert.*;
import StrategyMTH.*;
import domain.Falha; // Mantido apenas se as assinaturas do Strategy exigirem a classe base
import stubs.DadosFalhaStub;
import stubs.FalhaStub;

/**
 * Classe de testes unitários para priorização de falhas por categoria e grau de impacto.
 * Os testes verificam as falhas e seu impacto em cada estado e os delegam, garantindo que as regras de negócio das prioridades de falhas sejam respeitadas.
 * @since 2026-06-09
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
        falha.setMaquinaParada(false); // Cenário corrigido anteriormente
        
        Priorizacao impacto = new Impacto(falha); 
        PriorizarAutomatica motorImpacto = new PriorizarAutomatica(impacto);
        
        assertEquals("Nivel Alto", motorImpacto.retornarNivel());
    }
    
    @Test
    public void deveRetornarNivelCriticoPorSla(){
        FalhaStub falha = new FalhaStub(new DadosFalhaStub());
        falha.atualizarHorasRestantes(1); // 1 hora restante = Crítico
        
        Priorizacao sla = new PriorizacaoSLA(falha.getHorasRestantesSLA()); 
        PriorizarAutomatica motorSLA = new PriorizarAutomatica(sla);
        
        assertEquals("Nivel Critico", motorSLA.retornarNivel());
    }
    
    @Test
    public void deveRetornarNivelAltoPorSla(){
        FalhaStub falha = new FalhaStub(new DadosFalhaStub());
        // MODIFICAÇÃO: Definindo explicitamente um valor que represente o "Nível Alto" (ex: 24 horas)
        falha.atualizarHorasRestantes(24); 
        
        Priorizacao sla = new PriorizacaoSLA(falha.getHorasRestantesSLA()); 
        PriorizarAutomatica motorSLA = new PriorizarAutomatica(sla);
        
        assertEquals("Nivel Alto", motorSLA.retornarNivel());
    }
    
    @Test
    public void deveRetornarNivelCriticoCategoria(){
        // MODIFICAÇÃO: Substituído as classes reais por DadosFalhaStub e FalhaStub
        FalhaStub falha = new FalhaStub(new DadosFalhaStub("Eletrica"));
        
        Priorizacao categoria = new PriorizacaoCategoria(falha); 
        PriorizarAutomatica motorCategoria = new PriorizarAutomatica(categoria);
        
        assertEquals("Nivel Critico", motorCategoria.retornarNivel());
    }
}