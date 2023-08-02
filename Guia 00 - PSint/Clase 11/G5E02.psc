//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
//
//muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al arre-
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
	
	escribir "El resultado de la suma de los números ingresados es: ", j
	escribir "El resultado de la resta de los números ingresados es: ", k
	escribir "El resultado de la multiplicación de los números ingresados es: ", l
	
	//Para i<-0 Hasta 4 Con Paso 1 Hacer
	//	Escribir vector(i) " " Sin Saltar
		
	//Fin Para
	
	
	
FinAlgoritmo