package ejemplo4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //arreglo con un maximo de 10 estudiantes
        Estudiante[] estudiantes = new Estudiante[10];
        int contadorEstudiantes = 0;

        try {
            while (true) {
                System.out.println("\nSistema de registro de estudiantes");
                System.out.println("1. Registrar estudiante");
                System.out.println("2. Mostrar estudiantes registrados");
                System.out.println("3. Salir");
                System.out.print("Elige una opción: ");

                int opcion = 0;
                try {
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debes ingresar un numero valido");
                    scanner.nextLine();
                    //para que se reinicie el bucle while
                    continue;
                }

                if (opcion == 1) {
                    //registrar un estudiante
                    if (contadorEstudiantes >= estudiantes.length) {
                        System.out.println("No se pueden registrar más estudiantes, el sistema esta lleno");
                        continue;
                    }

                    System.out.print("Introduce el nombre del estudiante: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Introduce la edad del estudiante: ");
                    int edad = 0;
                    try {
                        edad = scanner.nextInt();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Error: La edad debe ser un numero valido");
                        scanner.nextLine();
                        //para volver al inicio del bucle
                        continue;
                    }

                    //validar que la edad sea mayor a 0
                    if (edad <= 0) {
                        System.out.println("Error: La edad debe ser mayor a 0");
                        continue;
                    }

                    System.out.print("Introduce el curso del estudiante: ");
                    String curso = scanner.nextLine();

                    //crear un nuevo estudiante y agregarlo al arreglo
                    Estudiante nuevoEstudiante = new Estudiante(nombre, edad, curso);
                    estudiantes[contadorEstudiantes] = nuevoEstudiante;
                    contadorEstudiantes++;

                    System.out.println("Estudiante registrado exitosamente");

                } else if (opcion == 2) {
                    //mostrar estudiantes registrados
                    if (contadorEstudiantes == 0) {
                        System.out.println("No hay estudiantes registrados");
                    } else {
                        System.out.println("\nEstudiantes registrados:");
                        for (int i = 0; i < contadorEstudiantes; i++) {
                            estudiantes[i].mostrarEstudiante();
                        }
                    }

                } else if (opcion == 3) {
                    //salir
                    System.out.println("Gracias por usar el sistema de registro de estudiantes");
                    break;
                } else {
                    System.out.println("Opción invalida");
                }
            }

        } catch (Exception e) {
            //capturar cualquier excepcion y mostrar el mensaje de error
            System.out.println("Error: " + e.getMessage());
        } finally {
            //cerrar el scanner independientemente de si hubo una excepcion o no
            scanner.close();
        }
    }
}