//Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y
//los muestre por pantalla.

Algoritmo Ejercicio1
	Definir matriz Como Real
	Definir n, m, i, j Como Entero
	Escribir "Ingrese el tamaño (NxM) de la matriz: "
	Leer n,m
	Dimension matriz[n,m]
	Para i<-0 Hasta N-1 Con Paso 1 Hacer
		Para j<-0 Hasta M-1 Con Paso 1 Hacer
			
			Escribir Sin Saltar "Ingrese el valor de la posición [ ",i,", ",j," ]"
			Leer matriz[i,j]
			
		FinPara
	FinPara
	mostrarMatriz(matriz, N, M)
FinAlgoritmo

SubProceso mostrarMatriz(matriz, N, M)
	Definir i, j Como Entero
	Para i<-0 Hasta N-1 Con Paso 1 Hacer
		Para j<-0 Hasta M-1 Con Paso 1 Hacer
			
			Escribir Sin Saltar "[" matriz(i,j) "]"
			
		FinPara
		Escribir " "
	FinPara
FinSubProceso
	