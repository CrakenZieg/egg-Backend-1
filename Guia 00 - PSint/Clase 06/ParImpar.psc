//Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
//En caso de que el valor ingresado sea 0, se debe mostrar "el número no es par ni impar".
//Nota: investigar la función mod de PSeInt

Algoritmo ParImpar
	Definir num Como Entero
	Escribir "Ingresa un número"
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
