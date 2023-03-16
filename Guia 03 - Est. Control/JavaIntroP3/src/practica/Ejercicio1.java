/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para 
cada operación matemática y deben devolver sus resultados para imprimirlos en el 
main. 
 */
package practica;

import java.util.Scanner;

public class Ejercicio1 {
    
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
                    resultado = (double) suma(num1, num2);
                    System.out.println("El resultado de su suma es: "+resultado);
                    break;
                case 2:
                    resultado = (double) resta(num1, num2);
                    System.out.println("El resultado de su resta es: "+resultado);
                    break;
                case 3:
                    resultado = (double) multiplicacion(num1, num2);
                    System.out.println("El resultado de su multiplicacion es: "+resultado);
                    break;
                case 4:
                    resultado = (double)division(num1, num2);
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
    
    public int suma(int num1, int num2){
        int suma;
        suma = num1 + num2;
        return suma;
    }
    
    public int resta(int num1, int num2){
        int resta;
        resta = num1 - num2;
        return resta;
    }
    
    public int multiplicacion(int num1, int num2){
        int multiplicacion;
        multiplicacion = num1 * num2;
        return multiplicacion;
    }
    
    public double division(int num1, int num2){
        double division;
        division = (double)num1 / (double)num2;
        return division;
    }
    
}
