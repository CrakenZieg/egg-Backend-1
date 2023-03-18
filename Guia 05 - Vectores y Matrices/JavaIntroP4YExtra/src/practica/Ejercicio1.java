/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente
 */
package practica;

public class Ejercicio1 {
    
    public void ejercicio(){
        
        int[] arreglo = new int[100];
        
        llenar(arreglo);
        mostrar(arreglo, -1);
        //mostrar(arreglo, 1);
        
    }
    
    public void llenar(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i+1;
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
