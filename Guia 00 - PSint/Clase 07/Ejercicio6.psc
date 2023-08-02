//Escriba un programa que solicite al usuario números decimales mientras que el usuario
//escriba números mayores al primero que se ingresó. Por ejemplo: si el usuario ingresa
//como primer número un 3.1, y luego ingresa un 4, el programa debe solicitar un tercer
//número. El programa continuará solicitando valores sucesivamente mientras los valores
//ingresados sean mayores que 3.1, caso contrario, el programa finaliza.

Algoritmo Ejercicio6
	
	definir val,num Como real
	escribir"Ingrese valor inicial con decimal"
	leer val
	Escribir"Ingrese numero"
	leer num
	
	mientras num>=val Hacer
		Escribir"Ingrese numero"
		leer num
	FinMientras
	
	escribir"Su numero es menor al valor inicial"
	
	
FinAlgoritmo
