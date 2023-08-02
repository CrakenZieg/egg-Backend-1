//Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de 3
//comprendidos entre 1 y 100.
Algoritmo sin_titulo
	Definir cont2, cont3, cont4 como real
	Definir i Como Entero
	cont2=0
	cont3=0
	cont4=0
	para i = 1 Hasta 100 Hacer
		si i mod 2=0 Entonces
			cont2=cont2+1
		FinSi
		si i mod 3 =0 Entonces
			cont3=cont3+1
		FinSi
		si i mod 4=0 Entonces
			cont4=cont4+1
		FinSi
	FinPara
	Escribir "la cantidad de numeros multiplos de 2 son: ", cont2
	Escribir "la cantidad de numeros multiplos de 3 son: ", cont3
	Escribir "la cantidad de numeros multiplos de 4 son: ", cont4
FinAlgoritmo
