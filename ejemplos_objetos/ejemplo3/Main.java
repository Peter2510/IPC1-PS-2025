package ejemplo3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            //pedir al usuario el nombre del producto
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();

            //solicitar al usuario el precio del producto y validar el tipo de dato
            double precio = 0;
            boolean precioValido = false;
            while (!precioValido) {
                System.out.print("Ingrese el precio del producto: Q.");
                try {
                    precio = scanner.nextDouble();
                    //si se ingresa un numero valido, salimos del ciclo
                    precioValido = true; 
                } catch (InputMismatchException e) {
                    //si ocurre un error de tipo, se muestra un mensaje de error
                    System.out.println("Error: Debe ingresar un numero valido para el precio.");
                    scanner.nextLine(); 
                }
            }

            //crear un objeto Producto con los valores ingresados
            Producto producto = new Producto(nombre, precio);

            //verficar si el precio es negativo
            if (producto.precio < 0) {
                throw new Exception("El precio no puede ser negativo.");
            }

            System.out.println("Producto: " + producto.nombre + ", Precio: Q." + producto.precio);

        } catch (Exception e) {
            //si hay error se captura la excepcion y muestra el mensaje de error
            System.out.println("Error: " + e.getMessage());
        } finally {
            //por defecto cerrar el scanner incluso si hay una excepcion
            scanner.close();
        }
    }
}
