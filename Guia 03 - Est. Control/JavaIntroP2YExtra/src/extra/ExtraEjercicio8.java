/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de 
números pares y la cantidad de números impares. Al igual que en el ejercicio 
anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
sentencia break.
*/
package extra;

import java.util.Scanner;

public class ExtraEjercicio8 {
 
    public void ejercicio(){
        
        Scanner sc = new Scanner(System.in);
        int num, pares, impares, total;
        pares=0;
        impares=0;
        total=0;
        do {
            System.out.println("Ingrese numeros: ");
            num = sc.nextInt();
            if(num%5==0){
                break;
            }
            if(num>=0){
                total++;
                if(num%2==0){
                    pares++;
                } else {
                    impares++;
                }
            }
        } while (num%5!=0);
        System.out.println("El total de numeros leidos es: "+ total);
        System.out.println("El total de numeros pares es: "+ pares);
        System.out.println("El total de numeros impares es: "+ impares);
    }
}
