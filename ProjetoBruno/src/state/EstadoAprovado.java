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
public class EstadoAprovado implements EstadoFalha{
    
    @Override
    public void iniciarAtendimento(Falha f) {
        f.setEstado(new EstadoEmAtendimento());
    }

    @Override
    public String nome() {
        return "APROVADO";
    }
}
