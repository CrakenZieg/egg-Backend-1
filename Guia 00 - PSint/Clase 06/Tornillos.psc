//Escriba un programa para obtener el grado de eficiencia de un operario de una f�brica de
//tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un per�odo
//de prueba:
//? Producir menos de 200 tornillos defectuosos.
//? Producir m�s de 10000 tornillos sin defectos.
//? El grado de eficiencia se determina de la siguiente manera:
//? Si no cumple ninguna de las condiciones, grado 5.
//? Si s�lo cumple la primera condici�n, grado 6.
//? Si s�lo cumple la segunda condici�n, grado 7.
//? Si cumple las dos condiciones, grado 8

Algoritmo Tornillos
	Definir defec, sinDefect Como Entero
	Escribir "Ingresa el n�mero de tornillos defectuosos: "
	Leer defec
	Escribir "Ingresa el n�mero de tornillos sin defectos: "
	Leer sinDefect
	Si (defec>200) Entonces
		Si (sinDefect<10000) Entonces
			Escribir "La pruducci�n es de grado 5"
		SiNo
			Escribir "La pruducci�n es de grado 7"
		FinSi
	SiNo
		Si (sinDefect<10000) Entonces
			Escribir "La pruducci�n es de grado 6"
		SiNo
			Escribir "La pruducci�n es de grado 8"
		FinSi
	FinSi
FinAlgoritmo
