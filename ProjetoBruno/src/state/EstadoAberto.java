/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import domain.Falha;

/**
 * Esta classe é uma das possibilidades de estados - EstadoAberto
 * @author Gabriel Dias Santiago
 */
public class EstadoAberto implements EstadoFalha{
    /**
     * @param f  define o estado do objeto recebido para o proximo na fila - EstadoEmAnalise
     */
    @Override
    public void iniciarAnalise(Falha f) {
        f.setEstado(new EstadoEmAnalise());
    }
    /**
     * 
     * @return Retorna qual estado é este - EstadoAberto
     */
    
     @Override
    public String nome() {
        return "ABERTO";
    }
    
}
