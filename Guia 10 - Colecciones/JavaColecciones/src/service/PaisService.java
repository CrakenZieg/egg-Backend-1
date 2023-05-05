
package service;

import entities.Pais;
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PaisService {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public void cargar(Set<Pais> paises){
        String opcion;
        do {
            System.out.println("Ingrese el país: ");
            Pais pais = new Pais(sc.next());
            paises.add(pais);
            System.out.println("Quiere ingresar el otro pais? (S/N)");
            opcion = sc.next().toUpperCase();
        } while (opcion.equals("S"));
        mostrar(paises);
    }
    
    public void mostrar(Set<Pais> paises){
        int cont = 1;
        System.out.println("Paises:");
        for(Pais pais: paises){
            System.out.println(cont+": "+pais);
            cont++;
        }
    }

    public void ordernar(Set<Pais> paises){
        System.out.println("Mostrando Set original");
        mostrar(paises);
        System.out.println("Creando ArrayList auxiliar con los mismos elementos");
        ArrayList<Pais> retorno = new ArrayList<Pais>(paises);
        System.out.println("Creando nuevo TreeSet (con el mismo comparador -> Pais.compararPais)");
        paises = new TreeSet<Pais>(Pais.compararPais);
        System.out.println("Cargando TreeSet con los elementos del auxiliar");
        for(Pais pais: retorno){
            paises.add(pais);
        }
        System.out.println("Mostrando resultado");
        mostrar(paises);
    }
    
    public void eliminar(Set<Pais> paises, String pais){
        if(paises.contains(new Pais(pais))){
            paises.remove(new Pais(pais));
            System.out.println(pais+" eliminado!");
        } else {
            System.out.println("El pais no se encontró!");
        }
//        Iterator<Pais> it = paises.iterator();
//        boolean estaba = false;
//        while(it.hasNext()){
//            if(it.next().getNombre().equals(pais)){
//                it.remove();
//                estaba = true;
//            }
//        }
//        if(estaba){
//            System.out.println(pais+" eliminado!");
//        } else {
//            System.out.println("El pais no se encontró!");
//        }
    }
    
    public void cargarPaises(Set<Pais> paises, int n){
        Random rand = new Random();
        String[] abecedario= {"A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"," ","' ","'"};
        for(int j=0; j<n; j++){
            int largo = rand.nextInt(1,15);
            String nombre= "";
            for(int i=0; i<largo; i++){ 
                nombre = nombre.concat(abecedario[rand.nextInt(abecedario.length)]);
            }
            Pais pais = new Pais(nombre);
            paises.add(pais);
            System.out.println((j+1)+": "+pais.toString());
        }
        mostrar(paises);
    }
    
}
/*
5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
*/