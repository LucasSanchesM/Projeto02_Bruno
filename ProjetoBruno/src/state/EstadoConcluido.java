/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import domain.Falha;

/**
 * Esta classe é uma das possibilidades de estados - EstadoConcluido
 * @author Gabriel Dias Santiago
 */
public class EstadoConcluido implements EstadoFalha {
    /**
     * @param f  define o estado do objeto recebido para o proximo na fila - EstadoEncerrado
     */
    @Override
    public void encerrar(Falha f) {
        f.setEstado(new EstadoEncerrado());
    }

    /**
     * @return Retorna qual estado é este - Concluido
     */
    @Override
    public String nome() {
        return "CONCLUIDO";
    }
}