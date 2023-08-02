//Es tu turno, diseña un condicional anidado que le pregunte al usuario si quiere tomar té o café y
//en caso de que quiera tomar café, preguntar si solo o cortado y en caso de ser cortado, si prefiere
//leche vegetal.

Algoritmo Desayuno
	Definir num Como Entero
	Escribir "Ingrese el número de la bebida que prefiera:"
	Escribir "1. Té"
	Escribir "2. Café"
	Leer num
	Si num == 2 Entonces
		Escribir "Ingrese el número de la opción que prefiera:"
		Escribir "1. Cortado"
		Escribir "2. Solo"
		Leer num
		Si num == 1 Entonces
			Escribir "Ingrese el número de la opción que prefiera:"
			Escribir "1. Animal"
			Escribir "2. Vegetal"
			Leer num
			Si num==1 Entonces
				Escribir "Seleccionó Café cortado con leche animal"
			SiNo
				Escribir "Seleccionó Café cortado con leche vegetal"
			FinSi
		SiNo
			Escribir "Seleccionó Café solo"
		FinSi
	SiNo
		Escribir "Seleccionó Té"
	FinSi
FinAlgoritmo
