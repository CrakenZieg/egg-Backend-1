//Realizar una funci�n que valide si un n�mero es impar o no. Si es impar la funci�n debe devol-
//ver un verdadero, si no es impar debe devolver falso. Nota: la funci�n no debe tener mensajes
//que digan si es par o no, eso debe pasar en el Algoritmo.

Algoritmo Paridad
	Definir retorno Como Logico
	Definir num Como Entero
	
	Hacer
		Escribir "Ingrese un n�mero: "
		Leer num
		retorno = Imparidad(num)
		Escribir "Es ", retorno, " que ", num, " es impar."
		retorno = Verdadero
	Mientras Que retorno
	
FinAlgoritmo

Funcion impar <- Imparidad(num)
	Definir impar Como Logico
	impar = (num%2<>0)
FinFuncion
	