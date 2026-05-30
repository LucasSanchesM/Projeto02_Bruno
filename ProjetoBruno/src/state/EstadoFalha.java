/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package state;

import domain.Falha;

/**
 *
 * @author gabri
 */
public interface EstadoFalha {
    
     default void iniciarAnalise(Falha f) {
        throw new IllegalStateException("Transicao invalida: iniciarAnalise a partir de " + nome());
    }

    default void aprovar(Falha f) {
        throw new IllegalStateException("Transicao invalida: aprovar a partir de " + nome());
    }

    default void recusar(Falha f) {
        throw new IllegalStateException("Transicao invalida: recusar a partir de " + nome());
    }

    default void iniciarAtendimento(Falha f) {
        throw new IllegalStateException("Transicao invalida: iniciarAtendimento a partir de " + nome());
    }

    default void concluir(Falha f) {
        throw new IllegalStateException("Transicao invalida: concluir a partir de " + nome());
    }

    default void encerrar(Falha f) {
        throw new IllegalStateException("Transicao invalida: encerrar a partir de " + nome());
    }

    String nome();
}
