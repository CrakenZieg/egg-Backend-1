
package service;

import java.util.ArrayList;
import java.util.Scanner;

public class AleatorioService {
    
    ArrayList<Integer> numeros = new ArrayList<>();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public void cargar(){
        int num;
        System.out.println("Ingrese numeros:");
        do {
            num = sc.nextInt();
            if(num!=-99){
                numeros.add(num);
            }
        } while (num!=-99);
    }
    
    public void mostrar(){
        System.out.println("Se leyeron: "+numeros.size());
        int suma=0;
        double prom;
        for (Integer numero : numeros) {
            suma += numero;
        }
        prom = (double)suma/numeros.size();
        System.out.println("Su suma es: "+suma);
        System.out.println("Su promedio es: "+prom);
    }
    
}
/*
1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
*/