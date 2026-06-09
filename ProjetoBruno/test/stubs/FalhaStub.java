/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stubs;

import domain.Falha;
import model.DadosFalha;
import services.EstadoFalha;

/**
 * Stub (classe Falha)
 *
 * <p>Estende a Falha real e sobrescreve apenas o necessario para SUBSTITUIR
 * o comportamento real por respostas controladas: setEstado() apenas ARMAZENA
 * o estado recebido e getEstadoAtual() o DEVOLVE. Nenhum observador e
 * notificado e nenhum efeito colateral da Falha real e executado.</p>
 *
 * <p>Trata-se de um stub: ele nao registra nem expoe interacoes (numero
 * de chamadas, etc.). A verificacao nos testes e feita exclusivamente pelo
 * ESTADO resultante obtido via getEstadoAtual().</p>
 */

public class FalhaStub extends Falha {

    private EstadoFalha estadoAtual;

    public FalhaStub(DadosFalha dados) {
        super(dados);
    }

    @Override
    public void setEstado(EstadoFalha novoEstado) {
        this.estadoAtual = novoEstado;
    }

    @Override
    public EstadoFalha getEstadoAtual() {
        return estadoAtual;
    }
}
