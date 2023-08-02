//Una empresa de venta de productos por correo desea realizar una estadística de las ventas
//realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5 produc-
//tos en los 5 días hábiles de la semana. Se desea conocer:
//	a) Total de ventas por cada día de la semana.
//	b) Total de ventas de cada producto a lo largo de la semana.
//	c) El producto más vendido en cada semana.
//	d) El nombre, el día de la semana y la cantidad del producto más vendido.

Algoritmo Ejercicio7Extra
	Definir n, m, l, h Como Entero
	Definir matrizFinal, matrizProductosDia, vectorProductos, vectorDias, vectorDiasP Como Caracter
	n=5
	m=5
	l=8
	h=7
	Dimension matrizProductosDia[n,m], matrizFinal[l,h], vectorProductos[n], vectorDias[n], vectorDiasP[n]
	rellenarMatriz(matrizProductosDia, n, m)
	rellenarVectorProd(matrizProductosDia, vectorProductos, n, m)
	rellenarVectorDia(matrizProductosDia, vectorDias, n, m)
	rellenarVectorDiasP(matrizProductosDia, vectorDiasP, n, m)
	contruirPlantilla(matrizFinal, matrizProductosDia, vectorProductos, vectorDias, vectorDiasP, l, h)
	
	mostrarMatriz(matrizFinal, l, h)
FinAlgoritmo

SubProceso contruirPlantilla(matrizFinal Por Referencia, matrizProductosDia Por Referencia, vectorProductos Por Referencia, vectorDias Por Referencia, vectorDiasP Por Referencia, l, h)
	Definir i, j Como Entero
	Para i=0 Hasta l-1 Hacer
		Para j=0 Hasta h-1 Hacer
			Segun i Hacer
				0:
					Segun j Hacer
						0:
							matrizFinal[i,j]="              "
						1:
							matrizFinal[i,j]="    Lunes     "
						2:
							matrizFinal[i,j]="    Martes    "
						3:
							matrizFinal[i,j]="  Miercoles   "
						4:
							matrizFinal[i,j]="    Jueves    "
						5:
							matrizFinal[i,j]="    Viernes   "
						6:
							matrizFinal[i,j]="Total Producto"
					FinSegun
				6:
					Segun j Hacer
						0:
							matrizFinal[i,j]=" Total Semana	 "
						1:
							matrizFinal[i,j]="    "+vectorDias[j-1]+"      "
						2:
							matrizFinal[i,j]="    "+vectorDias[j-1]+"	  "
						3:
							matrizFinal[i,j]="    "+vectorDias[j-1]+"	  "
						4:
							matrizFinal[i,j]="    "+vectorDias[j-1]+"	  "
						5:
							matrizFinal[i,j]="    "+vectorDias[j-1]+"	  "
						6:
							matrizFinal[i,j]="--------------"
					FinSegun				 
				7:
					Segun j Hacer
						0:
							matrizFinal[i,j]="Prod principal"
						1:
							matrizFinal[i,j]="    "+vectorDiasP[j-1]+"	  "
						2:
							matrizFinal[i,j]="    "+vectorDiasP[j-1]+"	  "
						3:
							matrizFinal[i,j]="    "+vectorDiasP[j-1]+"	  "
						4:
							matrizFinal[i,j]="    "+vectorDiasP[j-1]+"	  "
						5:
							matrizFinal[i,j]="    "+vectorDiasP[j-1]+"	  "
						6:
							matrizFinal[i,j]="--------------"
					FinSegun
				De Otro Modo:
					Segun j Hacer
						0: 
							matrizFinal[i,j]="	Producto "+ConvertirATexto(i)+"  	  "
						1:
							matrizFinal[i,j]="    "+matrizProductosDia[i-1,j-1]+"       "
						2:
							matrizFinal[i,j]="    "+matrizProductosDia[i-1,j-1]+"       "
						3:
							matrizFinal[i,j]="    "+matrizProductosDia[i-1,j-1]+"       "
						4:
							matrizFinal[i,j]="    "+matrizProductosDia[i-1,j-1]+"       "
						5:
							matrizFinal[i,j]="    "+matrizProductosDia[i-1,j-1]+"       "
						6:
							matrizFinal[i,j]="    "+vectorProductos[i-1]+"       "
					FinSegun
			FinSegun
				
		FinPara
	FinPara
FinSubProceso

SubProceso rellenarMatriz(matriz Por Referencia, n, m)
	Definir i, j Como Entero
	Para i<-0 Hasta n-1 Hacer
		Para j<-0 Hasta m-1 Hacer
			matriz(i,j)=ConvertirATexto(Aleatorio(0, 200))
		FinPara
	FinPara
FinSubProceso

SubProceso rellenarVectorProd(matriz Por Referencia, vector Por Referencia, n, m)
	Definir i, j, suma Como Entero
	Para i<-0 Hasta n-1 Hacer
		suma=0
		Para j<-0 Hasta m-1 Hacer
			suma=suma+ConvertirANumero(matriz(i,j))
		FinPara
		vector[i]=ConvertirATexto(suma)
	FinPara
FinSubProceso

SubProceso rellenarVectorDia(matriz Por Referencia, vector Por Referencia, n, m)
	Definir i, j, suma Como Entero
	Para i<-0 Hasta n-1 Hacer
		suma=0
		Para j<-0 Hasta m-1 Hacer
			suma=suma+ConvertirANumero(matriz(j,i))
		FinPara
		vector[i]=ConvertirATexto(suma)
	FinPara
FinSubProceso

SubProceso rellenarVectorDiasP(matriz Por Referencia, vector Por Referencia, n, m)
	Definir i, j, cant, prod Como Entero
	Para i<-0 Hasta n-1 Hacer
		cant=0
		Para j<-0 Hasta m-1 Hacer
			Si cant<ConvertirANumero(matriz(j,i)) Entonces
				cant=ConvertirANumero(matriz(j,i))
				prod=j
			FinSi
		FinPara
		vector[i]=ConvertirATexto(prod+1)+": "+ ConvertirATexto(cant)
	FinPara
FinSubProceso

SubProceso mostrarMatriz(matriz, N, M)
	Definir i, j Como Entero
	Para i<-0 Hasta N-1 Hacer
		Para j<-0 Hasta M-1 Hacer
			
			Escribir Sin Saltar "[", matriz(i,j), "]"
			
		FinPara
		Escribir " "
	FinPara
FinSubProceso