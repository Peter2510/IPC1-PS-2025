package ejemplo10;

import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String[] args) {

        int numeroMayor = 0;
        int contadorPares = 0, contadorSegundaDocena = 0, contadorImpares = 0, sumaPares = 0;
        int numero;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("\nIngresa un numero entre 0 y 36");
            numero = scanner.nextInt();

            //validar si el numero esta dentro del rango
            if (numero >= 0 && numero <= 36) {

                //encontrar el numero mayor
                if (numero > numeroMayor) {
                    numeroMayor = numero;
                }

                //contar los numeros en la segunda docena (13 a 24)
                if (numero >= 13 && numero <= 24) {
                    contadorSegundaDocena++;
                }

                //contar numeros impares
                if (numero % 2 != 0) {
                    contadorImpares++;
                }

                //contar numeros pares (excepto cero)
                if (numero % 2 == 0 && numero != 0) {
                    contadorPares++;
                    sumaPares += numero;
                }

            } else {
                System.out.println("Ingresa un numero entre 0 y 36.");
            }
        }

        //calcular el promedio de los numeros pares
        double promedioPares;

        if (contadorPares > 0) {
            promedioPares = (double) sumaPares / contadorPares;
        } else {
            promedioPares = 0;
        }
        
        //mostrar los resultados
        System.out.println("\nResultados:");
        System.out.println("Cantidad de numeros impares: " + contadorImpares);
        System.out.println("Promedio de numeros pares (sin contar ceros): " + promedioPares);
        System.out.println("Cantidad de numeros en la 2da docena (13-24): " + contadorSegundaDocena);
        System.out.println("Numero mas grande: " + numeroMayor);

        scanner.close();
    }
}
