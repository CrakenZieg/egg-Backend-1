//Escriba un programa en el cual se ingrese un valor l�mite positivo, y a continuaci�n solicite
//n�meros al usuario hasta que la suma de los n�meros introducidos supere el l�mite inicial.

Algoritmo Ejercicio2
	
	definir limite, num, acumulador Como Entero
	Escribir "Ingrese limite"
	leer limite
	escribir "Ingrese numero"
	leer num
	
	acumulador=0
	acumulador=acumulador+num
	
	Mientras acumulador<limite Hacer
		
		Escribir"Su numero es menor al limite, ingrese otro"
		leer num
		acumulador=acumulador+num
		
		
	FinMientras
	Escribir "El resultado es igual o supero al limite"
	
FinAlgoritmo
