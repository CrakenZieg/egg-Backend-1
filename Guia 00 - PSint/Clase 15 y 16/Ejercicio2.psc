//Crear un procedimiento que calcule la temperatura media de un d�a a partir de la temperatura
//m�xima y m�nima. Crear un programa principal, que, utilizando un procedimiento, vaya pi-
//diendo la temperatura m�xima y m�nima de n d�as y vaya mostrando la media de cada d�a. El
//programa pedir� el n�mero de d�as que se van a introducir.

//Tmax
//Tmin
//Tmedia
//nDias

Algoritmo Ejercicio2
	Definir nDias, i Como Entero
	Escribir "Ingrese la cantidad de d�as: "
	Leer nDias
	Para i=1 Hasta nDias Hacer
		promedioTemperatura(i)
	FinPara
	
FinAlgoritmo

SubProceso promedioTemperatura(i)
	Definir tMax, tMin, tMedia Como Real
	Escribir "Ingrese la T m�xima: "
	Leer tMax
	Escribir "Ingrese la T m�nima: "
	Leer tMin
	tMedia = (tMax+tMin)/2
	Escribir "La temperatura media del d�a ", i," fue: ", tMedia, "C�"
FinSubProceso
	