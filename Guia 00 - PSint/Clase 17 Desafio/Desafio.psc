Algoritmo Desafio
	
	menu()
	
FinAlgoritmo

SubProceso menu()
	Definir opcional Como Entero
	opcional=0
	Mientras opcional=0 Hacer
		Escribir "Elija una opción: "
		Escribir "1. Calcular muro de ladrillo"
		Escribir "2. Calcular viga de hormigón"
		Escribir "3. Calcular columnas de hormigón"
		Escribir "4. Calcular contrapisos"
		Escribir "5. Calcular techo"
		Escribir "6. Calcular pisos"
		Escribir "7. Calcular pintura"
		Escribir "8. Calcular iluminación"
		Escribir "9. Salir"
		Leer opcional
		Segun opcional
			1://muro ladrillo
				calcularMuro()
			2://viga
				calcularViga()
			3://columna
				calcularColumna()
			4://contrapiso
				calcularContrapisos()
			5://techo
				calcularTecho()
			6://píso
				calcularPisos()
			7://pintura
				calcularPintura()
			8://ilumninacion
				calcularIluminacion()
			9://salir
				opcional = 10
		FinSegun
		Si opcional<10 Entonces
			opcional=0
		FinSi
	FinMientras
FinSubProceso

SubProceso  calcularMuro()
	Definir espesor Como Entero
	Definir alto, ancho, superficie, cemento1, arena1, ladrillos1, cemento2, arena2, ladrillos2 Como Real
	cemento1 = 10.9 
	arena1 = 0.09 
	ladrillos1 = 90 
	cemento2 = 15.2 
	arena2 = 0.115 
	ladrillos2 = 120
	alto=0
	ancho=0
	Hacer
		Escribir "¿Qué espesor tendrá?"
		Escribir "1. 20cm"
		Escribir "2. 30cm"
		Leer espesor
		Escribir "Ingrese el alto y el largo del muro:" 
		Leer alto, ancho
	Mientras Que (espesor<>1 Y espesor<>2) O alto=0 O ancho=0
	superficie = calcularSuperficie(alto, ancho)
	Escribir "-----------------------------------------------------------"
	Escribir "Para un muro de ", superficie, " metros cuadrados usted necesita: "
	Si espesor = 1 Entonces
		Escribir cemento1*superficie, "kg de cemento"
		Escribir arena1*superficie, " metros cubicos de arena"
		Escribir ladrillos1*superficie, " ladrillos"
	SiNo
		Escribir cemento2*superficie, "kg de cemento"
		Escribir arena2*superficie, " metros cubicos de arena"
		Escribir ladrillos2*superficie, " ladrillos"
	FinSi
	Escribir "-----------------------------------------------------------"
FinSubProceso

SubProceso calcularViga()
	Definir largo, cemento, arena, piedra, hierro8, hierro4 Como Real
	cemento = 9 
	arena = 0.02 
	piedra = 0.02 
	hierro8 = 4 
	hierro4 = 3
	largo=0
	Hacer
		Escribir "Ingrese el largo de la viga: "
		Leer largo
	Mientras Que largo<=0
	Escribir "-----------------------------------------------------------"
	Escribir "Para una viga de ", largo, " metros usted necesita:"
	Escribir cemento*largo, "kg de cemento"
	Escribir arena*largo, " metros cubicos de arena"
	Escribir piedra*largo, " metros cubicos de piedra"
	Escribir hierro8*largo, " metros de hierro de 8mm de diametro"
	Escribir hierro4*largo, " metros de hierro de 4mm de diametro"
	Escribir "-----------------------------------------------------------"
FinSubProceso

SubProceso calcularColumna()
	Definir largo, cemento, arena, piedra, hierro10, hierro4 Como Real
	cemento = 7.5 
	arena = 0.016 
	piedra = 0.016 
	hierro10 = 6 
	hierro4 = 3
	largo=0
	Hacer
		Escribir "Ingrese el largo de la columna: "
		Leer largo
	Mientras Que largo<=0
	Escribir "-----------------------------------------------------------"
	Escribir "Para una columna de ", largo, " metros usted necesita:"
	Escribir cemento*largo, "kg de cemento"
	Escribir arena*largo, " metros cubicos de arena"
	Escribir piedra*largo, " metros cubicos de piedra"
	Escribir hierro10*largo, " metros de hierro de 10mm de diametro"
	Escribir hierro4*largo, " metros de hierro de 4mm de diametro"
	Escribir "-----------------------------------------------------------"
