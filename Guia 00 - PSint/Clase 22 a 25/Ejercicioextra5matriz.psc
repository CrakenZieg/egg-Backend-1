//Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
//primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
//deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
//la matriz de la siguiente forma:
//	3 + 5 = 8
//	4 + 3 = 7
//	1 + 4 = 5
Algoritmo sin_titulo
	DEFINIR  matriz Como Entero
	
	dimension matriz(3,3)
	rellenarMatriz(matriz)
	sumar(matriz)
	mostrarmatriz(matriz)
	
FinAlgoritmo
subproceso RellenarMatriz( matriz por referencia)
	definir i,j,f como entero
	
	para i<-0 hasta 2 Hacer
		
		para j<-0 hasta 1 Hacer
			escribir "ingrese valores"
			leer f
			matriz(i,j)=f
			
		FinPara
	FinPara
	
FinSubProceso

subproceso sumar(matriz por referencia)
	definir i,j como entero
	para i<-0 hasta 2 Hacer
		
		para j<-0 hasta 2 hacer 
			si j=2 Entonces
				matriz(i,j)=matriz(i,j-2)+matriz(i,j-1)
				
			FinSi
			
		FinPara
	FinPara
	
FinSubProceso

subproceso mostrarmatriz( matriz por referencia)
	definir i,j,f como entero
	
	para i<-0 hasta 2 Hacer
		
		para j<-0 hasta 2 Hacer
			
			escribir Sin Saltar " " matriz(i,j)
			si j<1 Entonces
				escribir sin saltar " +"
			
			FinSi
			si j=1 Entonces
				escribir sin saltar " ="
				
			FinSi
		FinPara
		escribir ""
	FinPara
	
FinSubProceso