Algoritmo Ejercicio11
	
	ingresados =0
	Nmayor = 0
	
	Para i <-1 Hasta 10 Con Paso 1 paso Hacer
	
		Escribir "Ingrese un numero entre 0 y 36"
		leer num
		
		Si num >= 0 & num < 36 Entonces
			
			Si ingresados = 0 Entonces
				ingresados = ingresados + 1
				Nmayor = num
				
				Si num >= 13 & num <= 24  Entonces
					contadorSegundaDocena = contadorSegundaDocena + 1
					
				SiNo
				Fin Si
				
				NPar = num MOD 2
				
				Si NPar = 0 Entonces
					contadorPar= contadorPar +1
					
					total = total + num
					promedioPares = (total)/contadorPar
				SiNo
					contadorImPar = contadorImPar + 1
					
				Fin Si
				
			SiNo
				Si num > Nmayor Entonces
					Nmayor = num
					
					ingresados = ingresados + 1
					
					Si num >= 13 & num <= 24  Entonces
						contadorSegundaDocena = contadorSegundaDocena + 1
						
					SiNo
					Fin Si
					
					NPar = num MOD 2
					
					Si NPar = 0 Entonces
						contadorPar= contadorPar +1
						
						total = total + num
						promedioPares = (total)/contadorPar
					
					SiNo
						contadorImPar = contadorImPar + 1
						
					Fin Si
					
					
				SiNo
					ingresados = ingresados + 1
					
					NPar = num MOD 2
					
					Si NPar = 0 Entonces
						contadorPar= contadorPar +1
						
						total = total + num
						promedioPares = (total)/contadorPar
					SiNo
						contadorImPar = contadorImPar + 1
						
					Fin Si
					
					
					
				Fin Si
			Fin Si
			
		SiNo
			Escribir "Ingrese numero Valido"
		Fin Si
		
		
		
	Fin Para
	
	Escribir " De los n�meros ingresados, " ,contadorImPar, " numeros son impares, el promedio de los pares es de: " ,promedioPares , ", el n�mero mayor es: " ,Nmayor, " y los numeros comprendidos entre 1 y 24 son: ",  contadorSegundaDocena
	
FinAlgoritmo