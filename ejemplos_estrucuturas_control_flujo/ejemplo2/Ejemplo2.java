package ejemplo2;

import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {

        // variable
        int contador;

        // definir el scanner

        Scanner sc = new Scanner(System.in);

        // Solicitar el numero

        System.out.print("\nIngrese un numero: ");
        int numero = sc.nextInt();
        sc.close();

        // salto de linea
        System.out.print("\n");
        contador = numero;

        // mostrar del numero ingresado al 1

        System.out.println(numero);
        // mientras el contador sea mayor a 1
        while (contador > 1) {

            // disminuir en uno
            contador = contador - 1;

            // mostrar el numero disminuido
            System.out.println(contador);

        }

    }
}
