//Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
//La variable A, debe terminar con el valor de la variable B.

Algoritmo Ejercicio1
	Definir A, B, suma Como Entero
	Escribir "Ingresa un valor para A:"
	Leer A
	Escribir "Ingresa un valor para B:"
	Leer B
	intercambiador(A, B)
	Escribir "Ahora A es ",A, " y B es ", B
	Escribir suma
FinAlgoritmo

SubProceso intercambiador(a Por Referencia, b Por Referencia)
	Definir auxA, auxB Como Entero
	auxA = a
	auxB = b
	a = auxB
	b = auxA
FinSubProceso

Funcion suma<-intercambiadorF(a Por Referencia, b Por Referencia)
	Definir auxA, auxB, suma Como Entero
	auxA = a
	auxB = b
	a = auxB
	b = auxA
	suma = a+b
FinFuncion

