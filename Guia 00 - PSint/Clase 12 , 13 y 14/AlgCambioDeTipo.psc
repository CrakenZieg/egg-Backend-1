//Dise�ar una funci�n que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podr� recibir n�meros de hasta 3 d�gitos. Nota: no poner n�meros con de-
//cimales ni letras. Ejemplo: ingresando "100"(car�cter) debe convertirse en 100(entero).

Algoritmo AlgCambioDeTipo
	
	Definir numC Como Caracter
	Definir numE Como Entero
	
	Escribir "Ingrese un numero: "
	Leer numC
	numE = cambioDeTipo(numC)
	Escribir numE, " ahora es de tipo entero"
FinAlgoritmo

Funcion num <- cambioDeTipo(num1)
	Definir num Como Entero
	Si Longitud(num1)<=3 Entonces
		num = ConvertirANumero(num1)
	SiNo
		num = -1
	FinSi
FinFuncion
	