//Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha anterior.
//Para ello se deber� utilizar un procedimiento llamado diaAnterior que reciba una fecha repre-
//sentada a trav�s de tres enteros dia, mes y anio, y retorne la fecha anterior. Puede asumir que
//dia, mes y anio representan una fecha v�lida. Realice pruebas de escritorio para los valores
//dia=5, mes=10, anio=2012 y para dia=1, mes=3, anio=2004.

Algoritmo Ejercicio8
	Definir dia, mes, anio, diaAnt, mesAnt, anioAnt Como Entero
	Escribir "Ingrese el dia: "
	Leer dia
	Escribir "Ingrese el mes: "
	Leer mes
	Escribir "Ingrese el anio: "
	Leer anio
	diaAnterior(dia, mes, anio, diaAnt, mesAnt, anioAnt)
	Escribir "El d�a anterior a ", dia, "/", mes, "/", anio, " es ", diaAnt, "/", mesAnt, "/", anioAnt 
FinAlgoritmo

SubProceso diaAnterior(dia, mes, anio, diaAnt Por Referencia, mesAnt Por Referencia, anioAnt Por Referencia)
Si dia = 1 Entonces
	Segun mes
		1:
				Escribir "D�a: ", 31, ", Mes: ", 12, ", A�o: ", anio-1  
				diaAnt = 31
				mesAnt = 12
				anioAnt = anio-1
		2:
				Escribir "D�a: ", 31, ", Mes: ", mes-1, ", A�o: ", anio  
				diaAnt = 31
				mesAnt = mes-1
				anioAnt = anio
		3:
				Si anio%4=0 Entonces
					Escribir "D�a: ", 29, ", Mes: ", mes-1, ", A�o: ", anio  
					diaAnt = 29
					mesAnt = mes-1
					anioAnt = anio
				SiNo
					Escribir "D�a: ", 28, ", Mes: ", mes-1, ", A�o: ", anio  
					diaAnt = 28
					mesAnt = mes-1
					anioAnt = anio
				FinSi
		4:
				Escribir "D�a: ", 31, ", Mes: ", mes-1, ", A�o: ", anio  
				diaAnt = 31
				mesAnt = mes-1
				anioAnt = anio
		5:
				Escribir "D�a: ", 30, ", Mes: ", mes-1, ", A�o: ", anio  
				diaAnt = 30
				mesAnt = mes-1
				anioAnt = anio
		6:
				Escribir "D�a: ", 31, ", Mes: ", mes-1, ", A�o: ", anio  
				diaAnt = 31
				mesAnt = mes-1
				anioAnt = anio
		7:
				Escribir "D�a: ", 30, ", Mes: ", mes-1, ", A�o: ", anio  
				diaAnt = 30
				mesAnt = mes-1
				anioAnt = anio
		8:
				Escribir "D�a: ", 31, ", Mes: ", mes-1, ", A�o: ", anio  
				diaAnt = 31
				mesAnt = mes-1
				anioAnt = anio
		9:
				Escribir "D�a: ", 31, ", Mes: ", mes-1, ", A�o: ", anio  
				diaAnt = 31
				mesAnt = mes-1
				anioAnt = anio
		10:
				Escribir "D�a: ", 30, ", Mes: ", mes-1, ", A�o: ", anio  
				diaAnt = 30
				mesAnt = mes-1
				anioAnt = anio
		11:
				Escribir "D�a: ", 31, ", Mes: ", mes-1, ", A�o: ", anio
				diaAnt = 31
				mesAnt = mes-1
				anioAnt = anio
		12:
				Escribir "D�a: ", 30, ", Mes: ", mes-1, ", A�o: ", anio 
				diaAnt = 30
				mesAnt = mes-1
				anioAnt = anio
	FinSegun
SiNo
	Escribir "D�a: ", dia-1, ", Mes: ", mes, ", A�o: ", anio
	diaAnt = dia-1
	mesAnt = mes
	anioAnt = anio
FinSi
FinSubProceso
