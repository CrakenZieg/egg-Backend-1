//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//capicúa o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
//transformar el numero a cadena para realizar el ejercicio.

Algoritmo Ejercicio13
	Definir num Como Entero
	Definir val Como Logico
	
	Escribir "Ingrese un numero: "
	Leer num
	val = ComparaCapicua(num, TamanoNumero(num))
	Si val Entonces
		Escribir num, " es capicúa"
	SiNo
		Escribir num, " no es capicúa"
	FinSi

FinAlgoritmo

Funcion val <- ComparaCapicua(num, tamano)
	Definir val, aux Como Logico
	Definir i, aux1, aux2 Como Entero
	val = Verdadero
	aux = Verdadero
	Mientras val Y aux Hacer
		Para i=0 Hasta trunc(tamano/2) Hacer
			Si tamano>1 Entonces
				aux1=trunc(num/(10^(tamano-1)))
				aux2=num%10
				aux = (aux1=aux2)
				Si aux Entonces
					val = Verdadero
				SiNo
					val = Falso
				FinSi
				num = num%(10^(tamano-1))
				num = trunc(num/10)
				tamano = TamanoNumero(num)
			FinSi
		FinPara
		aux = Falso
	FinMientras
	
FinFuncion

Funcion tamano <- TamanoNumero(num)
	Definir tamano Como Entero
	tamano = 0
	Hacer
			tamano = tamano + 1
			num=trunc(num/10)
	Mientras Que num>0
FinFuncion
