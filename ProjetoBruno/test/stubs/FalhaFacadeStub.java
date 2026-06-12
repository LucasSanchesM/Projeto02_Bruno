/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stubs;
import domain.Falha;
import model.DadosFalha;
import services.EstadoFalha;
import state.EstadoEmAnalise;
import state.EstadoAprovado;
import state.EstadoEmAtendimento;
import state.EstadoEncerrado;


/**
 *Classe herdada de Falha, responsável por lidar com o Facade
 * @author Mirel
 */
public class FalhaFacadeStub extends Falha{
    
    private EstadoFalha estadoAtual;

    /**
    Cria uma instância do stub utilizando os dados informados.
    @param dados dados utilizados na criação da falha.
     * @param estado define um estado base para testes
    */
    public FalhaFacadeStub(DadosFalha dados) {
        super(dados);
    }
    /**
    Simula a transição para o estado EM_ANALISE.
    */
    @Override
    public void iniciarAnalise() {
    this.estadoAtual = new EstadoEmAnalise();
    }

    /**
    Simula a transição para o estado APROVADO.
    */
    @Override
    public void aprovar() {
    this.estadoAtual = new EstadoAprovado();
    }

    /**
    Simula a transição para o estado EM_ATENDIMENTO.
    */
    @Override
    public void iniciarAtendimento() {
    this.estadoAtual = new EstadoEmAtendimento();
    }

    /**
    Simula a transição para o estado ENCERRADO.
    */
    @Override
    public void encerrar() {
        this.estadoAtual = new EstadoEncerrado();
    }

    /**
    Retorna o estado atual armazenado pelo stub.
    @return estado atual da falha.
    */
    @Override
    public EstadoFalha getEstadoAtual() {
    return estadoAtual;
    }
    
}
