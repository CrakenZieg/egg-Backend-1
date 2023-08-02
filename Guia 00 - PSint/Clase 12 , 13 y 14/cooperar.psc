//Realiza una función llamada Cooperar que reciba dos variables de tipo carácter, una variable debe
//contener el mensaje "Cooperando" y la otra "trabajamos mejor". La función debe concatenar am-
//bos textos.

Algoritmo Cooperar
	Definir string1, string2, retorno1 Como Caracter
	string1 = "Cooperando"
	string2 = "trabajamos mejor"
	retorno1 = metodoCooperar(string1,string2)
	Escribir string1, " + ", string2, " = ", retorno1
FinAlgoritmo

Funcion retorno <- metodoCooperar(string1, string2)
	Definir retorno Como Caracter
	retorno = Concatenar(string1, string2)
FinFuncion
	