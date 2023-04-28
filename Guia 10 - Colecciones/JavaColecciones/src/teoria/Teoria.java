
package teoria;

import entities.Libro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javacolecciones.EjercicioModelo;

public class Teoria implements EjercicioModelo{

    public void ejercicio() {
        
        System.out.println("Creando la List");
        List<String> lista = new ArrayList<>();
        System.out.println("Creando el Set");
        Set<String> conjunto = new HashSet<>();
        System.out.println("Creando el Map");
        Map<Integer,String> mapa = new HashMap<>();
        
        System.out.println("Llenando las 3 colecciones");
        for(int i=0; i<5;i++){
            lista.add("Mau");
            conjunto.add("Mau"+i);
            mapa.put(i, "Mau");
        }
        
//EL ITERADOR NO SE LLEVA BIEN CON EL MULTI-THREAD
//Y, pedazo de navo, declaralo después de llenar la lista o el set, no es dinamico
        System.out.println("Creando iteradores para List y Set");
        Iterator<String> iteradorLista = lista.iterator();
        Iterator<String> iteradorConjunto = conjunto.iterator();
        System.out.println("Imprimiendo");
        System.out.println("List:");
        while(iteradorLista.hasNext()){
            String palabra = iteradorLista.next();
            System.out.println(palabra);
        }
//        for(String palabra: lista){
//            System.out.println(palabra);
//        }
        System.out.println("Set:");
        while(iteradorConjunto.hasNext()){
            String palabra = iteradorConjunto.next();
            System.out.println(palabra);
        }
//        for(String palabra: conjunto){
//            System.out.println(palabra);
//        }
        System.out.println("Map:");
        for(Map.Entry<Integer,String> entry : mapa.entrySet()){
            System.out.println("Llave: "+entry.getKey()+", valor: "+entry.getValue());
        }
        
        System.out.println("Creando lista de Libros");
        ArrayList<Libro> listaLibros = new ArrayList<>();
        System.out.println("Llenando lista de Libros");
        for(int i = 0; i < 10; i++) {
            listaLibros.add(new Libro());
        }
        System.out.println("Mostrando lista de Libros:");
        for(Libro libro: listaLibros){
            System.out.println(libro);
        }
        
    }
    
}
/*
Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.

¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.
*/