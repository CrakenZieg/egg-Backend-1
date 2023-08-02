//Crear un programa que solicite al usuario que ingrese el precio de un producto al inicio del
//año, y el precio del mismo producto al finalizar el año. El programa debe calcular cuál fue el
//porcentaje de aumento que tuvo ese producto en el año y mostrarlo por pantalla.

Algoritmo inflacion
	Definir precio1, precio2, infla Como Real
	Escribir "Ingresa el precio del principio de año: "
	Leer precio1
	Escribir "Ingresa el precio del final de año: "
	Leer precio2
	infla = ((precio2-precio1)/precio1)*100 
	Escribir "La inflacion fue de: ", infla, "%"
FinAlgoritmo
