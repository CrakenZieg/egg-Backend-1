//Es tu turno, dise�a un condicional anidado que le pregunte al usuario si quiere tomar t� o caf� y
//en caso de que quiera tomar caf�, preguntar si solo o cortado y en caso de ser cortado, si prefiere
//leche vegetal.

Algoritmo Desayuno
	Definir num Como Entero
	Escribir "Ingrese el n�mero de la bebida que prefiera:"
	Escribir "1. T�"
	Escribir "2. Caf�"
	Leer num
	Si num == 2 Entonces
		Escribir "Ingrese el n�mero de la opci�n que prefiera:"
		Escribir "1. Cortado"
		Escribir "2. Solo"
		Leer num
		Si num == 1 Entonces
			Escribir "Ingrese el n�mero de la opci�n que prefiera:"
			Escribir "1. Animal"
			Escribir "2. Vegetal"
			Leer num
			Si num==1 Entonces
				Escribir "Seleccion� Caf� cortado con leche animal"
			SiNo
				Escribir "Seleccion� Caf� cortado con leche vegetal"
			FinSi
		SiNo
			Escribir "Seleccion� Caf� solo"
		FinSi
	SiNo
		Escribir "Seleccion� T�"
	FinSi
FinAlgoritmo
