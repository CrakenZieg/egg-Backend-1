//Escriba un programa para obtener el grado de eficiencia de un operario de una fábrica de
//tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un período
//de prueba:
//? Producir menos de 200 tornillos defectuosos.
//? Producir más de 10000 tornillos sin defectos.
//? El grado de eficiencia se determina de la siguiente manera:
//? Si no cumple ninguna de las condiciones, grado 5.
//? Si sólo cumple la primera condición, grado 6.
//? Si sólo cumple la segunda condición, grado 7.
//? Si cumple las dos condiciones, grado 8

Algoritmo Tornillos
	Definir defec, sinDefect Como Entero
	Escribir "Ingresa el número de tornillos defectuosos: "
	Leer defec
	Escribir "Ingresa el número de tornillos sin defectos: "
	Leer sinDefect
	Si (defec>200) Entonces
		Si (sinDefect<10000) Entonces
			Escribir "La pruducción es de grado 5"
		SiNo
			Escribir "La pruducción es de grado 7"
		FinSi
	SiNo
		Si (sinDefect<10000) Entonces
			Escribir "La pruducción es de grado 6"
		SiNo
			Escribir "La pruducción es de grado 8"
		FinSi
	FinSi
FinAlgoritmo
