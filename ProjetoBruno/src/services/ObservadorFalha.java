/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import domain.Falha;

/**
 * Padrao OBSERVER. Interessados em mudancas de estado/prioridade da Falha
 * implementam esta interface.
 *
 * @author Ana Livia Vasconcellos
 * @since 2026
 * @version 1.0.0
 */
public interface ObservadorFalha {

    public static Object vezesNotificado = null;

    void atualizar(Falha falha);
}
