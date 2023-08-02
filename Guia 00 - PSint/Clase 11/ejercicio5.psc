Algoritmo sin_titulo
	Definir num, resultado Como Entero
	escribir" ingrese un numero"
	Leer num
	resultado <-nprimo (num)
FinAlgoritmo

Funcion c<- nprimo (b)
	
	definir ndiv, i como entero
	ndiv = 1
	i=0
	mientras ndiv <= b Hacer
		si b mod ndiv==0 entonces
			i = i+1
		FinSi
		ndiv= ndiv+1
	FinMientras
	si  i == 2 Entonces
		Escribir " el numero: " b " es primo"
	SiNo
		Escribir " el numero: " b " no es primo"
	FinSi
	FinFuncion
	