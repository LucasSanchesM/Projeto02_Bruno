/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import services.ObservadorFalha;
import domain.Falha;

/**
 * Um dos modelos de observer disponiveis.
 * Possui o intuito de ser um painel voltado a maquina e sua produção
 * @author Ana Livia Vasconcellos
 * @since 2026
 * @version 1.0.0
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