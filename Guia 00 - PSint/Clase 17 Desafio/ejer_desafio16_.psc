
//Calcular muro de ladrillo
///subprograma calcularMuro
//Nos debe pedir primero si el muro será de 20 o 30 cm de espesor. Luego el largo y el alto. A partir
//	de estos datos se debe mostrar al usuario la superficie del muro y la cantidad de materiales que
//	necesitaremos para construirlo.
//	Si el muro es de 30cm necesitaremos por metro cuadrado: 15.2 kg de cemento, 0.115 m3 de arena
//			y 120 ladrillos.
//		Si el muro es de 20cm necesitaremos por metro cuadrado: 10.9 kg de cemento, 0.09 m3 de arena
//				y 90 ladrillos.
///subprograma calcularViga
//Nos debe pedir el largo de la viga. Por metro lineal de viga se necesitarán: 9 kg de cemento, 0.02
//	m3 de arena, 0.02 m2 de piedra, 4 m de hierro del 8 y 3 m de hierro del 4.
//	Debemos mostrar al usuario la cantidad de materiales necesaria.


Algoritmo ejer_desafio16_
	Definir opc Como Entero
	
	Repetir
		Escribir "Ingrese la opcion que usted desee realizar"
		Escribir " 1) calcular muros de ladrillos"
		Escribir " 2) calcular vigas"
		Escribir " 3) calcular columnas"
		Escribir " 4) calcular contrapisos"
		Escribir " 5) calcular techo"
		Escribir " 6) calcular pisos"
		Escribir " 7) calcular pintura"
		Escribir " 8) calcular iluminacion"
		Escribir " 9) salir"
		Leer opc
		Segun opc Hacer
			1:
				calculaMuros
			2:
				calcularViga
			3:
				calcularColumna
			4:
				calcularContrapisos
			5:
				calcularTecho
			6:
				calcularPisos
			7:
				calcularPintura
			8:
				calcularIluminacion
			9:
			Escribir "gracias por su visita :"
			
			
		Fin Segun
	Mientras Que opc <> 9
	
	
FinAlgoritmo


Funcion superficie<-calcularSuperficie(alto, largo) 
	Definir superficie Como Real
	superficie = alto * largo
FinFuncion

Funcion volumen<-calcularVolumen(alto, largo, espesor) 
	Definir volumen Como Real
	volumen = alto * largo * espesor
FinFuncion


SubProceso  calculaMuros
	definir espesor, largo,alto Como Entero
	definir superficie, total_arena,total_cemento,total_ladrillo,ladrillos,arena,cemento Como Real
	
	Escribir "Ingrese el espesor del muro si sera de 20 cm o 30 cm"
	leer espesor
	Escribir "Ingrese el largo que va a terner el muro"
	Leer largo
	Escribir "Ingrese el alto que va a tener el muro"
	Leer alto
	
	superficie=calcularSuperficie(alto,largo)
	total_arena = 0
	total_cemento = 0
	total_ladrillo = 0
	
	si espesor = 20 o espesor = 30 Entonces
		
		si espesor = 20 Entonces
			arena = 0.09 
			cemento = 10.9
			ladrillos = 90
			total_arena = superficie * arena
			total_cemento = superficie * cemento
			total_ladrillo = superficie * ladrillos
			Escribir "Los materiales a utilizar en el muro de 20 cm son:",total_arena," m3 de arena ",total_cemento," kilos de cemento " , total_ladrillo " unidades de ladrillos "
			Escribir "_____________________________________________________________________________________________________________________"
		FinSi
		si espesor = 30 Entonces
			arena = 0.115
			cemento = 15.2
			ladrillos = 120
			total_arena = superficie * arena
			total_cemento = superficie * cemento
			total_ladrillo = superficie * ladrillos
			Escribir "Los materiales a utilizar en el muro de 30 cm son:",total_arena," m3 de arena ",total_cemento," kilos de cemento " , total_ladrillo " unidades de ladrillos "
			Escribir "_____________________________________________________________________________________________________________________"
			
		FinSi	
	SiNo
		Escribir "*** El espesor del muro  ingresado es incorrecto ***"
	FinSi
	
