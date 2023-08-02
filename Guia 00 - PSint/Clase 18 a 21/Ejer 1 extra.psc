
//Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los
//muestre por pantalla.
Algoritmo sin_titulo
	Definir vector1, vector2 Como Entero
	Dimension vector1(5)
	dimension vector2(5)

	llenar1(vector1)
	escribir "_______"
	llenar1(vector2)

FinAlgoritmo
SubProceso llenar1(vector1 Por Referencia)
	Definir i Como Entero
	Para i = 0 Hasta 5-1 Hacer
		vector1[i] = Aleatorio(0, 100)
		escribir vector1[i]
	FinPara
FinSubProceso
SubProceso llenar2(vector2 Por Referencia)
	Definir i Como Entero
	Para i = 0 Hasta 5-1 Hacer
		vector2[i] = Aleatorio(0, 100)
		escribir vector2[i]
	FinPara
FinSubProceso