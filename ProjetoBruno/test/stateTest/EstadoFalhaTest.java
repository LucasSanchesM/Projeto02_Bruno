/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package stateTest;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import state.EstadoAberto;
import state.EstadoEmAnalise;
import state.EstadoRecusado;
import stubs.DadosFalhaStub;
import stubs.FalhaStub;

/**
 * Testes unitarios do padrao State implementando os casos de teste
 * documentados CT-01 a CT-04.
 * Nesse contexto, os testes implementam de forma correta os stubs, o que na versão anterior não estava aplicado corretamente
 *
 * <p>Cada teste exercita um ESTADO CONCRETO de forma isolada. Em vez de
 * acoplar o teste ao comportamento completo da Falha real (observadores,
 * notificacoes, etc.), usamos o {@link FalhaStub}: um stub do Context que
 * apenas ARMAZENA o estado definido por setEstado() e o devolve em
 * getEstadoAtual(). A verificacao e feita exclusivamente pelo ESTADO
 * resultante (nome do estado), nunca por contagem de chamadas.</p>
 *
 * <p>O {@link FalhaStub} depende de {@link model.DadosFalha} em seu construtor;
 * essa dependencia e substituida pelo {@link DadosFalhaStub}.</p>
 *
 * @since 2026-06-04
 * @author Gabriel Dias Santiago
 */
public class EstadoFalhaTest {

    public EstadoFalhaTest() {
    }

    /** aqui cria um stub do Context (Falha) usando o stub de dependencia DadosFalha. */
    private FalhaStub novaFalhaStub() {
        return new FalhaStub(new DadosFalhaStub());
    }

    /**
     * CT-01 — A partir do estado ABERTO, iniciarAnalise() deve transitar a
     * falha para EM_ANALISE.
     */
    
    @Test
    public void ct01_abertoIniciaAnaliseVaiParaEmAnalise() {
        EstadoAberto estado = new EstadoAberto();
        FalhaStub falha = novaFalhaStub();
        falha.setEstado(estado); // estado inicial ABERTO

        // a acao aqui: o estado ABERTO trata iniciarAnalise()
        estado.iniciarAnalise(falha);

        // resultado esperado: a falha passou a estar em EM_ANALISE
        assertEquals("EM_ANALISE", falha.getEstadoAtual().nome());
    }

    /**
     * CT-02 — A partir do estado ABERTO, concluir() e uma transicao proibida:
     * deve lancar IllegalStateException e o estado deve permanecer ABERTO.
     */
    
    @Test
    public void ct02_concluirAPartirDeAbertoDeveLancarExcecao() {
        EstadoAberto estado = new EstadoAberto();
        FalhaStub falha = novaFalhaStub();
        falha.setEstado(estado); // estado inicial ABERTO

        // acao + resultado esperado: intercepta a acao de risco
        assertThrows(IllegalStateException.class, () -> estado.concluir(falha));

        // Pos-condicao: a falha permanece em estado seguro ABERTO
        assertEquals("ABERTO", falha.getEstadoAtual().nome());
    }

    /**
     * CT-03 — A partir do estado EM_ANALISE, aprovar() deve transitar a falha
     * para APROVADO.
     */
    
    @Test
    public void ct03_aprovarAPartirDeEmAnaliseVaiParaAprovado() {
        EstadoEmAnalise estado = new EstadoEmAnalise();
        FalhaStub falha = novaFalhaStub();
        falha.setEstado(estado); // estado inicial EM_ANALISE

        // acao: o estado EM_ANALISE trata aprovar()
        estado.aprovar(falha);

        // Pos-condicao: a falha passou a estar em APROVADO
        assertEquals("APROVADO", falha.getEstadoAtual().nome());
    }

    /**
     * CT-04 — A partir do estado EM_ANALISE, recusar(texto) deve transitar a
     * falha para RECUSADO mantendo a justificativa informada.
     */
    
    @Test
    public void ct04_recusarAPartirDeEmAnaliseVaiParaRecusadoComJustificativa() {
        EstadoEmAnalise estado = new EstadoEmAnalise();
        FalhaStub falha = novaFalhaStub();
        falha.setEstado(estado); // estado inicial EM_ANALISE
        String motivo = "Sem fundamento tecnico";

        // acao: invoca recusar(...) passando a string informada
        estado.recusar(falha, motivo);

        // Pos-condicao: estado RECUSADO contendo o texto da recusa armazenado
        assertEquals("RECUSADO", falha.getEstadoAtual().nome());
        assertTrue(falha.getEstadoAtual() instanceof EstadoRecusado);
        assertEquals(motivo, ((EstadoRecusado) falha.getEstadoAtual()).justificativa());
    }
}
