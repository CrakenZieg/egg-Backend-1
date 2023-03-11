/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero".  El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si 
el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package ejercicios;

import java.util.Scanner;

public class TeoriaEjercicios9 {
    
    public void ejercicio(){
    
        Scanner sc = new Scanner(System.in);
        int suma, num, contador;
        suma = 0;
        contador = 20;
        do {
            System.out.println("Ingrese un numero (quedan "+ contador +"): " );
            num = sc.nextInt();
            if(num>0){
                suma = suma + num;
            }
            if(num==0){
                System.out.println("Se capturó el numero cero");
                contador = 0;
                break;
            }
            contador--;
        } while (contador>0);
        System.out.println("La suma de los numeros leidos fue: " + suma);
    }
}
