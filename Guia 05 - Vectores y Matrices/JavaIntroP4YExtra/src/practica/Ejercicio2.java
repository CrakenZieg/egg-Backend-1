/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido
 */
package practica;

import java.util.Scanner;

public class Ejercicio2 {
    
    public void ejercicio(){
        
        Scanner sc = new Scanner(System.in);
        String cont;
        boolean continuar;
        int n, cuantos;
        int[] arreglo, resultado;
        
        continuar = true;
        
        System.out.println("Ingrese el tamaño del arreglo: ");
        n = sc.nextInt();
        
        arreglo = new int[n];
        llenar(arreglo);
        
        do {
            System.out.println("Ingrese un numero a buscar en el arreglo creado: ");
            n = sc.nextInt();
            cuantos = buscarCuantos(arreglo, n);
            if(cuantos!=0){
                resultado = new int[cuantos];
                buscarDonde(arreglo, resultado, n);
                System.out.println("El numero "+n+" se encuentra "+cuantos+" veces "
                        + "en las posiciones: ");
                for (int i = 0; i < resultado.length; i++) {
                    System.out.print(resultado[i]+" ");
                }
                System.out.println("");
                mostrar(arreglo,1);
            } else {
                System.out.println("No se encontro el numero!");
            }
            System.out.println("Desea continuar (S/N)?");
            cont = sc.next().toLowerCase();
            
            if(cont.equals("n")){
            continuar = false;
            }
        } while (continuar);
    }
    
    public void llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random()*arreglo.length*2);
        }
    }
    
    public int buscarCuantos(int[] arreglo, int n){
    
        int cantidad;
        cantidad = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i]==n){
                cantidad++;
            }
        }
        return cantidad;
    }
    
    public void buscarDonde(int[] arreglo, int[] retorno, int n){
        
        int encuentros;
        encuentros = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]==n){
                retorno[encuentros] = i;
                encuentros++;
            }
        }
    }
    
    public void mostrar(int[] arreglo, int orden) {
        //orden = 1 ascendente / -1 descendente
        System.out.println("");
        System.out.print("[ ");
        for (int i = (orden==1?0:-(arreglo.length)); i < (orden==1?arreglo.length:0); i++) {
            System.out.print(arreglo[(orden==1?i:-(i+1))]+" ");
        }
        System.out.print("]");
        System.out.println("");
    }
    
}
