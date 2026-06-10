package domain;

import Observer.ObservadorFalha;
import java.util.ArrayList;
import java.util.List;
import model.DadosFalha;
import model.Prioridade;
import state.EstadoAberto;
import services.EstadoFalha;

/**
 * @author Gabriel Dias Santiago
 * Aqui concentra o dominio de toda a aplicação, atualmente concentrando o uso do padrão State
 * State: ele basicamente delega as transições para o objeto de estado atual
 */

public class Falha {
    
    private String titulo;
    private String categoria;
    private EstadoFalha estadoAtual = new EstadoAberto();
    private int horasRestantesSLA = 24;
    private boolean maquinaParada;
    private Prioridade prioridade;
    private final List<ObservadorFalha> observadores = new ArrayList<>();

    /**
     * 
     * @param dados Obtem a descrição e o tipo que está no objeto obtido
     */
    public Falha(DadosFalha dados) {
        this.titulo = dados.getDescricao();
        this.categoria = dados.getTipo();
    }
    
    public void iniciarAnalise() {
        estadoAtual.iniciarAnalise(this);
        notificarObservadores();
    }
    
    public void aprovar() {
        estadoAtual.aprovar(this);
        notificarObservadores();
    }
    
     public void recusar(String justificativa) {
        estadoAtual.recusar(this, justificativa);
    }

    public void iniciarAtendimento() {
        estadoAtual.iniciarAtendimento(this);
        notificarObservadores();
    }

    public void concluir() {
        estadoAtual.concluir(this);
        notificarObservadores();
    }

    public void encerrar() {
        estadoAtual.encerrar(this);
        notificarObservadores();
    }

    public EstadoFalha getEstadoAtual() {
       return estadoAtual;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }
    /**
     * 
     * @param titulo Define o atributo titulo para a string recebida 
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * 
     * @param categoria  Define o atributo categoria para a String recebida
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    /**
     * 
     * @param novoEstado Define o atributo estadoAtual para o novo estado recebido
     */
      public void setEstado(EstadoFalha novoEstado) {
        this.estadoAtual = novoEstado;
    }
      
    public int getHorasRestantesSLA() {
      return horasRestantesSLA;
    }
    
     public boolean isMaquinaParada() {
        return maquinaParada;
    }

    public void setMaquinaParada(boolean maquinaParada) {
        this.maquinaParada = maquinaParada;
    }
    
    public Prioridade getPrioridade() {
        return prioridade;
    }
    
    public void adicionarObservador(ObservadorFalha o) {
        observadores.add(o);
    }

    public void removerObservador(ObservadorFalha o) {
        observadores.remove(o);
    }

    public void notificarObservadores() {
        for (ObservadorFalha o : observadores) {
            o.atualizar(this);
        }
    }
    
    public void atualizarHorasRestantes(int horas){
        this.horasRestantesSLA = horas;
    }
    
    
}