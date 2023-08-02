//Define un vector que alojará números enteros y otro de cadena. Dimensiona ambos de la longitud
//que tu desees. Ahora en lapiz y papel, escribe la dimensión de tus vectores y sus subíndices.

Algoritmo vectores
	Definir cadena1 Como Caracter
	Definir entero1, i Como Entero
	Dimension cadena1[7]
	Dimension entero1[7]
	Para i=0 Hasta 6 Hacer
		cadena1[i]=subcadena("cadena1", i,i)
		entero1[i]=i
	FinPara
	cadena1[0]="0"
	Escribir Sin Saltar cadena1[0], " "
	Para i=1 Hasta 6 Hacer
		Escribir Sin Saltar cadena1[i], " "
	
	FinPara
	Escribir ""
	entero1[0]=375
	Escribir Sin Saltar entero1[0], " "
	Para i=1 Hasta 6 Hacer
		Escribir Sin Saltar entero1[i]," "
		
	FinPara

FinAlgoritmo
