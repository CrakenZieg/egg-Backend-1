/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos 
por parámetro para que nos indique si es o no un número primo, debe devolver true 
si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si 
es primo.
*/
package practica;

import java.util.Scanner;

public class Ejercicio4 {
    
    public void ejercicio(){
                
        Scanner sc = new Scanner(System.in);
        boolean primo;
        int num;
        
        do {
            
            System.out.println("Ingresa un numero (0 para salir): ");
            num = sc.nextInt();

            primo = primos(num);
        
            System.out.println(num+" es primo? "+((primo)?"Si!":"No!"));
        
        }while (num!=0);
        
    }
    
    public boolean primos(int num){
    
        boolean primo;
        primo = false;
        if (num == 1){
            primo = false;
        } else if (num == 2 || num == 3){
            primo = true;
        } else if (num%2==0) {
            primo = false;
        } else {
            for (int i = 3; i < Math.sqrt(num); i+=2) {
                if (num%i==0){
                    primo = false;
                    break;
                } else {
                    primo = true;
                }
            }
        }
        return primo;
    }
    
}
