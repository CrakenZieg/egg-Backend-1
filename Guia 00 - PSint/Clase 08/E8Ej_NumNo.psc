//Se debe realizar un programa que:
//	1o) Pida por teclado un número (entero positivo).
//	2o) Pregunte al usuario si desea introducir o no otro número.
//		3o) Repita los pasos 1o y 2o mientras que el usuario no responda n/N (no).
//		4o) Muestre por pantalla la suma de los números introducidos por el usuario.
//
Algoritmo E8Ej_NumNo
	definir num,sum Como Entero
	definir neg,resp Como Caracter
	
	neg="N"
	sum=0
	
	Hacer
		Escribir "Ingrese un num entero positivo"
		leer num
		Escribir "¿Desea escribir otro numero? S o N"
		leer resp
		
		sum=sum+num
		
	Mientras Que Mayusculas(resp) <> neg
	
	Escribir "la suma de sus numeros es: ",sum
	
FinAlgoritmo