FinSubProceso



SubProceso calcularViga
	Definir cemento,arena,piedra ,metrosdeViga,hierro_8,hierro_4,total_arena,total_cemento,total_piedra,total_hierro8,total_hierro4  como real
	
	Escribir "Ingrese el largo de la viga que nesecita construir "
	
	Leer metrosdeViga
	
	cemento = 9	
	arena = 0.02
	piedra = 0.02
	hierro_8 = 4
	hierro_4 = 3
	
	si metrosdeViga > 0 Entonces
		total_cemento = cemento * metrosdeViga
		total_arena = arena * metrosdeViga
		total_piedra = piedra * metrosdeViga
		total_hierro8 = hierro_8 * metrosdeViga
		total_hierro4 = hierro_4 * metrosdeViga
		Escribir "Los materiales a utilizar en la construcion de la viga son : ", total_cemento," kg de cemento " total_arena, " m3 de arena " total_piedra " m2 de piedra ",total_hierro8 " metros de varilla de hierro de 8mm ", total_arena " metros de varilla de hierro de 4mm"
		Escribir "_____________________________________________________________________________________________________________________"
	FinSi	
	
FinSubProceso
//subprograma calcularColumna
//Nos debe pedir el largo de la columna. Por metro lineal de columna se necesitarán: 7.5 kg de
//	cemento, 0.016 m3 de arena, 0.016 m2 de piedra, 6 m de hierro del 10 y 3 m de hierro del 4.
//	Debemos mostrar al usuario la cantidad de materiales necesaria.
SubProceso calcularColumna
	definir metrosdeColumna,cemento,arena,piedra,hierro_10,hierro_4,total_arena,total_cemento,total_hierro10,total_hierro4,total_piedra Como Real
	cemento = 7.5
	arena = 0.016
	piedra = 0.016
	hierro_10 = 6
	hierro_4 = 3	
	Escribir "Ingrese el largo de la columna que nesecita construir "
	Leer metrosdeColumna
	
	si metrosdeColumna > 0 Entonces
		total_cemento = cemento * metrosdeColumna
		total_arena = arena * metrosdeColumna
		total_piedra = piedra * metrosdeColumna
		total_hierro10 = hierro_10 * metrosdeColumna 
		total_hierro4 = hierro_4 * metrosdeColumna
		Escribir "Los materiales a utilizar en la construcion de la columna son : ", total_cemento," kg de cemento " total_arena, " m3 de arena " total_piedra " m2 de piedra ",total_hierro10 " metros de varilla de hierro de 8mm ", total_arena " metros de varilla de hierro de 4mm"
		Escribir "_____________________________________________________________________________________________________________________"
	FinSi	
	
FinSubProceso
//Nos debe pedir espesor, ancho y largo del contrapiso a calcular.
//Por metro cúbico de contrapiso se necesita: 105 kg de cemento, 0.45 m3 de arena y 0.9 m3 de
//	piedra.
//	Debemos mostrar al usuario la cantidad de materiales necesaria.
SubProceso calcularContrapisos
	Definir metro3,cemento,alto,arena,piedra,espesor,largo,total_arena,total_cemento,total_piedra Como Real
	
	cemento = 105
	arena = 0.45
	piedra = 0.9
	Escribir "Ingrese el espesor del contrapiso"
	Leer espesor
	Escribir "Ingrese el ancho del contrapiso"
	Leer alto
	Escribir "Ingrese el largo del contrapiso"
	leer largo
	metro3=calcularVolumen(alto, largo, espesor)
	si metro3 >= 0 Entonces
		total_cemento = cemento * metro3
		total_arena = arena * metro3
		total_piedra = piedra * metro3
		Escribir "Los materiales a utilizar son: ", total_cemento ," kg de cemnto " ,total_arena, " metro3 de arena ", total_piedra, " metros2 de piedra "
	FinSi
	
