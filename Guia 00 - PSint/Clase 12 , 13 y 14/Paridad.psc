//Realizar una función que valide si un número es impar o no. Si es impar la función debe devol-
//ver un verdadero, si no es impar debe devolver falso. Nota: la función no debe tener mensajes
//que digan si es par o no, eso debe pasar en el Algoritmo.

Algoritmo Paridad
	Definir retorno Como Logico
	Definir num Como Entero
	
	Hacer
		Escribir "Ingrese un número: "
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
	