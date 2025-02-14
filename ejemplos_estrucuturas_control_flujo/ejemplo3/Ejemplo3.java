package ejemplo3;

import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {

        // variables
        int numero, factorial;

        // definir el scanner

        Scanner sc = new Scanner(System.in);

        // solicitar el numero

        System.out.print("\nIngrese un numero: ");
        numero = sc.nextInt();
        sc.close();

        // salto de linea
        System.out.print("\n");

        if (numero >= 0) {

            if (numero == 1 || numero == 0) {

                System.out.println("El factorial es 1");

            }

            else {

                int aux = 1;
                factorial = 1;

                //calculo del factorial del numero ingresado
                while (aux < numero) {

                    aux++;

                    factorial = factorial * aux;

                }

                System.out.println("El factorial de " + numero + " es: " + factorial);
            }

        }

        else {
            System.out.println("Ingresa un numero positivo");
        }

    }
}
