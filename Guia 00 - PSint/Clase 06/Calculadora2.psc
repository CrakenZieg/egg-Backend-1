Algoritmo sin_titulo
	definir num1, num2 Como entero
	definir operac Como Caracter
	escribir "ingrese un numero: "
	leer num1
	escribir "ingrese numero: "
	leer num2
	Escribir "ingrese la operación matematica: "
	leer operac
	operac = Minusculas(SubCadena(operac,0,0))
	si operac = "s" Entonces
		Escribir "la suma es:  ", (num1 + num2)
	SiNo
		si operac = "r" Entonces
			escribir "la resta es: ", (num1 - num2)
		SiNo
			si operac = "d" Entonces
				Escribir "la división es: ", (num1/num2)
			SiNo
				si operac = "m" Entonces
					escribir "la multiplicación es: ", (num1*num2)
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo