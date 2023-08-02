//EJERCICIO ZOOM
//Realizar un programa que pida al usuario el horario en el que se conectó al zoom. Si ese horario
//está entre la hora de ingreso y la hora de ingreso + los 15? de tardanza, mostrará un mensaje por
//pantalla que diga "Llegaste a tiempo, tienes presente". Si el horario de ingreso supera ese límite,
//se mostrará un mensaje por pantalla que diga "Hoy tendrás tardanza. Recuerda avisarle a tus
//coaches cuando llegarás tarde. Mañana te esperamos a tiempo, tu participación en el equipo es
//VITAL"

Algoritmo presente
	Definir hora, minutos Como Entero
	Escribir "Escribe la hora de ingreso"
	Leer hora
	Escribir "Escribe los minutos de ingreso"
	Leer minutos
	Si (hora=19 Y minutos<15) O hora<19 Entonces
		Escribir "LLegaste a tiempo, tienes presente"
	SiNo
		Escribir "Hoy tendrás tardanza. Recuerda avisarle a tus coaches cuando llegarás tarde. Mañana te esperamos a tiempo, tu participación en el equipo es VITAL"
	FinSi
FinAlgoritmo
