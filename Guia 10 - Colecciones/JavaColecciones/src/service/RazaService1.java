
package service;

import entities.Razas1;
import java.util.Scanner;

public class RazaService1 {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Razas1 razas = new Razas1();
    int opcion;

    public void menu(){
        do {
            System.out.println("Ingrese una opcion:");
            System.out.println("1. Ingresar una raza");
            System.out.println("2. Mostrar razas guardadas");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1 ->{
                    System.out.println("Ingrese el nombre de la raza:");
                    razas.agregar(sc.next());
                }
                case 2 ->{
                    if(razas.vacio()){
                        System.out.println("Debes ingresar razas primero!");
                    } else {
                        System.out.println("Las razas en la lista son:");
                        System.out.println(razas.toString());
                    }
                }
                case 3 ->{
                    System.out.println("Gracias!");
                }
                default -> {
                    System.out.println("Opcion no valida!");
                }
            }
        }while(opcion!=3);
    }
        
}
/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
*/