/*
Crear un programa que dado un número determine si es par o impar.
 */
package practica;

import java.util.Scanner;

public class Ejercicio1 {
    
    public void ejercicio(){
        
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese el numero a evaluar: ");
        num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" es par!");
        } else {
            System.out.println(num+" es impar!");
        }
        
    }
    
}
