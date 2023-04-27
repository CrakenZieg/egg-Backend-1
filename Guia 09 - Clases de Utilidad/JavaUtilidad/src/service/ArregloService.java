
package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArregloService {
    
    Random rand = new Random();
    
    public void inicializarA(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble(-50, 50);
        }      
    }
    
    public void inicializarA(ArrayList<Double> arr){
        for (int i = 0; i < 50; i++) {
            double a = rand.nextDouble(-50, 50);
            arr.add(a);
        }
    }
    
    public void mostrar(double[] arr){
        System.out.println("------------------");
        System.out.print("[ ");
        for( int i = 0; i < arr.length; i++){
            System.out.print(" "+arr[i]+(i!=arr.length-1?",":""));
        }
        System.out.println("]");
        System.out.println("------------------");
    }
    
    public void mostrar(ArrayList<Double> arr){
        System.out.println("------------------");
        System.out.print("[ ");
        for(double d: arr){
            System.out.print(" "+ d);
        }
        System.out.println("]");
        System.out.println("------------------");
    }
    
    public void ordenar(double[] arr){
        Arrays.sort(arr);
        double aux;
        for(int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[j]>arr[i]){
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        } 
    }
    
    public void ordenar(ArrayList<Double> arr){
        Collections.sort(arr,Collections.reverseOrder());
        mostrar(arr);
    }
    
    public void inicializarB(double[] arrA, double[] arrB){
        for(int i = 0; i < 10; i++) {
            arrB[i] = arrA[i];
        }
        Arrays.fill(arrB,10, arrB.length, 0.5);
    }
    
    public void inicializarB(ArrayList<Double> arrA, ArrayList<Double> arrB){
        for(int i = 0; i < 10; i++) {
            double d = arrA.get(i);
            arrB.add(d);
        }
        for(int i = 10; i < 20; i++){
            arrB.add(0.5);
        }
    }
    
}
/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo 
B de 20 números reales. Crear la clase ArregloService, en el paquete servicio, 
con los siguientes métodos:
-Método inicializarA recibe un arreglo por parámetro y lo inicializa con números 
aleatorios.
-Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
-Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
-Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, 
mostrar A y B.
*/