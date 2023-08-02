//Realizar una funci�n que permita obtener el t�rmino n de la sucesi�n de Fibonacci. La suce-
//si�n de Fibonacci es la sucesi�n de los siguientes n�meros:
//1, 1, 2, 3, 5, 8, 13, 21, 34, ...
//Donde cada uno de los n�meros se calcula sumando los dos anteriores a �l. Por ejemplo:
//La sucesi�n del n�mero 2 se calcula sumando (1+1)
//An�logamente, la sucesi�n del n�mero 3 es (1+2),
//Y la del 5 es (2+3),
//Y as� sucesivamente...
//La sucesi�n de Fibonacci se puede formalizar de acuerdo a la siguiente f�rmula:
//Fibonacci (n) = Fibonacci (n-1) + Fibonacci (n-2) para todo n > 1
//Fibonacci (n) = 1 para todo n <= 1
//Por lo tanto, si queremos calcular el t�rmino "n" debemos escribir una funci�n que reciba
//como argumento el valor de "n" y que calcule la serie hasta llegar a ese valor.
//					
//Para conocer m�s acerca de la serie de Fibonacci consultar el siguiente link: https://quant-
//dare.com/numeros-de-fibonacci/

Algoritmo Fibonacci
	
	Definir num, fibo Como Entero
	
	Escribir "Ingrese un numero: "
	Leer num
	fibo = eneFibonacci(num)
	Escribir ""
	Escribir "El termino enesimo es: ", fibo 
	
FinAlgoritmo

Funcion enesimo <- eneFibonacci(n)
	Definir enesimo, n0, n1, i Como Entero
	n0 = 1
	n1 = 1
	Escribir Sin Saltar n0, " ", n1, " "
	Si n<=1 Entonces
		enesimo = 1
	SiNo
		Para i = 2 Hasta n Hacer
			Si n0<=n1 Entonces
				n0 = n0 + n1
				Escribir Sin Saltar n0, " "
			SiNo
				n1 = n0 + n1
				Escribir Sin Saltar n1, " "
			FinSi
		FinPara
		Si n0<=n1 Entonces
			enesimo = n1
		SiNo
			enesimo = n0
		FinSi 
	FinSi
	
FinFuncion
