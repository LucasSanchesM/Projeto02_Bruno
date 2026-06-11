/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stubs;

import Observer.ObservadorFalha;
import domain.Falha;

/**
 *
 * Classe responsável por simular observadores 
 * @author Ana Livia Vasconcellos
 * @since 2026
 */

public class ObserverStub implements ObservadorFalha{
    private int vezesNotificado = 0;
    
    public int getVezesNotificado(){
        return vezesNotificado;
    }
    
@Override
        public void atualizar(FalhaStub f) {
            vezesNotificado++;
        }

        
        /**
    @Override
    public void atualizar(Falha falha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
