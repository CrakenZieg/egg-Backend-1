//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el usua-
//rio. A continuación, se deberá crear una función que reciba el vector y devuelva el valor más
//grande del vector.

Algoritmo Ejercicio5
	Definir vector, max Como Real
	Definir N, i Como Entero
	Escribir "Ingrese el tamaño del vector: "
	Leer N
	Dimension vector[N]
	Para i=0 Hasta N-1 Hacer
		Escribir "Ingrese el numero en la posición ", i,":"
		Leer vector[i]
	FinPara
	max = masGrande(vector, N)
	Escribir "El más grande es: ", max
FinAlgoritmo

Funcion max <- masGrande(arreglo,N)
	Definir i Como Entero
	Definir max Como Real
	max=0
	Para i=0 Hasta N-1 Hacer
		Si arreglo[i]>=max Entonces
			max = arreglo[i]
		FinSi
	FinPara
FinFuncion
