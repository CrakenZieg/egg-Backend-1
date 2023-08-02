//Crear una función que devuelva la diferencia que hay entre el valor más chico de un arreglo y
//su valor más grande.

Algoritmo ejercicio6Extra
	Definir n, i Como Entero 
	Definir arreglo Como Real
	Escribir "Ingrese el tamaño del arreglo: "
	Leer n
	Dimension arreglo[n]
	Para i=0 Hasta n-1 Hacer
		arreglo[i] = Aleatorio(-100,100)
	FinPara
	Escribir "El vector es: "
	mostrarVector(arreglo, n)
	Escribir "La diferencia de sus extremos es ", diferenciaDeExtremos(arreglo, n)
FinAlgoritmo

SubProceso mostrarVector(arreglo Por Referencia, N)
	Definir i Como Entero
	Escribir ""
	Escribir Sin Saltar"[ "
	Para i=0 Hasta N-1 Hacer
		Si i<>N-1 Entonces
			Escribir Sin Saltar arreglo[i],", "
		SiNo
			Escribir Sin Saltar arreglo[i]," "
		FinSi
	FinPara
	Escribir Sin Saltar"] "
	Escribir ""
	Escribir ""
FinSubProceso

Funcion diferencia <- diferenciaDeExtremos(arreglo Por Referencia, n)
	Definir i Como Entero
	Definir max, min, diferencia Como Real
	Para i=0 Hasta n-1 Hacer
		Si i=0 Entonces
			max = arreglo[i]
			min = arreglo[i]
		SiNo
			Si max<=arreglo[i] Entonces
				max = arreglo[i]
			FinSi
			Si min>=arreglo[i] Entonces
				min = arreglo[i]
			FinSi
		FinSi
	FinPara
	diferencia = max - min
FinFuncion
	