package ejemplo2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pedir marca y modelo al usuario
        System.out.print("Ingresa la marca del carro: ");
        String marca = scanner.nextLine();

        System.out.print("Ingresa el modelo del carro: ");
        String modelo = scanner.nextLine();

        // crear un objeto de tipo Carro
        Carro carro = new Carro(marca, modelo);

        // mostrar los datos iniciales del carro
        carro.mostrarDatos();

        // solicitar el incremento de velocidad
        boolean incrementoValido = false;
        int acelerar = 0;
        while (!incrementoValido) {
            try {
                System.out.print("Ingresa la cantidad de km/h para acelerar: ");
                acelerar = scanner.nextInt();
                if (acelerar < 0) {
                    System.out.println("Error: La cantidad para acelerar no puede ser negativa");
                } else {
                    // salir del bucle si la entrada es valida
                    incrementoValido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor ingresa un numero valido");
                scanner.nextLine();
            }
        }

        //acelerar el carro
        carro.acelerar(acelerar);

        // solicitar el decremento de velocidad
        boolean decrementoValido = false;
        int frenar = 0;
        while (!decrementoValido) {
            try {
                System.out.print("Ingresa la cantidad de km/h para frenar: ");
                frenar = scanner.nextInt();
                if (frenar < 0) {
                    System.out.println("Error: La cantidad para frenar no puede ser negativa");
                } else {
                    // salir del bucle si la entrada es vslida
                    decrementoValido = true; 
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor ingresa un numero valido.");
                scanner.nextLine();
            }
        }
        carro.frenar(frenar);

        // mostrar los datos finales del carro
        carro.mostrarDatos();

        //cerrar el scanner
        scanner.close();
    }
}
