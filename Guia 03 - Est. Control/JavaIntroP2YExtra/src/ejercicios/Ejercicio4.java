/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de 
esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un 
mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
*/
package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    
    public void ejercicio(){
        
        String frase;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la frase: ");
        frase = sc.nextLine();
        
        if(frase.substring(0, 0).equals("A")){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
    }
    
}
