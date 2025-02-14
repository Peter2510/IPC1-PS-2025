package ejemplo5;

import java.util.Scanner;

public class Ejemplo5 {
    public static void main(String[] args) {

        // inicializar variables
        int edad;
        int mayoresIgualesVeinte = 0;
        int menoresVeinte = 0;
        int sumaEdadMayoresVeinte = 0;
        int sumaEdadMenoresVeinte = 0;
        Scanner scanner = new Scanner(System.in);

        // solicitar las edades de 10 personas
        for (int i = 0; i < 10; i++) {
            System.out.println("\nIngresa la edad:");
            edad = scanner.nextInt();

            // verificar si la persona es mayor o igual a 25 años
            if (edad >= 25) {
                mayoresIgualesVeinte++;
                sumaEdadMayoresVeinte += edad;
            } else {
                menoresVeinte++;
                sumaEdadMenoresVeinte += edad;
            }
        }

        // cerrar el scanner
        scanner.close();

        // calcular los promedios despues del ciclo
        int promMayoresIguales = 0;
        int promMenoresVeinte = 0;

        // verificar si hay personas en cada grupo antes de calcular los promedios
        if (mayoresIgualesVeinte > 0) {
            promMayoresIguales = sumaEdadMayoresVeinte / mayoresIgualesVeinte;
        }

        if (menoresVeinte > 0) {
            promMenoresVeinte = sumaEdadMenoresVeinte / menoresVeinte;
        }

        // mostrar resultados
        System.out.println("\nEl promedio de edad de las personas menores a 25 años es de " + promMenoresVeinte
                + " años, y el promedio de las personas con 25 años o más es de " + promMayoresIguales + " años");
    }
}
