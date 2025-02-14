Algoritmo Ejercicio3
	
	Escribir "Ingrese un numero"
	leer N
	
	Si N > 0 Entonces
		
		Si N = 1 Entonces
			
			Escribir "El factorial es 1"
			
		SiNo
			
			Aux = 1
			factorial = 1
			
			Mientras Aux < N Hacer
				
				Aux = Aux + 1
				factorial = factorial * Aux
				
			Fin Mientras
			
			Escribir factorial
			
		Fin Si
	SiNo
		Escribir "Ingresa un numero positivo"
	Fin Si
	
	
FinAlgoritmo