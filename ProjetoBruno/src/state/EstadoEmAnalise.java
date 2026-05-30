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
public class EstadoEmAnalise implements EstadoFalha {

    @Override
    public void aprovar(Falha f) {
        f.setEstado(new EstadoAprovado());
    }

    @Override
    public void recusar(Falha f) {
        f.setEstado(new EstadoRecusado());
    }

    @Override
    public String nome() {
        return "EM_ANALISE";
    }
}
