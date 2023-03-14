/*
Crear un programa que dibuje una escalera de números, donde cada línea de números 
comience en uno y termine en el número de la línea. Solicitar la altura de la 
escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123

*/
package extra;

import java.util.Scanner;

public class ExtraEjercicio13 {
    
    public void ejercicio(){
        Scanner sc = new Scanner(System.in);
        int num;
        String concatenado;
        concatenado = "";
        System.out.println("Ingrese un numero entero: ");
        num = sc.nextInt();
        for(int i = 1; i <= num; i++) {
            concatenado = concatenado.concat(Integer.toString(i));
            System.out.println(concatenado);
        } 
    }
}
