//Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
//una clave. Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá
//mostrar un mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la
//clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema
//correctamente.
//
Algoritmo E8Ej1_Eureka
	Definir clave,usuario Como Caracter
	definir i Como Entero
	
	clave = "eureka"
	i=0
	
	Hacer
		Escribir "Ingrese una clave"
		leer usuario
		i=i+1
	Mientras Que usuario <> clave y i<3
	
	si usuario=clave Entonces
		Escribir "ingreso la clave correcta"
	SiNo
		Escribir "Usuario denegado"
	FinSi
	
FinAlgoritmo
