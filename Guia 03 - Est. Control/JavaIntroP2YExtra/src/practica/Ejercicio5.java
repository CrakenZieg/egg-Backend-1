/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere 
el límite inicial.
*/
package practica;

import java.util.Scanner;

public class Ejercicio5 {
    
    public void ejercicio(){
    
        int num, suma, lim;
        Scanner sc = new Scanner(System.in);
        suma=0;
        do {
            System.out.println("Ingrese el valor limite positivo: ");
            lim = sc.nextInt();
        } while (lim<=0);
        
        do {
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
            suma += num;
        } while (suma<=lim);
        
        System.out.println("La suma " + suma + " es más grande que el limite " + lim);
    }
    
}
