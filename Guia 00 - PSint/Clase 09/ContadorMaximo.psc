//Escribir una estructura PARA que le solicite al usuario varios n�meros y al finalizar muestre el
//mayor n�mero ingresado.

Algoritmo ContadorMaximo
	Definir i, maximo, num, total Como Entero
	Escribir "�Cuantos numeros vas a ingresar?"
	Leer total
	maximo = 0
	
	Para i<-1 Hasta total Hacer
		Escribir "Ingrese un numero: "
		Leer num
		Si num>maximo Entonces
			maximo = num
		FinSi
	//i+1
	FinPara
	Escribir "El mayor de los ", i-1 " es numeros ingresados es " maximo
	
FinAlgoritmo
