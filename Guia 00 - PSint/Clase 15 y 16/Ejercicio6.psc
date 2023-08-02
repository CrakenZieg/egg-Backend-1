//Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta entre las
//letras "M" y "T". Recordar que Pseint le da un valor numérico a cada letra a través del Código
//Ascii, lo que nos deja usar operadores relacionales con letras y cadenas.

Algoritmo Ejercicio6
	Definir letra Como Caracter
	Escribir "Ingrese la letra: "
	Leer letra
	evaluador(letra) 
FinAlgoritmo

SubProceso evaluador(letra)
	Si "M"<=letra Y letra<="T" Entonces
		Escribir letra, " esta entre M y T"
	SiNo
		Escribir letra, " no esta entre M y T"
	FinSi
FinSubProceso
	