/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stubs;

import services.ObservadorFalha;
import domain.Falha;

/**
 *
 * Classe responsável por simular observadores
 *
 * @author Ana Livia Vasconcellos
 * @since 2026
 * @version 1.0.0
 */
public class ObserverStub implements ObservadorFalha {

    private int vezesNotificado = 0;

    /**
     *
     * @return retorna o valor armazenado no atributo vezesNotificado
     */
    public int getVezesNotificado() {
        return vezesNotificado;
    }

    /**
     * Incrementa a quantidade de vezes notificado a cada chamado
     *
     * @param f parametro exigido para manter coerente a classe pai
     */
    @Override
    public void atualizar(Falha f) {
        vezesNotificado++;
    }

}
