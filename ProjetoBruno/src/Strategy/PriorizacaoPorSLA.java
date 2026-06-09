/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

import domain.Falha;
import model.Prioridade;

/**
 *
 * @author gabri
 */
public class PriorizacaoPorSLA implements EstrategiaPriorizacao {
    private static final int LIMITE_SEGURANCA_HORAS = 2;

    @Override
    
    public Prioridade calcularPrioridade(Falha falha) {
        if (falha.getHorasRestantesSLA() <= LIMITE_SEGURANCA_HORAS) {
            return Prioridade.ALTA;
        }
        return Prioridade.MEDIA;
    }
}
