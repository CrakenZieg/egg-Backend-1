//Crear un procedimiento que calcule la temperatura media de un d�a a partir de la temperatura
//m�xima y m�nima. Crear un programa principal, que, utilizando un procedimiento, vaya pi-
//diendo la temperatura m�xima y m�nima de n d�as y vaya mostrando la media de cada d�a. El
//programa pedir� el n�mero de d�as que se van a introducir.

//Tmax
//Tmin
//Tmedia
//nDias

Algoritmo Ejercicio2B
	Definir nDias Como Entero
	Escribir "Ingrese la cantidad de d�as: "
	Leer nDias
		promedioTemperatura(nDias)
FinAlgoritmo

SubProceso promedioTemperatura(nDias)
	Definir i Como Entero
	Definir tMax, tMin, tMedia Como Real
	Para i=1 Hasta nDias Hacer
		Escribir "Ingrese la T m�xima: "
		Leer tMax
		Escribir "Ingrese la T m�nima: "
		Leer tMin
		tMedia = (tMax+tMin)/2
		Escribir "La temperatura media del d�a ", i," fue: ", tMedia, "C�"
	FinPara
FinSubProceso
	