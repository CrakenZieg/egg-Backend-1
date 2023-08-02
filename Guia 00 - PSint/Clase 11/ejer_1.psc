//
//Realizar un programa que lea 5 números (comprendidos entre 1 y 20) e imprima el número
//ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//	5 *****
//	3 ***
//	11 ***********
//	2 **
//	9 *********


Algoritmo ejer_1
	Definir n,n1,n2,n3,n4,i Como Entero
	definir ast, ast1, ast2,ast3,ast4 Como Caracter
	Escribir "Ingrese cinco numeros"
	Leer n,n1,n2,n3,n4
	ast = ""
	ast1 = ""
	ast2 = ""
	ast3 = ""
	ast4 = ""
		
	
	Para i=1 Hasta n Con Paso 1 Hacer
	
		
		 ast = ast +"*"
		
	Fin Para
	Escribir n," ", ast
	
	Para i=1 Hasta n1 Con Paso 1 Hacer
		
		
		ast1 = ast1 +"*"
		
	Fin Para
	Escribir n1," ", ast1
	
	Para i=1 Hasta n2 Con Paso 1 Hacer
		
		
		ast2 = ast2 +"*"
		
	Fin Para
	Escribir n2," ", ast2
	
	Para i=1 Hasta n3 Con Paso 1 Hacer
		
		
		ast3 = ast3 +"*"
		
	Fin Para
	Escribir n3," ", ast3
	
	Para i=1 Hasta n4 Con Paso 1 Hacer
		
		
		ast4 = ast4 +"*"
		
	Fin Para
	Escribir n4," ", ast4
	
	


	
FinAlgoritmo
