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
	
	definir matriz,producto,dia,resultDia,resultSem,resultMasVendido,vectorD,prodMasVend Como Entero
	
	Dimension matriz[5,5]
	Dimension resultSem[5]
	
	Para producto<-0 hasta 4 Hacer
		Para dia<-0 hasta 4 Hacer
			
			matriz[producto,dia]<-Aleatorio(0,20)
			
		FinPara
	FinPara
	
	resultDia<-ventasDia(matriz)
	resultSem<-ventasSemana(matriz)
	resultMasVendido<-MasVendidoSem(matriz)
	vectorD<-calculoD(matriz)
	prodMasVend<-MasVend(matriz)
	muestra(prodMasVend,matriz,resultDia,resultSem,resultMasVendido,vectorD)
	
	
	
FinAlgoritmo


funcion resultaDia<-ventasDia(matriz Por Referencia)
	
	definir resultado,aux,i,j Como Entero
	Dimension resultado[5]
	
	
	para i<-0 hasta 4 Hacer
		aux<-0
		para j<-0 hasta 4 Hacer
			
			aux<-aux+matriz[j,i]
			
		FinPara
		resultado[i]<-aux
	FinPara
	
	
	
FinFuncion
funcion resultSem<-ventasSemana(matriz Por Referencia)
	
	definir resultSem,aux,i,j Como Entero
	Dimension resultSem[5]
	
	
	para i<-0 hasta 4 Hacer
		aux<-0
		para j<-0 hasta 4 Hacer
			
			aux<-aux+matriz[i,j]
			
		FinPara
		resultSem[i]<-aux
	FinPara
	
	
	
FinFuncion
funcion resultMasVendido<-MasVendidoSem(matriz Por Referencia)
	
	definir resultMasVendido,aux,i,total Como Entero
	dimension total[5]
	total<-ventasSemana(matriz)
	
	aux<-0
	resultMasVendido<-0
	
	para i<-0 hasta 4 Hacer
		
		si total[i] > aux entonces
			aux<-total[i]
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

funcion prodMasVend<-MasVend(matriz)
	
	definir prodMasVend,i,j,aux como entero
	
	Dimension prodMasVend[5]
	
	aux<-0
	
	Para i<-0 hasta 4 Hacer
		Para j<-0 hasta 4 Hacer
			
			si matriz[j,i] > aux Entonces
				aux<-matriz[j,i]
				prodMasVend[i]<-j
			FinSi
			
			
		FinPara
	FinPara
	
FinFuncion

subproceso muestra(prodMasVend Por Referencia,matriz Por Referencia,resultDia por referencia,resultSem por referencia,resultMasVendido por referencia,vectorD por referencia)
	
	definir matrizMuestra,i,j como caracter
	Dimension matrizMuestra[8,7]
	
	matrizMuestra[0,0]=" "
	matrizMuestra[0,1]="Lunes"
	matrizMuestra[0,2]="Martes"
	matrizMuestra[0,3]="Miercoles"
	matrizMuestra[0,4]="Jueves"
	matrizMuestra[0,5]="Viernes"
	matrizMuestra[0,6]="Total producto"
	
	matrizMuestra[1,0]="Producto1"
	matrizMuestra[2,0]="Producto2"
	matrizMuestra[3,0]="Producto3"
	matrizMuestra[4,0]="Producto4"
	matrizMuestra[5,0]="Producto5"
	matrizMuestra[6,0]="Total Semana"
	matrizMuestra[7,0]="Producto mas vendido"
	
	para i<-1 hasta 5 Hacer
		
		para j<-1 hasta 5 Hacer
			matrizMuestra[i,j]<-ConvertirATexto(matriz[i-1,j-1])
		FinPara
		matrizMuestra[i,6]<-ConvertirATexto(resultSem[i-1])
		matrizMuestra[6,i]<-ConvertirATexto(resultDia[i-1])
		matrizMuestra[7,i]<-ConvertirATexto(prodMasVend[i-1])
	FinPara
	Para i<-0 hasta 6 Hacer
		para j<-0 hasta 7 Hacer
			
			escribir sin saltar matrizMuestra[i,j]," "
			escribir""
			
		FinPara
		escribir""
	FinPara

FinSubProceso
	