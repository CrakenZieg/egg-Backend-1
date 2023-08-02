//Realizar un programa que pida un número y determine si ese número es par o impar.
//Mostrar en pantalla un mensaje que indique si el número es par o impar. (para que un
//número sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota: investigar
//la función mod de PseInt.

Algoritmo ParOImpar
	Definir num Como Entero
	Si num%2=0 Entonces
		Escribir num, " es un numero par"
	SiNo
		Escribir num, " es un numero impar"
	FinSi
FinAlgoritmo
