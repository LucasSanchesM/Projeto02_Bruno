/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import domain.Falha;

/**
 *
 * @author gabri
 */
public class EstadoAberto implements EstadoFalha{
    
    @Override
    public void iniciarAnalise(Falha f) {
        f.setEstado(new EstadoEmAnalise());
    }
    
     @Override
    public String nome() {
        return "ABERTO";
    }
    
}
