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
public class PainelProducao implements ObservadorFalha {

    @Override
    public void atualizar(Falha falha) {
        System.out.println("[PainelProducao] Painel atualizado | Falha: '" + falha.getTitulo()
                + "' | Estado: " + falha.getEstadoAtual().nome()
                + " | Prioridade: " + falha.getPrioridade()
                + " | Maquina parada: " + (falha.isMaquinaParada() ? "SIM" : "NAO") + ".");
    }
}