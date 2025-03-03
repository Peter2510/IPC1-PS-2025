/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.herenciapolimorfismo;

/**
 *
 * @author peterg
 */
public class Leon extends Animal{

    private String tipoMelena;
    
    public Leon(String nombre, String tipoMelena) {
        super(nombre);
        this.tipoMelena = tipoMelena;
    }
    
    public void mostrarTipoMelena(){
        System.out.println("Mi tipo de melena es " + tipoMelena);
    }

    public String getTipoMelena() {
        return tipoMelena;
    }

    public void setTipoMelena(String tipoMelena) {
        this.tipoMelena = tipoMelena;
    }
    
    
    @Override
   public void hacerSonido(){
       System.out.println("Como soy un Leon, mi sonido es Roar");
    }
    
    
 
    
}
