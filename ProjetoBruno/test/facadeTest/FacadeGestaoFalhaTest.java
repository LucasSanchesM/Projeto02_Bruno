/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadeTest;

import domain.Falha;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import facade.FacadeGestaoFalha;
import model.DadosFalha;
import stubs.DadosFalhaStub;
import stubs.FalhaFacadeStub;
import stubs.FalhaStub;

/**
 * Teste responsável por validar a abertura de uma falha
 * utilizando a fachada FacadeGestaoFalha.
 *
 * Verifica se a falha é criada corretamente
 * e se inicia no estado ABERTO e também valida se ele realmente cria com os dados dos quais estamos passando
 *
 * @author Mirel
 */
public class FacadeGestaoFalhaTest {
    @Test
    public void deveAbrirFalhaComSucesso() {

        FacadeGestaoFalha facade = new FacadeGestaoFalha();

        Falha falha = facade.abrirFalha(new DadosFalhaStub());
        assertEquals("ABERTO", falha.getEstadoAtual().nome());
        assertEquals("Motor parou", falha.getTitulo());
        
    }
    
    @Test
    public void iniciarAnaliseFalhaDeveLevarParaEmAnalise() {
        FalhaFacadeStub stub = new FalhaFacadeStub(new DadosFalhaStub());
        FacadeGestaoFalha facade = new FacadeGestaoFalha(stub);

        facade.iniciarAnaliseFalha(1);

        assertEquals("EM_ANALISE", stub.getEstadoAtual().nome());
    }

    @Test
    public void aprovarFalhaDeveLevarParaAprovado() {
        FalhaFacadeStub stub = new FalhaFacadeStub(new DadosFalhaStub());
        FacadeGestaoFalha facade = new FacadeGestaoFalha(stub);

        facade.aprovarFalha(1);

        assertEquals("APROVADO", stub.getEstadoAtual().nome());
    }

    @Test
    public void atenderFalhaDeveLevarParaEmAtendimento() {
        FalhaFacadeStub stub = new FalhaFacadeStub(new DadosFalhaStub());
        FacadeGestaoFalha facade = new FacadeGestaoFalha(stub);

        facade.atenderFalha(1, 1);

        assertEquals("EM_ATENDIMENTO", stub.getEstadoAtual().nome());
    }

    @Test
    public void encerrarFalhaDeveLevarParaEncerrado() {
        FalhaFacadeStub stub = new FalhaFacadeStub(new DadosFalhaStub());
        FacadeGestaoFalha facade = new FacadeGestaoFalha(stub);

        facade.encerrarFalha();

        assertEquals("ENCERRADO", stub.getEstadoAtual().nome());
    }
    
}
