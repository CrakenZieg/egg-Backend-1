//Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales re-
//petidas. Al final el procedimiento mostrará la frase final.
//
//Por ejemplo:
//Entrada: "Habia una vez un barco"
//Salida: "Habi un vez n brco"
//	
//Se marcan en rojo las repetidas sólo para explicar la consigna. Las vocales ?e?, ?i? y ?o? que-
//dan al no estar repetidas.

Algoritmo Ejercicio9
	Definir frase, letras Como Caracter
	Escribir "Ingrese una frase a limpiar: "
	Leer frase
	Escribir "Ingrese las letras a limpiar: "
	Leer letras
	limpiador(frase, letras)
	Escribir "La frase está limpia: "
	Escribir frase
FinAlgoritmo

SubProceso limpiador(frase Por Referencia, letras Por Valor)
	Definir i Como Entero
	Para i=0 Hasta Longitud(letras)-1 Hacer
		limpiadorFino(frase, Subcadena(letras,i,i))
	FinPara
FinSubProceso

Funcion limpiadorFino(frase Por Referencia, letra Por Valor)
	Definir auxF Como Caracter
	Definir i Como Entero
	Definir aparecio Como Logico
	auxF = ""
	aparecio = Falso
	Para i=0 Hasta Longitud(frase)-1 Hacer
		Si aparecio=Falso Entonces
			Si Minusculas(Subcadena(frase,i,i))=Minusculas(letra) Entonces
				aparecio = Verdadero
				auxF = Concatenar(auxF, Subcadena(frase,i,i))
			SiNo
				auxF = Concatenar(auxF, Subcadena(frase,i,i))
			FinSi
		SiNo
			Si Minusculas(Subcadena(frase,i,i))<>Minusculas(letra) Entonces
				auxF = Concatenar(auxF, Subcadena(frase,i,i))
			FinSi
		FinSi
	FinPara
	frase = auxF
FinSubProceso

