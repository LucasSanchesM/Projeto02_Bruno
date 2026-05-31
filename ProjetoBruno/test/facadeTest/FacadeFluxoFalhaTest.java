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

import facade.FacadeDadosFalha;
import facade.FacadeFalha;
import facade.FacadeGestaoFalha;
import org.junit.Test;
import static org.junit.Assert.*;

public class FacadeFluxoFalhaTest {
    
    @Test
    public void deveConcluirFluxoDeFalhaComSucesso() {

        FacadeGestaoFalha facade = new FacadeGestaoFalha();

        FacadeDadosFalha dados = new FacadeDadosFalha(
                "Erro no sistema",
                "Sistema travou",
                "Máquina 01"
        );

        FacadeFalha falha = facade.abrirFalha(dados);

        facade.iniciarAnalise();
        facade.aprovarFalha();
        facade.atenderFalha();

        assertNotNull(falha);
        assertEquals("EM_ATENDIMENTO", falha.getEstado());
    }
    
}
