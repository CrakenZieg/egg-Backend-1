Algoritmo sin_titulo
	
	definir n,cont, sumapar, sumaimpar, contimp, contpar Como Real
	
    cont=0
	sumapar = 0
	sumaimpar = 0
	contimp = 0 
	contpar = 0
	
	hacer 
		
		escribir "Ingrese un numero"
	    leer n
			
			si n mod 2=0 entonces sumapar= sumapar + n
			FinSi
			Si n mod 2<>0 entonces sumaimpar= sumaimpar + n
			FinSi
			
			si n mod 2=0 entonces contpar=contpar +1
			FinSi
			si n mod 2<>0 entonces contimp=contimp +1
			FinSi
			
			cont = cont + 1
			
	hasta que cont = 10
	
	Escribir "la media de los numeros pares es:" sumapar/contpar
	Escribir "la media de los numeros impares es: " sumaimpar/contimp
	
	
FinAlgoritmo
