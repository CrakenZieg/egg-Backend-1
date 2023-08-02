
Algoritmo Ejercicio5extra
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
			correrArreglo(arreglo, posicion, buscarEspacio(arreglo, posicion, N), N)
			arreglo[posicion]=letra
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

Funcion posicionEsp <- buscarEspacio(arreglo Por Referencia, posicion, N)
	Definir i, posicionEsp Como Entero
	posicionEsp = -1
	Para i=1 Hasta N-1 Hacer
		Si (posicion-i)>=0 Entonces
			Si arreglo[posicion-i]="" O arreglo[posicion-i]=" " Entonces
				i=N-1
				posicionEsp = posicion-i
			FinSi
		FinSi
		Si (posicion+i)<=N-1 Entonces
			Si arreglo[posicion+i]="" O arreglo[posicion+i]=" " Entonces
				i=N-1
				posicionEsp = posicion+i
			FinSi
		FinSi
	FinPara
FinFuncion

SubProceso correrArreglo(arreglo Por Referencia, posicion, posicionEsp, N)
	Definir i Como Entero
	Si posicion<posicionEsp entonces
		Para i=N-1 Hasta posicion Hacer
			arreglo[i] = arreglo[i-1]
		FinPara
	SiNo
		Para i=0 Hasta posicion Hacer
			arreglo[i] = arreglo[i+1]
		FinPara
	FinSi
FinSubProceso
	