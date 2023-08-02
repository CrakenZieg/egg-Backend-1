Algoritmo CuadradoPrimo
	Definir i, j, lado Como Entero
	Escribir "Ingrese el largo del lado: "
	Leer lado
	Para i=1 Hasta lado Hacer
		Para j=1 Hasta lado Hacer
			Si (lado%i=0 O lado%j=0) Entonces
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