//Crea una función EsMultiplo que reciba los dos números pasados por el usuario, validando
//que el primer número múltiplo del segundo y devuelva verdadero si el primer número es múlti-
//plo del segundo, sino es múltiplo que devuelva falso.

Algoritmo Multiplos
	Definir num1, num2 Como Entero
	Definir retorno Como Logico
	Escribir "Ingrese 2 números: "
	Leer num1, num2
	retorno = EsMultiplo(num1, num2)
	Escribir "Es ", retorno, " que ", num1, " es multiplo de  ", num2
FinAlgoritmo

Funcion multiplo <- EsMultiplo(num1, num2)
	Definir multiplo Como Logico
	multiplo = (num1%num2=0)
FinFuncion
	