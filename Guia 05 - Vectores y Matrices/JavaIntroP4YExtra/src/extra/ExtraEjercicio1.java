/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de 
tamaño N, con los valores ingresados por el usuario.
*/
package extra;

import java.util.Scanner;

public class ExtraEjercicio1 {
    
    public void ejercicio(){
        
        Scanner sc = new Scanner(System.in);
        int[] vector;
        int n, suma;
        
        System.out.println("Ingrese el tamaño del arreglo: ");
        n = sc.nextInt();
        vector = new int[n];
        
        cargarVector(vector);
        suma=sumaDelVector(vector);
        
        System.out.println("El vector a sumar es: ");
        mostrarVector(vector);
        System.out.println("Su suma es: "+suma);
        
        
    }
    
    public int sumaDelVector(int[] vector){
    
        int suma = 0;
        for (int v: vector) {
            suma += v;
        }
    
        return suma;
    }
    
    public void cargarVector(int[] vector){
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < vector.length; i++){
            System.out.println("Ingrese un valor: ");
            vector[i] = sc.nextInt();
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
