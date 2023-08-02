//Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y muestra
//una cadena con un espacio adicional tras cada letra.
//Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se use
//dicho procedimiento.

Algoritmo Ejercicio5
	Definir frase Como Caracter
	Escribir "Ingrese la frase a espaciar: "
	Leer frase
	espaciador(frase)
	Escribir frase
FinAlgoritmo

SubProceso espaciador(frase Por Referencia)
	Definir i Como Entero
	Definir auxF Como Caracter
	auxF = ""
	Para i = 0 Hasta Longitud(frase)-1 Hacer
		Si i<>Longitud(frase)-1 Entonces
			Si Subcadena(frase,i+1,i+1)=" " O Subcadena(frase,i,i)=" " Entonces
				auxF = Concatenar(auxF,Subcadena(frase,i,i))
			SiNo
				auxF = Concatenar(auxF,Concatenar(Subcadena(frase,i,i), " "))
			FinSi
		SiNo
			auxF = Concatenar(auxF,Concatenar(Subcadena(frase,i,i), " "))
		FinSi
	FinPara
	frase = auxF
FinSubProceso
