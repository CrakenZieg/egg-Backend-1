//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.
Algoritmo ej2_extras
	
	Definir vector, acum Como Real
	Definir n, i Como Entero
	Escribir "ingrese tama�o del arreglito"
	leer n
	Dimension vector(n)
	acum=0
	para i=0 Hasta n-1 Hacer
		Escribir "ingrese valores"
		leer vector(i)
		acum=acum+vector(i)
	FinPara
	Escribir "el promedio de la suma de los valores es: ", acum/n
	
FinAlgoritmo
