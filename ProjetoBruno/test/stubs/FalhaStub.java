/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stubs; 
 
import domain.Falha; 
import model.DadosFalha; 
import services.EstadoFalha; 
import services.ObservadorFalha;
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
    /**
     * 
     * @return Retorna o valor do tipo armazenado em dados internos 
     */
    @Override
    public String getCategoria() {
        return this.dadosInternos.getTipo();
    }
    /**
     * 
     * @param horas  define as horas restantes
     */
    @Override
    public void atualizarHorasRestantes(int horas){
        this.horasRestantes = horas;
    }
    /**
     * 
     * @return Retorna a hora definida 
     */
    @Override
    public int getHorasRestantesSLA(){
        return horasRestantes;
    }
    /**
     * 
     * @param maquinaParada Define a maquina como parada 
     */
    @Override
    public void setMaquinaParada(boolean maquinaParada) {
        this.maquinaParada = maquinaParada;
    }
/**
 * 
 * @return Reorna o estado da maquina 
 */
    @Override
    public boolean isMaquinaParada() {
        
        return this.maquinaParada;
    }
/**
 * 
 * @return Retorna o estado atual 
 */
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
/**
 * 
 * @param novoEstado define um novo estado  
 */   
    @Override 
    public void setEstado(EstadoFalha novoEstado) { 
        this.estadoAtual = novoEstado; 
    } 
 
}

