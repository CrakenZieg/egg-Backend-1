Algoritmo ejercicio6
	
	definir vector,frase,letra Como Caracter
	definir posicion Como Entero
	
	Dimension vector[20]
	
	escribir "Ingrese frase"
	leer frase
	
	ingreso(frase,vector)
	
	escribir "Ingrese una letra"
	leer letra
	Escribir"Ingrese posicion del 1 al 20"
	leer posicion
	
	insercion(letra,posicion,vector)
	
FinAlgoritmo
SubProceso ingreso(frase,vector Por Referencia)
	
	definir i Como Entero
	
	para i<-0 hasta 19 Hacer
		
		vector[i]=subcadena(frase,i,i)
		
	FinPara
	
FinSubProceso
SubProceso insercion(letra,posicion,vector)
	
	definir i Como Entero
	
	si vector[posicion-1] == " " Entonces
		vector[posicion-1] <- letra
	FinSi
	
	para i<-0 hasta 19 Hacer
		
		Escribir sin saltar vector[i]
		
	FinPara
	
	
FinSubProceso