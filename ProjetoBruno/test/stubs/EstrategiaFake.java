/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stubs;

import Strategy.EstrategiaPriorizacao;
import domain.Falha;
import model.Prioridade;

/**
 * Duble (spy) de EstrategiaPriorizacao usado no teste de delegacao (CT-07).
 *
 * <p>Registra se o metodo calcularPrioridade foi acionado (foiChamada) e
 * retorna sempre um nivel fixo (MEDIA). Permite provar que a Falha DELEGA
 * o calculo a estrategia injetada, em vez de aplicar regras locais.</p>
 *
 * @author Thalyson Gama
 * @since 2026-06
 */

public class EstrategiaFake implements EstrategiaPriorizacao {

    private boolean foiChamada = false;

    @Override
    public Prioridade calcularPrioridade(Falha falha) {
        this.foiChamada = true;
        return Prioridade.MEDIA;
    }

    public boolean isFoiChamada() {
        return foiChamada;
    }
    
}