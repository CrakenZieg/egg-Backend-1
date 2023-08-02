//Realizar una función que permita obtener el término n de la sucesión de Fibonacci. La suce-
//sión de Fibonacci es la sucesión de los siguientes números:
//1, 1, 2, 3, 5, 8, 13, 21, 34, ...
//Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
//La sucesión del número 2 se calcula sumando (1+1)
//Análogamente, la sucesión del número 3 es (1+2),
//Y la del 5 es (2+3),
//Y así sucesivamente...
//La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
//Fibonacci (n) = Fibonacci (n-1) + Fibonacci (n-2) para todo n > 1
//Fibonacci (n) = 1 para todo n <= 1
//Por lo tanto, si queremos calcular el término "n" debemos escribir una función que reciba
//como argumento el valor de "n" y que calcule la serie hasta llegar a ese valor.
//					
//Para conocer más acerca de la serie de Fibonacci consultar el siguiente link: https://quant-
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
