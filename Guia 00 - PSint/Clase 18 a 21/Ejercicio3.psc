//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el usua-
//rio. A continuación, se debe buscar un elemento dentro del arreglo (el número a buscar tam-
//bién debe ser ingresado por el usuario). El programa debe indicar la posición donde se en-
//cuentra el valor. En caso de que el número se encuentre repetido dentro del arreglo se deben
//
//imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso de que el número a buscar no está adentro del arreglo se debe mostrar
//un mensaje.

Algoritmo Ejercicio3
	Definir array, i, N, buscar Como Entero
	Definir respuesta, acum Como Caracter
	respuesta = "El numero está en el lugar: "
	acum = ""
	Escribir "Ingrese el tamaño del arreglo: "
	Leer N
	Dimension array[N]
	Para i=0 Hasta N-1 Hacer
		Escribir "Ingrese el numero en la posición ", i, ":"
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
			respuesta = "El número " + ConvertirATexto(buscar) + " no fue encontrado en el arreglo."
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
