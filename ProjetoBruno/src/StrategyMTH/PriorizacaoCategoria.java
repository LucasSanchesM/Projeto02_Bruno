package StrategyMTH;

import domain.Falha;
/**
 * Implementa a interface de priorização e unindo dados da priorização por categoria
 * @author Thalyson
 * @since 04-06-2026
 * @version 1.0.0
 */
public class PriorizacaoCategoria implements Priorizacao {
    private Falha falha;
/**
 * Objeto que contem as informações das falhas
 * @param falha 
 */
    public PriorizacaoCategoria(Falha falha) {
        this.falha = falha;
    }
/**
 * 
 * @return Retorna String de priorização de categoria  
 */
    @Override
    public String getNome() {
        return "priorização por categoria";
    }
/**
 * 
 * @return Retorna nivel de falha 
 */
    @Override
    public String getNivel() {
        if (falha != null && "Eletrica".equalsIgnoreCase(falha.getCategoria())) {
            return "Nivel Critico";
        }
        return "alto";
    }
}