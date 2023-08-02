//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.

Algoritmo sin_titulo
	definir i,n,Vector,suma Como Entero
	
	escribir "Ingrese el Tamaño del vector a llenar"
	
	leer n
	
	suma=0
	
	dimension Vector(n)
	escribir "Ingrese los Valores"
	para i=0 hasta n-1 Hacer
		
		leer Vector(i)
		suma=Vector(i)+suma
	FinPara
	
	Escribir "la suma de todos los valores ingresados es de:(" suma/n ")"
	
FinAlgoritmo
