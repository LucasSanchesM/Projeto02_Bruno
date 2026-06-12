/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import services.EstadoFalha;
import domain.Falha;

/**
 * Esta classe é uma das possibilidades de estados - EstadoEmAnalise
 * @author Gabriel Dias Santiago
 * @since 2026
 * @version 1.0.0
 */
public class EstadoEmAnalise implements EstadoFalha {

    /**
     * @param f  define o estado do objeto recebido para o proximo na fila - EstadoAprovado
     */
    @Override
    public void aprovar(Falha f) {
        f.setEstado(new EstadoAprovado());
    }
    /**
     * @param f  define o estado do objeto recebido para recusado
     */
    @Override
    public void recusar(Falha f, String justificativa) {
        f.setEstado(new EstadoRecusado(justificativa));
    }

    /**
     * @return Retorna qual estado é este - Em_Analise
     */
    @Override
    public String nome() {
        return "EM_ANALISE";
    }
}
