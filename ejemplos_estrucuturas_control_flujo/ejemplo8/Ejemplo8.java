package ejemplo8;

import java.util.Scanner;

public class Ejemplo8 {
    public static void main(String[] args) {

        Double promedio = 0.0;
        Double totalTemperaturaValidas = 0.0;
        int contador = 0;
        Double temperatura1 = 0.0, temperatura2 = 0.0;

        Scanner sc = new Scanner(System.in);

        while (true) {

            //leer temperatura 1
            System.out.println("Ingresa la temperatura 1:");
            temperatura1 = sc.nextDouble();

            //si T1 es 0, detener el ciclo
            if (temperatura1 == 0) {
                break;
            }

            //leer temperatura 2
            System.out.println("Ingresa la temperatura 2:");
            temperatura2 = sc.nextDouble();

            //validar que T1 y T2 esten en el rango de 5 a 15
            if (temperatura1 >= 5 && temperatura1 <= 15) {
                totalTemperaturaValidas += temperatura1;
                contador++;
            }

            if (temperatura2 >= 5 && temperatura2 <= 15) {
                totalTemperaturaValidas += temperatura2;
                contador++;
            }
        }

        //calcular el promedio si se ingresaron temperaturas validas
        if (contador > 0) {
            promedio = totalTemperaturaValidas / contador;
            System.out.printf("El promedio de las temperaturas entre 5° y 15° es: %.2f \n", promedio);
        } else {
            System.out.println("No se ingresaron temperaturas dentro del rango de 5° a 15°");
        }

        sc.close();
    }
}
