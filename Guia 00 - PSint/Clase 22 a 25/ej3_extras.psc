//Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos y
//ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna de
//ceros. Por ejemplo, nuestro matriz final debería verse así:
//	111111111111111
//	100000000000001
//	100000000000001
//	100000000000001
//	111111111111111
Algoritmo ej3_extras
	
	Definir matriz, n, i, j, m Como Entero
	n=5
	m=15
	Dimension matriz(n,m)
	rellenarMatriz(matriz,n,m)
	mostrarMatriz(matriz, n, m)
	
FinAlgoritmo

SubProceso rellenarMatriz(matriz Por Referencia, n, m)
	
	Definir i, j Como Entero
	para i<- 0 Hasta n-1 Hacer
		para j<-0 Hasta m - 1 Hacer
			si i=0 o i=n-1 o j=0 o j=m-1 Entonces
				matriz(i,j)=1
			SiNo
				matriz(i,j)=0
			FinSi
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