//Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios. Después,
//hacer una función que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
//función debe devolver el resultado de esta validación, para mostrar el mensaje en el algoritmo.
//Nota: recordar el uso de las variables de tipo lógico.

Algoritmo Ejercicio7
	Definir vector1, vector2, N Como Entero
	Definir resultado Como Logico
	Escribir "Ingrese el tamaño de los arreglos: "
	Leer N
	Dimension vector1[N], vector2[N]
	llenarDos(vector1, vector2, N)
	resultado = comparar(vector1, vector2, N)
	mostrarVector(vector1, N)
	mostrarVector(vector2, N)
	Escribir "La igualdad es ", resultado
FinAlgoritmo

SubProceso mostrarVector(arreglo Por Referencia, N)
	Definir i Como Entero
	Escribir ""
	Escribir Sin Saltar"[ "
	Para i=0 Hasta N-1 Hacer
		Si i<>N-1 Entonces
			Escribir Sin Saltar arreglo[i],", "
		SiNo
			Escribir Sin Saltar arreglo[i]," "
		FinSi
	FinPara
	Escribir Sin Saltar"] "
	Escribir ""
	Escribir ""
FinSubProceso

Funcion iguales<-comparar(arreglo1, arreglo2, N)
	Definir iguales Como Logico
	Definir i Como Entero
	iguales=Verdadero
	Para i=0 Hasta N-1 Hacer
		Mientras iguales
			Si arreglo1[i]<>arreglo2[i]
				iguales=Falso
				i=N-1
			FinSi
		FinMientras
	FinPara
FinFuncion

SubProceso llenarDos(arreglo1 Por Referencia, arreglo2 Por Referencia, N)
	llenar(arreglo1, N)
	llenar(arreglo2, N)
FinSubProceso

SubProceso llenar(arreglo Por Referencia, N)
	Definir i Como Entero
	Para i = 0 Hasta N-1 Hacer
		arreglo[i] = Aleatorio(-100, 100)
	FinPara
FinSubProceso



