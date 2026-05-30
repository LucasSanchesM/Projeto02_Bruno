/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

/**
 *
 * @author Gabriel Dias Santiago
 */
public class EstadoRecusado implements EstadoFalha{
    
    @Override
    public String nome() {
        return "RECUSADO";
    }
    
}
