Algoritmo Ejercicio5

    // Inicializar variables
    mayoresigualesveint <- 0
    menoresveint <- 0
    sumaEdadMayoresveint <- 0
    sumaEdadMenoresveint <- 0

    Para i <- 1 Hasta 10 Con Paso 1 Hacer

        Escribir "Ingresa la edad"
        Leer edad

        Si edad >= 25 Entonces
            mayoresigualesveint <- mayoresigualesveint + 1
            sumaEdadMayoresveint <- sumaEdadMayoresveint + edad
        Sino
            menoresveint <- menoresveint + 1
            sumaEdadMenoresveint <- sumaEdadMenoresveint + edad
        Fin Si

    Fin Para

    // Calcular promedios
    Si mayoresigualesveint > 0 Entonces
        promMayoresigualesveinte <- sumaEdadMayoresveint / mayoresigualesveint
    Sino
        promMayoresigualesveinte <- 0
    Fin Si

    Si menoresveint > 0 Entonces
        promMenoresveint <- sumaEdadMenoresveint / menoresveint
    Sino
        promMenoresveint <- 0
    Fin Si

    // Mostrar resultados
    Escribir "El promedio de edad de las personas menores a 25 es de ", promMenoresveint, " años, y el promedio de las personas con 25 años o más es de ", promMayoresigualesveinte, " años"

FinAlgoritmo
