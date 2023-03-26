/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo 
por parámetro. Después haremos otra función o procedimiento que imprima el vector.
*/
package extra;

import java.util.Random;
import java.util.Scanner;

public class ExtraEjercicio3 {
    
    public void ejercicio(){
        
        Scanner sc = new Scanner(System.in);
        int n;
        int[] int1;
        int[] int2;
        System.out.println("Ingrese el tamano del vector:");
        n = sc.nextInt();
        int1 = new int[n];
        
        llenar(int1);
//        int2 = llenar();
//        System.out.println("Int1 llenado por parametro:");
        mostrarVector(int1);
//        System.out.println("Int2 llenado por retorno: ");
//        mostrarVector(int2);
    }
    
//    public int[] llenar(){
//        Random rand = new Random();
//        int[] arreglo = new int[15];
//        int digi;
//        for (int i = 0; i < arreglo.length; i++) {
//            digi = rand.nextInt(5);
//            switch (digi){
//                    case 0 -> arreglo[i] = rand.nextInt(9);
//                    case 1 -> arreglo[i] = rand.nextInt(99);
//                    case 2 -> arreglo[i] = rand.nextInt(999);
//                    case 3 -> arreglo[i] = rand.nextInt(9999);
//                    case 4 -> arreglo[i] = rand.nextInt(99999);
//            }
//        }
//        return arreglo;
//    }
    
    public void llenar(int[] arreglo){
        Random rand = new Random();
        int digi;
        for (int i = 0; i < arreglo.length; i++) {
            digi = rand.nextInt(5);
            switch (digi){
                    case 0 -> arreglo[i] = rand.nextInt(9);
                    case 1 -> arreglo[i] = rand.nextInt(99);
                    case 2 -> arreglo[i] = rand.nextInt(999);
                    case 3 -> arreglo[i] = rand.nextInt(9999);
                    case 4 -> arreglo[i] = rand.nextInt(99999);
            }
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
