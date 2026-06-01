/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import domain.Falha;

/**
 *
 * @author vasco
 */
public class NotificadorTecnico implements ObservadorFalha {
    
     @Override
    public void atualizar(Falha falha) {

        System.out.println("[NotificadorTecnico] Tecnico avisado: falha '" + falha.getTitulo()
                + "' agora esta no estado " + falha.getEstadoAtual().nome() + ".");
    }
}
