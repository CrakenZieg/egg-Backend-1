//Realizar un programa que solicite al usuario su c�digo de usuario (un n�mero entero
//mayor que cero) y su contrase�a num�rica (otro n�mero entero positivo). El programa no le
//debe permitir continuar hasta que introduzca como c�digo 1024 y como contrase�a 4567.
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