FinSubProceso

SubProceso calcularContrapisos()
	Definir alto, ancho, espesor, volumen, cemento, arena, piedra Como Real
	cemento = 105
	arena = 0.45 
	piedra = 0.9
	Hacer
		Escribir "Ingrese el alto, el ancho y el espesor del contrapiso:" 
		Leer alto, ancho, espesor
	Mientras Que alto<=0 O ancho<=0 O espesor<=0.
	volumen = calcularVolumen(alto, ancho, espesor)
	Escribir "-----------------------------------------------------------"
	Escribir "Para una contrapiso de ", volumen, " metros cubicos usted necesita:"
	Escribir cemento*volumen, "kg de cemento"
	Escribir arena*volumen, " metros cubicos de arena"
	Escribir  piedra*volumen, " metros cubicos de piedra"
	Escribir "-----------------------------------------------------------"
FinSubProceso

SubProceso calcularTecho()
	Definir alto, ancho, espesor, volumen, cemento, arena, piedra, hierro8, hierro6 Como Real
	cemento = 33
	arena = 0.072 
	piedra = 0.072 
	hierro8 = 7 
	hierro6 = 4
	Hacer
		Escribir "Ingrese el alto, el ancho y el espesor del techo:" 
		Leer alto, ancho, espesor
	Mientras Que alto<=0 O ancho<=0 O espesor<=0.
	volumen = calcularVolumen(alto, ancho, espesor)
	Escribir "-----------------------------------------------------------"
	Escribir "Para una techo de ", volumen, " metros cubicos usted necesita:"
	Escribir cemento*volumen, "kg de cemento"
	Escribir arena*volumen, " metros cubicos de arena"
	Escribir piedra*volumen, " metros cubicos de piedra"
	Escribir hierro8*volumen, " metros de hierro de 8mm de diametro"
	Escribir hierro6*volumen, " metros de hierro de 6mm de diametro"
	Escribir "-----------------------------------------------------------"
FinSubProceso

SubProceso calcularPisos()
	Definir largo, ancho, superficie, multiplicador Como Real
	multiplicador = 1.1
	Hacer
		Escribir "Ingrese el largo y el ancho del piso a colocar: "
		Leer largo, ancho
	Mientras Que largo<=0 o ancho<=0
	superficie = calcularSuperficie(largo, ancho)
	Escribir "-----------------------------------------------------------"
	Escribir "Para una superficie de ", superficie, " metros cuadrados usted necesita: "
	Escribir superficie*multiplicador " metros cuadrados de pisos"
	Escribir "-----------------------------------------------------------"
FinSubProceso

SubProceso calcularPintura()
	Definir alto, ancho, superficie, multiplicador Como Real
	multiplicador = 1/6
	Hacer
		Escribir "Ingrese el alto y el ancho del muro a pintar: "
		Leer alto, ancho
	Mientras Que alto<=0 o ancho<=0
	superficie = calcularSuperficie(alto, ancho)
	Escribir "-----------------------------------------------------------"
	Escribir "Para una superficie de ", superficie, " metros cuadrados usted necesita: "
	Escribir superficie*multiplicador " litros de pintura"
	Escribir "-----------------------------------------------------------"
FinSubProceso

SubProceso calcularIluminacion()
	Definir alto, ancho, superficie, multiplicador Como Real
	multiplicador = 0.2
	Hacer
		Escribir "Ingrese el alto y el ancho del muro a pintar: "
		Leer alto, ancho
	Mientras Que alto<=0 o ancho<=0
	superficie = calcularSuperficie(alto, ancho)
	Escribir "-----------------------------------------------------------"
	Escribir "Para una superficie de ", superficie, " metros cuadrados usted necesita: "
	Escribir superficie*multiplicador " metros cuadrados de iluminación natural"
	Escribir "-----------------------------------------------------------"
FinSubProceso

Funcion superficie<-calcularSuperficie(alto, ancho) 
	Definir superficie Como Real
	superficie = alto * ancho
FinFuncion

Funcion volumen<-calcularVolumen(alto, ancho, espesor) 
	Definir volumen Como Real
	volumen = alto * ancho * espesor
FinFuncion
