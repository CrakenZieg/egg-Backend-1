//Escribir un programa que lea un n�mero entero y devuelva el n�mero de d�gitos que
//componen ese n�mero. Por ejemplo, si introducimos el n�mero 12345, el programa
//deber� devolver 5. Calcular la cantidad de d�gitos matem�ticamente utilizando el operador
//de divisi�n. Nota: recordar que las variables de tipo entero truncan los n�meros o
//resultados.

Algoritmo Digitos
	Definir num, i, cont Como Entero
	cont=0
	Escribir "Introdusca un n�mero: "
	Leer num
	i=num
	Mientras i<>0 Hacer
		cont=cont+1
		i=trunc(i/10)
	FinMientras
	Escribir num, " tiene ", cont, " d�gitos."
FinAlgoritmo
