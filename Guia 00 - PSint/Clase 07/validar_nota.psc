//Escriba un programa que valide si una nota est� entre 0 y 10, sino est� entre 0 y 10 la nota
//se pedir� de nuevo hasta que la nota sea correcta.

Algoritmo validar_nota
	
	definir nota Como real
	Escribir "Ingrese nota"
	Leer nota
	
	Mientras nota<0 o nota>10 Hacer
		
		Escribir"Nota incorrecta, escriba su nota"
		leer nota
		
	FinMientras
	
	Escribir "Su nota es ",nota
	
FinAlgoritmo
