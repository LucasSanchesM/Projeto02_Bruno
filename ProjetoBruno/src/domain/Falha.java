package domain;

import model.DadosFalha;
import state.EstadoAberto;
import state.EstadoFalha;

/**
 * @author Gabriel Dias Santiago
 * Aqui concentra o dominio de toda a aplicação, atualmente concentrando o uso do padrão State
 * State: ele basicamente delega as transições para o objeto de estado atual
 */

public class Falha {
    
    private String titulo;
    private String categoria;
    private EstadoFalha estadoAtual = new EstadoAberto();

    public Falha(DadosFalha dados) {
        this.titulo = dados.getDescricao();
        this.categoria = dados.getTipo();
    }

    public void iniciarAnalise() {
        estadoAtual.iniciarAnalise(this);
    }
    
    public void aprovar() {
        estadoAtual.aprovar(this);
    }
    
     public void recusar(String justificativa) {
        estadoAtual.recusar(this);
    }

    public void iniciarAtendimento() {
        estadoAtual.iniciarAtendimento(this);
    }

    public void concluir() {
        estadoAtual.concluir(this);
    }

    public void encerrar() {
        estadoAtual.encerrar(this);
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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

      public void setEstado(EstadoFalha novoEstado) {
        this.estadoAtual = novoEstado;
    }
    
    
}