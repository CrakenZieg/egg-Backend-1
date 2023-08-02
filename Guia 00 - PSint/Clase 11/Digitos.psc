//Escribir un programa que lea un número entero y devuelva el número de dígitos que
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa
//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
//de división. Nota: recordar que las variables de tipo entero truncan los números o
//resultados.

Algoritmo Digitos
	Definir num, i, cont Como Entero
	cont=0
	Escribir "Introdusca un número: "
	Leer num
	i=num
	Mientras i<>0 Hacer
		cont=cont+1
		i=trunc(i/10)
	FinMientras
	Escribir num, " tiene ", cont, " dígitos."
FinAlgoritmo
