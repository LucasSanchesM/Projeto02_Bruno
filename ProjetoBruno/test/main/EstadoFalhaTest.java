package main;

import domain.Falha;
import model.DadosFalha;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Classe de testes unitários para validar o comportamento da classe Falha em seu ciclo de vida de estados.
 * Os testes verificam transições válidas e inválidas entre os estados, garantindo que as regras de negócio da máquina de estados sejam respeitadas
 * @since @since 2026-05-30
 * @author Gabriel Dias Santiago
 */ 
public class EstadoFalhaTest {

    private final String descricao = "Motor meu parou";
    private final String tipo = "Mecânica";
    private final int idMaquina = 1;

    public EstadoFalhaTest() {
    }

    /**
     * Deve transitar uma falha do estado ABERTO para EM_ANALISE
     * quando o método iniciarAnalise() for executado.
     */
    
    @Test
    public void deveTransitarDeAbertoParaEmAnalise() {
        Falha falha = new Falha(new DadosFalha(descricao, tipo, idMaquina));
        falha.iniciarAnalise();

        assertEquals("EM_ANALISE", falha.getEstadoAtual().nome());
    }

    /**
     * Não deve permitir a conclusão de uma falha diretamente a partir do
     * estado {@code ABERTO}.
     *
     * Nesse cenário, a operação concluir() deve lançar uma
     * IllegalStateException}
     *
     * @throws IllegalStateException se a operação de conclusão for chamada
     *         em um estado inválido (como pode ser visto dentro da classe da qual padroniza exção)
     */
    @Test
    public void naoDevePermitirConcluirAPartirDeAberto() {
        Falha falha = new Falha(new DadosFalha("Falha teste", "Mecânica", 2));

        assertThrows(IllegalStateException.class, () -> falha.concluir());
        assertEquals("ABERTO", falha.getEstadoAtual().nome());
    }

    /**
     * Deve aprovar uma falha quando ela estiver no estado EM_ANALISE
     */
    @Test
    public void deveAprovarAPartirDeEmAnalise() {
        Falha falha = new Falha(new DadosFalha(descricao, tipo, idMaquina));
        falha.iniciarAnalise();
        falha.aprovar();

        assertEquals("APROVADO", falha.getEstadoAtual().nome());
    }
    
    /**
    * Deve recusar uma falha quando ela estiver no estado EM_ANALISE.
    *
    * Nesse cenario, ao executar  recusar() a falha deve migrar para o estado RECUSADO
    */

     @Test
    public void deveRecusarAPartirDeEmAnalise() {
        Falha falha = new Falha(new DadosFalha(descricao, tipo, idMaquina));
        falha.iniciarAnalise();
        falha.recusar("Sem fundamento tecnico");
        assertEquals("RECUSADO", falha.getEstadoAtual().nome());
    }
}