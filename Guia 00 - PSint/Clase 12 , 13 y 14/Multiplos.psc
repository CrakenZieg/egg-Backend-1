//Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario, validando
//que el primer n�mero m�ltiplo del segundo y devuelva verdadero si el primer n�mero es m�lti-
//plo del segundo, sino es m�ltiplo que devuelva falso.

Algoritmo Multiplos
	Definir num1, num2 Como Entero
	Definir retorno Como Logico
	Escribir "Ingrese 2 n�meros: "
	Leer num1, num2
	retorno = EsMultiplo(num1, num2)
	Escribir "Es ", retorno, " que ", num1, " es multiplo de  ", num2
FinAlgoritmo

Funcion multiplo <- EsMultiplo(num1, num2)
	Definir multiplo Como Logico
	multiplo = (num1%num2=0)
FinFuncion
	