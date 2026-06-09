package domain;

/**
 * Acordo de Nivel de Servico (SLA) associado a uma Falha.
 *
 * <p>Centraliza a regra de prazo de atendimento: em vez de a Falha guardar
 * um inteiro solto de "horas restantes", o tempo restante passa a ser
 * calculado (prazo maximo - horas decorridas). Esse valor e consumido tanto
 * pela estrategia de priorizacao por SLA quanto pelo observador MonitorSLA.</p>
 *
 * @author Gabriel Dias Santiago
 * @since 2026-06
 */
public class AcordoNivelServico {

    private int prazoMaximoHoras;
    private int horasDecorridas;

    /**
     * Cria um SLA com o prazo maximo informado e zero horas decorridas.
     *
     * @param prazoMaximoHoras prazo total acordado, em horas.
     */
    
    public AcordoNivelServico(int prazoMaximoHoras) {
        this.prazoMaximoHoras = prazoMaximoHoras;
        this.horasDecorridas = 0;
    }

    /**
     * Calcula quantas horas ainda restam antes do estouro do SLA.
     *
     * @return horas restantes (pode ser negativo se ja violado).
     */
    
    public int calcularTempoRestante() {
        return prazoMaximoHoras - horasDecorridas;
    }

    /**
     * Indica se o SLA foi violado (tempo restante esgotado).
     *
     * @return true se o prazo ja estourou.
     */
    
    public boolean verificarViolacao() {
        return calcularTempoRestante() <= 0;
    }

    /**
     * Registra o avanco do tempo decorrido desde a abertura da falha.
     *
     * @param horas horas decorridas acumuladas.
     */
    
    public void registrarHorasDecorridas(int horas) {
        this.horasDecorridas = horas;
    }

    public int getPrazoMaximoHoras() {
        return prazoMaximoHoras;
    }

    public int getHorasDecorridas() {
        return horasDecorridas;
    }
}