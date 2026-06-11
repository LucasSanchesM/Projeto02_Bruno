/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadeTest;

import domain.Falha;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import facade.FacadeGestaoFalha;
import stubs.DadosFalhaStub;
import stubs.FalhaFacadeStub;

/**
 * Teste responsável por validar a abertura de uma falha
 * utilizando a fachada FacadeGestaoFalha.
 *
 *Verificam a abertura de falhas e as transições de estado realizadas pela fachada.
 * @author Mirel
 */
public class FacadeGestaoFalhaTest {
  
    /**
    Verifica a abertura de uma falha.
    */
    @Test
    public void ct18_deveAbrirFalhaComSucesso() {

        FacadeGestaoFalha facade = new FacadeGestaoFalha();

        Falha falha = facade.abrirFalha(new DadosFalhaStub());
        assertEquals("ABERTO", falha.getEstadoAtual().nome());
        assertEquals("Motor parou", falha.getTitulo());
        
    }
    
    /**
    Verifica a transição para EM_ANALISE.
    */
    @Test
    public void ct19_iniciarAnaliseFalhaDeveLevarParaEmAnalise() {
        FalhaFacadeStub stub = new FalhaFacadeStub(new DadosFalhaStub());
        FacadeGestaoFalha facade = new FacadeGestaoFalha(stub);

        facade.iniciarAnaliseFalha(1);

        assertEquals("EM_ANALISE", stub.getEstadoAtual().nome());
    }

    /**
    Verifica a transição para APROVADO.
    */
    @Test
    public void ct20_aprovarFalhaDeveLevarParaAprovado() {
        FalhaFacadeStub stub = new FalhaFacadeStub(new DadosFalhaStub());
        FacadeGestaoFalha facade = new FacadeGestaoFalha(stub);

        facade.aprovarFalha(1);

        assertEquals("APROVADO", stub.getEstadoAtual().nome());
    }

    /**
    Verifica a transição para EM_ATENDIMENTO.
    */
    @Test
    public void ct21_atenderFalhaDeveLevarParaEmAtendimento() {
        FalhaFacadeStub stub = new FalhaFacadeStub(new DadosFalhaStub());
        FacadeGestaoFalha facade = new FacadeGestaoFalha(stub);

        facade.atenderFalha(1, 1);

        assertEquals("EM_ATENDIMENTO", stub.getEstadoAtual().nome());
    }

    /**
    Verifica a transição para ENCERRADO.
    */
    @Test
    public void ct22_encerrarFalhaDeveLevarParaEncerrado() {
        FalhaFacadeStub stub = new FalhaFacadeStub(new DadosFalhaStub());
        FacadeGestaoFalha facade = new FacadeGestaoFalha(stub);

        facade.encerrarFalha();

        assertEquals("ENCERRADO", stub.getEstadoAtual().nome());
    }
    
}
    