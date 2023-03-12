/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
*/

package teoria;

import java.util.Scanner;

public class TeoriaEjercicios8 {
    
    public void ejercicio(){
        
        Scanner sc = new Scanner(System.in);
        int nota = -1;
        
        while(nota<0 || nota>10){
        
            System.out.println("Ingrese la nota: ");
            nota = sc.nextInt();
        
        }
        
    }
    
}
