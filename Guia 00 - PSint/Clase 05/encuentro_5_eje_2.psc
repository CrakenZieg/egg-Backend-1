//  Realizar un programa que pida un n�mero y determine si ese n�mero es par o impar.
//	Mostrar en pantalla un mensaje que indique si el n�mero es par o impar. (para que un
//  n�mero sea par, se debe dividir entre dos y su resto debe ser igual a 0). 
///  Nota: investigar la funci�n mod de PseInt.

Algoritmo encuentro_5_eje_2
	
	Definir num1, num2 Como Entero
	Escribir "ingrese dos numeros enteros"
	Leer num1
	Leer num2
	
	Si (num1 MOD 2=0) y (num2 MOD 2=0) Entonces
		Escribir "ambos numeros son pares"
	SiNo
		Escribir "ambos numeros son impares o al menos uno de ellos no es par"
	Fin Si
	
FinAlgoritmo
