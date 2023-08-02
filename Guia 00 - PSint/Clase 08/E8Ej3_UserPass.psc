//Realizar un programa que solicite al usuario su código de usuario (un número entero
//mayor que cero) y su contraseña numérica (otro número entero positivo). El programa no le
//debe permitir continuar hasta que introduzca como código 1024 y como contraseña 4567.
//El programa finaliza cuando ingresa los datos correctos.
//


Algoritmo E8Ej3_UserPass
	definir user,pass,usuario,clave Como Entero
	
	user=1024
	pass=4567
	
	Hacer
		Escribir "ingrese usuario"
		leer usuario
		Escribir "ingrese clave"
		leer clave
	Mientras Que usuario<>user o clave<>pass
	
	Escribir "Acceso concedido"
	
FinAlgoritmo
