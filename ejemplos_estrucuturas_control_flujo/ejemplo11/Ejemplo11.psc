Algoritmo Ejercicio11
	
	promedioEdad = 0
	PromedioAlturaM = 5
	PromedioAlturaF = 0
	
	Escribir "Ingrese la altura"
	leer altura
	
	Mientras altura > 0 Hacer
		
		Escribir "Ingrese 1 si eres mujer o 2 si eres Hombre"
		leer sexo
		
		Si sexo = 2 Entonces
			Escribir  "Ingrese la edad"
			leer edad
			
			contadorM = contadorM + 1
			contadorEdad = contadorEdad + edad
			sumaAlturaM = sumaAlturaM + altura
			sumaEdadM = sumaEdadM + edad
			PromedioAlturaM = sumaAlturaM / contadorM
			promedioEdad =(sumaEdadF +sumaEdadM) /(contadorM +contadorF)
			
		SiNo
			Escribir  "Ingrese la edad"
			leer edad
			
			contadorF = contadorF + 1
			contadorEdad = contadorEdad + edad
			sumaAlturaF = sumaAlturaF + altura
			sumaEdadF = sumaEdadF + edad
			PromedioAlturaF = sumaAlturaF / contadorF
			promedioEdad =(sumaEdadF +sumaEdadM) /(contadorM +contadorF)
			
			
		Fin Si
		
		Escribir "Ingrese la altura"
		leer altura
	Fin Mientras
	Escribir " El promedio de altura entre lo varones es de", PromedioAlturaM , ", el promedio de altura entre las mujeres es de" ,PromedioAlturaF ," y el promedio de edad entre los participantes es de", promedioEdad
FinAlgoritmo