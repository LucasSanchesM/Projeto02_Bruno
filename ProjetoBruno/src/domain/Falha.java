package domain;

import services.ObservadorFalha;
import java.util.ArrayList;
import java.util.List;
import model.DadosFalha;
import model.Prioridade;
import state.EstadoAberto;
import services.EstadoFalha;

/**
 * Concentra o dominio de toda a aplicação. Atualmente concentrando o uso do
 * padrão State State: ele basicamente delega as transições para o objeto de
 * estado atual
 *
 * @author Gabriel Dias Santiago
 * @since 2026
 * @version 1.0.0
 *
 */
public class Falha {

    private String titulo;
    private String categoria;
    private EstadoFalha estadoAtual = new EstadoAberto();
    private int horasRestantesSLA = 24;
    private boolean maquinaParada;
    private Prioridade prioridade;
    public final List<ObservadorFalha> observadores = new ArrayList<>();

    /**
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

    /**
     * @param justificativa variavel reponsavel por definir a justificativa da
     * troca para o estado recusado
     */
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

    /**
     * @return Retorna o estado do processo de resolução da falha
     */
    public EstadoFalha getEstadoAtual() {
        return estadoAtual;
    }

    /**
     * @return Retorna o valor armazenado dentro do atributo titulo da classe
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return Retorna o valor armazenado dentro do atributo categoria da classe
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param titulo Define o atributo titulo para a string recebida
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     *
     * @param categoria Define o atributo categoria para a String recebida
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @param novoEstado Define o atributo estadoAtual para o novo estado
     * recebido
     */
    public void setEstado(EstadoFalha novoEstado) {
        this.estadoAtual = novoEstado;
    }

    /**
     * @return Retorna o valor armazenado dentro do atributo horasRestantesSla
     * da classe
     */
    public int getHorasRestantesSLA() {
        return horasRestantesSLA;
    }

    /**
     * @return Retorna o valor armazenado dentro do atributo maquinaParada da
     * classe
     */
    public boolean isMaquinaParada() {
        return maquinaParada;
    }

    /**
     *
     * @param maquinaParada Valor recebido para a definição no atributo da
     * classe
     */
    public void setMaquinaParada(boolean maquinaParada) {
        this.maquinaParada = maquinaParada;
    }

    /**
     * @return Retorna o objeto armazenado no atributo da classe
     */
    public Prioridade getPrioridade() {
        return prioridade;
    }

    /**
     * @param o Objeto usado para adicionar um novo observerdor na lista de
     * observadores
     */
    public void adicionarObservador(ObservadorFalha o) {
        observadores.add(o);
    }

    /**
     * @param o Objeto usado para adicionar um novo observerdor na lista de
     * observadores
     */
    public void removerObservador(ObservadorFalha o) {
        observadores.remove(o);
    }

    public void notificarObservadores() {
        for (ObservadorFalha o : observadores) {
            o.atualizar(this);
        }
    }

    /**
     * @param horas valor recebido usado para definir o atributo
     * horasRestantesSLA
     */
    public void atualizarHorasRestantes(int horas) {
        this.horasRestantesSLA = horas;
    }

}
