//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y termi-
//nada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vo-
//cal se reemplaza por el car�cter que se indica en la tabla y el resto de los caracteres (inclu-
//yendo a las vocales acentuadas) se mantienen sin cambios.
//	
//	a e i o u
//	@ # $ % *
//	
//Realice un subprograma que reciba una secuencia de caracteres y retorne la codificaci�n co-
//rrespondiente. Utilice la estructura "seg�n" para la transformaci�n.
//		
//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//La salida del programa deber�a ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
//NOTA: investigue el uso de la funci�n concatenar de PSeInt para armar la palabra/frase.

Algoritmo Ejercicio4
	Definir frase Como Caracter
	Escribir "Ingrese la frase a codificar: "
	Leer frase
	codificacion(frase)
	Escribir "La frase se codific� con exito: "
	Escribir frase
FinAlgoritmo

SubProceso codificacion(frase Por Referencia)
	Definir i Como Entero
	Definir auxL, auxF Como Caracter
	Para i = 0 Hasta (Longitud(frase)-1) Hacer
		auxL = Minusculas(Subcadena(frase,i,i))
		Segun auxL
			"a":
				Segun i
					0:
						frase = concatenar("@",Subcadena(frase,1,Longitud(frase)-1))
					Longitud(frase)-1:
						frase = concatenar(Subcadena(frase,0,Longitud(frase)-2),"@")
					De Otro Modo:
						auxF = concatenar(Subcadena(frase,0,i-1),"@")
						auxF = concatenar(auxF,Subcadena(frase,i+1,Longitud(frase)-1))
						frase = auxF
				FinSegun
			"e":
				Segun i
					0:
						frase = concatenar("#",Subcadena(frase,1,Longitud(frase)-1))
					Longitud(frase)-1:
						frase = concatenar(Subcadena(frase,0,Longitud(frase)-2),"#")
					De Otro Modo:
						auxF = concatenar(Subcadena(frase,0,i-1),"#")
						auxF = concatenar(auxF,Subcadena(frase,i+1,Longitud(frase)-1))
						frase = auxF
				FinSegun
			"i":
				Segun i
					0:
						frase = concatenar("$",Subcadena(frase,1,Longitud(frase)-1))
					Longitud(frase)-1:
						frase = concatenar(Subcadena(frase,0,Longitud(frase)-2),"$")
					De Otro Modo:
						auxF = concatenar(Subcadena(frase,0,i-1),"$")
						auxF = concatenar(auxF,Subcadena(frase,i+1,Longitud(frase)-1))
						frase = auxF
				FinSegun
			"o":
				Segun i
					0:
						frase = concatenar("%",Subcadena(frase,1,Longitud(frase)-1))
					Longitud(frase)-1:
						frase = concatenar(Subcadena(frase,0,Longitud(frase)-2),"%")
					De Otro Modo:
						auxF = concatenar(Subcadena(frase,0,i-1),"%")
						auxF = concatenar(auxF,Subcadena(frase,i+1,Longitud(frase)-1))
						frase = auxF
				FinSegun
			"u":
				Segun i
					0:
						frase = concatenar("*",Subcadena(frase,1,Longitud(frase)-1))
					Longitud(frase)-1:
						frase = concatenar(Subcadena(frase,0,Longitud(frase)-2),"*")
					De Otro Modo:
						auxF = concatenar(Subcadena(frase,0,i-1),"*")
						auxF = concatenar(auxF,Subcadena(frase,i+1,Longitud(frase)-1))
						frase = auxF
				FinSegun
		FinSegun
	FinPara
FinSubProceso
