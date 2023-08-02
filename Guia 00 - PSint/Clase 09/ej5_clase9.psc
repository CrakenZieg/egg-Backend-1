//Escribir un programa que calcule la suma de los N primeros números naturales. El valor de
//N se leerá por teclado.
Algoritmo sin_titulo
	
	Definir num, i, suma Como entero
	Escribir "ingrese cantidad de numeros que quiera sumar"
	leer num
	suma=0
	para i=1 Hasta num Hacer
		suma=suma+i
	FinPara
	Escribir "el total de la suma de sus numero naturales es: ", suma
FinAlgoritmo
