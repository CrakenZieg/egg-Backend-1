/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
*/
package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    
    public void ejercicio(){
    
        Scanner sc = new Scanner(System.in);
        int num;
        Double resultado;
        
        System.out.println("Ingrese un numero entero: ");
        num = sc.nextInt();
        
        System.out.println("Su doble es: ");
        resultado =  2*((double) num);
        System.out.println(resultado);
        System.out.println("Su triple es: ");
        resultado =  3*((double) num);
        System.out.println(resultado);
        System.out.println("Su raiz cuadrada es: ");
        resultado = Math.sqrt((double) num);
        System.out.println(resultado);
        
    }
    
}
