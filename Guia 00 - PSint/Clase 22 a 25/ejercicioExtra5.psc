Algoritmo ejercicioExtra5
//	Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
//	primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
//	deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
//	la matriz de la siguiente forma:
//	3 + 5 = 8
//	4 + 3 = 7
//	1 + 4 = 5
	Definir matriz, f, i, j, num como entero
	Escribir "ingrese cantidad de filas para la matriz: "
	leer f
	Dimension matriz[f,3]
	
	para i<-0 hasta f-1 Hacer
		para j<-0 hasta 2 Hacer
			Escribir Sin Saltar "ingrese valores hasta rellenar las 2 primeras columnas: "
			leer matriz[i,j]
		FinPara
		matriz[i,2]= matriz[i,0]+matriz[i,1]
	FinPara
	
	
	Para i<-0 Hasta f-1 Hacer
		Para j<-0 Hasta 2 Hacer
			Escribir Sin Saltar "[" matriz(i,j) "]"
		FinPara
		Escribir " "
	FinPara
	
	
FinAlgoritmo
