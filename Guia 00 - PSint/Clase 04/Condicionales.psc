Algoritmo Ejercicio6
	//"�Hola! Muchas gracias por cubrirme. Lo principal que debes hacer es completar 
	//la hoja de c�lculo de ingresos mensuales. Puedes hacerlo buscando los �ltimos ingresos 
	//publicitarios en los informes de marketing. Despu�s de hacer todo eso, revisa mi correo
	//electr�nico y si hay menos de 10 correos sin leer revisa mi correo de voz para ver si hay
	//alguna solicitud de los ejecutivos. Si hay tales solicitudes, h�galas primero a menos que
	//tenga una solicitud de emergencia de otro departamento. Una vez que hayas terminado
	//con la solicitud de cumplimiento, riegue la planta de mi escritorio despu�s de apagar la
	//computadora. Ah, espera, deber�a haber mencionado un par de cosas: debes iniciar
	//sesi�n con usuario de administrador para ver los informes de marketing, y tendr�s que
	//enviarme un correo electr�nico de actualizaci�n justo despu�s de que termines de
	//manejar las solicitudes. Bueno, gracias de nuevo. �Es de gran ayuda! Te debo el almuerzo
	//cuando regrese." [Continua en la siguiente p�gina]
	//Nuestra tarea ser� imprimir por pantalla la lista de tareas en el orden que corresponden
	//para que luego las podamos realizar. �Te animas a colocar las tareas en el orden correcto?
	//Para hacer esto, debes crear en PSeInt la cantidad de variables que creas correctas y
	//asignarles valor.
		//Por ejemplo:
			//? cantidadEmails = 6
	//? solicitudesEjecutivos = 3
	Definir ingreso Como caracter
	Definir correo Como entero
	definir correoDeVoz , correoDeEmergencia , correoEjecutivos Como caracter
	Escribir "ingrese como administrador"
	leer ingreso
	si ingreso == "administrador" Entonces
		Escribir "lista de tareas: "
		Escribir "Buscar informes de marketing"
		escribir "Completar la hoja de c�lculo de ingresos mensuales"
		Escribir "revisar correo electronico e indicar la cantidad recibida"
		Leer correo
		Si correo < 10 Entonces
			
			Escribir "Revise correo de voz S/N"
			Leer correoDeVoz
			si correoDeVoz == "S" Entonces
				escribir "Ingrese si hay correos de emergencias de otros departamentos indique S/N"
				Leer correoDeEmergencia
				si correoDeEmergencia == "S" Entonces
					Escribir "Responder correos de emergencias"
					
				FinSi
				Escribir "ingrese si hay correos de ejecutivos S/N"
				Leer correoEjecutivos
				si correoEjecutivos == "S" Entonces
					Escribir "Responder correos de ejecutivos"
				FinSi
				
			FinSi
			escribir "enviar correo electronico de actualizacion"
		FinSi
		Escribir "Apagar computadora"
		Escribir "Regar plantas"
	FinSi

	
FinAlgoritmo
