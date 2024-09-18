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
public class persona {
    String nombre;
    int edad;
    
    
    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        
    }
    public String obtenerInformacion() {
      return "Nombre: " + nombre + ", Edad: " + edad;
        
    }
     public void cumplirAño() {
         edad++;
     }
}
