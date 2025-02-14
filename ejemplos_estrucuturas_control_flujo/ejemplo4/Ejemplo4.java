package ejemplo4;

import java.util.Scanner;

public class Ejemplo4 {

    public static void main(String[] args) {
        // definir variables
        int continuarIngreso = 0;
        int cantidadMujeresMayoresEdad = 0;
        int cantidadMujeresMenoresEdad = 0;
        int cantidadHombresMayoresEdad = 0;
        int cantidadHombresMenoresEdad = 0;

        // crear el objeto scanner para leer datos
        Scanner scanner = new Scanner(System.in);

        // ingresar datos hasta que el usuario decida salir (opción 5)
        while (true) {

            // solicitar sexo
            System.out.println("\nIngresa 1 si eres mujer o 2 si eres hombre (o 5 para salir):");
            int entradaUsuario = scanner.nextInt();

            // si el usuario ingresa 5, termina el ciclo
            if (entradaUsuario == 5) {
                break;
            }
            
            // si la opcion de entrada no es valida, se vuelve a preguntar
            if (entradaUsuario != 1 && entradaUsuario != 2) {
                System.out.println("Opción invalida. Por favor ingresa 1 para mujer o 2 para hombre.");
                continue;
            }

            // solicitar edad
            System.out.println("Ingresa tu edad:");
            int edad = scanner.nextInt();

            // procesar segun sexo y edad
            // mujer
            if (entradaUsuario == 1) {
                if (edad >= 18) {
                    // mujer mayor de edad
                    cantidadMujeresMayoresEdad++;
                } else {
                    // mujer menor de edad
                    cantidadMujeresMenoresEdad++;
                }
            } else if (entradaUsuario == 2) {
                if (edad >= 18) {
                    // hombre mayor de edad
                    cantidadHombresMayoresEdad++;
                } else {
                    // hombre menor de edad
                    cantidadHombresMenoresEdad++;
                }
            }
        }

        // mostrar resultados
        System.out.println("La cantidad de mujeres mayores de edad es: " + cantidadMujeresMayoresEdad);
        System.out.println("La cantidad de hombres menores de edad es: " + cantidadHombresMenoresEdad);

        // cerrar el scanner
        scanner.close();
    }
}
