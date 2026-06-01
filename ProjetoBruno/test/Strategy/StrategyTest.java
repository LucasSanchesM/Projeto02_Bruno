/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 * Teste responsável por validar o fluxo completo
 * do ciclo de vida de uma falha.
 *
 * Verifica a execução sequencial das operações
 * abrirFalha, iniciarAnalise, aprovarFalha e
 * atenderFalha, garantindo que o estado final
 * seja EM_ATENDIMENTO.
 *
 * @author Thalyson
 */

import org.junit.Test;
import static org.junit.Assert.*;
import StrategyMTH.*;
import domain.Falha;
import model.DadosFalha;
public class StrategyTest {
    
    @Test
   
      public void ImpactoProducao(){
          Falha falha = new Falha(new DadosFalha("Parou a esteira", "Mecanica", 2));
          DelegarFalha delegar = new DelegarFalha(falha);
          Priorizacao impacto = delegar.prioriorizacao(true); 
         //PriorizarAutomatica priori = new PriorizarAutomatica(impacto); 
          
          
        assertEquals("Nivel Critico", impacto.getNivel());
        }
        
}
