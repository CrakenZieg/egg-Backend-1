//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el usua-
//rio. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a buscar tam-
//bi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n donde se en-
//cuentra el valor. En caso de que el n�mero se encuentre repetido dentro del arreglo se deben
//
//imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso de que el n�mero a buscar no est� adentro del arreglo se debe mostrar
//un mensaje.

Algoritmo Ejercicio3
	Definir array, i, N, buscar Como Entero
	Definir respuesta, acum Como Caracter
	respuesta = "El numero est� en el lugar: "
	acum = ""
	Escribir "Ingrese el tama�o del arreglo: "
	Leer N
	Dimension array[N]
	Para i=0 Hasta N-1 Hacer
		Escribir "Ingrese el numero en la posici�n ", i, ":"
		Leer array[i]
	FinPara
	Escribir "Ingrese el numero a buscar: "
	Leer buscar
	Escribir ""
	Para i=0 Hasta N-1 Hacer
		Si array[i]=buscar Entonces
			acum = Concatenar(acum, ConvertirATexto(i)+" ")
		FinSi
			respuesta = Concatenar(respuesta, acum)
		Si acum = "" Entonces
			respuesta = "El n�mero " + ConvertirATexto(buscar) + " no fue encontrado en el arreglo."
		FinSi
	FinPara
	Escribir Sin Saltar "[ "
	Para i=0 Hasta N-1 Hacer
		Escribir Sin Saltar array[i], " "
	FinPara
	Escribir Sin Saltar "]"
	Escribir ""
	Escribir ""
	Escribir respuesta
FinAlgoritmo
