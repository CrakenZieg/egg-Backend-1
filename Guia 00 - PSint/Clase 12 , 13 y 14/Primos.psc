//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
//primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s� mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.

Algoritmo Primos
	Definir num Como Entero
	Definir val Como Logico
	Escribir "Escribir el posible Primo: "
	Leer num
	val = (CantidadDeFactores(num)<=2)
	Escribir "Es ", val, " que ", num, " es primo"
FinAlgoritmo

Funcion cant <- CantidadDeFactores(num)
	Definir cant, i Como Entero
	cant = 0
	Para i=1 Hasta num Hacer
		Si num%i=0 Entonces
			cant = cant + 1
		FinSi
	FinPara
FinFuncion
