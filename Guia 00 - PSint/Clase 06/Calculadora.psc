//Construir un programa que simule un men� de opciones para realizar las cuatro
//operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
//num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
//car�cter de la operaci�n que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta, ?M?
//o ?m? para la multiplicaci�n y ?D? o ?d? para la divisi�n.

Algoritmo Calculadora
	Definir opcion1 Como Caracter
	Definir num1, num2 Como Real
	Escribir "Ingrese S para suma, R para resta, M para multiplicaci�n o D para divisi�n: "
	Leer opcion1
	Escribir "Ingrese el primer n�mero: "
	Leer num1
	Escribir "Ingrese el Segundo n�mero: "
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
			Escribir "La opci�n ingresada no es correcta"
	FinSegun
FinAlgoritmo
