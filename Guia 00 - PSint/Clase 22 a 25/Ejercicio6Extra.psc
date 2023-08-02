//Realizar un programa que permita visualizar el resultado del producto de una matriz de ente-
//ros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden iniciali-
//zarse evitando así el ingreso de datos por teclado.

Algoritmo Ejercicio6Extra
	Definir matriz, vector, resultado, n Como Entero
	n=3
	Dimension matriz[n,n], vector[n], resultado[n]
	rellenarMatriz(matriz, n, n)
	rellenarVector(vector, n)
	mutliplicarMatrizPorVector(matriz, vector, resultado, n)
	Escribir "---------------------------"
	mostrarMatriz(matriz, n, n)
	Escribir "*"
	mostrarVector(vector, n)
	Escribir ""
	Escribir "---------------------------"
	mostrarVector(resultado, n)
	Escribir ""
FinAlgoritmo

SubProceso rellenarMatriz(matriz Por Referencia, n, m)
	Definir i, j Como Entero
	Para i<-0 Hasta n-1 Hacer
		Para j<-0 Hasta m-1 Hacer
			matriz(i,j)=Aleatorio(0, 9)
		FinPara
	FinPara
FinSubProceso

SubProceso rellenarVector(vector Por Referencia, n)
	Definir i Como Entero
	Para i<- 0 Hasta n-1 Hacer
		vector(i)=Aleatorio(0, 9)
	FinPara
FinSubProceso

SubProceso mutliplicarMatrizPorVector(matriz Por Referencia, vector Por Referencia, resultado Por Referencia, n)
	Definir i Como Entero
	Para i<- 0 Hasta n-1 Hacer
		resultado[i]=matriz(i,0)*vector[0]+matriz(i,1)*vector[1]+matriz(i,2)*vector[2]
	FinPara
FinSubProceso

SubProceso mostrarVector(vector Por Referencia, n)
	Definir i Como Entero
	Para i = 0 Hasta n-1 Hacer
		Escribir Sin Saltar "[ ", vector(i), " ]"
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
//1  2  3         a        1a + 2b + 3c 
//4  5  6    *    b   =    4a + 5b + 6c 
//7  8  9         c        7a + 8b + 9c 