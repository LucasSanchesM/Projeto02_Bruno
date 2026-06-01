/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadeTest;

/**
 * Teste responsável por validar o fluxo completo
 * do ciclo de vida de uma falha.
 *
 * Verifica a execução sequencial das operações
 * abrirFalha, iniciarAnalise, aprovarFalha e
 * atenderFalha, garantindo que o estado final
 * seja EM_ATENDIMENTO.
 *
 * @author Mirel
 */

import domain.Falha;
import facade.FacadeGestaoFalha;
import model.DadosFalha;
import org.junit.Test;
import static org.junit.Assert.*;

public class FacadeFluxoFalhaTest {
    
    @Test
    public void deveConcluirFluxoDeFalhaComSucessoAteAtendimento() {
        
        int idFalha = 1;
        int idTecnico = 1;
        
        FacadeGestaoFalha facade = new FacadeGestaoFalha();

        Falha falha = facade.abrirFalha(new DadosFalha("Motor parou", "Mecanica", 1));

        facade.iniciarAnaliseFalha(idFalha);
        facade.aprovarFalha(idFalha);
        facade.atenderFalha(idFalha, idTecnico);
        
        assertEquals("EM_ATENDIMENTO", falha.getEstadoAtual().nome());
    }
    
}
