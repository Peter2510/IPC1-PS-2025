/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.herenciapolimorfismo;

/**
 *
 * @author peterg
 */
public class Animal {
    
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
 
    public void hacerSonido(){
        System.out.println("El animal hace un sonido...");
    }
    
    public void hacerSonido(String sonido){
        System.out.println("El animal hace un sonido el cual es un " + sonido);
    }
    
    public void mostrarNombre(){
        System.out.println("Mi nombre es" + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}

