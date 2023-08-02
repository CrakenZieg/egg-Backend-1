Algoritmo sin_titulo
	Definir m , n  Como Entero
	
	escribir "tamaño de matriz"
	
	leer m, n
	
	submatriz(m,n)
	
FinAlgoritmo

SubProceso submatriz(m,n) 
	definir i , j , matriz como entero
	Dimension matriz(m,n)
	
	
	Para i<-0 Hasta m-1 Con Paso 1 Hacer
		Para j<-0  hasta n-1 Con Paso 1 Hacer
			matriz[i,j] = Aleatorio(1,100)
			escribir Sin Saltar matriz[i,j] "  "
		Fin Para
		
		escribir" "
	Fin Para
	
	suma(matriz,m,n)
	
FinSubProceso

SubProceso suma(matriz,m,n)
	definir i , j , aux como entero
	aux=0
	
	Para i<-0 Hasta m-1 Con Paso 1 Hacer
		Para j<-0  hasta n-1 Con Paso 1 Hacer
			aux= matriz[i,j] + aux 
		Fin Para
	Fin Para
	
	escribir "la suma de los valorres es  " aux
	
	
	
FinSubProceso
	