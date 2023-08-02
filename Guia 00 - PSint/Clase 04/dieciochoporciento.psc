//Construir un pseudocódigo que permita ingresar un número, si el número es mayor de
//500, se debe calcular y mostrar en pantalla el 18% de este.
Algoritmo dieciochoporciento
	Definir numero1, dieciocho Como Real
	Escribir "Introdusca un numero: "
	Leer numero1
	Si numero1>500 Entonces
		dieciocho=numero1*0.18
		Escribir "El 18% de ", numero1, " es ", dieciocho
	FinSi
FinAlgoritmo
