//Dada una secuencia de números ingresados por teclado que finaliza con un ?1, por
//ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,......,-1; realizar un programa que calcule el promedio de los
//números ingresados. Suponemos que el usuario no insertará número negativos.


Algoritmo Ejercicio3
	
	definir num,acumulador,i Como Entero
	escribir "Ingrese numero"
	leer num
	
	i=0
	acumulador=0
	
	Mientras num<>-1 Hacer
	
		acumulador=acumulador+num
		i=i+1
		escribir "Ingrese numero"
		leer num
		
	FinMientras
	
	Escribir"Su promedio es ",acumulador/i
	
	
FinAlgoritmo
