//Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta
//que ingrese la opción Salir:
//	A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria
//	usando la función Aleatorio(valorMin, valorMax) de PseInt.
//	B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
//	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//a elemento. Ejemplo: C = A + B
//	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//elemento. Ejemplo: C = B - A
//E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector
//	A, B, o C.
//	F. Salir.
//NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La longitud
//		para todos los vectores debe ser la misma, por lo tanto, esa información sólo se solicitará una
//vez.

Algoritmo Ejercicio4
	Definir vectorA, vectorB, vectorC Como Real
	Definir logicoA, logicoB, logicoC Como Logico
	Definir N Como Entero
	Definir opcionMenu, opcionMostrar Como Caracter
	opcionMenu=""
	logicoA=Falso
	logicoB=Falso
	logicoC=Falso
	Escribir "Ingrese el tamaño de los arreglos:"
	Leer N
	Dimension vectorA[N], vectorB[N], vectorC[N]
	Hacer
		Escribir "Ingrese A para: Llenar Vector A"
		escribir "Ingrese B para: Llenar Vector B"
		escribir "Ingrese C para: Llenar Vector C con la suma de los vectores A y B" 
		escribir "Ingrese D para: Llenar Vector C con la resta de los vectores A y B" 
		escribir "Ingrese E para mostras Vector A,B o C"
		escribir "Ingrese F para salir"
		Leer opcionMenu
		opcionMenu = Mayusculas(opcionMenu)
		Segun opcionMenu
			"A":
				llenar(vectorA, N)
				logicoA = Verdadero
				opcionMenu = ""
				Escribir "------------------------------"
				Escribir "Vector iniciado correctamente."
				Escribir "------------------------------"
			"B":
				llenar(vectorB, N)
				logicoB = Verdadero
				opcionMenu = ""
				Escribir "------------------------------"
				Escribir "Vector iniciado correctamente."
				Escribir "------------------------------"
			"C":
				Si logicoA Y logicoB Entonces
					llenarSumando(vectorA, vectorB, vectorC, N)
					logicoC=Verdadero
					opcionMenu = ""
				SiNo 
					Si logicoA Entonces
						Escribir "Debes inicializar B"
					SiNo
						Escribir "Debes inicializar A"
					FinSi
					opcionMenu = ""
				FinSi
				Escribir "------------------------------"
				Escribir "Sumado de vectores correcta."
				Escribir "------------------------------"
			"D":
				Si logicoA Y logicoB Entonces
					llenarRestando(vectorA, vectorB, vectorC, N)
					logicoC=Verdadero
					opcionMenu = ""
				SiNo 
					Si logicoA Entonces
						Escribir "Debes inicializar B"
					SiNo
						Escribir "Debes inicializar A"
					FinSi
					opcionMenu = ""
				FinSi
				Escribir "------------------------------"
				Escribir "Resta de vectores correcta."
				Escribir "------------------------------"
			"E":
				Escribir "Ingrese el vector a mostrar: "
				Leer opcionMostrar
				opcionMostrar = Mayusculas(opcionMostrar)
				Escribir "------------------------------"
				Segun opcionMostrar
					"A":
						Si logicoA Entonces
							mostrarVector(vectorA, N)
						FinSi
					"B":
						Si logicoB Entonces
							mostrarVector(vectorB, N)
						FinSi				
					"C":
						Si logicoC Entonces
							mostrarVector(vectorC, N)
						FinSi
				FinSegun
				Escribir ""
				Escribir "------------------------------"
				opcionMenu = ""
			"F":
				Escribir "------------------------------"
				opcionMenu = "Gracias por usar el sistema"
				Escribir opcionMenu
				Escribir "------------------------------"
				
		FinSegun
	Mientras Que opcionMenu = ""
		
FinAlgoritmo

SubProceso llenar(arreglo Por Referencia, N)
	Definir i Como Entero
	Para i = 0 Hasta N-1 Hacer
		arreglo[i] = Aleatorio(-100, 100)
	FinPara
FinSubProceso

SubProceso llenarSumando(arreglo1 Por Referencia, arreglo2 Por Referencia, arreglo3 Por Referencia, N)
	Definir i Como Entero
	Para i = 0 Hasta N-1 Hacer
		arreglo3[i] = arreglo1[i] +  arreglo2[i]
	FinPara
FinSubProceso

SubProceso llenarRestando(arreglo1 Por Referencia, arreglo2 Por Referencia, arreglo3 Por Referencia, N)
	Definir i Como Entero
	Para i = 0 Hasta N-1 Hacer
		arreglo3[i] = arreglo2[i] - arreglo1[i]
	FinPara
FinSubProceso

SubProceso mostrarVector(arreglo Por Referencia, N)
	Definir i Como Entero
	Escribir ""
	Escribir Sin Saltar"[ "
	Para i=0 Hasta N-1 Hacer
		Si i<>N-1 Entonces
			Escribir Sin Saltar arreglo[i],", "
		SiNo
			Escribir Sin Saltar arreglo[i]," "
		FinSi
	FinPara
	Escribir Sin Saltar"] "
FinSubProceso
	