//Realizar una función que calcule y retorne la suma de todos los divisores del número n distin-
//tos de n. El valor de n debe ser ingresado por el usuario.

Algoritmo SumaDePrimos
	Definir num, acum, i Como Entero
	acum=0
	Escribir "Ingrese un numero: "
	Leer num
	
	Para i=1 Hasta num-1 Hacer
		Si EsDivisor(num,i) Entonces
			acum = acum+i
		FinSi
	FinPara
	
	Escribir "La suma de los factores de ", num, " es ", acum
	
FinAlgoritmo

Funcion val <- EsDivisor(num1, num2)
	Definir val Como Logico
	val = (num1%num2=0)
FinFuncion

	