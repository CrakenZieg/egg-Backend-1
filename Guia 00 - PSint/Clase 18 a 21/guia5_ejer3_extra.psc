//Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
//almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
//debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
//	Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.
Algoritmo guia5_ejer3_extra
	definir vect1 Como Caracter
	definir n,i,vect2 Como Entero
	Escribir "ingrese el tamaño "
	leer n
	Dimension vect1(n),vect2(n)
	para i=0 Hasta n-1 Hacer
		Escribir "Ingrese nombres de personas"
		leer vect1(i)
		vect2(i)=Longitud(vect1(i))
	FinPara
	para i=0 Hasta n-1 Hacer
		escribir "Nombres ",vect1(i), " longitud de la palabra  ",vect2(i) 
	FinPara
FinAlgoritmo
