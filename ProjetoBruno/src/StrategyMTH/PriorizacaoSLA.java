package StrategyMTH;
/**
 * Implementa a interface de priorização e unindo dados da priorização por SLA
 * @author Thalyson
 * @since 04-06-2026
 * @version 1.0.0
 */
public class PriorizacaoSLA implements Priorizacao {
    private int horasRestantes;
/**
 * 
 * @param horasRestantes inteiro de horas restantes para paralisação das maquinas
 */
    public PriorizacaoSLA(int horasRestantes) {
        this.horasRestantes = horasRestantes;
    }
/**
 * 
 * @return Retorna String de tipo de priorizaçao por sla
 */
    @Override
    public String getNome() {
        return "priorização por SLA";
    }
/**
 * 
 * @return Retorna nivel por peiorização
 */
    @Override
    public String getNivel() {
        return (horasRestantes <= 2) ? "Nivel Critico" : "Nivel Alto";
    }
}