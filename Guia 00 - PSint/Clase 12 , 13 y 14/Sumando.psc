//Realizar una funci�n que calcule la suma de dos n�meros. En el algoritmo principal le pedire-
//mos al usuario los dos n�meros para pas�rselos a la funci�n. Despu�s la funci�n calcular� la
//suma y lo devolver� para imprimirlo en el algoritmo.

Algoritmo Sumando
	Definir num1, num2, retorno Como Real
	Escribir "Ingrese 2 numeros para sumarlos:"
	Leer num1, num2
	retorno = Suma(num1, num2)
	Escribir "La suma de ", num1, " y ", num2, " es ", retorno
FinAlgoritmo

Funcion retorno <- Suma(num1, num2)
	Definir retorno Como Real
	retorno = num1 + num2 
FinFuncion
	