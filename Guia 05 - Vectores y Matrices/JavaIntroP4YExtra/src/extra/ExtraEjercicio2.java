/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
elementos).
*/
package extra;

import java.util.Random;

public class ExtraEjercicio2 {
    
    public void ejercicio(){
    
        int[] int1 = new int[7]; 
        int[] int2 = new int[7]; 
        int[] int3 = new int[7];
        int[] intDifT = new int[6]; 
        int[] intDif1 = new int[7]; 
        int[] intControl = new int[7];
        
        llenar(int1);
        llenar(int2);
        llenar(int3);
        copiarVectores(int1, intDifT, 0);
        copiarVectores(int1, intDif1, 1);
        copiarVectores(int1, intControl, 0);
        
//        if(comparadorDeVectores(int1, int1, int1)){
//            System.out.println("Comparar 3 vectores iguales funciona");
//        } else {
//            System.out.println("Comparar 3 vectores iguales NO funciona");
//        }
        
        mostrarComparando(int1, int2);
        mostrarComparando(int1, int3);
        mostrarComparando(int1, intDifT);
        mostrarComparando(int1, intDif1);
        mostrarComparando(int1, intControl);
        
        
    }
    
    public boolean comparadorDeVectores(int[] ...args){
        
        boolean comparacion = true;
        int tamano = 0;
        tamano = args[0].length;
        
            for (int i = 1; i < args.length; i++) {
                if (args[i].length!=tamano){
                    comparacion = false;
                    System.out.println("Tienen diferentes tamanos");
                    break;
                }
            }
            if (comparacion){
                for (int i = 0; i < args[0].length; i++) {
                    for (int j = 1; j < args.length; j++) {
                        if(args[0][i]!=args[j][i]){
                            comparacion = false;
                            System.out.println("Sus elementos son diferentes");
                            break;
                        }
                    }
                    if(!comparacion){
                        break;
                    }
                }
            }
        return comparacion;
    }
    
    public void mostrarComparando(int[] vec1, int[] vec2){
    
        System.out.println("Vector 1:");
        mostrarVector(vec1);
        System.out.println("Vector 2:");
        mostrarVector(vec2);
        if(comparadorDeVectores(vec1,vec2)){
            System.out.println("Son iguales!");
        } else {
            System.out.println("Son diferentes!");
        }
        System.out.println("*********************************");
    
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
    
    public void copiarVectores(int[] vec1, int[] vec2, int n){
    //copia el vector1 en el vector2, n indica cuantos numeros diferentes queremos
        if(vec1.length!=vec2.length){
            if(vec1.length<vec2.length){
                for (int i = 0; i < vec2.length; i++) {
                    if(i<vec1.length){
                        vec2[i] = vec1[i];
                    } else {
                        int[] aux = new int[1];
                        llenar(aux);
                        vec2[i] = aux[0];
                    }
                }
            } else {
                for (int i = 0; i < vec2.length; i++) {
                    vec2[i] = vec1[i];
                }
            }
        } else {
            for (int i = 0; i < vec1.length; i++) {
                vec2[i] = vec1[i];
            }
            while(n!=0){
                int[] aux = new int[1];
                llenar(aux);
                vec2[(int)(Math.random()*(vec2.length-1))] = aux[0];
                n--;
            }
        }
    
    }
    
}
