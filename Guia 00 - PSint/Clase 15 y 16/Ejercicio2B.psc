//Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
//máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya pi-
//diendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
//programa pedirá el número de días que se van a introducir.

//Tmax
//Tmin
//Tmedia
//nDias

Algoritmo Ejercicio2B
	Definir nDias Como Entero
	Escribir "Ingrese la cantidad de días: "
	Leer nDias
		promedioTemperatura(nDias)
FinAlgoritmo

SubProceso promedioTemperatura(nDias)
	Definir i Como Entero
	Definir tMax, tMin, tMedia Como Real
	Para i=1 Hasta nDias Hacer
		Escribir "Ingrese la T máxima: "
		Leer tMax
		Escribir "Ingrese la T mínima: "
		Leer tMin
		tMedia = (tMax+tMin)/2
		Escribir "La temperatura media del día ", i," fue: ", tMedia, "C°"
	FinPara
FinSubProceso
	