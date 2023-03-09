/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
por pantalla.
*/

package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    
    public void ejercicio(){
    
        String nombre;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre: ");
        nombre = sc.next();
        System.out.println("Tu nombre es: " + nombre);
        
    }
    
}
