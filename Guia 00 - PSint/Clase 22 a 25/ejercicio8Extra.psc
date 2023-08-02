Algoritmo sin_titulo
//	Una distribuidora de Nescafé tiene 4 representantes que viajan por toda la Argentina ofre-
//ciendo sus productos. Para tareas administrativas el país está dividido en cinco zonas: Norte,
//Sur, Este, Oeste y Centro. Mensualmente almacena sus datos y obtiene distintas estadísticas
//sobre el comportamiento de sus representantes en cada zona. Se desea hacer un programa
//que lea el monto de las ventas de los representantes en cada zona y calcule luego:
//		a) el total de ventas de una zona introducida por teclado
//		b) el total de ventas de un vendedor introducido por teclado en cada una de las zonas
//		c) el total de ventas de todos los representantes.
	Definir matriz0, n, m  Como Entero
	Definir Matriz1 como caracter
	n=5
	m=6
	Dimension matriz0[n,m], Matriz1[n+1,m+1] 
	rellenarMatriz(matriz0, n, m)
	mostrarMatriz(matriz0, n, m)
	MatrizTabla(Matriz1, matriz0, n+1, m+1)
	Escribir "-----------------------------"
	mostrarMatriz(matriz1, n+1, m+1)
	
FinAlgoritmo

SubProceso rellenarMatriz(matriz0 Por Referencia, n, m)
	Definir i, j, acumulador, f Como Entero
	Para i<-0 Hasta n-1 Hacer
		acumulador=0
		Para j<-0 Hasta m-1 Hacer
			si i=n-1 Entonces
				si j=m-1 Entonces
				matriz0[i,j]=0
			SiNo
				acumulador=0
				Para f<-0 hasta i-1 Hacer
					acumulador=acumulador+matriz0[f,j]
				FinPara
				matriz0[i,j]=acumulador
			FinSi
			SiNo
				si j=m-1 Entonces
					matriz0[i,j]=acumulador
				SiNo 
					Escribir "ingrese las ventas de " i+1
					//Leer matriz0[i,j]
					matriz0[i,j] =i+j
					acumulador=acumulador+matriz0[i,j]
				FinSi
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso mostrarMatriz(matriz0, N, M)
Definir i, j Como Entero
	Para i<-0 Hasta N-1 Hacer
		Para j<-0 Hasta M-1 Hacer
		Escribir Sin Saltar "[", matriz0(i,j), "]"
		FinPara
		Escribir " "
	FinPara
FinSubProceso

SubProceso MatrizTabla(Matriz1, matriz0, n, m)
	Definir i, j Como Entero
	para i<-0 hasta n-1 Hacer
		para j<-0 hasta m-1 Hacer
			segun i Hacer
				0:
					Segun j Hacer
						0:
							Matriz1[i,j]="            "
						1:
							Matriz1[i,j]=" Zona Norte "
						2:
							Matriz1[i,j]="  Zona Sur  "
						3:
							Matriz1[i,j]=" Zona Este  "
						4:
							Matriz1[i,j]=" Zona Oeste "
						5:
							Matriz1[i,j]=" Zona Centro "
						6:
							Matriz1[i,j]="Suma por Rep."
					FinSegun
				n-1:
					Segun j Hacer
						0:
							Matriz1[i,j]="Suma Por Region"
						1:
							Matriz1[i,j]=ConvertirATexto(matriz0[i-1,j-1])
						2:
							Matriz1[i,j]=ConvertirATexto(matriz0[i-1,j-1])
						3:
							Matriz1[i,j]=ConvertirATexto(matriz0[i-1,j-1])
						4:
							Matriz1[i,j]=ConvertirATexto(matriz0[i-1,j-1])
						5:
							Matriz1[i,j]=ConvertirATexto(matriz0[i-1,j-1])
						6:
							Matriz1[i,j]=ConvertirATexto(matriz0[i-1,j-1])
					FinSegun
				De Otro Modo:
					Segun j Hacer
						0:
							Matriz1[i,j]="Vendedor "+ConvertirATexto(i)
						1:
							Matriz1[i,j]=ConvertirATexto(matriz0[i-1,j-1])
						2:
							Matriz1[i,j]=ConvertirATexto(matriz0[i-1,j-1])
						3:
							Matriz1[i,j]=ConvertirATexto(matriz0[i-1,j-1])
						4:
							Matriz1[i,j]=ConvertirATexto(matriz0[i-1,j-1])
						5:
							Matriz1[i,j]=ConvertirATexto(matriz0[i-1,j-1])
						6:
							Matriz1[i,j]=ConvertirATexto(matriz0[i-1,j-1])
					FinSegun
			FinSegun
		FinPara
	FinPara
	FinSubProceso 
	