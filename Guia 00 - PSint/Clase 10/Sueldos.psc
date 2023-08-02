//Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
//m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
//recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
//compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
//deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
//cada venta.

Algoritmo Sueldos
	Definir i, j, nominaEmpleados, cantVentas Como Entero
	Definir sueldo, venta, comision, sueldoTotal Como Real
	Definir nombre, respuesta, dato Como Caracter
	respuesta = ""
	Escribir "�Cuantos empleados desea ingresar?"
	Leer nominaEmpleados
	Para i=1 Hasta nominaEmpleados Hacer
		nombre = ""
		sueldo = 0
		cantVentas = 0
		comision = 0
		Hacer
			Escribir "Ingrese el nombre del empleado: "
			Leer nombre
		Mientras Que nombre=""
		Hacer
			Escribir "Ingrese el sueldo del empleado: "
			Leer sueldo
		Mientras Que sueldo=0
		Escribir "�Cuantas ventas realiz� esta semana?"
		Leer cantVentas
		si cantVentas>0
			Para j=1 Hasta cantVentas Hacer
				Escribir "Ingrese el monto de la venta ", j, ":"
				Leer venta
				comision = comision+venta*0.1			
			FinPara
		FinSi
		sueldoTotal = sueldo + comision
		dato = nombre + " debe recibir $" + ConvertirATexto(sueldoTotal) + " en total, de los cuales $" + ConvertirATexto(comision) + " son en concepto de comision por "+ ConvertirATexto(cantVentas) + " ventas. - "
		respuesta = Concatenar(respuesta, dato)
	FinPara
	Escribir respuesta
FinAlgoritmo
