/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde 
la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa 
que permita introducir un cuadrado por teclado y determine si este cuadrado es 
mágico o no. El programa deberá comprobar que los números introducidos son correctos, 
es decir, están entre el 1 y el 9.
*/
package practica;

import java.util.Scanner;

public class Ejercicio6 {
    
    public void ejercicio(){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado (3 recomendado): ");
        int n = sc.nextInt();
        int[][] magicCuadrado = new int[n][n];
        int[] sumaFil, sumaCol, sumaDiag;
        
        System.out.println("Iniciando carga: ");
        llenarAMano(magicCuadrado);
        System.out.println("El resultado de la carga es: ");
        mostrarMatriz(magicCuadrado);
        
        System.out.println("Realizando la suma de las filas:");
        sumaFil = sumaDeVecEnMatriz(magicCuadrado, "f");
        mostrarVector(sumaFil);
        System.out.println("Realizando la suma de las columnas:");
        sumaCol = sumaDeVecEnMatriz(magicCuadrado, "c");
        mostrarVector(sumaCol);
        System.out.println("Realizando la suma de las diagonales:");
        sumaDiag = sumaDeDiagMatriz(magicCuadrado);
        mostrarVector(sumaDiag);
        
        mostrarMatriz(magicCuadrado);
        if(compararVectores(sumaFil, sumaCol, sumaDiag)){
            System.out.println("Es un cuadrado magico!");
        } else {
            System.out.println("No es un cuadrado magico!");
        }
        
    }
    
    public void llenarAMano(int[][] matriz){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                boolean pri=false;
                do {
                    if(pri){System.out.println("Numero incorrecto, debe estar en el intervalo [1, 9]...");}
                    System.out.println("Ingrese un numero entero del 1 al 9 para la posicion ["+i+", "+j+"] de la matriz: ");
                    matriz[i][j] = sc.nextInt();
                    pri=true;
                } while (matriz[i][j]<0||matriz[i][j]>9);
            }
        }
    }
    
    public void mostrarMatriz(int[][] matriz){
        System.out.println("-----------------------------");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("]");
            System.out.println("");
        }
        System.out.println("-----------------------------");
    }
    
    public int[] sumaDeVecEnMatriz(int[][] matriz, String dir){
        //dir = f para filas, dir = c para columnas
        int n = ((dir.toLowerCase().equals("f"))?matriz.length:matriz[0].length);
        int m = ((dir.toLowerCase().equals("f"))?matriz[0].length:matriz.length);
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = 0;
            for (int j = 0; j < m; j++) {
                vector[i]+=matriz[((dir.toLowerCase().equals("f"))?i:j)][((dir.toLowerCase().equals("f"))?j:i)];
            }
        }
        return vector;
    }
    
    public int[] sumaDeDiagMatriz(int[][] matriz){
        int[] vector = new int[2];
        vector[0] = 0;
        vector[1] = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i==j){
                    vector[0]+=matriz[i][j];
                }
                if(i==matriz.length-1-j){
                    vector[1]+=matriz[i][j];
                }
            }
        }
        return vector;
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
    
    public boolean compararVectores(int[] ...args){
    
        boolean comparacion = true;
 
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length; j++) {
                if(i!=args.length-1){
                    if(args[i][j]!=args[i+1][((j>=args[i+1].length)?((int)(Math.random()*(args[i+1].length-1))):j)]){
                        comparacion = false;
                        break;
                    }
                } else {
                    if (args[i][j]!=args[0][((j>=args[0].length)?((int)(Math.random()*(args[0].length-1))):j)]){
                        comparacion = false;
                        break;
                    }
                }
                if(j!=args[i].length-1){
                    if(args[i][j]!=args[i][j+1]){
                        comparacion = false;
                        break;
                    }
                } else {
                    if (args[i][j]!=args[i][0]){
                        comparacion = false;
                        break;
                    }
                }
            }
            if (!comparacion){
                break;
            }
        }
    
        return comparacion;
        
    }
    
}


