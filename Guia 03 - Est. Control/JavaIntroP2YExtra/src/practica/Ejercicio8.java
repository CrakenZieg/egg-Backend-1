/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
*/
package practica;

import java.util.Scanner;

public class Ejercicio8 {
    
    public void ejercicio(){
    
        Scanner sc = new Scanner(System.in);
        int n;
      
        System.out.println("Ingrese el tamaño del cuadrado: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        
    }
    
}
