//Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio del
//a�o, y el precio del mismo producto al finalizar el a�o. El programa debe calcular cu�l fue el
//porcentaje de aumento que tuvo ese producto en el a�o y mostrarlo por pantalla.

Algoritmo inflacion
	Definir precio1, precio2, infla Como Real
	Escribir "Ingresa el precio del principio de a�o: "
	Leer precio1
	Escribir "Ingresa el precio del final de a�o: "
	Leer precio2
	infla = ((precio2-precio1)/precio1)*100 
	Escribir "La inflacion fue de: ", infla, "%"
FinAlgoritmo
