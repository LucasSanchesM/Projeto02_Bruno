/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stubs;

import model.DadosFalha;

/**
 *
 * @author gabri
 */
/**
 * Stub de {@link DadosFalha} usado nos testes de transicao de estado.
 *
 * <p>Substitui a dependencia real de dados da falha: os getters retornam
 * valores fixos ("forcados") e independentes da logica real, garantindo
 * entradas previsiveis para o objeto sob teste.</p>
 *
 * @author Gabriel Dias Santiago
 * @since 2026-06-08
 */
public class DadosFalhaStub extends DadosFalha {

    public DadosFalhaStub() {
        // valores do super sao irrelevantes: serao sobrescritos pelos getters
        super("Falha", "Mecanica", 1);
    }

    @Override
    public String getDescricao() {
        return "Motor parou";
    }

    @Override
    public String getTipo() {
        return "Mecanica (stub)";
    }

    @Override
    public int getIdMaquina() {
        return 99; // valor "marcado" para evidenciar que vem do stub, nao do real
    }
}