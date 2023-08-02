//Realizar una funci�n que calcule la suma de los d�gitos de un n�mero.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el �ltimo n�mero de un digito de 2 cifras o m�s debemos pensar en el
//resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.

Algoritmo Ejercicio10
	Definir num Como Caracter
	Definir suma Como Entero
	Escribir "Ingrese un n�mero: "
	Leer num
	suma = sumaDeDigitos(num)
	Escribir "La suma de los d�gitos de ", num, " es: " suma
FinAlgoritmo

Funcion suma<- sumaDeDigitos(num)
	
	Definir suma, i Como Entero
	suma = 0
	Para i = 0 Hasta Longitud(num)-1 Hacer
		suma = suma + ConvertirANumero(Subcadena(num,i,i))
	FinPara

FinFuncion

