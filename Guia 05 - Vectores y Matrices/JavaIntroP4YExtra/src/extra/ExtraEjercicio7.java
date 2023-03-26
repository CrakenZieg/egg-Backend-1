/*
Realizar un programa que complete un vector con los N primeros números de la sucesión 
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes 
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por 
ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función 
que reciba como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente link: 
https://quantdare.com/numeros-de-fibonacci/
*/
package extra;

import java.util.Scanner;

public class ExtraEjercicio7 {
    
    public void ejercicio(){
    
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el termino a mostrar: ");
        n = sc.nextInt();
        int[] fibo = new int[n];
        
        for (int i = 1; i <= n; i++) {
            fibo[i-1] = fibonacci(i);
        }
        
        mostrarVector(fibo);
        
    }
    
    public int fibonacci(int n){
    
        if(n==1||n==2){
            return 1;
        } else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    
    }
    
    public void mostrarVector(int[] vector){
        System.out.println("-----------------------------");
        System.out.print("[ ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
        }
        System.out.print("]");
        System.out.println("");
        System.out.println("-----------------------------");
    }
    
}
