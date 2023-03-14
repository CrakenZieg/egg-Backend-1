/*
Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
*/
package extra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExtraEjercicio7 {
    
    public void ejercicio(){
    
        Scanner sc = new Scanner(System.in);
        int n, num, aux1, aux2, max, min;
        List<Integer> lista = new ArrayList<>();
        boolean pri;
        double promedio;
        pri=true;
        min=0;
        max=0;
        promedio=0;
        n = 0;
        do {
            System.out.println("Ingrese la cantidad de numeros a procesar: "); 
            n = sc.nextInt();
            aux1 = n;
            aux2 = n;
        } while (n<=0);
    
        do {
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
            lista.add(num);
            if(pri){
                min=num;
                max=num;
                pri=false;
            }
            if (num<min){
                min=num;
            }
            if (num>max){
                max=num;
            }
            promedio+=num;
            aux1--;
            System.out.println("(Quedan "+ aux1 + " por ingresar)");
        } while (aux1>=1);
        System.out.println("---------------------------------");
        System.out.println("Resultados en Do While");
        System.out.println("El promedio es "+promedio/n);
        System.out.println("El maximo introducido es "+ max);
        System.out.println("El minimo introducido es "+ min);
        System.out.println("---------------------------------");
        pri=true;
        min=0;
        max=0;
        promedio=0;
        while (aux2>0) {
            num = lista.get(aux2-1);
            if(pri){
                min=num;
                max=num;
                pri=false;
            }
            if (num<min){
                min=num;
            }
            if (num>max){
                max=num;
            }
            promedio+=num;
            aux2--;
            System.out.println("(Quedan "+ aux2 + " por procesar)");
        }
        System.out.println("---------------------------------");
        System.out.println("Resultados en While");
        System.out.println("El promedio es "+promedio/n);
        System.out.println("El maximo introducido es "+ max);
        System.out.println("El minimo introducido es "+ min);
    };
    
}
