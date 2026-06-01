/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import domain.Falha;

/**
 * Observa a Falha e verifica violacao de SLA quando ha mudancas.
 * @author Ana Livia Vasconcellos
 */
public class MonitorSLA implements ObservadorFalha {

    @Override
    public void atualizar(Falha falha) {
        // Em producao: consultar AcordoNivelServico e disparar alerta.
        // Mantido simples para fins didaticos.
        if (falha.getHorasRestantesSLA() <= 4) {
            System.out.println("[MonitorSLA] ALERTA: falha '" + falha.getTitulo()
                    + "' com SLA critico (" + falha.getHorasRestantesSLA() + "h restantes).");
        } else {
            System.out.println("[MonitorSLA] SLA verificado para a falha '" + falha.getTitulo()
                    + "' (" + falha.getHorasRestantesSLA() + "h restantes).");
        }
    }
    }
}
