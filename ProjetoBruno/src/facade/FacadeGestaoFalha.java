/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import domain.Falha;
import model.DadosFalha;

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
    
    private Falha falha;
    /**
     * Abre uma nova falha no estado inicial ABERTO.
     *
     * @param dados Dados necessários para criação da falha.
     * @return Falha criada.
     */
    
     public FacadeGestaoFalha() {
    }
     
     /**
     * Abre uma nova falha no estado inicial ABERTO.
     *
     * @param dados dados de entrada da falha (titulo, descricao, maquina).
     * @return a {@link Falha} criada.
     */
    
    public Falha abrirFalha(DadosFalha dados) {

      if (falha == null) {
            falha = new Falha(dados);
        }    
        
    System.out.println("Validando dados...");
    System.out.println("Registrando incidente...");
    System.out.println("Associando máquina afetada...");

    return falha;
}
    /**
     * Altera o estado da falha para APROVADA.
     */

    public void aprovarFalha(int idFalha) {
        System.out.println("Aprovando falha..." + idFalha);
        falha.aprovar();
    }
    /**
     * Inicia o atendimento da falha por um tecnico.
     *
     * @param idFalha   identificador da falha.
     * @param idTecnico identificador do tecnico responsavel.
     */

    public void atenderFalha(int idFalha, int idTecnico) {
        System.out.println("Atendendo falha numero: " + idFalha + "" + "técnico: " + idTecnico);
        falha.iniciarAtendimento();
    }
    
    /**
     * Encerra a falha indicada.
     *
     * @param idFalha identificador da falha a encerrar.
     */
    
    public void encerrarFalha() {
        System.out.println("Encerrando falha...");
        falha.encerrar();
    }
    
    public void iniciarAnaliseFalha(int idFalha) {
    System.out.println("Iniciando analise da falha..." + idFalha);
    falha.iniciarAnalise();
    }
}
