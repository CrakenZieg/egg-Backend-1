/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma
*/

package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    
    public void ejercicio(){
        
        int num1;
        int num2;
        int num3;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese num1: ");
        num1 = scanner.nextInt();
        
        System.out.println("Ingrese num2: ");
        num2 = scanner.nextInt();
        
        num3 = num1 + num2;
        
        System.out.println("num3 = " + num3);
        
    }
    
}
