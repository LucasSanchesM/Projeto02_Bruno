/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StrategyMTH;

/**
 *
 * @author Panasonic
 */
public class PriorizarAutomatica {
    Priorizacao estrategia;

    public PriorizarAutomatica(Priorizacao estrategia) {
        this.estrategia = estrategia;
        
    }

     public String RetornarNivel(){
     
        return estrategia.getNivel();
    }
     
     public String retornarnome(){
         return estrategia.getNome();
     }
     
 
}
