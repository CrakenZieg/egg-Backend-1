//Realizar un programa que lea 10 n�meros reales por teclado, los almacene en un arreglo y
//
//muestre por pantalla la suma, resta y multiplicaci�n de todos los n�meros ingresados al arre-
//glo.

Algoritmo G5E02
	Dimension vector(10)
	DEFINIR  i Como Entero
	definir vector, j, k, l  Como Real
	
	escribir "Ingrese 10 valores reales"
	
	j=0
	k=0
	l=1
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		leer vector(i)
		j=j+vector(i)
		k=k-vector(i)
		l=l*vector(i)
	Fin Para
	
	escribir "El resultado de la suma de los n�meros ingresados es: ", j
	escribir "El resultado de la resta de los n�meros ingresados es: ", k
	escribir "El resultado de la multiplicaci�n de los n�meros ingresados es: ", l
	
	//Para i<-0 Hasta 4 Con Paso 1 Hacer
	//	Escribir vector(i) " " Sin Saltar
		
	//Fin Para
	
	
	
FinAlgoritmo