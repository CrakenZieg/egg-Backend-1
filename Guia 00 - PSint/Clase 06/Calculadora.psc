//Construir un programa que simule un menú de opciones para realizar las cuatro
//operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
//numéricos enteros. El usuario, además, debe especificar la operación con el primer
//carácter de la operación que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta, ?M?
//o ?m? para la multiplicación y ?D? o ?d? para la división.

Algoritmo Calculadora
	Definir opcion1 Como Caracter
	Definir num1, num2 Como Real
	Escribir "Ingrese S para suma, R para resta, M para multiplicación o D para división: "
	Leer opcion1
	Escribir "Ingrese el primer número: "
	Leer num1
	Escribir "Ingrese el Segundo número: "
	Leer num2
	Segun opcion1 Hacer
		"S","s":
			Escribir num1 + num2
		"R", "r":
			Escribir num1 - num2
		"M", "m":
			Escribir num1 * num2
		"D", "d":
			Escribir num1 / num2
		De Otro Modo:
			Escribir "La opción ingresada no es correcta"
	FinSegun
FinAlgoritmo
