//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el usua-
//rio. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el valor m�s
//grande del vector.

Algoritmo Ejercicio5
	Definir vector, max Como Real
	Definir N, i Como Entero
	Escribir "Ingrese el tama�o del vector: "
	Leer N
	Dimension vector[N]
	Para i=0 Hasta N-1 Hacer
		Escribir "Ingrese el numero en la posici�n ", i,":"
		Leer vector[i]
	FinPara
	max = masGrande(vector, N)
	Escribir "El m�s grande es: ", max
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
