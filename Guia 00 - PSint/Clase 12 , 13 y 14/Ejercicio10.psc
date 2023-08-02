//Realizar una función que calcule la suma de los dígitos de un número.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el último número de un digito de 2 cifras o más debemos pensar en el
//resto de una división entre 10. Recordar el uso de la función Mod y Trunc.

Algoritmo Ejercicio10
	Definir num Como Caracter
	Definir suma Como Entero
	Escribir "Ingrese un número: "
	Leer num
	suma = sumaDeDigitos(num)
	Escribir "La suma de los dígitos de ", num, " es: " suma
FinAlgoritmo

Funcion suma<- sumaDeDigitos(num)
	
	Definir suma, i Como Entero
	suma = 0
	Para i = 0 Hasta Longitud(num)-1 Hacer
		suma = suma + ConvertirANumero(Subcadena(num,i,i))
	FinPara

FinFuncion

