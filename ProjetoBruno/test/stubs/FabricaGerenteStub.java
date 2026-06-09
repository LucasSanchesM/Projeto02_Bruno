/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stubs;
import factory.FabricaGerente;
import model.Gerente;
import services.Funcionario;

/**
 * Stub para Testes.
 * Simula a classe real porem permite que valores fixos (em casos necessarios),
 * sejam postos para manter adequado ao ambiente de teste
 * @author Lucas Sanches Marcílio Pereiraa
 * @since 2026
 * @version 1.0.0
 */
public class FabricaGerenteStub extends FabricaGerente{
    @Override
    public Funcionario criarFuncionario(){
        Gerente gerenteFake = new Gerente();
        gerenteFake.setId(999);
        gerenteFake.setNome("Gerente de Teste");
        return gerenteFake;
    }
}
