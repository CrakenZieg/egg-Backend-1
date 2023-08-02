//Realizar un programa que lea 5 números (comprendidos entre 1 y 20) e imprima el número
//ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//	5 *****
//	3 ***
//	11 ***********
//	2 **
//	9 *********

Algoritmo CincoNumeros
	Definir i, j, k, n, num Como Entero
	Definir data, datin Como Caracter
	data = ""
	Hacer
		Escribir "Ingrese la cantidad de números que desea graficar: "
		Leer n
	Mientras Que n<=0
	Para i=1 Hasta n Hacer
		Hacer
			Escribir "Ingrese el número ", i, ":"
			Leer num
		Mientras Que num<0 O num>100
		datin = Concatenar("*",ConvertirATexto(num))
		data = Concatenar(data, datin)
	//*55*66*4*434
	FinPara
	Para j=0 Hasta Longitud(data)-1 Hacer
		Si Subcadena(data,j,j)<>"*" Entonces
			Si j+1<=Longitud(data)-1 Entonces
				Si Subcadena(data,j+1,j+1)<>"*" Entonces
					num = ConvertirANumero(concatenar(Subcadena(data,j,j),Subcadena(data,j+1,j+1)))
					Escribir Sin Saltar num
					Para k=1 Hasta num Hacer
						Escribir Sin Saltar "*"
					FinPara
					Escribir ""
					j = j+1
				SiNo
					Si ConvertirANumero(Subcadena(data,j,j))=0 Entonces
						Escribir Sin Saltar Subcadena(data,j,j)
						Escribir ""
					SiNo
						Escribir Sin Saltar Subcadena(data,j,j)
						Para k=1 Hasta ConvertirANumero(Subcadena(data,j,j)) Hacer
							Escribir Sin Saltar "*"
						FinPara
						Escribir ""
					FinSi
				FinSi
			SiNo
				Si ConvertirANumero(Subcadena(data,j,j))=0 Entonces
					Escribir Sin Saltar Subcadena(data,j,j)
					Escribir ""
				SiNo
					Escribir Sin Saltar Subcadena(data,j,j)
					Para k=1 Hasta ConvertirANumero(Subcadena(data,j,j)) Hacer
						Escribir Sin Saltar "*"
					FinPara
					Escribir ""
				FinSi
			FinSi
		FinSi
	FinPara
	
FinAlgoritmo
