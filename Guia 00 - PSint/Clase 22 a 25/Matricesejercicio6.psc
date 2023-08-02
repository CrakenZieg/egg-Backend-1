Algoritmo Matricesejercicio6
	
	Definir m,n,i , j , matriz,diagonal, horizontal,vertical Como Entero
	
	escribir "ingresar tamaño de matriz"
	
	leer m
	n=m
	
	Dimension matriz(m,n)
	escribir "llenar matriz "
	
	Para i<-0 Hasta m-1 Con Paso 1 Hacer
		Para j<-0  hasta n-1 Con Paso 1 Hacer
			Repetir
				leer matriz[i,j]
				
			Mientras Que matriz[i,j] >9 y matriz[i,j] <1
			
		Fin Para
		
	Fin Para
	
	
	Para i<-0 Hasta m-1 Con Paso 1 Hacer
		Para j<-0  hasta n-1 Con Paso 1 Hacer
			
			escribir Sin Saltar matriz[i,j] "  "
		Fin Para
		
		escribir" "
	Fin Para
	
	
	
	
	diagonal =0
	horizontal=0
	vertical=0
	
	Para i<-0 Hasta m-1 Con Paso 1 Hacer
		Para j<-0  hasta n-1 Con Paso 1 Hacer
			
			si i=j Entonces
				
				diagonal =matriz[i,j] +diagonal
				
			FinSi
			
			si i=0 
				
				horizontal=matriz[i,j] +horizontal
				
				
				
			FinSi
			
			si j=0 
				vertical=matriz[i,j] +vertical
				
			FinSi
			
		Fin Para
		
	Fin Para
	
	si diagonal=horizontal y horizontal=vertical
		
		escribir "la matriz es magica "
		escribir " suma diagonal  " diagonal
		
		escribir " suma horizontal " horizontal
		
		escribir " suma vertical  " vertical
	SiNo
		escribir " matriz no magica"
	finsi
FinAlgoritmo
