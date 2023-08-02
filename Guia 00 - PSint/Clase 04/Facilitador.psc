//Escriba un programa en donde se le pregunte al estudiante si el día de hoy le toca ser el
//facilitador de tu equipo. En caso de que sea, que muestre por pantalla el siguiente mensaje:
//"¡Felicidades! Eres el facilitador de tu equipo."

Algoritmo Facilitador
	Definir facilitador_de_hoy Como Cadena
	Escribir "¿Sos el facilitador de hoy? (S/N)"
	Leer facilitador_de_hoy
	SI facilitador_de_hoy == S Entonces
		Escribir "¡Felicidades! Eres el facilitador de tu equipo."
	SiNo
		Escribir "¡Felicidades! No eres el facilitador de tu equipo."
	FinSi
FinAlgoritmo
