//Escribir un programa que calcule cuántos dígitos tiene un número entero positivo sin
//convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
//investigar la función trunc().

Algoritmo Ejercicio8
	
	definir num,i Como Entero
	escribir "Ingrese numero"
	leer num
	
	i=0
 
	si num<0 Entonces
		
		Escribir"Numero incorrecto"
	SiNo
		
		
		si num == 0 Entonces
			escribir "Tiene 1 digito"
		SiNo
			mientras num<>0 Hacer
				num=trunc(num/10)
				i=i+1
				
			FinMientras
			escribir "Tiene ",i," digitos"
		FinSi
		
	FinSi
	
	
FinAlgoritmo
