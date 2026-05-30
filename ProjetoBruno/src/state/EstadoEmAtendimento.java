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
public class EstadoEmAtendimento implements EstadoFalha {

    @Override
    public void concluir(Falha f) {
        f.setEstado(new EstadoConcluido());
    }

    @Override
    public String nome() {
        return "EM_ATENDIMENTO";
    }
}
