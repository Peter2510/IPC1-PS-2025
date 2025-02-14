Algoritmo Ejercicio1
	contadorPar = 0
	contadorParImpar = 0
	
	Escribir "Ingresa un numero"
	leer num
	
	Mientras i < num  Hacer
		Numaleatorio = 0 + Azar(num) + 1
		
		Si Numaleatorio mod 2 = 0 Entonces
			contadorPar = contadorPar + 1
			i = i + 1
			Escribir Numaleatorio
			
		SiNo
			contadorParImpar = contadorParImpar + 1
			i = i + 1
			Escribir Numaleatorio
		Fin Si
	Fin Mientras
	
	Escribir "Los numeros pares generados fueron: ", contadorPar, " y los numeros impares generados fueron: ", contadorParImpar
	
FinAlgoritmo