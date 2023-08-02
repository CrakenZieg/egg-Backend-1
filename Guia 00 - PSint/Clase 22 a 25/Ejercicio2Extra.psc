//Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario), llenarla
//con números aleatorios entre 1 y 100 y mostrar su traspuesta.

Algoritmo Ejercicio2Extra
	Definir matriz, matrizT, n, m Como Entero
	Escribir "Ingrese las dimensiones de la Matriz: "
	Leer n,m
	Dimension matriz[n,m]
	Dimension matrizT[m,n]
	rellenarMatriz(matriz, n, m)
	trasponer(matriz, matrizT, n, m)
	Escribir "--------------------------"
	mostrarMatriz(matriz, n, m)
	Escribir "--------------------------"
	mostrarMatriz(matrizT, m, n)
	Escribir "--------------------------"
FinAlgoritmo

SubProceso rellenarMatriz(matriz Por Referencia, n, m)
	Definir i, j Como Entero
	Para i<- 0 Hasta n-1 Hacer
		Para j<-0 Hasta m - 1 Hacer
			matriz(i,j)=Aleatorio(1, 100)
		FinPara
	FinPara
FinSubProceso

SubProceso mostrarMatriz(matriz, N, M)
	Definir i, j Como Entero
	Para i<-0 Hasta N-1 Con Paso 1 Hacer
		Para j<-0 Hasta M-1 Con Paso 1 Hacer
			Escribir Sin Saltar "[" matriz(i,j) "]"
		FinPara
		Escribir " "
	FinPara
FinSubProceso

SubProceso trasponer(matriz Por Referencia, matrizT Por Referencia, n, m)
	Definir i, j Como Entero
	Para i<-0 Hasta n-1 Hacer
		Para j<-0 Hasta m - 1 Hacer
			matrizT(j,i)=matriz(i,j)
		FinPara
	FinPara
FinSubProceso


	