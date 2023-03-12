/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
*/
package extra;

import java.util.Scanner;

public class ExtraEjercicio3 {
    
    public void ejercicio(){
    
        Scanner sc = new Scanner(System.in);
        String letra;
        
        do {
            
            System.out.println("Ingresa una letra (0 para salir): ");
            letra = sc.next().toLowerCase();
            if(letra.equals("a")||letra.equals("e")||letra.equals("i")
                    ||letra.equals("o")||letra.equals("u")){
                System.out.println(letra + " es una vocal!");
            } else {
                System.out.println(letra + " no es una vocal!");
            }
            
        } while (!letra.equals("0"));
        
    }
    
}
