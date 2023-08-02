//Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
//N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves de
//sus estudiantes:
//§ Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
//reprueba el curso si tiene una nota final inferior a 6.5
//§ Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
//§ La mayor nota obtenida en las exposiciones.
//§ Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
//El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
//las 3 notas y calculará todos informes claves que requiere el docente.
Algoritmo sin_titulo
	//doc. ingresa cantidad de estudiantes
	//por c/u entrega 3 notas
	//hacer promedio entre los desaprobados, contador de desaprobados y acumulador
	//contador de aprobados
	//maximo de exposiciones
	//contador de los que estan entre 4.0 y 7.5
	Definir estudiantes, int, ex, par, contDes, acumDes, contApr, maxExp, ultCont, nota Como Real
	Definir i Como Entero
	Escribir "Profe: ingrese cantidad de estudiantes"
	leer estudiantes
	acumDes=0
	contDes=0
	maxExp=0
	contApr=0
	ultCont=0
	para i = 1 Hasta estudiantes Hacer
		hacer 
			Escribir "ingrese las notas de integrador, exposicion y parcial"
			leer int, ex, par
		Mientras Que int<0 o int>10 o ex<0 o ex>10 o par<0 o par>10
		nota= (int*0.35)+(ex*0.25)+(par*0.40)
		si nota<6.5 Entonces
			acumDes=acumDes+nota
			contDes=contDes+1
		FinSi
		si nota>7.5 Entonces
			contApr=contApr+1
		FinSi
		si ex>maxExp Entonces
			maxExp=ex
		FinSi
		si par>=4.0 y par<=7.5 Entonces
			ultCont=ultCont+1
		FinSi
	FinPara
	Escribir "nota promedio final de estudiantes desaprobados: ", acumDes/contDes
	Escribir "el porcentaje de alumnos con calificacion mayor a 7.5 es: ", trunc(contApr*100/estudiantes), "%"
	Escribir "la mayor nota obtenida en exposiciones es: ", maxExp
	Escribir "Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5: ", ultCont
	
FinAlgoritmo
