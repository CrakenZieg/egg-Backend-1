//Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree un
//cuadrado de asteriscos de ese tama�o. Los asteriscos s�lo se ver�n en el borde del
//cuadrado, no en el interior.

Algoritmo Cuadrado
	Definir i, j, lado Como Entero
	Escribir "Ingrese el largo del lado: "
	Leer lado
	Para i=1 Hasta lado Hacer
		Para j=1 Hasta lado Hacer
			Si i=1 O j=1 O i=lado O j=lado Entonces
				Escribir Sin Saltar"* "
			SiNo
				Escribir Sin Saltar "  "
			FinSi
			Si j=lado Entonces
				Escribir ""
			FinSi
		FinPara
	FinPara
FinAlgoritmo

