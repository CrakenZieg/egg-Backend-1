/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre 
por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa 
deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá 
ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario 
selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar 
el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se 
vuelve a mostrar el menú.
Menu
1 sumar
2 restar
3 multiplicar
4 dividir
5 salir 
elija opcion:
*/
package practica;

import java.util.Scanner;

public class Ejercicio6 {
    
    public void ejercicio(){
    
        int num1, num2, opcion;
        double resultado;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese el primer numero: ");
            num1 = sc.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            num2 = sc.nextInt();
        } while (num1<=0 || num2<=0);
    
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opcion:");
            opcion=sc.nextInt();
            
            switch(opcion){
                case 1:
                    resultado = (double) num1+num2;
                    System.out.println("El resultado de su suma es: "+resultado);
                    break;
                case 2:
                    resultado = (double) num1-num2;
                    System.out.println("El resultado de su resta es: "+resultado);
                    break;
                case 3:
                    resultado = (double) num1*num2;
                    System.out.println("El resultado de su multiplicacion es: "+resultado);
                    break;
                case 4:
                    resultado = (double)num1 / (double)num2;
                    System.out.println("El resultado de su suma es: "+resultado);
                    break;
                case 5:
                    String respuesta;
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    respuesta = sc.next().toUpperCase();
                    if(respuesta.equals("S")){
                        System.out.println("Hasta luego!");
                    } else {
                        opcion=-1;
                }
            }
        } while (opcion!=5);
    }
}
