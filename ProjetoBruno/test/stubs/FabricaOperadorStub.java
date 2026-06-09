/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stubs;

import factory.FabricaOperador;
import model.Operador;
import services.Funcionario;

/**
 * Stub para Testes.
 * Responsavel por simular valores que o teste necessita para funcionar,
 * Mantendo toda operação limitada ao ambiente de teste
 * @author Lucas Sanches Marcílio Pereira
 * @since 2026
 * @version 1.0.0
 */
public class FabricaOperadorStub extends FabricaOperador{
    @Override
    public Funcionario criarFuncionario(){
        Operador operadorFake = new Operador();
        operadorFake.setId(999);
        operadorFake.setNome("Operador de Teste");
        return operadorFake;
    }
}
