Algoritmo Final
	//Definici�n de variables
	Definir calculadora Como Entero
	Definir cadena1, cadena2 Como Caracter
	Definir diagonal3D1, diagonal3D2 Como Entero
	//Definimos las 3 dimensiones de la matriz calculadora
	Dimension calculadora[3, 3, 3]
	//Asignamos valores a las cadenas de texto
	cadena1 = "789090362"
	cadena2 = "484529837"
	//Inicializamos la matriz
	inicializarMatriz(calculadora)
	//Llenamos las matrices como se marca en el enunciado
	llenarMatriz_Z0(calculadora, cadena1)
	llenarMatriz_Z1(calculadora, cadena2)
	llenarMatriz_Z2(calculadora)
	//Mostramos los resultados de la matriz
	imprimirMatriz(calculadora)
	//Asignamos los valores de las diagonales 3D
	diagonal3D1 = calculadora(0, 2, 0)*calculadora(1, 1,1)*calculadora(2, 0, 2)
	diagonal3D2 = calculadora(0, 0, 0)*calculadora(1, 1,1)*calculadora(2, 2, 2)
	//Escribimos los resultados de las diagonales
	Escribir "La multiplicaci�n de los elementos de la diagonal 3D 1 es ", diagonal3D1
	Escribir "La multiplicaci�n de los elementos de la diagonal 3D 2 es ", diagonal3D2
FinAlgoritmo

SubProceso inicializarMatriz(calculadora Por Referencia)
	Definir i, j, k Como Entero
	Para k=0 hasta 2 Hacer
		Para i=0 hasta 2 Hacer
			Para j=0 hasta 2 Hacer
				calculadora[k,i,j]=0
			FinPara	
		FinPara
	FinPara
FinSubProceso

SubProceso llenarMatriz_Z0(calculadora Por Referencia, cadena)
	Definir i, j, k, aux Como Entero
	k=0
	aux=0
		Para i=0 hasta 2 Hacer
			Para j=0 hasta 2 Hacer
				calculadora[k,i,j]=ConvertirANumero(Subcadena(cadena,aux,aux))
				aux=aux+1
			FinPara	
		FinPara
FinSubProceso

SubProceso llenarMatriz_Z1(calculadora Por Referencia, cadena)
	Definir i, j, k, aux Como Entero
	k=1
	aux=0
	Para i=0 hasta 2 Hacer
		Para j=0 hasta 2 Hacer
			calculadora[k,i,j]=ConvertirANumero(Subcadena(cadena,aux,aux))
			aux=aux+1
		FinPara	
	FinPara
FinSubProceso

SubProceso llenarMatriz_Z2(calculadora Por Referencia)
	Definir i, j, k Como Entero
	k=2
	Para i=0 hasta 2 Hacer
		Para j=0 hasta 2 Hacer
			calculadora[k,i,j]=calculadora[0,i,j]*calculadora[1,i,j]
		FinPara	
	FinPara
FinSubProceso

Subproceso imprimirMatriz(calculadora Por Referencia)
Definir i, j, k Como Entero
Para k=0 hasta 2 Hacer
	Escribir "Capa ", k, ":"
	Para i=0 hasta 2 Hacer
		Para j=0 hasta 2 Hacer
			Escribir Sin Saltar " ", calculadora[k,i,j], " "
		FinPara	
		Escribir ""
	FinPara
FinPara
FinSubProceso