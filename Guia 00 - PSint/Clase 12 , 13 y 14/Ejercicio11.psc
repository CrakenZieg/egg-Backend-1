//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero
//tiene todos sus d�gitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//numero en partes (si es un numero de m�s de un digito) y ver si cada n�mero es par o impar.
//Nota: recordar el uso de la funci�n Mod y Trunc(). No podemos pasar el numero a cadena para
//realizar el ejercicio.

Algoritmo Ejercicio11
	Definir num Como Entero
	Definir val Como Logico
	Escribir "Ingrese un numero: "
	Leer num
	val=SonImpares(num)
	Escribir "�Sus digitos son impares? ", val
FinAlgoritmo

Funcion val<-SonImpares(num)
	Definir val Como Logico
	val=Verdadero
	Mientras val Y num>0 Hacer
		Si num%2<>0 Entonces
			val = Verdadero
		SiNo
			val = Falso
		FinSi
		num = trunc(num/10)
	FinMientras
	
FinFuncion
	