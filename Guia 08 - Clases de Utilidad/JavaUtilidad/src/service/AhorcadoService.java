
package service;

import entities.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Ahorcado juego;
    
    public void crearJuego(){
        juego = new Ahorcado();
        String opcion;
        System.out.println("Querés ingresar una palabra o que sea automatico? (y/n)");
        opcion = sc.next().toLowerCase();
        if(opcion.equals("y")){
            System.out.println("Ingresa la palabra: ");
            opcion = sc.next().toLowerCase();
            juego.setPalabra(opcion.toCharArray());
            System.out.println("Ingresa la cantidad maxima de intentos:");
            juego.setIntentos(sc.nextInt());
        }
    }
    
    public void longitud(){
        System.out.println("La palabra tiene "+juego.getPalabra().length+" letras!");
    }
    
    public int buscar(String letra){
        int contador = 0;
        char[] encontradas = juego.getDescubierto();
        for(int i=0; i<juego.getPalabra().length; i++){
            if(String.valueOf(juego.getPalabra()[i]).equals(letra.toLowerCase())){
                encontradas[i] = letra.toCharArray()[0];
                juego.setDescubierto(encontradas);
                contador++;
            }
        }
        if(contador==0){
            System.out.println("La letra no estaba!");
        } else {
            System.out.println("La letra estaba "+contador+" veces!");
        }
        return contador;
    }
    
    public boolean encontradas(String letra){
        int resultado = buscar(letra);
        juego.setEncontradas(juego.getEncontradas()+resultado);
        System.out.println("Número de letras (encontradas, faltantes): ("+
                juego.getEncontradas()+","+(juego.getPalabra().length-juego.getEncontradas())+")");
        String muestra="";
        for (char ch: juego.getDescubierto()) {
            muestra = muestra+ch;
        }
        System.out.println("Lo descubierto es: "+muestra);
        return resultado > 0;
    }
    
    public void intentos(){
        System.out.println("La cantidad de intentos que quedan es: "+juego.getIntentos());
    }
    
    public void juego(){
        crearJuego();
        do {
            System.out.println("-----------------------------");
            String letra;
            System.out.println("Ingrese una letra: ");
            letra = sc.next().toLowerCase();
            longitud();
            if(encontradas(letra)){
                System.out.println("Acertaste");
            } else {
                juego.setIntentos(juego.getIntentos()-1);
                System.out.println("Fallaste");
            }
            intentos();
        } while (juego.getEncontradas()!=juego.getPalabra().length&&juego.getIntentos()!=0);
        if(juego.getEncontradas()==juego.getPalabra().length){
            System.out.println("Ganaste!");
        } else {
            System.out.println("Perdiste!");
        }
        System.out.println("La palabra era: "+String.valueOf(juego.getPalabra()));
    }
}
/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener 
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas 
y la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes 
métodos en AhorcadoService:
-Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del 
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada 
letra de la palabra en un índice del vector. Y también, guarda la cantidad de 
jugadas máximas y el valor que ingresó el usuario.
-Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
Nota: buscar como se usa el vector.length.
-Método buscar(letra):  este método recibe una letra dada por el usuario y busca 
si la letra ingresada es parte de la palabra o no. También informará si la letra 
estaba o no.
-Método encontradas(letra):  que reciba una letra ingresada por el usuario y 
muestre cuantas letras han sido encontradas y cuántas le faltan. Este método 
además deberá devolver true si la letra estaba y false si la letra no estaba, ya 
que, cada vez que se busque una letra que no esté, se le restará uno a sus 
oportunidades.
-Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
-Método juego(): el método juego se encargará de llamar todos los métodos 
previamente mencionados e informará cuando el usuario descubra toda la palabra o 
se quede sin intentos. Este método se llamará en el main.
Un ejemplo de salida puede ser así:

Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades
*/