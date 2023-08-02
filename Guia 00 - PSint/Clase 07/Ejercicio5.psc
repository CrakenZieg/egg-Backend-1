//Escriba un programa que solicite dos números enteros (mínimo y máximo). A continuación,
//se debe pedir al usuario que ingrese números enteros situados entre el máximo y mínimo.
//Cada vez que un número se encuentre entre ese intervalo, se sumara uno a una variable.
//El programa terminará cuando se escriba un número que no pertenezca a ese intervalo, y
//al finalizar se debe mostrar por pantalla la cantidad de números ingresados dentro del
//intervalo.


Algoritmo Ejercicio5
	
	definir min, max, num, i Como Entero
	escribir "Ingrese minimo"
	leer min
	escribir "Ingrese maximo"
	leer max
	escribir "Ingrese numero"
	leer num
	
	i=0
	
	Mientras num>min y num<max Hacer
		
		i=i+1
		escribir "Ingrese numero"
		leer num
		
	FinMientras
	Escribir "Ingreso ",i," numeros"
	
FinAlgoritmo
