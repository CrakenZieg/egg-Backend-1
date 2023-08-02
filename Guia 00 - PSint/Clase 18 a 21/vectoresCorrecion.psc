Algoritmo vectores
	Definir vector, i Como Entero
	Dimension vector[17]
	
	rellenar(vector, 17)
	escribir1(vector, 17)
	
FinAlgoritmo

SubProceso rellenar(vector Por Referencia, tamano)
	Definir i Como Entero
	Para i<-0 Hasta tamano-1 Con Paso 1 Hacer
		vector[i] = i
	Fin Para
FinSubProceso

SubProceso escribir1(vector Por Referencia, tamano)
	Definir i Como Entero
	Escribir Sin Saltar "["
	Para i<-0 Hasta tamano-1 Con Paso 1 Hacer
		Si i<tamano-1 Entonces
			Escribir Sin Saltar vector[i], ", "
		SiNo
			Escribir Sin Saltar vector[i]
		FinSi
	Fin Para
	Escribir Sin Saltar "]"
FinSubProceso

	