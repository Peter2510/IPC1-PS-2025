package ejemplo2;

public class Carro {
    
     // atributos de la clase Carro
     private String marca;
     private String modelo;
     private int velocidad;
 
     //constructor para inicializar los atributos
     public Carro(String marca, String modelo) {
         this.marca = marca;
         this.modelo = modelo;
         this.velocidad = 0;
     }
 
     //metodo para acelerar el carro
     public void acelerar(int incremento) {
         if (incremento >= 0) {
             this.velocidad = this.velocidad + incremento;
             System.out.println("El carro ha acelerado. Velocidad actual: " + this.velocidad + " km/h.");
         } else {
             System.out.println("Error: El incremento de velocidad no puede ser negativo.");
         }
     }
 
     //metodo para frenar el carro
     public void frenar(int decremento) {
         if (decremento >= 0) {
             this.velocidad = this.velocidad - decremento;
             if (this.velocidad < 0) {
                 this.velocidad = 0;
             }
             System.out.println("El carro ha frenado. Velocidad actual: " + this.velocidad + " km/h.");
         } else {
             System.out.println("Error: El decremento de velocidad no puede ser negativo.");
         }
     }
 
     //metodo para mostrar los datos del carro
     public void mostrarDatos() {
         System.out.println("Marca: " + this.marca);
         System.out.println("Modelo: " + this.modelo);
         System.out.println("Velocidad: " + this.velocidad + " km/h");
     }
}