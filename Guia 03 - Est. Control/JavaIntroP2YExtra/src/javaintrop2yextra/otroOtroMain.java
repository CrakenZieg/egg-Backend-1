/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se 
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si 
el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
*/

package javaintrop2yextra;

import java.util.Scanner;

public class otroOtroMain {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num, suma, contador;
        suma = 0;
        contador = 0;
        
        do{
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
            if(num>0){
                suma += num;
            }
            if(num==0){
                System.out.println("Se capturó el numero cero");
                break;
            }
            
            //System.out.println("suma: "+suma);
            contador++;
            //System.out.println("contador: "+contador);
            if(num!=0 && contador==20){
            System.out.println("La suma de los numeros es: "+suma);
            }
        } while (contador<20);
               
    }

}
