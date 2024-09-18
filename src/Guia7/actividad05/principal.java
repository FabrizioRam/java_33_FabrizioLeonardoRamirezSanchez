/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7.actividad05;

/**
 *
 * @author Admin
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       persona persona1 = new persona("Juan Pérez", 30);
       System.out.println(persona1.obtenerInformacion());
       persona1.cumplirAño();
       System.out.println(persona1.obtenerInformacion());
    }
    
}
