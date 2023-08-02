//Realizar un procedimiento que permita realizar la división entre dos números y muestre el co-
//ciente y el resto utilizando el método de restas sucesivas.
//
//El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta
//obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas
//realizadas es el cociente. Por ejemplo: 50 / 13:
//		50 - 13 = 37 una resta realizada
//		37 - 13 = 24 dos restas realizadas
//		24 - 13 = 11 tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

Algoritmo Ejercicio3
	Definir dividendo, divisor Como Entero
	Escribir "Ingrese el dividendo: "
	Leer dividendo
	Escribir "Ingrese el divisor: "
	Leer divisor
	restasSucesivas(dividendo, divisor)
FinAlgoritmo

SubProceso restasSucesivas(dividendo, divisor)
	Definir resto, i Como Entero
	i = 0
	Si divisor>dividendo Entonces
		resto = dividendo
		Escribir "El cociente de dividir ", dividendo, " por ", divisor, " es ", i, " y el resto es ", resto
	SiNo
		Hacer
			resto = dividendo - divisor
			i = i + 1
			Escribir dividendo, " - ", divisor, " = ", resto, " una resta realizada"
			dividendo = resto
		Mientras Que divisor<=dividendo
		Escribir "El cociente es ", i, " y el resto es ", resto
	FinSi
	
FinSubProceso
	