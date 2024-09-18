/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.actividad03;

/**
 *
 * @author Admin
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Lapiz miLapiz = new Lapiz();
        miLapiz.setColor("Rojo");
        miLapiz.setLongitud(14.0);
               
       System.out.println("Color del lápiz: " + miLapiz.getColor());
       System.out.println("Longitud del lápiz: " + miLapiz.getLongitud() + " cm");
       
    }   
}
