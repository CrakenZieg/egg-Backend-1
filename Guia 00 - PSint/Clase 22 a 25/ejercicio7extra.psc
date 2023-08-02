//Una empresa de venta de productos por correo desea realizar una estadística de las ventas
//
//realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5 produc-
//tos en los 5 días hábiles de la semana. Se desea conocer:
//	
//	a) Total de ventas por cada día de la semana.
//	b) Total de ventas de cada producto a lo largo de la semana.
//	c) El producto más vendido en cada semana.
//	d) El nombre, el día de la semana y la cantidad del producto más vendido.

Algoritmo ejercicio7extra
	
	definir matriz,producto,dia,resultaDia,resultSem,resultMasVendido,vectorD,prodMasVend Como Entero
	
	Dimension matriz[5,5]
	Dimension resultSem[5]
	Dimension resultaDia[5]
	Dimension prodMasVend[5]
	
	Para producto<-0 hasta 4 Hacer
		Para dia<-0 hasta 4 Hacer
			
			matriz[producto,dia]<-Aleatorio(0,20)
			
		FinPara
	FinPara
	
	ventasDia(resultaDia,matriz)
	ventasSemana(resultSem,matriz)
	resultMasVendido<-MasVendidoSem(resultSem)
	vectorD<-calculoD(matriz)
	MasVend(prodMasVend,matriz)
	muestra(prodMasVend,matriz,resultaDia,resultSem,resultMasVendido,vectorD)
	
	
	
FinAlgoritmo


subProceso ventasDia(resultaDia por referencia,matriz Por Referencia)
	
	definir aux,i,j Como Entero

	
	
	para i<-0 hasta 4 Hacer
		aux<-0
		para j<-0 hasta 4 Hacer
			
			aux<-aux+matriz[j,i]
			
		FinPara
		resultaDia[i]<-aux
	FinPara
	
	
	
FinSubProceso

SubProceso  ventasSemana(resultSem Por Referencia,matriz)
	
	definir aux,i,j Como Entero
	
	
	
	para i<-0 hasta 4 Hacer
		aux<-0
		para j<-0 hasta 4 Hacer
			
			aux<-aux+matriz[i,j]
			
		FinPara
		resultSem[i]<-aux
	FinPara
	
	
	
FinSubProceso

funcion resultMasVendido<-MasVendidoSem(resultSem Por Referencia)
	
	definir resultMasVendido,aux,i,total Como Entero

	
	
	aux<-0
	resultMasVendido<-0
	
	para i<-0 hasta 4 Hacer
		
		si resultSem[i] > aux entonces
			aux<-resultSem[i]
			resultMasVendido<-i
		FinSi
		
	FinPara
	
FinFuncion
funcion vectorD<-calculoD(matriz)
	
	definir vectorD,i,j,aux Como Entero
	Dimension vectorD[3]
	
	aux<-0
	
	para i<-0 hasta 4 Hacer
		para j<-0 hasta 4 Hacer
			
			si matriz[i,j] > aux Entonces
				
				aux<-matriz[i,j]
				vectorD[0]<-i
				vectorD[1]<-j
				vectorD[2]<-aux
				
				
			FinSi
			
		FinPara
	FinPara
	
	
	
FinFuncion

SubProceso MasVend( prodMasVend Por Referencia,matriz Por Referencia)
	
	definir i,j,aux como entero
	
	para i<-0 hasta 4 Hacer
		prodMasVend[i]<-0
	FinPara
	
	aux<-0
	
	Para i<-0 hasta 4 Hacer
		Para j<-0 hasta 4 Hacer
			
			si matriz[j,i] > aux Entonces
				aux<-matriz[j,i]
				prodMasVend[i]<-j
			FinSi
			
			
		FinPara
	FinPara
	
FinSubProceso


subproceso muestra(prodMasVend Por Referencia,matriz Por Referencia,resultaDia por referencia,resultSem por referencia,resultMasVendido por referencia,vectorD por referencia)
	
	definir matrizMuestra como caracter
	definir i,j Como Entero
	
	
	
	Dimension matrizMuestra[8,7]
	
	matrizMuestra[0,0]="              "
	matrizMuestra[0,1]="Lunes         "
	matrizMuestra[0,2]="Martes        "
	matrizMuestra[0,3]="Miercoles     "
	matrizMuestra[0,4]="Jueves        "
	matrizMuestra[0,5]="Viernes       "
	matrizMuestra[0,6]="Total producto"
	
	matrizMuestra[1,0]="Producto1     "
	matrizMuestra[2,0]="Producto2     "
	matrizMuestra[3,0]="Producto3     "
	matrizMuestra[4,0]="Producto4     "
	matrizMuestra[5,0]="Producto5     "
	matrizMuestra[6,0]="Total Semana  "
	matrizMuestra[7,0]="Prod mas vend "
	
	para i<-1 hasta 5 Hacer
		
		para j<-1 hasta 5 Hacer
			
			
			
			matrizMuestra[i,j]<-"     "+ConvertirATexto(matriz[i-1,j-1])+"        "			
		FinPara
		matrizMuestra[i,6]<-"     "+ConvertirATexto(resultSem[i-1])+"        "
		matrizMuestra[6,i]<-"     "+ConvertirATexto(resultaDia[i-1])+"        "
		matrizMuestra[7,i]<-"     "+ConvertirATexto(prodMasVend[i-1])+"        "
	FinPara
	matrizMuestra[6,6]<-""
	matrizMuestra[7,6]<-""
	
	Para i<-0 hasta 7 Hacer
		para j<-0 hasta 6 Hacer
			
			escribir sin saltar matrizMuestra[i,j]," "
			 
			
		FinPara
		escribir""
	FinPara

FinSubProceso
	