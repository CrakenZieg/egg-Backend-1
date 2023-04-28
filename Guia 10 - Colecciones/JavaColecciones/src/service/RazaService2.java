
package service;

import entities.Razas2;
import java.util.Iterator;
import java.util.Scanner;

public class RazaService2 {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Razas2 razas = new Razas2();
    int opcion;

    public void menu(){
        do {
            System.out.println("Ingrese una opcion:");
            System.out.println("1. Ingresar una raza");
            System.out.println("2. Mostrar razas guardadas");
            System.out.println("3. Eliminar raza");
            System.out.println("4. Salir");
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
                    System.out.println("Ingrese la raza a eliminar:");
                    String raza = sc.next();
                    if(razas.tieneRaza(raza)){
                        Iterator<String> it = razas.iterador();
                        while(it.hasNext()){
                            if(it.next().equals(raza)){
                                it.remove();
                            }
                        }
                    } else {
                        System.out.println(raza+" no se encuentra en la lista!");
                    }
                    System.out.println(razas.toString());
                }
                case 4 ->{
                    System.out.println("Gracias!");
                } 
                default -> {
                    System.out.println("Opcion no valida!");
                }
            }
        }while(opcion!=4);
    }
        
}
/*
2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
*/