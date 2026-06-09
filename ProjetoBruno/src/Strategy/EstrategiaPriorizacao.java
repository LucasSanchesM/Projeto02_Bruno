/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Strategy;

import domain.Falha;
import model.Prioridade;

/**
 *
 * @author gabri
 */
public interface EstrategiaPriorizacao {
    
    Prioridade calcularPrioridade(Falha falha);
}
