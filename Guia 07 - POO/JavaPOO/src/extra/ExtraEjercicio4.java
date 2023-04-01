/*
Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea métodos 
para agregar nuevas recetas a la lista, para buscar una receta por nombre y para 
obtener la lista de recetas que se pueden preparar con los ingredientes disponibles 
en la cocina.
*/

package extra;

import entidades.cocina.Cocina;
import javapoo.*;
import java.util.Scanner;

public class ExtraEjercicio4 implements EjercicioModelo{
    
    Scanner sc = new Scanner(System.in);
    @Override
    public void ejercicio(){
        menu();
    }
    
    public void menu(){
    
        int opcion;
        Cocina recetario = new Cocina();
        do {
            System.out.println("Ingrese la opcion a elegir:");
            System.out.println("1. Agregar receta");
            System.out.println("2. Listar recetas");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Buscar por ingredientes");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1 -> {recetario.agregarReceta();}
                case 2 -> {recetario.listar(recetario.getRecetas());}
                case 3 -> {recetario.buscarPorNombre();}
                case 4 -> {recetario.buscarIngredientes();}
                case 0 -> {System.out.println("Gracias por usar nuestro sistema!");}
            }
        } while (opcion!=0);
        
    }
    
}
