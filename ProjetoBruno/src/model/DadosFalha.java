
package model;
/**
 * Classe auxiliadora que centraliza os dados da falha
 * @author Lucas Sanches Marcilio Pereira
 * @since 2026
 */
public class DadosFalha {
    private final String descricao;
    private final String tipo;
    private final int idMaquina;
    /**
     * 
     * @param descricao Contem a descrição da falha
     * @param tipo Contem o tipo de falha apresentada
     * @param idMaquina  Identificador da falha
     */
    
    public DadosFalha(String descricao, String tipo, int idMaquina) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.idMaquina = idMaquina;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public int getIdMaquina() {
        return idMaquina;
    }
    
    
    
    
}
