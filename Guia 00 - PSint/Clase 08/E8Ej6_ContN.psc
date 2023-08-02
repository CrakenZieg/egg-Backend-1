//Se pide escribir un programa que calcule la suma de los N primeros números pares. Es
//decir, si ingresamos el número 5 como valor de N, el algoritmo nos debe realizar la suma
//	de los siguientes valores: 2+4+6+8+10.
//


Algoritmo E8Ej6_ContN
	
	definir n,cont, sumapar Como Real
	
	cont=0
	sumapar = 0
	
	escribir "Cuantos numeros pares desea sumar"
	leer n
	
	hacer 
	    cont <- cont + 1
		
		sumapar= sumapar+2*cont
       
	hasta que cont = n
	
	Escribir "la suma de los numeros pares es : " sumapar
	
FinAlgoritmo
