Algoritmo act_3
	
	Definir usuario, contrasenia,res Como Caracter
	Definir login Como Logico
	Definir i,op,n,botellas,gr,saldo,saldototal Como Entero
	
	
	usuario="a"
	contrasenia="a"
	res="a"
	gr =0
	saldo=0
	saldototal =0
	i=0
	login = Falso
	
	Mientras i<3  Hacer
		Escribir "ingrese nombre de usuario"
		Leer usuario
		Escribir "ingrese contraseña"
		Leer contrasenia
		
		Si usuario = "Albus_D" y contrasenia = "carameloDeLimon" Entonces
			login= Verdadero
			i=i+4
			
			Repetir
				Escribir "elegir una opcion"
				Escribir " "
				Escribir "1)ingresar botellas"
				Escribir "2)consultar saldo"
				Escribir "3)salir"
				Escribir "------------------------------"
				Leer op
				Segun op Hacer
					1:
						Escribir "cuantas botellas desea ingresar?"
						Leer botellas
						Para n=1 Hasta botellas Con Paso 1 Hacer
							gr= azar(200)
							
							Si gr < 50 Entonces
								gr = gr+gr	
								saldo =50
							Fin Si
							
							Si gr >50 y  gr <150 Entonces
								gr = gr+gr
								saldo =125
							Fin Si
							
							Si gr >151 Entonces
								gr = gr+gr
								saldo=200
								
							Fin Si
							saldototal = saldototal + saldo 
						Fin Para
						Escribir "las ",botellas," botellas pesan ",gr," gr"
						Escribir saldo,"$"
						Escribir "acepta el pago?"
						Leer res
						Si res ="si" Entonces
							Escribir "saldo acreditado exitosamente"
							Escribir "---------------------------"
						SiNo
							Escribir "Devolviendo material."
							Escribir "---------------------------"
							saldo=0
						Fin Si
					2:
						Escribir "saldo actual: ",saldototal
					3:
						Escribir "salir"
						login= Falso
					De Otro Modo:
						Escribir "opcion no valida"
				Fin Segun
				
			Mientras Que login = Verdadero
			
			
		
		Fin Si
		i=i+1
		
		
	Fin Mientras
	
	
	Escribir "usted salio del sistema!!"
	
	
	

	
	
	
FinAlgoritmo
