
package FacadeGestaoFalha;
/**
 * Classe auxiliadora que centraliza os dados da falha
 * @author Lucas Sanches Marcilio Pereira
 * @since 2026
 */
public class DadosFalha {
    String descricao;
    String tipo;
    String id;
    /**
     * 
     * @param descricao Contem a descrição da falha
     * @param tipo Contem o tipo de falha apresentada
     * @param id  Identificador da falha
     */
    public DadosFalha(String descricao, String tipo, String id) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.id = id;
    }
    
}
