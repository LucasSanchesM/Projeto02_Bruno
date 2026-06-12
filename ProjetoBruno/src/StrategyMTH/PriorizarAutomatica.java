package StrategyMTH;

import services.Priorizacao;

/**
 * Lida com a priorização independente do tipo
 * @author Thalyson
 * @since 2026
 * @version 1.0.0
 */
public class PriorizarAutomatica {
    private Priorizacao estrategia;

   /**
    * @param estrategia Define um objeto recebido pela classe 
    */
    public PriorizarAutomatica(Priorizacao estrategia) {
        this.estrategia = estrategia;
    }
/**
 * @param estrategia seta os valores de acordo com o objeto recebido
 */
    public void setEstrategia(Priorizacao estrategia) {
        this.estrategia = estrategia;
    }
/**
 * @return Retorna o nivel de acordo com o objeto estratégia que esta aramzenado na classe 
 */
    public String retornarNivel() {
        return estrategia.getNivel();
    }
     /**
      * @return  Retorna o nome de acordo com o objeto estratégia que esta aramzenado na classe 
      */
    public String retornarNome() {
        return estrategia.getNome();
    }
}