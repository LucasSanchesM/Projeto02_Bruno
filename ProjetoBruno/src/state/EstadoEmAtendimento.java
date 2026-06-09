/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import services.EstadoFalha;
import domain.Falha;

/**
 * Esta classe é uma das possibilidades de estados - EstadoEmAtendimento
 * @author Gabriel Dias Santiago
 */
public class EstadoEmAtendimento implements EstadoFalha {
    /**
     * @param f  define o estado do objeto recebido para o proximo na fila - EstadoConcluido
     */
    @Override
    public void concluir(Falha f) {
        f.setEstado(new EstadoConcluido());
    }
    /**
     * @return Retorna qual estado é este - Em_Atendimento
     */
    @Override
    public String nome() {
        return "EM_ATENDIMENTO";
    }
}
