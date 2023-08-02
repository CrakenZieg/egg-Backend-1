Algoritmo sin_titulo
	
	Definir m ,n  Como Entero
	
	escribir "tamaño de matriz"
	
	leer m 
	
	n=m
	
	submatriz(m,n)
	
FinAlgoritmo

SubProceso submatriz(m,n) 
	definir i , j , matriz como entero
	Dimension matriz(m,n)
	
	
	Para i<-0 Hasta m-1 Con Paso 1 Hacer
		Para j<-0  hasta n-1 Con Paso 1 Hacer
			si i=j Entonces
				matriz[i,j] = 0
				
			SiNo
				matriz[i,j] = Aleatorio(1,100)
			FinSi
			
			
		Fin Para
		
		
	Fin Para
	
	impmatriz( matriz,m,n) 
	
FinSubProceso

SubProceso impmatriz(matriz,m,n) 
	definir i , j como entero
	
	
	Para i<-0 Hasta m-1 Con Paso 1 Hacer
		Para j<-0  hasta n-1 Con Paso 1 Hacer
			
			escribir Sin Saltar matriz[i,j] "  "
		Fin Para
		
		escribir" "
	Fin Para
	
	
FinSubProceso