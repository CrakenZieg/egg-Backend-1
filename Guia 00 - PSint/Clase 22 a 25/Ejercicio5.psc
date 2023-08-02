
//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario, encon-
//trando la manera de que la frase se muestre de manera continua en la matriz.
//Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:Algoritmo sin_titulo

Algoritmo  ejercicio5
	Definir i , j , aux Como Entero
	definir palabra , matriz Como Caracter
	Dimension matriz(3,3)
	
	escribir "ingresar palabra"
	
	leer palabra
	
	aux=0
	
	si Longitud(palabra)= 9 Entonces
		Para i<-0 Hasta 2 Con Paso 1 Hacer
			Para j<-0  hasta 2 Con Paso 1 Hacer
				
				matriz[i,j] = subcadena(palabra,aux,aux)
				aux=aux+1
				escribir sin saltar matriz[i,j] "  "
			Fin Para
			escribir "  "
		Fin Para
	SiNo
		escribir "palabra de tamaño incorrecto"
	FinSi
	
	
	
FinAlgoritmo
