//Crear una función llamada "Login", que recibe un nombre de usuario y una contraseña y que
//devuelve Verdadero si el nombre de usuario es "usuario1" y si la contraseña es "asdasd". Ade-
//más, la función calculara el número de intentos que se ha usado para loguearse, tenemos solo
//3 intentos, si nos quedamos sin intentos la función devolverá Falso.

Algoritmo Ejercicio8
	
	Definir usuario, contrasena Como Caracter
	Definir valLog Como Logico
	Escribir "Ingrese usuario:"
	Leer usuario
	Escribir "Ingrese contrasena:"
	Leer contrasena
	
	valLog = Login(usuario, contrasena)
	
	Escribir "Su login es ", valLog
	
FinAlgoritmo

Funcion val <- Login(usua, contra)
	Definir val Como Logico
	Definir usuario, contrasena Como Caracter
	Definir cont Como Entero
	
	cont=2
	val=Falso
	usuario="u"
	contrasena="c"
	
	Mientras val==Falso Y cont>0 Hacer
		cont = cont-1
		Si usua==usuario Entonces
			Si contra==contrasena Entonces
				val=Verdadero
			FinSi
		FinSi
		Si val==Falso Entonces
		Escribir "Ingrese usuario:"
		Leer usua
		Escribir "Ingrese contrasena:"
		Leer contra
		FinSi
	FinMientras
	
FinFuncion
