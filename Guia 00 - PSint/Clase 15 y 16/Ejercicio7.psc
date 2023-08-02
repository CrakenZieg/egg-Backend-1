//Crear un programa que dibuje una escalera de n�meros, donde cada l�nea de n�meros co-
//mience en uno y termine en el n�mero de la l�nea. Solicitar la altura de la escalera al usuario al
//comenzar. Ejemplo: si se ingresa el n�mero 3:
//1
//12
//123

Algoritmo Ejercicio7
	Definir altura Como Entero
	Escribir "Ingrese la altura de la escalera: "
	Leer altura
	construirEscalera(altura)
FinAlgoritmo

SubProceso construirEscalera(altura)
	Definir frase Como Caracter
	Definir i Como Entero
	frase = ""
	Para i=1 Hasta altura Hacer
		frase = Concatenar(frase, ConvertirATexto(i))
		Escribir frase
	FinPara
FinSubProceso
