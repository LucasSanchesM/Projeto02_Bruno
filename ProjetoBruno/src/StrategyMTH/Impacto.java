package StrategyMTH;

import services.Priorizacao;
import domain.Falha;

/**
 * Classe que implementa a interface priorização sendo um dos possíveis casos
 * @author Thalyson
 * @since 2026
 * @version 1.0.0
 */
public class Impacto implements Priorizacao {
    private boolean maquinaParada;

    /**
     * 
     * @param falha Parametros da falha para coleta de estado de maquina
     */
    public Impacto(Falha falha) {
        this.maquinaParada = falha.isMaquinaParada();
    }
    /**
     * 
     * @return Retorna uma String de tipo do impacto 
     */
    @Override
    public String getNome() {
        return "impacto de produção";
    }
    
  /**
   * 
   * @return Retorna uma String do grau do nivel
   */
    @Override
    public String getNivel() {
        return maquinaParada ? "Nivel Critico" : "Nivel Alto";
    }
}