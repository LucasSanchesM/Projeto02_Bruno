/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import services.ObservadorFalha;
import domain.Falha;

/**
 * Esta classe é um dos modelos de observadores disponiveis.
 * Possui o intuito de notificação voltada ao tecnico
 * @author Ana Livia Vasconcellos
 * @since 2026
 * @version 1.0.0
 * 
 */
public class NotificadorTecnico implements ObservadorFalha {
    
     @Override
    public void atualizar(Falha falha) {

        System.out.println("[NotificadorTecnico] Tecnico avisado: falha '" + falha.getTitulo()
                + "' agora esta no estado " + falha.getEstadoAtual().nome() + ".");
    }
}
