//  Escriba un programa que pida 3 notas y valide si esas notas están entre 1 y 10. Si están
//	entre esos parámetros se debe poner en verdadero una variable de tipo lógico y si no
//	ponerla en falso. Al final el programa debe decir si las 3 notas son correctas usando la
//	variable de tipo lógico.

Algoritmo TresNotas
	
	Definir nota1, nota2, nota3 Como entero
	Definir respuesta Como Logico
	Escribir "ingrese 3 notas"
	Leer nota1
	Leer nota2
	Leer nota3

	
    Si (nota1 > 1 y nota1 < 10) y (nota2 > 1 y nota2 < 10) y (nota3 > 1 y nota3 < 10) Entonces
		respuesta = Verdadero
		Escribir respuesta
	SiNo
		respuesta = Falso
		Escribir respuesta
	Fin Si
	
FinAlgoritmo
