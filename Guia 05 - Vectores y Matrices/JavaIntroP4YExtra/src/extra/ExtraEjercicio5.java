/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y 
muestre la suma de sus elementos.
*/
package extra;

import java.util.*;

public class ExtraEjercicio5 {
    
    public void ejercicio(){
    
        int n, m, suma;
        int[][] matriz;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de n (filas)");
        n = sc.nextInt();
        System.out.println("-----------------------------");
        System.out.println("Ingrese el valor de m (filas)");
        m = sc.nextInt();
        System.out.println("-----------------------------");
        matriz = new int[n][m];
        System.out.println("Llenando matriz...");
        System.out.println("-----------------------------");
        llenarMatriz(matriz);
        System.out.println("Mostrando matriz...");
        mostrarMatriz(matriz);
        suma = sumarMatriz(matriz);
        System.out.println("La suma es: "+suma);
    }  
    
    public int sumarMatriz(int[][] matriz){
    
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma+=matriz[i][j];
            }
        }
        return suma;
    }
    
    public void llenarMatriz(int[][] matriz){
        Random rand = new Random();
        int digi;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                digi = rand.nextInt(3);
                switch (digi){
                        case 0 -> matriz[i][j] = rand.nextInt(9);
                        case 1 -> matriz[i][j] = rand.nextInt(99);
                        case 2 -> matriz[i][j] = rand.nextInt(999);
                }
            }
        }
    }
    
    public void mostrarMatriz(int[][] matriz){
        System.out.println("-----------------------------");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("]");
            System.out.println("");
        }
        System.out.println("-----------------------------");
    }
                        
}
