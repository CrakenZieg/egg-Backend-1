//Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
//primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
//deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
//la matriz de la siguiente forma:
//	3 + 5 = 8
//	4 + 3 = 7
//	1 + 4 = 5
Algoritmo ejercicio5
	Definir matriz, n, m Como Entero
	
	escribir "ingrese numero de filas"
	leer m
	
	Dimension matriz(m,3)
	
	
	rellenarMatriz(matriz, m)
	sumar(matriz,m)
	mostrarMatriz(matriz, m,3)
FinAlgoritmo
SubProceso rellenarMatriz(matriz Por Referencia, m)
	Definir i, j, f Como Entero
	
	para i<- 0 Hasta m-1 Hacer
		para j<-0 Hasta 1 Hacer
			Escribir " ingrese valores"
			leer  f
			matriz(i,j)=f
		FinPara
	FinPara
FinSubProceso
SubProceso sumar(matriz Por Referencia,m)
	Definir i Como Entero
	para i<- 0 Hasta m-1 Hacer
		matriz(i,2)= matriz(i,1) + matriz(i,0)
	FinPara
FinSubProceso
SubProceso mostrarMatriz(matriz, M, m)
	Definir i, j Como Entero
	Para i<-0 Hasta M-1 Con Paso 1 Hacer
		Para j<-0 Hasta m-1 Con Paso 1 Hacer
			
			Escribir Sin Saltar "[" matriz(i,j) "]"
			
		FinPara
		Escribir " "
	FinPara
FinSubProceso
