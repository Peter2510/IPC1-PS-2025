/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.herenciapolimorfismo;

/**
 *
 * @author peterg
 */
public class Perro extends Animal{
    
    private String raza;

    public Perro(String raza, String nombre) {
        super(nombre);
        this.raza = raza;
    }
    
    public void mostrarRaza(){
        System.out.println("Mi raza es " + raza);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override
    public void mostrarNombre(){
       System.out.println("Soy un perro, y mi nombre es " + getNombre());
   }
    
    
}
