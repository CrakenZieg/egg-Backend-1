
package service;

import entities.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class CantanteService {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<String> log = new ArrayList<>(); 
    ArrayList<CantanteFamoso> lista = new ArrayList<>();
    
    public void eliminarCantante(){
        boolean encontrado = false;
        System.out.println("Ingrese el cantante a eliminar:");
        String nombre = sc.next();
        Iterator<CantanteFamoso> it = lista.iterator();
        while(it.hasNext()){
            if(it.next().getNombre().equals(nombre)){
                log.add("Eliminado: "+nombre);
                encontrado = true;
                it.remove();
            } 
        }
        if(!encontrado) {
                System.out.println("Cantante no encontrado");
                log.add("Cantante de nombre '"+nombre+"' no entrado al intentar eliminarlo");
        }
    }
    
    public void agregarCantante(){
        System.out.println("Ingrese el nombre del cantante: ");
        String nombre = sc.next();
        System.out.println("Ingrese el disco más vendido: ");
        String disco = sc.next();
        CantanteFamoso cantante = new CantanteFamoso(nombre, disco);
        lista.add(cantante);
        log.add("Agregado: "+ cantante.toString());
    }
    
    public void mostrar(){
        for (CantanteFamoso cantanteFamoso : lista) {
            System.out.println("Cantante: "+cantanteFamoso.toString());
        }
        log.add("Lista impresa por consola");
    }
    
    public void mostraLog(){
        log.add("Log mostrado por consola");
        for (String l : log) {
            System.out.println(l);
        }
    }
    
    public void cargarCantantes(int n){
        log.add("Agregando "+n+" cantantes generados aleatoriamente");
        Random rand = new Random();
        String[] abecedario= {"A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"," ","!","?","'"};
        for(int j=0; j<n; j++){
            int largo = rand.nextInt(1,15);
            String nombre= "";
            for(int i=0; i<largo; i++){ 
                nombre = nombre.concat(abecedario[rand.nextInt(abecedario.length)]);
            }
            largo = rand.nextInt(1,15);
            String cancion= "";
            for(int i=0; i<largo; i++){ 
                cancion = cancion.concat(abecedario[rand.nextInt(abecedario.length)]);
            }
            CantanteFamoso cantante = new CantanteFamoso(nombre, cancion);
            lista.add(cantante);
            System.out.println((j+1)+": "+cantante.toString());
            log.add("Agregado: "+ cantante.toString());
        }
    }
}
/*
2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
*/