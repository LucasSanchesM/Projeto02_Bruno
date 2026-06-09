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
public class PriorizacaoPorCategoria implements EstrategiaPriorizacao {
    
    @Override
    public Prioridade calcularPrioridade(Falha falha) {
        if ("Eletrica".equalsIgnoreCase(falha.getCategoria())) {
            return Prioridade.CRITICA;
        }
        return Prioridade.MEDIA;
    }
}
