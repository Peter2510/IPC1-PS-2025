Algoritmo Ejercicio4
	opcion = 6
	
Mientras opcion != 5 Hacer
		
		Escribir "Ingresa 1 si eres mujer o 2 si eres Hombre"
		leer sexo
		
	
	Si sexo = 1 Entonces
		F = F + 1
		Escribir "Ingresa tu edad"
		leer edad
		
		Si edad > 17 Entonces
			MayorF = MayorF + 1
			Escribir MayorF
			Escribir "¿ingresaras otro dato?, marca 5 si no y 0 si sí"
			leer op
			op = opcion
		SiNo
			MenorF = MenorF +1
			Escribir "¿ingresaras otro dato?, marca 5 si no y 0 si sí"
			leer op
			op = opcion
		Fin Si
		
	SiNo
		M = M +1
		Escribir "Ingresa tu edad"
		leer edad
		
		Si edad > 17 Entonces
			MayorM = MayorM + 1
			Escribir "¿ingresaras otro dato?, marca 5 si no y 0 si sí"
			leer op
			op = opcion
		SiNo
			MenorM = MenorM + 1
			Escribir "¿ingresaras otro dato?, marca 5 si no y 0 si sí"
			leer op
			op = opcion
		Fin Si
		
		
	Fin Si

	Escribir "La cantidad de mujeres mayores de edad es",  MayorF , " y la cantidad de hombres menores de edad es ", MenorM

Fin Mientras

FinAlgoritmo