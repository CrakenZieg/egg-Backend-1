//La función factorial se aplica a números enteros positivos. El factorial de un número entero
//positivo (!n) es igual al producto de los enteros positivos desde 1 hasta n
//Escriba un programa que calcule las factoriales de todos los números enteros desde el 1
//hasta el 5.

Algoritmo factorial
	Definir resultado, n, i, j Como Entero
	Definir respuesta Como Caracter
	Escribir "Ingrese un numero entero: "
	Leer n
	Para i=1 Hasta n Hacer
		resultado = 1
		respuesta=""
		Para j=1 Hasta i Hacer
			resultado=j*resultado
			Si j<>1 Entonces
				respuesta=Concatenar(respuesta, "*")
				respuesta=Concatenar(respuesta, ConvertirATexto(j))
			SiNo
				respuesta=Concatenar(respuesta, ConvertirATexto(j))
			FinSi
		FinPara
		Escribir i, "!=", respuesta, "=", resultado
	FinPara
FinAlgoritmo
