/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado 
y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente 
manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el 
resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la 
codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
*/
package teoria;

import java.util.Scanner;

public class TeoriaEjercicio11 {
    
    public void ejercicio(){
    
        String frase, retorno;
        Scanner sc = new Scanner(System.in);
        retorno = "";
        
        System.out.println("Ingres una frase:");
        frase = sc.nextLine();
        
        retorno = reemplazar(frase);
        
        System.out.println("Retorno = " + retorno);
    }
        
    public String reemplazar(String frase){
    
        String retorno;
        retorno = "";
        for (int i = 0; i < frase.length(); i++) {
            String letra = frase.substring(i, i+1).toLowerCase();
            if (!letra.equals(".")){
                switch (letra) {
                    case "a":
                        retorno = retorno.concat("@");
                        break;
                    case "e":
                        retorno = retorno.concat("#");
                        break;
                    case "i":
                        retorno = retorno.concat("$");
                        break;
                    case "o":
                        retorno = retorno.concat("%");
                        break;
                    case "u":
                        retorno = retorno.concat("*");
                        break;
                    default:
                        retorno = retorno.concat(letra);
                }
            } else {
                retorno = retorno.concat(letra);
                break;
            }
        }
        return retorno;
    }
    
}
