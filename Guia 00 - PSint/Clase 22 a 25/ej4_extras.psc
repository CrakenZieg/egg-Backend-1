//Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3. Inicia-
//lice las matrices para evitar el ingreso de datos por teclado.
Algoritmo ej4_extras
	Definir matriz, matriz2, matriz3, n Como Entero
	n=3
	Dimension matriz(n,n)
	Dimension matriz2(n,n)
	Dimension matriz3(n,n)
	rellenarMatriz(matriz, n)
	rellenarMatriz(matriz2, n)
	mutiplicarMatriz(matriz, matriz2, matriz3, n)
	mostrarMatriz(matriz, n, n)
	Escribir ""
	mostrarMatriz(matriz2, n, n)
	Escribir ""
	mostrarMatriz(matriz3, n, n)
	Escribir ""
FinAlgoritmo
SubProceso rellenarMatriz(matriz Por Referencia, n)
	Definir i, j Como Entero
	para i<- 0 Hasta n-1 Hacer
		para j<-0 Hasta n - 1 Hacer
			matriz(i,j)=Aleatorio(0, 25)
		FinPara
	FinPara
FinSubProceso
SubProceso mutiplicarMatriz(matriz Por Referencia, matriz2 Por Referencia, matriz3 Por Referencia, n)
	Definir i, j Como Entero
	para i<- 0 Hasta n-1 Hacer
		para j<-0 Hasta n - 1 Hacer
			matriz3(i,j)=matriz(i,j)*matriz2(i,j)
		FinPara
	FinPara
FinSubProceso
SubProceso mostrarMatriz(matriz, N, n)
	Definir i, j Como Entero
	Para i<-0 Hasta N-1 Con Paso 1 Hacer
		Para j<-0 Hasta n-1 Con Paso 1 Hacer
			
			Escribir Sin Saltar "[" matriz(i,j) "]"
			
		FinPara
		Escribir " "
	FinPara
FinSubProceso