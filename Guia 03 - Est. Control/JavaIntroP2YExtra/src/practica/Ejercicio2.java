/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.
 */
package practica;

import java.util.Scanner;

public class Ejercicio2 {
    
    public void ejercicio(){
        
        String frase;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la frase: ");
        frase = sc.nextLine();
        
        if(frase.equals("eureka")){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
    }
    
}
