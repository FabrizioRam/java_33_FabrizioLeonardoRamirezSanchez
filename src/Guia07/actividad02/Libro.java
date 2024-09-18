/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia07.actividad02;

/**
 *
 * @author Admin
 */
public class Libro {
    String titulo;
    String autor;
    
    public void mostrarInformacion() {
        System.out.println("Titulo"+ titulo);
        System.out.println("Autor"+ autor);
    }
    public void mostrarlibro(){
        System.out.println("El titulo del libro es" + titulo);
        System.out.println("El autor del libro es" + autor);
    
    }
}
