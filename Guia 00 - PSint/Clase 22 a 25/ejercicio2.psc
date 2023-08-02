Algoritmo ejercicio2
//	Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
//	usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las coorde-
//	nadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En caso de no
//	encontrar el valor dentro de la matriz se debe mostrar un mensaje.
	
	Definir matriz, i, j, n Como Entero
	definir bandera Como Logico
	Dimension matriz[5,5]
	bandera=falso
	para i<-0 hasta 4 Hacer
		para j<-0 hasta 4 Hacer
			matriz[i,j]=Aleatorio(1,30)
		FinPara
	FinPara
	Escribir "ingrese un elemento a buscar en la matriz: "
	leer n
	para i<-0 hasta 4 Hacer
		para j<-0 hasta 4 hacer 
			si matriz[i,j]=n Entonces
			bandera=Verdadero
		Escribir "el numero buscado se encuentra en: " , "(", i, ",", j, ")"
		
	FinSi
FinPara
FinPara
si bandera=falso Entonces
	Escribir "el numero no se encuentra en la matriz."
FinSi
Para i = 0 Hasta 5-1 Hacer
	Para j=0 Hasta 5-1 Hacer
		Escribir Sin Saltar matriz(i,j), " "
	FinPara
	Escribir ""
FinPara
FinAlgoritmo
