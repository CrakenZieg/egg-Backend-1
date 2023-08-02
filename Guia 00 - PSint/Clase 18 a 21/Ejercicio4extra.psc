//Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 0 y
//20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de PseInt.
//Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos estudiantes son:
//	a) Deficientes 0-5
//	b) Regulares 6-10
//	c) Buenos 11-15
//	d) Excelentes 16-20

Algoritmo Ejercicio_4_extra
	Definir notas, n, def, reg, bue, exc, i Como Entero
	n = 100
	Dimension notas[100]
	def=0 
	reg=0 
	bue=0 
	exc=0 
	llenar(notas, n)
	Para i=0 Hasta n-1 Hacer
		Si notas[i]<=10 Entonces
			Si notas[i]<=5 Entonces
				def = def + 1
			SiNo
				reg = reg + 1 
			FinSi
		SiNo
			Si notas[i]<=15 Entonces
				bue = bue + 1
			SiNo
				exc = exc + 1 
			FinSi
		FinSi
	FinPara
	Escribir "De los 100 estudiantes ", def, " son deficientes" 
	Escribir "De los 100 estudiantes ", reg, " son regulares"
	Escribir "De los 100 estudiantes ", bue, " son buenos"
	Escribir "De los 100 estudiantes ", exc, " son excelentes"
FinAlgoritmo

SubProceso llenar(arreglo Por Referencia, N)
	Definir i Como Entero
	Para i = 0 Hasta N-1 Hacer
		arreglo[i] = Aleatorio(0, 20)
	FinPara
FinSubProceso