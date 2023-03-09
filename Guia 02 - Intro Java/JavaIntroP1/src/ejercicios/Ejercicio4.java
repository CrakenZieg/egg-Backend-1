/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    
    public void ejercicio(){
    
        Scanner sc = new Scanner(System.in);
        Double c;
        Double f;
    
        System.out.println("Ingrese la temperatura (°C): ");
        c = sc.nextDouble();
        
        f = 32 + (9 * c / 5);
        
        System.out.println("La temperatura en grados Fahrenheit(°F) es: " + f);
        
    }
    
}
