/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que 
componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el 
operador de división. Nota: recordar que las variables de tipo entero truncan los 
números o resultados.
*/
package extra;

import java.util.Scanner;

public class ExtraEjercicio11 {
    
    public void ejercicio(){
        
        Scanner sc = new Scanner(System.in);
        int num, aux, digitos;
        digitos = 0;
        System.out.println("Ingresa un numero: ");
        num = sc.nextInt();
        aux = num;
        do {
            aux = aux/10;
            digitos++;
        } while (aux>0);
        System.out.println(num+" tiene "+digitos+" digitos!");
    }
    
}
