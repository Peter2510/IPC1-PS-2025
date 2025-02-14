package ejemplo12;

import java.util.Scanner;

public class Ejemplo12VersionSimple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        int num1, num2;

        //ciclo principal del menu
        do {
            //mostrar el menu
            System.out.println("\nIngresa 1 para sumar dos numeros, 2 para dividir dos numeros y 3 para salir");
            opcion = sc.nextInt();

            //realizar la operacion correspondiente segun la opcion
            switch (opcion) {
                case 1:
                    //sumar dos numeros
                    System.out.println("\nIngresa el primer numero para sumar:");
                    num1 = sc.nextInt();
                    System.out.println("Ingresa el segundo numero para sumar:");
                    num2 = sc.nextInt();
                    int suma = num1 + num2;
                    System.out.println("La suma de " + num1 + " + " + num2 + " es: " + suma);
                    break;

                case 2:
                    //dividir dos numeros
                    System.out.println("\nIngresa el primer numero para dividir:");
                    num1 = sc.nextInt();
                    System.out.println("Ingresa el segundo numero para dividir:");
                    num2 = sc.nextInt();
                    
                    //verificar si se intenta dividir por cero
                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre cero.");
                    } else {
                        double division = (double) num1 / num2;
                        System.out.println("La division de " + num1 + " entre " + num2 + " es: " + division);
                    }
                    break;

                case 3:
                    //salir
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    //opcion invalida
                    System.out.println("\nOpcion no valida. Por favor, ingresa 1, 2 o 3.");
                    break;
            }
        //continuar hasta que el usuario elija la opcion 3
        } while (opcion != 3); 

        sc.close();
    }
}
