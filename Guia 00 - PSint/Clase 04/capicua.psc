//Dise�e un algoritmo que lea un n�mero de tres cifras y determine si es o no capic�a.

Algoritmo capicua
	Definir numero1, centena, unidad Como Entero
	Escribir "Introduce un numero de 3 cifras: "
	Leer numero1
	centena = TRUNC(numero1/100)
	unidad = numero1%10
	Si centena == unidad Entonces
		Escribir numero1, " es capic�a!"
	FinSi
FinAlgoritmo
