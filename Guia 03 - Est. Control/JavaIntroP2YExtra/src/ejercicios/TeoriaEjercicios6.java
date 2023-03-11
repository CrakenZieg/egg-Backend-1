/*
Implementar un programa que le pida dos números enteros al usuario y determine 
si ambos o alguno de ellos es mayor a 25.
*/

package ejercicios;

import java.util.Scanner;

public class TeoriaEjercicios6 {
    
    public void ejercicio(){
    
        Scanner sc = new Scanner(System.in);
        String respuesta;
        int num1;
        int num2;
        
        System.out.println("Ingrese el primer numero:");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();
        
        if (num1 > 25 && num2 > 25){
            respuesta = "Ambos numeros son mayores que 25.";
        } else if (num1 > 25) {
            respuesta = "El primer numero es mayor que 25.";
        } else if (num2 > 25) {
            respuesta = "El segundo numero es mayor que 25.";
        } else {
            respuesta = "Ninguno es mayor que 25";
        }
        System.out.println(respuesta);
    }
    
}
