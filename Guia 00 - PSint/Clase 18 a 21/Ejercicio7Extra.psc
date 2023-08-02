//Programe una función que calcule el producto de un arreglo de números enteros. Para esto
//imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los valores es
//igual a (V[1]*V[2]*V[3]*V[4])

Algoritmo ejercicio6Extra
	Definir n, i Como Entero 
	Definir arreglo Como Real
	Escribir "Ingrese el tamaño del arreglo: "
	Leer n
	Dimension arreglo[n]
	Para i=0 Hasta n-1 Hacer
		arreglo[i] = Aleatorio(-100,100)
	FinPara
	Escribir "El vector es: "
	mostrarVector(arreglo, n)
	Escribir "El multiplo de sus elementos es ", multiploDeElementos(arreglo, n)
FinAlgoritmo

SubProceso mostrarVector(arreglo Por Referencia, N)
	Definir i Como Entero
	Escribir ""
	Escribir Sin Saltar"[ "
	Para i=0 Hasta N-1 Hacer
		Si i<>N-1 Entonces
			Escribir Sin Saltar arreglo[i],", "
		SiNo
			Escribir Sin Saltar arreglo[i]," "
		FinSi
	FinPara
	Escribir Sin Saltar"] "
	Escribir ""
	Escribir ""
FinSubProceso

Funcion multiplo <- multiploDeElementos(arreglo Por Referencia, n)
	Definir i Como Entero
	Definir multiplo Como Real
	multiplo=1
	Para i=0 Hasta n-1 Hacer
		multiplo=multiplo*arreglo[i]
	FinPara
FinFuncion