/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/
package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    
    public void ejercicio(){
    
        String frase;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa una frase: ");
        frase = sc.next();
        System.out.println("Tu frase en mayuscula es: " + frase.toUpperCase());
        System.out.println("Tu frase en miniscula es: " + frase.toLowerCase());
    
    }
    
}
