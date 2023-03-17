/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
*/
package practica;

import java.util.Scanner;

public class Ejercicio2 {
    
    public void ejercicio(){
        
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("¿Cual es la cantidad de personas a ingresar?");
        n = sc.nextInt();
        ingreso(n, sc);
        
    }
    
    public void ingreso(int n, Scanner sc){
    
        String nombre, mayoria;
        int edad;
        nombre = "";
        edad = 0;
        
        for (int i = 0; i < n; i++) {
            do {
            System.out.println("Ingrese el nombre: ");
            nombre = sc.next();
            } while (nombre.equals(""));
            do {
            System.out.println("Ingrese la edad: ");
            edad = sc.nextInt();
            } while (edad==0);
            
            mayoria = (edad>=18) ? "mayor": "menor";

            System.out.println(nombre+" tiene "+edad+" años y por lo tanto es "+mayoria);
            
            nombre = "";
            edad = 0;
        }
        
        System.out.println("Saliendo del subprograma Ingreso()");
        
        
    }
    
}
