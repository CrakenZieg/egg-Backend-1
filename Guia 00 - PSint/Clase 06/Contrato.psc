Algoritmo Contrato1
	Definir contrato Como Entero
	Definir ventas, horas, salario Como Real
	Escribir "Ingrese el tipo de contrato"
	Escribir "1. Comisión"
	Escribir "2. Salario fijo + comisión"
	Escribir "3. Salario fijo"
	Leer contrato
	Segun contrato Hacer
		1:
			Escribir "Ingrese el valor de las ventas: "
			Leer ventas
			Escribir "Debe recibir $", ventas*0.4
		2:
			Escribir "Ingrese el valor de las ventas: "
			Leer ventas
			Escribir "Ingrese las horas trabajadas: "
			Leer horas
			Escribir "Ingrese el valor de las hora: "
			Leer salario
			Si horas>40 Entonces
				Escribir "Debe recibir $", ventas*0.25+40*salario
			SiNo
				Escribir "Debe recibir $", ventas*0.25+horas*salario
			FinSi
		3:
			Escribir "Ingrese las horas trabajadas: "
			Leer horas
			Escribir "Ingrese el valor de las hora: "
			Leer salario
			Si horas>40 Entonces
				Escribir "Debe recibir $", 40*salario+(horas-40)*1.5*salario
			SiNo
				Escribir "Debe recibir $", horas*salario
			FinSi
	FinSegun
FinAlgoritmo

//Una empresa tiene personal de distintas áreas con distintas condiciones de contratación y
//formas de pago. El departamento de contabilidad necesita calcular los sueldos semanales
//(lunes a viernes) en base a las 3 modalidades de sueldo:
//	a) comisión
//	b) salario fijo + comisión, y
//	c) salario fijo
//	a) Para la modalidad salario por comisión se debe ingresar el monto total de las ventas
//		realizadas en la semana, y el 40% de ese monto total corresponde al salario del
//		empleado.
//		b) Para la condición de salario fijo + comisión, se debe ingresar el valor que se paga por
//			hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
//			esa semana. En este tipo de contrato las horas extras no están contempladas y se fija
//			como máximo 40 horas por semana. La comisión por las ventas se calcula como 25%
//			del valor de venta total.
//			c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga por
//				hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las 40
//				horas semanales, las horas extras se deben pagar con un extra del 50% del valor de la
//				hora. Realizar un menú de opciones para poder elegir el tipo de contrato que tiene un
//empleado.