/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import services.EstadoFalha;

/**
 * Esta classe é uma das possibilidades de estados - EstadoEncerrado
 *
 * @author Gabriel Dias Santiago
 * @since 2026
 * @version 1.0.0
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
