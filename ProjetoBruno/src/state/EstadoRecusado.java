/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import services.EstadoFalha;

/**
 * Esta classe é uma das possibilidades de estados - EstadoRecusado
 *
 * @author Gabriel Dias Santiago
 * @since 2026
 * @version 1.0.0
 */
public class EstadoRecusado implements EstadoFalha {

    private final String justificativa;

    public EstadoRecusado(String justificativa) {
        this.justificativa = justificativa;
    }

    /**
     * @return Retorna qual estado é este - Estado falha
     */
    @Override
    public String nome() {
        return "RECUSADO";
    }

    public String justificativa() {
        return justificativa;
    }

}
