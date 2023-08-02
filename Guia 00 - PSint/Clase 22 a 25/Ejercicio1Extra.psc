//Realizar un programa que rellene de números aleatorios una matriz a través de un subpro-
//grama y generar otro subprograma que muestre por pantalla la matriz final.

Algoritmo Ejercicio1Extra
	Definir matriz, n Como Entero
	Escribir "Ingrese el orden de la Matriz: "
	Leer n
	Dimension matriz[n,n]
	rellenarMatriz(matriz, n, n)
	mostrarMatriz(matriz, n, n)
FinAlgoritmo

SubProceso rellenarMatriz(matriz Por Referencia, n, m)
	Definir i, j Como Entero
	para i<- 0 Hasta n-1 Hacer
		para j<-0 Hasta m - 1 Hacer
			matriz(i,j)=Aleatorio(1, 9)
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