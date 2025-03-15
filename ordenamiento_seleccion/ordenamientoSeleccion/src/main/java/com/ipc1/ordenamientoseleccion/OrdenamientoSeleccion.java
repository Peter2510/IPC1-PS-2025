/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ipc1.ordenamientoseleccion;

/**
 *
 * @author peterg
 */
public class OrdenamientoSeleccion {

    
    public static void ordenamientoPorSeleccion(int[] arr){
        
        
        for (int i = 0; i < arr.length -1; i++) {
            
            //suponer que el primer elemento es el menor
            int menor = i;
            
            for (int j = i +1; j < arr.length; j++) {
                
                if(arr[j]<arr[menor]){
                    menor = j;
                }
                
            }
            
            int temporal = arr[menor];
            arr[menor] = arr[i];
            arr[i] = temporal;
            
            
        }
        
        
    }
    
    
    public static void main(String[] args) {
       int[] numeros = {48,59,68,1,56};
       
        ordenamientoPorSeleccion(numeros);
       
        System.out.println("Arreglo ordenado");
        for(int num: numeros){
            System.out.println(num + "");
            
        }
    }
}
