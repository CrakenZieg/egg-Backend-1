//Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
//un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro subpro-
//grama que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y los re-
//sultados por pantalla.
Algoritmo ej3_clase22
	
	Definir n, m, matriz Como entero	
	Escribir "ingrese el tamaño de la matriz"
	leer n, m
	Dimension matriz(n, m)
	rellenarMatriz(matriz, n, m)
	sumarMatriz(matriz,n, m)
	mostrarMatriz(matriz, n, m)
FinAlgoritmo

SubProceso rellenarMatriz(matriz Por Referencia, n, m)
	Definir i, j Como Entero
	para i<- 0 Hasta n-1 Hacer
		para j<-0 Hasta m - 1 Hacer
			matriz(i,j)=Aleatorio(0, 25)
		FinPara
	FinPara
FinSubProceso

 SubProceso sumarMatriz(matriz Por Referencia, n, m)
	Definir i, j, suma Como Entero
	suma=0
	para i<- 0 Hasta n-1 Hacer
		para j<-0 Hasta m - 1 Hacer
			suma=suma+matriz(i,j)
		FinPara
	FinPara
	Escribir "la suma de los valores de la matriz: ", suma
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