FinSubProceso 

//Nos debe pedir espesor, ancho y largo del techo a calcular.
//Por metro cuadrado de techo se necesita: 33 kg de cemento, 0.072 m3 de arena, 0.072 m3 de
//	piedra, 7 m de hierro del 8 y 4 m de hierro del 6
//	Debemos mostrar al usuario la cantidad de materiales necesaria.

SubProceso calcularTecho
	definir metro3,cemento,alto ,largo,arena,piedra,hierro_8,hierro_6,espesor,total_arena,total_cemento,total_hierro8,total_hierro6,total_piedra Como Real
	
	cemento = 33
	arena = 0.072
	piedra = 0.072
	hierro_8 = 7
	hierro_6 = 4
	Escribir "Ingrese el espesor del techo"
	Leer espesor
	Escribir "Ingrese el ancho del techo"
	Leer alto
	Escribir "Ingrese el largo del techo"
	leer largo
	metro3=calcularVolumen(alto, largo, espesor)
	si metro3 >= 0 Entonces
		total_cemento = cemento * metro3
		total_arena = arena * metro3
		total_piedra = piedra * metro3
		total_hierro8 = hierro_8 * metro3
		total_hierro6 = hierro_6 * metro3
		
		Escribir "Los materiales a utilizar son: ", total_cemento ," kg de cemnto " ,total_arena, " metro3 de arena ", total_piedra, " metros2 de piedra ",total_hierro8," metros de hierro de 8 mm ",total_hierro6, " metros de hierro de 6 mm" 
		
	FinSi
	

FinSubProceso
//	subprograma calcularPisos
//	Nos debe pedir ancho y largo del paño de piso a colocar. Teniendo esos datos se debe calcular la
//	superficie y añadirle un 10% extra por recortes
//	Mostrar el resultado en m2

SubProceso calcularPisos
	Definir alto,largo, suPiso,supPiso, supPiso_total como real
	Escribir "Ingrese el ancho del paño de piso"
	Leer alto
	Escribir "Ingrese el largo del paño de piso "
	Leer largo
	
	supPiso=calcularSuperficie(alto, largo)
	
	supPiso_total = supPiso * 1.10
	Escribir "La superficie total teniendo en cuenta los recortes es de: ",supPiso_total , " metros2"
	
FinSubProceso
//subprograma calcularPintura
//Nos debe pedir la superficie del muro y mostrar cuánta pintura necesitamos teniendo en cuenta
//que rinde 6 m2 por litro de pintura.
SubProceso calcularPintura
	Definir alto,ancho, sup_total,largo, supPintura como real
	
	Escribir "Ingrese la altura del muro a pintar"
	leer alto
	Escribir "Ingrese el ancho del muro a pintar"
	leer largo
	supPintura=calcularSuperficie(alto, largo)
	sup_total=supPintura / 6
	Escribir " La cantidad de pinura a utilizar es de : " sup_total, " litros "
	
FinSubProceso
//subprograma calcularIluminacion
//Nos debe pedir la superficie de la habitación. La iluminación la calculamos de la siguiente forma:
//	superficie * 0.20. Eso nos da la cantidad mínima de superficie de iluminación natural (ventanas y
//	puertas de vidrio). Mostrar resultado

SubProceso calcularIluminacion
	Definir largo, alto, sup Como Real
	
	Escribir "Ingrese el largo de la superficie."
	Leer largo
	Escribir "Ingrese el alto de la superficie."
	Leer alto
	
	sup=calcularSuperficie(alto, largo)
	
	Escribir "la superficie es de: ", sup " m2"
	Escribir "la cantidad minima de superficie de iluminacion natural (ventanas y puertas de vidrio) es: ", sup * 0.20 " ."
	
	
FinSubProceso	
	
	

	