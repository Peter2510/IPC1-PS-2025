Algoritmo Ejercicio6

    //inicializar variables
    total = 15
    pcjPar = 0
    pcjImpar = 0
    pcjCero = 0
    Npar = 0
    NImpar = 0
    Ncero = 0

    //bucle para generar 15 numeros aleatorios
    Para i <- 1 Hasta total Con Paso 1 Hacer

        //generar numero aleatorio entre 0 y 36
        numAleatorio = GenerarAleatorio(0, 36)

        //si el numero es cero, incrementar Ncero
        Si numAleatorio = 0 Entonces
            Ncero = Ncero + 1
        Sino
            //si el numero es par, incrementar Npar
            Si numAleatorio MOD 2 = 0 Entonces
                Npar = Npar + 1
            Sino
                //si el numero es impar, incrementar NImpar
                NImpar = NImpar + 1
            Fin Si
        Fin Si

    Fin Para

    //calcular los porcentajes
    pcjPar = (Npar * 100) / total
    pcjImpar = (NImpar * 100) / total
    pcjCero = (Ncero * 100) / total

    //mostrar resultados
    Escribir "El porcentaje de numeros pares aleatorios generados es de:", pcjPar, " porciento"
    Escribir "El porcentaje de numeros impares aleatorios generados es de:", pcjImpar, " porciento"
    Escribir "El porcentaje de ceros generados es de:", pcjCero, " porciento"

FinAlgoritmo
