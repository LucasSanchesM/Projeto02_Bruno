/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Observer;

import domain.Falha;

/**
 *
 * @author vasco
 */
/**
 * Padrao OBSERVER.
 * Interessados em mudancas de estado/prioridade da Falha implementam esta interface.
 * @author Ana Livia Vasconcellos
 */
public interface ObservadorFalha {
    void atualizar(Falha falha);
}