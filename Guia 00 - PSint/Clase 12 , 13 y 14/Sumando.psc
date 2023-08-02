//Realizar una función que calcule la suma de dos números. En el algoritmo principal le pedire-
//mos al usuario los dos números para pasárselos a la función. Después la función calculará la
//suma y lo devolverá para imprimirlo en el algoritmo.

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
	