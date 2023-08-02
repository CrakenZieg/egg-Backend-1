
Algoritmo Ejercicio6
	Definir arreglo, frase, letra Como Caracter
	Definir N, posicion Como Entero
	N=20
	Dimension arreglo[N]
	Escribir "Ingrese la frase: "
	Leer frase
	llenar(arreglo,frase,N)
	Hacer
	Escribir "Ingrese la letra: "
	Leer letra
	Escribir "Ingrese la posición en la que ingresará la letra: "
	Leer posicion
	Si posicion <= N-1 Entonces
		Si arreglo[posicion]="" O arreglo[posicion]=" " Entonces
			arreglo[posicion]=letra
		SiNo
			Escribir "La posición está ocupada."
		FinSi
	SiNo
		Escribir "La posición está fuera de rango."
	FinSi
	mostrarVector(arreglo, N)
	Mientras Que Verdadero
FinAlgoritmo

SubProceso llenar(arreglo Por Referencia, frase, N)
	Definir i Como Entero
	Para i=0 Hasta N-1 Hacer
		Si i<=Longitud(frase)-1 Entonces
			arreglo[i] = Subcadena(frase,i,i)
		SiNo
			arreglo[i] = ""
		FinSi
	FinPara
FinSubProceso

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