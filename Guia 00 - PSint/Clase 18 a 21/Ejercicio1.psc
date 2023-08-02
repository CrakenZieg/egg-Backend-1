//Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los
//muestre por pantalla.
Algoritmo Ejercicio1
	Definir array, i Como Entero
	Dimension array[5]
	Para i=0 Hasta 4 Hacer
		Escribir "Ingrese el numero en la posición ", i, ":"
		Leer array[i]
	FinPara
	Escribir Sin Saltar "[ "
	Para i=0 Hasta 4 Hacer
		Escribir Sin Saltar array[i], " "
	FinPara
	Escribir Sin Saltar "]"
FinAlgoritmo
