//Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
//primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
//deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
//la matriz de la siguiente forma:
//	3 + 5 = 8
//	4 + 3 = 7
//	1 + 4 = 5
//...

Algoritmo ejer_5_Extra
	
	Definir i, j, n, matriz Como Entero
	
	Escribir "Ingrese la cantidad de las filas en la matriz"
	Leer n
	
	Dimension matriz(n,3)
	
	rellenarMatriz(matriz,n)
	MostrarMatriz(matriz,n)
	
FinAlgoritmo

SubProceso rellenarMatriz(matriz Por Referencia,n)
	
	Definir i, j, num, suma Como Entero
	
	suma = 0
	
	para i <- 0 Hasta n-1 Hacer
		para j <- 0 Hasta 2 Hacer
			
			si j <> 2 Entonces
				
				Escribir "Ingrese el valor"
				Leer num
				matriz(i,j) = num
				suma = suma + num
			SiNo
				suma = suma
				matriz(i,j) = suma 
				
			FinSi
			
		FinPara
		
		suma = 0
		
	FinPara
	
FinSubProceso

SubProceso MostrarMatriz(matriz,n)
	Definir i, j Como Entero
	
	para i <- 0 Hasta n-1 Hacer
		para j <- 0 Hasta 2 Hacer
			
			Escribir Sin Saltar matriz(i,j) " | "
			
		FinPara
		
		Escribir " "
		
	FinPara
	
FinSubProceso

