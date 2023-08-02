//Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
//calcula según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas vale
//el 50% y la parte teórica el 40%. El programa leerá el nombre del alumno, las tres notas
//obtenidas, mostrará el resultado por pantalla, y a continuación volverá a pedir los datos del
//siguiente alumno hasta que el nombre sea una cadena vacía. Las notas deben estar
//comprendidas entre 0 y 10, y si no están dentro de ese rango no se imprimirá el promedio
//y se mostrará un mensaje de error.

Algoritmo Ejercicio7
	
	Definir nombre Como Caracter
	definir nota1,nota2,nota3,i Como real
	Escribir "Ingrese su nombre"
	leer nombre
	
	mientras nombre<>"" Hacer
		
		Escribir "Ingrese notas"
		leer nota1,nota2,nota3
		
		si nota1>=0 y nota1<=10 y nota2>=0 y nota2<=10 y nota3>=0 y nota3<=10 Entonces
			
			nota1=nota1*0.1
			nota2=nota2*0.5
			nota3=nota3*0.4
			
			Escribir "Tu nota es: ",nota1+nota2+nota3
		SiNo
			
			Escribir "Una de las notas es incorrecta"
			nombre<-""
			
		FinSi
		
		Escribir "Ingrese su nombre"
		leer nombre
		
		
	FinMientras
FinAlgoritmo
