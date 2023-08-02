//?Escribir un programa que lea n�meros enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el m�ximo n�mero ingresado, el m�nimo, y el promedio de
//todos ellos.

//Para poder lograr, por ejemplo, el m�ximo inicializaremos una variable en cero llamada
//	numeroMaximo. Luego iremos comparando cada n�mero que se ingresa con esta variable.
//	Si es mayor reemplazaremos el valor de numeroMaximo. Por ejemplo, si 5 > 0 entonces el
//		m�ximo entre estos n�meros ser� 5. Si luego ingreso el n�mero 2, se eval�a 2 > 5 lo que
//			resultar� falso y por lo tanto el valor 5 de numeroMaximo no se reemplaza. Una l�gica
//			similar tendr� el m�nimo.

Algoritmo E8Ej2_Enteros
	Definir nummax,nummin,num,i,acum Como Entero
	definir prom Como Real
	
	i=0
	acum=0
	nummax=0
	nummin=0
	
	
	hacer
		Escribir "Ingrese un numero"
		leer num
		
		si nummax=0 Entonces
			nummax=num
			nummin=num
		FinSi
		
		si num <>0 Entonces
			i=i+1
			acum=acum+num
			si num>nummax Entonces
				nummax=num
			FinSi
			si num<nummin Entonces
				nummin=num
			FinSi
		FinSi
		
	Mientras Que num<>0
	
	Escribir "el promedio: ",acum/i
	Escribir "El num maximo es: ", nummax
	Escribir "El num minimo es: ", nummin
	
FinAlgoritmo
