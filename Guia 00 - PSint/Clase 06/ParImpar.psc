//Realizar un programa que, dado un n�mero entero, visualice en pantalla si es par o impar.
//En caso de que el valor ingresado sea 0, se debe mostrar "el n�mero no es par ni impar".
//Nota: investigar la funci�n mod de PSeInt

Algoritmo ParImpar
	Definir num Como Entero
	Escribir "Ingresa un n�mero"
	Leer num
	Si num<>0 Entonces
		Si num%2==0 Entonces
			Escribir num, " es Par"
		SiNo
			Escribir num, " es Impar"
		FinSi
	SiNo
		Escribir num, " no es par ni impar"
	FinSi
FinAlgoritmo
