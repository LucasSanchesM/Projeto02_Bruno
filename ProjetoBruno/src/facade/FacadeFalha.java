package facade;

/**
 * Representa uma falha registrada no sistema.
 *
 * Armazena as informações básicas do incidente
 * e seu estado atual no fluxo de atendimento.
 *
 * @author Mirel
 */


public class FacadeFalha {
    
    private String titulo;
    private String descricao;
    private String maquina;
    private String estado;
    
    /**
     * Cria uma nova falha.
     *
     * @param titulo Título da falha.
     * @param descricao Descrição da falha.
     * @param maquina Máquina afetada.
     * @param estado Estado atual da falha.
     */
    
    public FacadeFalha(String titulo, String descricao, String maquina, String estado) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.maquina = maquina;
        this.estado = estado;
    }

     /**
     * Retorna o título da falha.
     *
     * @return título da falha.
     */
    
    public String getTitulo() {
        return titulo;
    }

    public String getEstado() {
        return estado;
    }
    
    /**
     * Retorna o estado atual da falha.
     *
     * @return estado da falha.
     */
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
