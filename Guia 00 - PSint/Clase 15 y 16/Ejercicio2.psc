//Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
//máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya pi-
//diendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
//programa pedirá el número de días que se van a introducir.

//Tmax
//Tmin
//Tmedia
//nDias

Algoritmo Ejercicio2
	Definir nDias, i Como Entero
	Escribir "Ingrese la cantidad de días: "
	Leer nDias
	Para i=1 Hasta nDias Hacer
		promedioTemperatura(i)
	FinPara
	
FinAlgoritmo

SubProceso promedioTemperatura(i)
	Definir tMax, tMin, tMedia Como Real
	Escribir "Ingrese la T máxima: "
	Leer tMax
	Escribir "Ingrese la T mínima: "
	Leer tMin
	tMedia = (tMax+tMin)/2
	Escribir "La temperatura media del día ", i," fue: ", tMedia, "C°"
FinSubProceso
	