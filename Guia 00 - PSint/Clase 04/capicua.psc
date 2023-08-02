//Diseñe un algoritmo que lea un número de tres cifras y determine si es o no capicúa.

Algoritmo capicua
	Definir numero1, centena, unidad Como Entero
	Escribir "Introduce un numero de 3 cifras: "
	Leer numero1
	centena = TRUNC(numero1/100)
	unidad = numero1%10
	Si centena == unidad Entonces
		Escribir numero1, " es capicúa!"
	FinSi
FinAlgoritmo
