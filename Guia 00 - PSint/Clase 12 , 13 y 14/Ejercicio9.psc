//Los empleados de una f�brica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el
//jornal diario de acuerdo con las siguientes reglas:
//	a) La tarifa de las horas diurnas es de $ 90
//	b) La tarifa de las horas nocturnas es de $ 125
//	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
//un 15% si el turno es nocturno.
//El programa debe solicitar la siguiente informaci�n al usuario: el nombre del trabajador, el d�a
//de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Adem�s, debe-
//mos preguntarle al usuario si el d�a de la semana (lunes, martes, mi�rcoles, etc.) era festivo o
//no, para poder calcular el jornal diario. Utilice una funci�n para realizar el c�lculo.

Algoritmo Ejercicio9
	
	Definir nombre, dia, turno, feria Como Caracter
	Definir cantHoras Como Entero
	Definir salario Como Real
	Definir feriado Como Logico
	
	Escribir "Ingrese el nombre del empleado:"
	Leer nombre
	Escribir "Ingrese el d�a de la semana:"
	Leer dia
	Escribir "�Es d�a festivo? (S/N)"
	Leer feria
	Si Mayusculas(feria) = "S" Entonces
		feriado = Verdadero
	SiNo
		feriado = Falso
	FinSi
	Escribir "Ingrese el turno (D/N):"
	Leer turno
	turno = Mayusculas(turno)
	Escribir "Ingrese cantidad de horas:"
	Leer cantHoras
	salario = CalcSalario(feriado, turno, cantHoras)
	
	Escribir "El empleado ", nombre, " recibir� $", salario, " por trabajar el d�a ", dia, " en el turno ", turno, " la cantidad de ", cantHoras, " horas"
FinAlgoritmo

Funcion salario <- CalcSalario(feriado, turno, cantHoras)
	Definir salario Como Real
 	Si turno = "D" Entonces
		Si feriado Entonces
			salario=cantHoras*90*1.1
		SiNo
			salario=cantHoras*90
		FinSi
	SiNo
		Si feriado Entonces
			salario=cantHoras*125*1.15
		SiNo
			salario=cantHoras*125
		FinSi
	FinSi
FinFuncion


