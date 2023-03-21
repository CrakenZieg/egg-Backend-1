/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/
package practica;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    
    public void ejercicio(){
        
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño del arreglo: ");
        n = sc.nextInt();
        int[] arreglo = new int[n];
        int[] digitos = new int[5];
        llenar(arreglo);
        mostrar(arreglo,1);
        digitosArreglo(arreglo, digitos);
        mostrar(digitos,1);
        System.out.println("(La primera posicion muestra los numeros de 1 digito, la segunda los de 2, etc..)");

    }
    
    public void digitosArreglo(int[] arreglo, int[] digitos){
        for (int i = 0; i < arreglo.length; i++) {
            digitos[digitos(arreglo[i])-1]+=1;
        }
    }
    
    public int digitos(int n){
        int contador;
        contador = 0;
        do {
            n=n/10;
            contador++;
        } while (n>0);
        return contador;
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
