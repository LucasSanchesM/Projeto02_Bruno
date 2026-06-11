/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stubs; 
 
import domain.Falha; 
import model.DadosFalha; 
import services.EstadoFalha; 
import Observer.ObservadorFalha;
import domain.Falha;
import model.DadosFalha;
import services.EstadoFalha;
 
public class FalhaStub extends Falha { 
 
    private EstadoFalha estadoAtual; 
    private boolean maquinaParada;
    private int horasRestantes = 24;
    public String categoria;
    // ALTERAÇÃO: Atributo adicionado para guardar a referência do stub de dados recebido
    private final DadosFalha dadosInternos; 


/**
 * Stub (classe Falha)
 *
 * <p>Estende a Falha real e sobrescreve apenas o necessario para SUBSTITUIR
 * o comportamento real por respostas controladas: setEstado() apenas ARMAZENA
 * o estado recebido e getEstadoAtual() o DEVOLVE. Nenhum observador e
 * notificado e nenhum efeito colateral da Falha real e executado.</p>
 *
 * <p>Trata-se de um stub: ele nao registra nem expoe interacoes (numero
 * de chamadas, etc.). A verificacao nos testes e feita exclusivamente pelo
 * ESTADO resultante obtido via getEstadoAtual().</p>
 */
    public FalhaStub(DadosFalha dados) { 
        super(dados); 
        this.dadosInternos = dados; 
    } 
    @Override
    public String getCategoria() {
        return this.dadosInternos.getTipo();
    }
    
    @Override
    public void atualizarHorasRestantes(int horas){
        this.horasRestantes = horas;
    }
    
    @Override
    public int getHorasRestantesSLA(){
        return horasRestantes;
    }
    
    @Override
    public void setMaquinaParada(boolean maquinaParada) {
        this.maquinaParada = maquinaParada;
    }

    @Override
    public boolean isMaquinaParada() {
        
        return this.maquinaParada;
    }

    @Override
    public EstadoFalha getEstadoAtual() {
        return estadoAtual;
    }
    
    @Override
   public void notificarObservadores() {
        for (ObservadorFalha o : observadores) {
            o.atualizar(this);
        }
    }
   
    @Override 
    public void setEstado(EstadoFalha novoEstado) { 
        this.estadoAtual = novoEstado; 
    } 
 
}

