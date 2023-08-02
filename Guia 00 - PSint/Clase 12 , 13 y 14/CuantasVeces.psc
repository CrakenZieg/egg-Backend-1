//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La fun-
//ción debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la fun-
//ción Subcadena().

Algoritmo CuantasVeces
	Definir frase, letra Como Caracter
	Definir retorno Como Entero
	Escribir "Ingrese una frase: "
	Leer frase
	Escribir "¿Que letra desea contar?"
	Leer letra
	retorno = CuantasVecesMet(frase, letra)
	Escribir letra, " aparece ", retorno ," veces en ", frase
FinAlgoritmo

Funcion SonONo <- SonIguales(char1, char2)
	Definir SonONo Como Logico
	SonONo = (char1=char2)
FinFuncion

Funcion cant <- CuantasVecesMet(frase,char)
	Definir cant, i Como Entero
	cant = 0
	Para i=0 Hasta Longitud(frase)-1 Hacer
		Si SonIguales(Subcadena(frase,i,i), char)
		cant = cant + 1
		FinSi
	FinPara
FinFuncion
