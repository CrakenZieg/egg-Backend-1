/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
validando que el primer número múltiplo del segundo e imprima si el primer número 
es múltiplo del segundo, sino informe que no lo son.
*/
package teoria;

import java.util.Scanner;

public class TeoriaEjercicio12 {
    
    public void ejercicio() {
        
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = sc.nextInt();
        
        multiplosSinRetorno(num1, num2);
    }
    
    public static void multiplosSinRetorno(int num1, int num2){
    
        boolean multiplos;
        if (num1>=num2){
            multiplos = num1%num2 == 0;
            if(multiplos){
                System.out.println(num1+" es multiplo de "+num2);
            } else {
                System.out.println(num1+" no es multiplo de "+num2);
            }
        } else {
            multiplos = num2%num1 == 0;
            if(multiplos){
                System.out.println(num2+" es multiplo de "+num1);
            } else {
                System.out.println(num2+" no es multiplo de "+num1);
            }
        }
            
    }
    
}
