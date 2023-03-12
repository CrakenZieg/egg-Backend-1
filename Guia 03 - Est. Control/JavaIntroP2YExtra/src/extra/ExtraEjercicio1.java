/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
*/
package extra;

import java.util.Scanner;

public class ExtraEjercicio1 {
    
    public void ejercicio(){
        
        Scanner sc = new Scanner(System.in);
        int min, dia, hora;
        
        System.out.println("Ingrese el tiempo en minutos: ");
        min = sc.nextInt();
        
        hora = min/60;
        dia = hora/24;
        
        System.out.println(min + " minutos equvale a " + hora + " horas y " + dia + " días ");
        
    }
    
}
