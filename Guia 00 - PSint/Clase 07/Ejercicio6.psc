//Escriba un programa que solicite al usuario n�meros decimales mientras que el usuario
//escriba n�meros mayores al primero que se ingres�. Por ejemplo: si el usuario ingresa
//como primer n�mero un 3.1, y luego ingresa un 4, el programa debe solicitar un tercer
//n�mero. El programa continuar� solicitando valores sucesivamente mientras los valores
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
