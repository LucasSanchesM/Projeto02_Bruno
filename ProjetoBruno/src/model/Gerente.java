/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import services.Funcionario;

/**
 * Implementação de funcionario como gerente
 *
 * @author Lucas Sanches Marcilio Pereira
 * @since 2026
 * @version 1.0.0
 */
public class Gerente implements Funcionario {

    private int id;
    private String nome;

    /**
     * @return retorna o valor do atributo id
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
     * @return retorna o valor (String) do atributo nome
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
