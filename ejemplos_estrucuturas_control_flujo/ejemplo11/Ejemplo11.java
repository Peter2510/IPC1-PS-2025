package ejemplo11;

import java.util.Scanner;

public class Ejemplo11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // variables a usar
        int sumaAlturaHombres = 0, sumaAlturaMujeres = 0, sumaEdadHombres = 0, sumaEdadMujeres = 0;
        int contadorHombres = 0, contadorMujeres = 0, contadorEdad = 0;
        int altura, edad;
        double promedioAlturaHombres, promedioAlturaMujeres, promedioEdad;

        System.out.println("\nIngrese la altura (ingrese un valor negativo para finalizar): ");
        altura = sc.nextInt();

        //mientras la altura ingresada sea positiva
        while (altura >= 0) {

            System.out.println("Ingrese 1 si eres mujer o 2 si eres hombre");
            int sexo = sc.nextInt();

            System.out.println("Ingrese la edad: ");
            edad = sc.nextInt();

            //sumar contador segun el sexo
            //hombre
            if (sexo == 2) {
                contadorHombres++;
                sumaAlturaHombres += altura;
                sumaEdadHombres += edad;
            //mujer
            } else if (sexo == 1) {
                contadorMujeres++;
                sumaAlturaMujeres += altura;
                sumaEdadMujeres += edad;
            }

            //leer nueva altura para continuar
            System.out.println("\nIngrese la altura (ingrese un valor negativo para finalizar): ");
            altura = sc.nextInt();
        }

        //calculo de promedios
        if (contadorHombres > 0) {
            promedioAlturaHombres = (double) sumaAlturaHombres / contadorHombres;
        } else {
            //si no hay hombres
            promedioAlturaHombres = 0;
        }

        if (contadorMujeres > 0) {
            promedioAlturaMujeres = (double) sumaAlturaMujeres / contadorMujeres;
        } else {
            // Si no hay mujere
            promedioAlturaMujeres = 0;
        }

        //calculo del promedio de edad
        int totalParticipantes = contadorHombres + contadorMujeres;
        if (totalParticipantes > 0) {
            promedioEdad = (double) (sumaEdadHombres + sumaEdadMujeres) / totalParticipantes;
        } else {
             // Si no hay participantes
            promedioEdad = 0;
        }

        System.out.println("El promedio de altura de los varones es: " + promedioAlturaHombres);
        System.out.println("El promedio de altura de las mujeres es: " + promedioAlturaMujeres);
        System.out.println("El promedio de edad de los participantes es: " + promedioEdad);
        
        sc.close();
    }
}
