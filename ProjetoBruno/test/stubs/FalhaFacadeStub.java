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
 *
 * @author Mirel
 */
public class FalhaFacadeStub extends Falha{
    
    private EstadoFalha estadoAtual;

    public FalhaFacadeStub(DadosFalha dados) {
        super(dados);
    }

    @Override
    public void iniciarAnalise() {
        this.estadoAtual = new EstadoEmAnalise();
    }

    @Override
    public void aprovar() {
        this.estadoAtual = new EstadoAprovado();
    }

    @Override
    public void iniciarAtendimento() {
        this.estadoAtual = new EstadoEmAtendimento();
    }

    @Override
    public void encerrar() {
        this.estadoAtual = new EstadoEncerrado();
    }

    @Override
    public EstadoFalha getEstadoAtual() {
        return estadoAtual;
    }
    
}
