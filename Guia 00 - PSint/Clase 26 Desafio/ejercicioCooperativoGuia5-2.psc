Algoritmo ejercicioCooperativoGuia4
	Definir tablero como Cadena
	Definir n, m Como Entero
	n=9
	m=12
	Dimension tablero[n,m]
		
		
		inicializarMatriz(tablero, n,m)		
		agregarPalabra(tablero, "VECTOR",0)
		agregarPalabra(tablero, "MATRIX", 1)
		agregarPalabra(tablero, "PROGRAMAR", 2)
		agregarPalabra(tablero, "SUBPROGRAMA", 3)
		agregarPalabra(tablero, "SUBPROCESO", 4)
		agregarPalabra(tablero, "VARIABLE", 5)
		agregarPalabra(tablero, "ENTERO", 6)
		agregarPalabra(tablero, "PARA", 7)
		agregarPalabra(tablero, "MIENTRAS", 8)
		imprimirMatriz(tablero, n,m)
		
		Escribir "___________"
		
		/// buscarR:
		acomodarPalabras(tablero)
		imprimirMatriz(tablero, n,m)

FinAlgoritmo


SubProceso inicializarMatriz(tablero, n,m)
	definir i,j Como Entero
	
	para i<-0 Hasta n-1
		para j<-0 hasta m-1
			tablero(i,j)= "*"
		FinPara
	FinPara	
FinSubProceso	
	
SubProceso imprimirMatriz(tablero, n,m)	
	Definir i,j Como Entero
	para i<-0 Hasta n-1
		para j<-0 hasta m-1
			Escribir Sin Saltar " ", tablero(i,j), " "
		FinPara
		Escribir " "
	FinPara	
FinSubProceso

SubProceso agregarPalabra(tablero Por Referencia, palabra, n)
		Definir i  Como Entero
				
		Para i=0 Hasta Longitud(palabra)-1 Hacer
			tablero(n,i)=Subcadena(palabra,i,i)
		FinPara
FinSubProceso
	

Funcion posicionR <- buscarR(tablero Por Referencia, n)
		Definir i, posicionR Como Entero
		
		Para i=0 Hasta 11 Hacer
			Si tablero[n,i]="R" Entonces
				posicionR=i
				i=11
			FinSi
		FinPara
FinFuncion

SubProceso acomodarPalabras(tablero Por Referencia)
	definir i,j, posicion Como Entero
	
	para i<-0 Hasta 8
		posicion=5-buscarR(tablero, i)
		
		para j<-11 hasta 0 Con Paso -1 Hacer
			si j-posicion>=0 Entonces
				tablero(i,j)=tablero(i,j-posicion)
				
			sino 
				tablero(i,j)= "*"
			FinSi
			
			
		FinPara
	FinPara
	
	
	
FinSubProceso
	