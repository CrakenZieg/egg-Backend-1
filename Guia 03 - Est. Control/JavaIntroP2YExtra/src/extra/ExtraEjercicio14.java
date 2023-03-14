/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad 
de hijos. Escriba un programa que pida la cantidad de familias y para cada familia 
la cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
*/
package extra;

import java.util.Scanner;

public class ExtraEjercicio14 {
 
    public void ejercicio(){
        
        Scanner sc = new Scanner(System.in);
        int n, m, edad, total;
        double promedio;
        promedio = 0;
        total = 0;
        
        System.out.println("Ingrese la cantidad de familias a encuestar: ");
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la cantidad de hijes de la familia "+(i+1)+":");
            m = sc.nextInt();
            total += m;
            for (int j = 0; j < m; j++) {
                System.out.println("Ingrese la edad del hije "+(j+1)+":");
                edad = sc.nextInt();
                promedio += edad; 
            }
        }
        
        System.out.println("El promedio de edad de los "+total+" hijes de las "+n+" familias es "+promedio/total);
        
    }
    
}
