Algoritmo CentenaDecenaUnidad
	Definir numero1, centena, decena, unidad Como Entero
	Escribir "Escribe un numero de 3 cifras: "
	Leer numero1
	centena = TRUNC(numero1/100)
	Escribir "Centena: ", centena
	//numero1 = numero1 - centena*100
	numero1 = numero1 % 100
	decena = TRUNC(numero1/10)
	Escribir "Decena: ", decena
	unidad = numero1 % 10
	//unidad = numero1 - decena*10
	Escribir "Unidad: ", unidad
FinAlgoritmo

//352 --> 3.52 --> trunc(3.52) = 3
//52/10 = 5.2