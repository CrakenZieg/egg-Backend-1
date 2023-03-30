
package entidades.cocina;

import java.util.ArrayList;
import java.util.Scanner;

public class Cocina {
    
    Scanner sc = new Scanner(System.in);
    ArrayList<Receta> recetas = new ArrayList<Receta>();

    public Cocina() {
    }
    
    public void agregarReceta(){
        String opcion;
        Receta receta = new Receta();
        System.out.println("Ingresa el nombre de la receta: ");
        opcion = sc.next();
        receta.setNombre(opcion);
        System.out.println("Requiere coccion? (S/N)");
        opcion = sc.next().toLowerCase();
        receta.setCoccion(opcion.equals("s")?true:false);
        if(receta.isCoccion()){
            System.out.println("Ingresa el tipo de coccion: 'S'arten, 'P'lancha, 'H'orno, Her'v'or");
            opcion = sc.next().toLowerCase();
            switch (opcion){
                case "s" -> opcion = "Sarten";
                case "p" -> opcion = "Plancha";
                case "h" -> opcion = "Horno";
                case "v" -> opcion = "Hervor";  
            }
            receta.setTipoCoccion(opcion);
        }
    }
}
/*
Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea métodos 
para agregar nuevas recetas a la lista, para buscar una receta por nombre y para 
obtener la lista de recetas que se pueden preparar con los ingredientes disponibles 
en la cocina.
*/