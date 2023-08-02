//Escriba un programa que lea un número entero (altura) y a partir de él cree una escalera
//invertida de asteriscos con esa altura.

Algoritmo triangulo
	Definir altura, i, j Como Entero
	Escribir "Ingrese la altura: "
	Leer altura
	Para i=altura Hasta 1 Con Paso -1 Hacer
		Para j=i Hasta 1 Con Paso -1 Hacer
			Escribir Sin Saltar "*"
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
