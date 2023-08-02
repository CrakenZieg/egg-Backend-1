Algoritmo sin_titulo
	definir matriz,j,i,e,n,num,suma,x Como Entero
	
	Escribir "Ingrese la cantidad de filas que desea en la matriz: " Sin Saltar
	Leer n
	Dimension matriz(n,3)
	
	//aGREGA VALORES
	
	suma=0
	para i<-0 con paso 1 hasta n-1
		para j<-0 con paso 1 hasta 1 Hacer
			    Escribir "Ingrese los valores de las primeras columnas:"
			    Leer num
			    matriz(i,j)=num
		FinPara
	FinPara
	
	para i<-0 con paso 1 hasta n-1 Hacer
		j=0
		
		matriz(i,j+2)=matriz(i,j)+matriz(i,j+1)
		
	FinPara
	
	//IMPRIME matriz
	para i<-0 con paso 1 hasta n-1 Hacer
		para j<-0 con paso 1 hasta 2
		Escribir matriz(i,j) "  " sin saltar
		FinPara
		Escribir""
	FinPara
	
FinAlgoritmo


//Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos 
//primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se 
//deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar 
//la matriz de la siguiente forma:
//	3 + 5 = 8 
//	4 + 3 = 7 
//	1 + 4 = 5