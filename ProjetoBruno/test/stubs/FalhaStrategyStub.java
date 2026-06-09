/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stubs;

import domain.Falha;
import model.DadosFalha;

/**
 *
 * @author gabri
 */
public class FalhaStrategyStub extends Falha {

    private boolean maquinaParadaForcada;
    private int horasRestantesSLAForcadas = 24;

    public FalhaStrategyStub(DadosFalha dados) {
        super(dados);
    }

    @Override
    public void setMaquinaParada(boolean maquinaParada) {
        this.maquinaParadaForcada = maquinaParada;
    }

    @Override
    public boolean isMaquinaParada() {
        return maquinaParadaForcada;
    }

    public void setHorasRestantesSLAForcadas(int horas) {
        this.horasRestantesSLAForcadas = horas;
    }

    @Override
    public int getHorasRestantesSLA() {
        return horasRestantesSLAForcadas;
    }
}