/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice 
que una matriz A es antisimétrica cuando ésta es igual a su propia antisimetrica1, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz 
antisimetrica1 de una matriz A se denota por AT y se obtiene cambiando sus filas por 
columnas (o viceversa).
*/
package practica;

import java.util.Random;

public class Ejercicio5 {
    
    public void ejercicio(){
    
       
        System.out.println("Creando matriz 4X4...");
        int n = 4;
        int[][] matriz = new int[n][n];
        
        llenarMatriz(matriz, n);
        mostrarMatriz(matriz, n);
        
        System.out.println("Creando traspuesta...");
        int[][] antisimetrica1 = new int[n][n];
        
        llenarMatrizAnti(matriz, antisimetrica1, n);
        mostrarMatriz(antisimetrica1, n);
        
        System.out.println("Evaluando si son antisimetricas: ");
        boolean anti = antisimetrica(matriz, antisimetrica1);
        if(anti){
            System.out.println("Son antisimetricas!");
        } else {
            System.out.println("No son antisimetricas!");
        }
        System.out.println("Proceso finalizado correctamente.");
    }
    
    public void llenarMatrizAnti(int[][] matriz, int[][] traspuesta, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                traspuesta[j][i] = -matriz[i][j];
            }
        }
    }
    
    public void llenarMatriz(int[][] matriz, int n){
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(999);
                matriz[j][i] = matriz[i][j];
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
    
    public boolean antisimetrica(int[][] matriz1, int[][] matriz2){
    
        boolean antisimetrica;
        antisimetrica = true;
        if(matriz1.length!=matriz2.length || matriz1[0].length!=matriz2[0].length || 
                matriz1[0].length!=matriz1.length || matriz2[0].length!=matriz2.length){
            antisimetrica = false;
        } else {
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[i].length; j++) {
                    if (matriz1[i][j]!=(-matriz2[i][j])){
                        antisimetrica = false;
                        break;
                    }
                }
                if(!antisimetrica){
                    break;
                }
            }
        }
        return antisimetrica;
    }
}
    