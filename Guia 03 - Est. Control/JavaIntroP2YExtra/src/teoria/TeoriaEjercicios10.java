/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package teoria;

import java.util.Scanner;

public class TeoriaEjercicios10 {
     
    public void ejercicio(){
        Scanner sc = new Scanner(System.in);
        int[] numeros;
        numeros = new int[4];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el "+(i+1)+"° numero a graficar: ");
            numeros[i]=sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
