//Realiza un programa que sólo permita introducir los caracteres ?S? y ?N?. Si el usuario
//ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla que
//diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO".

Algoritmo SiONo
	Definir entrada Como Caracter
	Escribir "Ingresa un caracter"
	Leer entrada
	entrada = Mayusculas(entrada)
	Si entrada="S" O entrada="N" Entonces
		Escribir "Correcto"
	SiNo
		Escribir "Incorrecto"
	FinSi
FinAlgoritmo
