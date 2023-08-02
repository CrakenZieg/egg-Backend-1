Algoritmo clase10Ejercicio1
	
	Definir trabaj, i, ventas, j Como Entero
	Definir comis, sueld, ventCant, ventTot, ventTota, sueldTot  como Real
	Definir Emple Como Caracter
	
	Escribir "Cuantos trabajadores son ?"
	Leer trabaj
	Escribir " "
	ventTota = 0
	ventTot = 0
	
	Para i <- 1 Hasta  trabaj Con Paso 1 Hacer
		
		Escribir "Cual es el nombre de el trabajador n°" i
		Leer Emple
		Escribir " "
		
		Escribir "Cuanto es su sueldo base de esta semana ?"
		Leer sueld
		Escribir " "
		
		Escribir "Cuantas ventas realizo esta semana?"
		Leer ventas 
		Escribir " "
		
		Para  j <- 1 Hasta ventas Con Paso 1 Hacer
			
			Escribir "Cuanto vale la venta n°" j
			Leer ventCant
			Escribir " "
			
			ventTot = ventTot + ventCant
		FinPara
		
		ventTota = ventas * (sueld * 10 /100)
		sueldTot = ventTota + sueld
		Escribir "El trabajador " Emple " tiene que cobrar $" ventTota " por comision de esta semana"
		Escribir " "
		Escribir "Genero $" ventTot " con el total de ventas de esta semana"
		Escribir " "
		Escribir "El total a pagar es de $" sueldTot " (sueldo semanal + comision de ventas semanales)"
		
	FinPara
	
FinAlgoritmo
