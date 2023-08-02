//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
//muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al arre-
//glo.

Algoritmo Ejercicio2
	Definir arrayReales, suma, resta, multiplicacion Como Real
	Definir i Como Entero
	Dimension arrayReales[10]
	suma = 0
	resta = 0
	multiplicacion = 1
	Para i=0 Hasta 9 Hacer
		Escribir "Ingrese el numero en la posición ", i, ":"
		Leer arrayReales[i]
		suma = suma + arrayReales[i]
		resta = resta - arrayReales[i]
		multiplicacion = multiplicacion * arrayReales[i]
	FinPara
	Escribir ""
	Escribir Sin Saltar "[ "
	Para i=0 Hasta 9 Hacer
		Si i <> 9 Entonces
			Escribir Sin Saltar arrayReales[i], ", "
		SiNo
			Escribir Sin Saltar arrayReales[i]
		FinSi
	FinPara
	Escribir Sin Saltar "]"
	Escribir ""
	Escribir "El resultado de su suma es: ", suma
	Escribir "El resultado de su resta es: ", resta
	Escribir "El resultado de su multiplicacion es: ", multiplicacion
	
FinAlgoritmo
