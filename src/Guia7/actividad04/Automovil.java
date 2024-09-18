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
public class Automovil {
    String marca;
    String modelo;
    
    public void acelerar(int velocidad) {
        System.out.println("El automovil " + marca + " " + modelo + " está acelerando a " + velocidad + " km/h");
    }
     
     public void frenar(int desaceleracion) {
        System.out.println("El automovil " + marca + " " + modelo + " está frenando " + desaceleracion + " m/s²");
     }
    }
  
    

