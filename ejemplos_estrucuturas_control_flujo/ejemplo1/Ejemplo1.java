package ejemplo1;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {

        // variables
        int numeroUsuario, numAleatorio;
        int par = 0;
        int impar = 0;

        // Definiendo el scanner
        Scanner sc = new Scanner(System.in);

        // Solicitar el numero

        System.out.println("\nIngrese un numero:");
        numeroUsuario = sc.nextInt();
        System.out.println("\n");
        sc.close();

        // Generar numeros aleatorios

        for (int i = 0; i < numeroUsuario; i++) {

            // generar numero aleatorio entre 10 y 50
            numAleatorio = (int) (Math.random() * (100 - 1) + 1);
            System.out.println(numAleatorio);

            if ((numAleatorio % 2) == 0) {

                par = par + 1;

            }

            else {
                impar = impar + 1;
            }

        }

        System.out.println("\nSe generaron " + numeroUsuario + " numeros aleatorios, donde " + par
                + " son numeros pares y " + impar + " son numeros impares");

    }
}
