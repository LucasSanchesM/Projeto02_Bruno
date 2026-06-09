package model;

import services.Funcionario;

/**
 * Implementação de funcionario como Tecnico
 * @author Lucas Sanches Marcilio Pereira
 * @since 2026
 * @version 1.0.0
 */
public class Tecnico implements Funcionario{
    private int id;
    private String nome;
    
    /**
     * @return retorna o inteiro denominado id armazenado na classe
     */
    @Override
    public int getId() {
        return id;
    }
    /**
     * @param id define o valor do atributo id para o valor recebido
     */
    @Override
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return retorna a String denominada nome armazenada na classe
     */
    @Override
    public String getNome() {
        return nome;
    }
    /**
     * @param nome define o valor do atributo nome para a String recebida
     */
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
