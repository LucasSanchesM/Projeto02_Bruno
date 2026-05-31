/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;
/**
 * Fachada responsável por centralizar e simplificar o gerenciamento
 * do ciclo de vida de uma falha.
 *
 * Permite abrir uma falha e controlar suas transições de estado
 * por meio de uma interface única.
 *
 * @author Mirel
 */
public class FacadeGestaoFalha {
    private FacadeFalha falha;
    /**
     * Abre uma nova falha no estado inicial ABERTO.
     *
     * @param dados Dados necessários para criação da falha.
     * @return Falha criada.
     */
    public FacadeFalha abrirFalha(FacadeDadosFalha dados) {

    System.out.println("Validando dados...");
    System.out.println("Registrando incidente...");
    System.out.println("Associando máquina afetada...");

    falha = new FacadeFalha(
            dados.getTitulo(),
            dados.getDescricao(),
            dados.getMaquina(),
            "ABERTO"
    );
    /**
     * Altera o estado da falha para EM_ANALISE.
     */

    return falha;
}
    public void iniciarAnalise() {
        System.out.println("Iniciando análise...");
        falha.setEstado("EM_ANALISE");
    }
    /**
     * Altera o estado da falha para APROVADA.
     */

    public void aprovarFalha() {
        System.out.println("Aprovando falha...");
        falha.setEstado("APROVADA");
    }
    /**
     * Altera o estado da falha para EM_ATENDIMENTO.
     */

    public void atenderFalha() {
        System.out.println("Atendendo falha...");
        falha.setEstado("EM_ATENDIMENTO");
    }
}
