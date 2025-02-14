package ejemplo9;

import java.util.Scanner;

public class ejemplo9 {
    public static void main(String[] args) {

        int suma = 0;
        int contadorMultiplos = 0;
        int sumaIntervalo = 0;

        Scanner sc = new Scanner(System.in);

        do {

            // pedir al usuario que ingrese un numero
            System.out.println("\nIngresa un numero: ");
            int num = sc.nextInt();

            // verificar si el numero es multiplo de 6
            if (num % 6 == 0) {
                contadorMultiplos++;
            }

            // verificar si el numero esta entre 1 y 10
            if (num >= 1 && num <= 10) {
                sumaIntervalo += num;
            }

            // sumar el numero a la suma total
            suma += num;

            // mostrar los resultados hasta el momento
            System.out.println("La cantidad de numeros multiplo de 6 es: " + contadorMultiplos
                    + " , la suma de los numeros entre 1 y 10 (incluidos) es de: " + sumaIntervalo
                    + " y la suma total es de: " + suma);

        // continuar hasta que la suma total sea mayor o igual a 1000
        } while (suma < 1000); 

        // mensaje final cuando la suma total alcanza 1000
        System.out.println("\nLa suma total alcanzo los 1000.");
        System.out.println("La cantidad de numeros multiplo de 6 es: " + contadorMultiplos
                + " , la suma de los numeros entre 1 y 10 (incluidos) es de: " + sumaIntervalo
                + " y la suma total es de: " + suma);

        sc.close();
    }
}
