//Escriba un programa que solicite dos n�meros enteros (m�nimo y m�ximo). A continuaci�n,
//se debe pedir al usuario que ingrese n�meros enteros situados entre el m�ximo y m�nimo.
//Cada vez que un n�mero se encuentre entre ese intervalo, se sumara uno a una variable.
//El programa terminar� cuando se escriba un n�mero que no pertenezca a ese intervalo, y
//al finalizar se debe mostrar por pantalla la cantidad de n�meros ingresados dentro del
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
