/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 * Classe utilizada para transportar os dados
 * necessários para abertura de uma falha.
 *
 * @author Mirel
 */

public class FacadeDadosFalha {
    
    private String titulo;
    private String descricao;
    private String maquina;
    
     /**
     * Cria um objeto contendo os dados da falha.
     *
     * @param titulo Título do incidente.
     * @param descricao Descrição do incidente.
     * @param maquina Máquina afetada.
     */

    public FacadeDadosFalha(String titulo, String descricao, String maquina) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.maquina = maquina;
    }

    /**
     * Retorna o título da falha.
     *
     * @return título.
     */
    
    public String getTitulo() {
        return titulo;
    }

     /**
     * Retorna a descrição da falha.
     *
     * @return descrição.
     */
    
    public String getDescricao() {
        return descricao;
    }
    /**
     * Retorna a máquina afetada.
     *
     * @return máquina.
     */
    
    public String getMaquina() {
        return maquina;
    }
    
}
