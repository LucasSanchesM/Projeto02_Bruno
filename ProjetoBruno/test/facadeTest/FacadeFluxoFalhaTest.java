/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadeTest;

/**
 * Teste do fluxo de gerenciamento de falhas pela fachada.
 *
 * Verifica se a sequência de operações resulta no estado final esperado.
 *
 * @author Mirel
 */

import facade.FacadeGestaoFalha;
import org.junit.Test;
import static org.junit.Assert.*;
import stubs.DadosFalhaStub;
import stubs.FalhaFacadeStub;

public class FacadeFluxoFalhaTest {
      
    /**
    Verifica se uma falha chega ao estado
    EM_ATENDIMENTO após a execução do fluxo.
    */
    @Test
    public void ct17_deveConcluirFluxoDeFalhaComSucessoAteAtendimento() {
        
    int idFalha = 1;
    int idTecnico = 1;

    FalhaFacadeStub stub = new FalhaFacadeStub(new DadosFalhaStub());

    FacadeGestaoFalha facade = new FacadeGestaoFalha(stub);

    facade.iniciarAnaliseFalha(idFalha);
    facade.aprovarFalha(idFalha);
    facade.atenderFalha(idFalha, idTecnico);

    assertEquals("EM_ATENDIMENTO", stub.getEstadoAtual().nome());
    
    }
}
