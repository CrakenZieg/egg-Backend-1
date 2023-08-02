//Leer tres números que denoten una fecha (día, mes, año) y comprobar que sea una fecha
//válida. Si la fecha no es válida escribir un mensaje de error por pantalla. Si la fecha es
//válida se debe imprimir la fecha cambiando el número que representa el mes por su
//nombre. Por ejemplo: si se introduce 1 2 2006, se deberá imprimir "1 de febrero de 2006".

Algoritmo Fecha
	Definir dia, mes, anio como Entero
	Escribir "Ingresa el día: "
	Leer dia
	Escribir "Ingresa el mes: "
	Leer mes
	Escribir "Ingresa el año: "
	Leer anio
	Si mes<1 O mes>12 Entonces
		Escribir "El mes no es válido"
	SiNo
//		Si dia<1 O dia>31 Entonces
//			Escribir "Día inválido"
//		SiNo
		Segun mes Hacer
			1:
				Si dia>=1 Y dia<=31 Entonces
					Escribir dia, " de Enero de ", anio
				SiNo
					Escribir "Día inválido"
				FinSi
			2:
				Si dia>=1 Y dia<=28 Entonces
					Escribir dia, " de Febrero de ", anio
				SiNo
					Escribir "Día inválido"
				FinSi
			3:
				Si dia>=1 Y dia<=31 Entonces
					Escribir dia, " de Marzo de ", anio
				SiNo
					Escribir "Día inválido"
				FinSi
			4:
				Si dia>=1 Y dia<=30 Entonces
					Escribir dia, " de Abril de ", anio
				SiNo
					Escribir "Día inválido"
				FinSi
			5:
				Si dia>=1 Y dia<=31 Entonces
					Escribir dia, " de Mayo de ", anio
				SiNo
					Escribir "Día inválido"
				FinSi
			6:
				Si dia>=1 Y dia<=30 Entonces
					Escribir dia, " de Junio de ", anio
				SiNo
					Escribir "Día inválido"
				FinSi
			7:
				Si dia>=1 Y dia<=31 Entonces
					Escribir dia, " de Julio de ", anio
				SiNo
					Escribir "Día inválido"
				FinSi
			8:
				Si dia>=1 Y dia<=31 Entonces
					Escribir dia, " de Agosto de ", anio
				SiNo
					Escribir "Día inválido"
				FinSi
			9:
				Si dia>=1 Y dia<=30 Entonces
					Escribir dia, " de Septiembre de ", anio
				SiNo
					Escribir "Día inválido"
				FinSi
			10:
				Si dia>=1 Y dia<=31 Entonces
					Escribir dia, " de Octubre de ", anio
				SiNo
					Escribir "Día inválido"
				FinSi
			11:
				Si dia>=1 Y dia<=30 Entonces
					Escribir dia, " de Noviembre de ", anio
				SiNo
					Escribir "Día inválido"
				FinSi
			12:
				Si dia>=1 Y dia<=31 Entonces
					Escribir dia, " de Diciembre de ", anio
				SiNo
					Escribir "Día inválido"
				FinSi
			
		FinSegun
	FinSi
//	FinSi
FinAlgoritmo
