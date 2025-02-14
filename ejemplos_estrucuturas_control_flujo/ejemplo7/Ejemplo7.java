package ejemplo7;

import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args) {

        int numAleatorio;
        String opcion;

        Scanner sc = new Scanner(System.in);

        do {
            //generar un numero aleatorio multiplo de 5 entre 5 y 500
            numAleatorio = (int) (Math.random() * 100) * 5 + 5;

            //mostrar el numero generado
            System.out.println("\nNumero aleatorio multiplo de 5: " + numAleatorio);

            //solicitar al usuario si quiere continuar o salir
            System.out.println("\nIngresa cualquier caracter para continuar o 'S' para salir");
            opcion = sc.nextLine();

             // El ciclo continuara hasta que el usuario ingrese "S"
        } while (!opcion.equalsIgnoreCase("S")); 

        sc.close();

        System.out.println("¡Has salido del programa!");
    }
}
