/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StrategyMTH;

import domain.Falha;

/**
 *
 * @author Panasonic
 */
public class DelegarFalha {
    Falha falha;

    public DelegarFalha(Falha falha) {
        this.falha = falha;
    }
    
    public Priorizacao prioriorizacao(boolean MaquinaStatus){
        if(falha.getCategoria().equals("Mecanica")){
        
            return new Impacto(MaquinaStatus);
        }else{
            return null;
        }
        
    } 
}
