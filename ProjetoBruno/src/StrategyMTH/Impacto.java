/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StrategyMTH;

/**
 *
 * @author Panasonic
 */
public class Impacto implements Priorizacao{
    boolean MaquinaParada;

    public Impacto(boolean MaquinaParada) {
        this.MaquinaParada = MaquinaParada;
    }
    
    public String getNome(){
        return "impacto de produção";
        
        
    }
    
    public String getNivel(){
       if(MaquinaParada){
        return "Nivel Critico";
           
       }else{
           return "alto";
       }
   
       
    }
    
    
    
    
}
