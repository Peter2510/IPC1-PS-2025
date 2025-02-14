package ejemplo6;

public class Ejemplo6 {
    public static void main(String[] args) {

        int par = 0, impar = 0, ceros = 0;
        int numAleatorio;

        //constante, pues se indica que seran 15 valores
        final int TOTAL_NUMEROS = 15;

        for (int i = 0; i < TOTAL_NUMEROS; i++) {

            //generar numero aleatorio entre 0 y 36
            numAleatorio = (int) (Math.random() * 37);

            //imprimir el numero generado
            System.out.println(numAleatorio);

            //contar pares, impares y ceros
            if (numAleatorio == 0) {
                ceros++;
            } else if (numAleatorio % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        /*
        calcular los porcentajes (ya multiplicados por 100 para mostrar en porcentaje)
        se convierte el TOTAL_NUMEROS a double para que se pueda realizar la operacion
        */
        double porcentajePar = (par / (double) TOTAL_NUMEROS) * 100;
        double porcentajeImpar = (impar / (double) TOTAL_NUMEROS) * 100;
        double porcentajeCero = (ceros / (double) TOTAL_NUMEROS) * 100;

        
          //El f indica que se va a formatear un numero de punto flotante (es decir, un numero con decimales, como 3.14)
          //El .2 antes del f especifica que el numero debe ser mostrado con 2 decimales
          //El primer % de %% es un caracter de escape utilizado para imprimir el simbolo %
          //El segundo % de %% es el que se imprimira en consola
        

        System.out.printf("El porcentaje de numeros pares aleatorios generados es de: %.2f%%\n", porcentajePar);
        System.out.printf("El porcentaje de núueros impares aleatorios generados es de: %.2f%%\n", porcentajeImpar);
        System.out.printf("El porcentaje de ceros generados es de: %.2f%%\n", porcentajeCero);

    }
}
