
package entidades.cocina;

import java.util.ArrayList;
import java.util.Scanner;

public class Cocina {
    
    Scanner sc = new Scanner(System.in);
    private ArrayList<Receta> recetas = new ArrayList<Receta>();
    private ArrayList<Receta> busqueda;

    public Cocina() {
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }
    public ArrayList<Receta> getBusqueda() {
        return busqueda;
    }
    
    public void agregarReceta(){
        int cant;
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
        } else {
            receta.setTipoCoccion("Sin coccion");
        }
        System.out.println("Cual es el tiempo de preparacion (minutos)?");
        opcion = sc.next();
        receta.setTiempoPreparacion(Integer.parseInt(opcion));
        System.out.println("Ingrese la cantidad de ingredientes:");
        cant = sc.nextInt();
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el ingrediente "+(i+1)+":");
            opcion = sc.next();
            receta.agregarIngrediente(opcion);
        }
        recetas.add(receta);
    }
    
    public Receta buscarPorNombre(){
        String nombre;
        System.out.println("Ingrese el nombre de la receta:");
        nombre = sc.next();
        Receta retorno = new Receta();
        for(Receta receta : recetas){
            if(receta.getNombre().equals(nombre)){
                retorno = receta;
            }
        }
        System.out.println(retorno.toString());
        return retorno;
    }
    
    public ArrayList<Receta> buscarIngredientes(){
        ArrayList<String> ingredientes = new ArrayList<String>();
        busqueda= new ArrayList<Receta>();
        String opcion = "";
        do {
            if (!opcion.equals("")){
                System.out.println("Quiere agregar otro ingrediente (S/N)?");
                opcion = sc.next().toLowerCase();
            }
            if(!opcion.equals("n")){
                System.out.println("Agregue un ingrediente a su busqueda:");
                opcion = sc.next().toLowerCase();
                ingredientes.add(opcion);
            }
        } while (!opcion.equals("n"));
        for(Receta receta : recetas){
            if(receta.tieneIngredientes(ingredientes)){
                busqueda.add(receta);
            }
        }
        listar(busqueda);
        return busqueda;
    }
    
    public void listar(ArrayList<Receta> recetas){
        for(Receta receta: recetas){
            System.out.println(receta.toString());
        }
    }
    
}
/*
Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea métodos 
para agregar nuevas recetas a la lista, para buscar una receta por nombre y para 
obtener la lista de recetas que se pueden preparar con los ingredientes disponibles 
en la cocina.
*/