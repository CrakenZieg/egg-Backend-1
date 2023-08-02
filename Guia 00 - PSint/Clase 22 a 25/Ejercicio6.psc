//Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
//tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
//Por ejemplo:
//	2 7 6
//	9 5 1
//	4 3 8
//En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un algo-
//ritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que sea
//mágica escribir la suma. Además, el programa deberá comprobar que los números introduci-
//dos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la matriz
//que no debe superar orden igual a 10.

Algoritmo Ejercicio6
	Definir matriz, n, fila, columna, diagonal, resultados, i, j Como Entero
	Escribir "Ingrese el orden de la matriz: "
	Leer n
	Dimension matriz[n,n], fila[n], columna[n]
	Para i=0 Hasta n-1 Hacer
		Para j=0 Hasta n-1 Hacer
			Escribir "Ingrese el elemento [ ", i, ", ", j, "]"	
			Leer matriz[i,j]
		FinPara
	FinPara
	diagonal=diagonales(matriz,n)
	Si diagonal<>-1 Entonces
		recorrido(matriz, fila, columna, n)
		resultados=comparar(fila, columna, n, diagonal)
		Si resultados<>-1 Entonces
			Escribir "Es un cuadrado mágico y su suma es ", resultados
		SiNo
			Escribir "No es un cuadrado mágico"
		FinSi
	SiNo
		Escribir "No es un cuadrado mágico "
	FinSi
FinAlgoritmo

Funcion suma<-sumaFila(matriz Por Referencia, n, i)
	Definir suma, c Como Entero
	suma=0
	Para c=0 Hasta n-1 Hacer
		suma=suma+matriz[i,c]
	FinPara
FinFuncion

Funcion suma<-sumaColumna(matriz Por Referencia, n, j)
	Definir suma, f Como Entero
	suma=0
	Para f=0 Hasta n-1 Hacer
		suma=suma+matriz[f,j]
	FinPara
FinFuncion

SubProceso recorrido(matriz Por Referencia, vectorF Por Referencia, vectorC Por Referencia, n)
	Definir i Como Entero
	Para i=0 Hasta n-1 Hacer
		vectorF[i]=sumaFila(matriz, n, i)
		vectorC[i]=sumaColumna(matriz, n, i)
	FinPara
FinSubProceso

Funcion suma<-diagonales(matriz Por Referencia, n)
	Definir i, sumaI, sumaD, suma Como Entero
	sumaI=0
	sumaD=0
	Para i=0 Hasta n-1 Hacer
		sumaI=sumaI+matriz[i,i]
		sumaD=sumaD+matriz[i,n-1-i]
	FinPara
	Si sumaI=sumaD Entonces
		suma=sumaD
	SiNo
		suma=-1
	FinSi
FinFuncion

Funcion resultados<-comparar(vectorF Por Referencia, vectorC Por Referencia, n, diagonal)
	Definir i, valorA, resultados Como Entero
	Para i=0 Hasta n-1 Hacer
		Si diagonal=vectorF[i] Y diagonal=vectorC[i] Entonces
			valorA=vectorF[i]
		SiNo 
			valorA=-1
			i=n-1
		FinSi
	FinPara
	resultados=valorA
FinFuncion

SubProceso rellenarMatriz(matriz Por Referencia, n, m)
	Definir i, j Como Entero
	para i<- 0 Hasta n-1 Hacer
		para j<-0 Hasta m - 1 Hacer
			matriz(i,j)=Aleatorio(1, 9)
		FinPara
	FinPara
FinSubProceso
	