/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import services.EstadoFalha;
import domain.Falha;

/**
 * Esta classe é uma das possibilidades de estados - EstadoAprovado
 *
 * @author Gabriel Dias Santiago
 * @since 2026
 * @version 1.0.0
 */
public class EstadoAprovado implements EstadoFalha {

    /**
     * @param f define o estado do objeto recebido para o proximo na fila -
     * EstadoEmAtendimento
     */
    @Override
    public void iniciarAtendimento(Falha f) {
        f.setEstado(new EstadoEmAtendimento());
    }

    /**
     * @return Retorna qual estado é este - Aprovado
     */
    @Override
    public String nome() {
        return "APROVADO";
    }
}
