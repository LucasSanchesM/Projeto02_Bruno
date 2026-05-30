package domain;

import FacadeGestaoFalha.DadosFalha;

/**
 * @author gabri
 */

public class Falha {
    private String titulo;
    private String categoria;
    private String estadoAtual = "ABERTO"; // começa em ABERTO

    public Falha(DadosFalha dados) {
        this.titulo = dados.getDescricao();
        this.categoria = dados.getTipo();
    }

    public void iniciarAnalise() {
        this.estadoAtual = "EM_ANALISE";
    }

    public String getEstadoAtual() {
        return this.estadoAtual; 
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }
}