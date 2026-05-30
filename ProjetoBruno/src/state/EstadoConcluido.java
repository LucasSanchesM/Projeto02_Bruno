/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import domain.Falha;

/**
 *
 * @author Gabriel Dias Santiago
 */
public class EstadoConcluido implements EstadoFalha {

    @Override
    public void encerrar(Falha f) {
        f.setEstado(new EstadoEncerrado());
    }

    @Override
    public String nome() {
        return "CONCLUIDO";
    }
}