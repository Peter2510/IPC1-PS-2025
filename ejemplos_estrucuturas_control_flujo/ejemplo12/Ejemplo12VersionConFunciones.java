package ejemplo12;

import java.util.Scanner;

public class Ejemplo12VersionConFunciones {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        //ciclo principal del menu
        do {
            //mostrar el menu y obtener la opcion del usuario
            opcion = mostrarMenu(sc);
            
            // Ejecutar la operación correspondiente según la opcion
            switch (opcion) {
                case 1:
                    sumarNumeros(sc);
                    break;
                case 2:
                    dividirNumeros(sc);
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("\nopcion no valida. Por favor, ingresa 1, 2 o 3.");
                    break;
            }
        //continuar hasta que el usuario elija la opcion 3    
        } while (opcion != 3);

        sc.close();
    }
    
    //ffuncion para mostrar el menu y obtener la opcion del usuario
    public static int mostrarMenu(Scanner sc) {
        System.out.println("\nIngresa 1 para sumar dos numeros, 2 para dividir dos numeros y 3 para salir");
        return sc.nextInt();
    }

    //funcion para sumar dos numeros
    public static void sumarNumeros(Scanner sc) {
        System.out.println("\nIngresa el primer numero para sumar:");
        int num1 = sc.nextInt();
        System.out.println("Ingresa el segundo numero para sumar:");
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + suma);
    }

    //funcion para dividir dos numeros
    public static void dividirNumeros(Scanner sc) {
        System.out.println("\nIngresa el primer numero para dividir:");
        int num1 = sc.nextInt();
        System.out.println("Ingresa el segundo numero para dividir:");
        int num2 = sc.nextInt();

        //verificar si se intenta dividir por cero
        if (num2 == 0) {
            System.out.println("No se puede dividir entre cero.");
        } else {
            double division = (double) num1 / num2;
            System.out.println("La division de " + num1 + " entre " + num2 + " es: " + division);
        }
    }
}
