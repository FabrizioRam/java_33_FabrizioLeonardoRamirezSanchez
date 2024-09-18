/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7.actividad04;

/**
 *
 * @author Admin
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Automovil miAutomovil = new Automovil();
         miAutomovil.marca = "Toyota";
          miAutomovil.modelo = "Corolla";
         miAutomovil.acelerar(120);
         miAutomovil.frenar(5);
        
        
    }
    
}
