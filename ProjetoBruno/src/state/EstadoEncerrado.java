/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

/**
 * Esta classe é uma das possibilidades de estados - EstadoEncerrado
 * @author Gabriel Dias Santiago
 */
public class EstadoEncerrado implements EstadoFalha {
    /** 
     * @return Retorna qual estado é este - Encerrado
     */
    @Override
    public String nome() {
        return "ENCERRADO";
    }
}