/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre 
la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y 
se obtiene cambiando sus filas por columnas (o viceversa).
*/
package practica;

import java.util.Random;

public class Ejercicio4 {
    
    public void ejercicio(){
        
        System.out.println("Creando matriz 4X4...");
        int n = 4;
        int[][] matriz = new int[n][n];
        
        llenarMatriz(matriz, n);
        mostrarMatriz(matriz, n);
        
        System.out.println("Creando traspuesta...");
        int[][] traspuesta = new int[n][n];
        
        llenarMatrizT(matriz, traspuesta, n);
        mostrarMatriz(traspuesta, n);
        
        System.out.println("Proceso finalizado correctamente.");
    }
    
    public void llenarMatrizT(int[][] matriz, int[][] traspuesta, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
    }
    
    public void llenarMatriz(int[][] matriz, int n){
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(999);
            }
        }
    }
    
    public void mostrarMatriz(int[][] matriz, int n){
        System.out.println("-----------------------------");
        for (int i = 0; i < n; i++) {
            System.out.print("[ ");
            for (int j = 0; j < n; j++) {
                System.out.print(+matriz[i][j]+" ");
            }
            System.out.print("]");
            System.out.println("");
        }
        System.out.println("-----------------------------");
    }

}
