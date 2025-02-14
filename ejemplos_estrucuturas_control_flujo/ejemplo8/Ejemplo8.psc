Algoritmo Ejercicio8

    //inicializar contadores y sumas
    contadorTemperaturas = 0
    sumaTemperaturas = 0.0

    Escribir "Ingrese la temperatura 1"
    leer temp1

    Mientras temp1 != 0 Hacer

        Si temp1 >= 5 Y temp1 <= 15 Entonces
            contadorTemperaturas = contadorTemperaturas + 1
            sumaTemperaturas = sumaTemperaturas + temp1
        Fin Si

        Escribir "Ingrese la temperatura 2"
        leer temp2

        Si temp2 >= 5 Y temp2 <= 15 Entonces
            contadorTemperaturas = contadorTemperaturas + 1
            sumaTemperaturas = sumaTemperaturas + temp2
        Fin Si

        //ssolicitar nuevamente la temperatura 1
        Escribir "Ingrese la temperatura 1"
        leer temp1

    Fin Mientras

    //calcular el promedio si hay temperaturas validas
    Si contadorTemperaturas > 0 Entonces
        promedio = sumaTemperaturas / contadorTemperaturas
        Escribir "El promedio de las temperaturas ingresadas entre 5° y 15° es de: ", promedio
    Sino
        Escribir "No se ingresaron temperaturas validas entre 5° y 15°"
    Fin Si

FinAlgoritmo
