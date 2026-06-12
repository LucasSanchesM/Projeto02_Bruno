package model;

/**
 * Classe auxiliadora que centraliza os dados da falha
 *
 * @author Lucas Sanches Marcilio Pereira
 * @since 2026
 * @version 1.0.0
 */
public class DadosFalha {

    private final String descricao;
    private final String tipo;
    private final int idMaquina;

    /**
     *
     * @param descricao Contem a descrição da falha
     * @param tipo Contem o tipo de falha apresentada
     * @param idMaquina Identificador da falha
     */
    public DadosFalha(String descricao, String tipo, int idMaquina) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.idMaquina = idMaquina;
    }

    /**
     * @return retorna o valor armazenado dentro do atributo descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return retorna o valor armazenado dentro do atributo tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @return retorna o valor armazenado dentro do atributo idMaquina
     */
    public int getIdMaquina() {
        return idMaquina;
    }

}
