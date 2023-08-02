//Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los
//muestre por pantalla.
Algoritmo ej1_extra
	
	Definir vec1, vec2 Como Real
	Definir i como entero
	Dimension vec1(5), vec2(5)
	para i=0 Hasta 4 Hacer
		vec1(i)=aleatorio(0, 100)
		vec2(i)=Aleatorio(0, 100)
	FinPara
	Escribir vec1(0), ", ", vec1(1),", ", vec1(2),", ", vec1(3),", ", vec1(4)
	Escribir vec2(0),", ", vec2(1),", ", vec2(2),", ", vec2(3),", ", vec2(4)
FinAlgoritmo

