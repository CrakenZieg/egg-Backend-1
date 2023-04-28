
package service;

import entities.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PeliculaService {
   
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public void ingresarPeliculas(ArrayList<Pelicula> peliculas){
        String opcion = "";
        do{
            crearPelicula(peliculas);
            System.out.println("Quiere ingresar otro pelicula? (S/N)");
            opcion = sc.next().toUpperCase();
        }while(opcion.equals("S"));
    }
    
    public void crearPelicula(ArrayList<Pelicula> peliculas){
        Pelicula aux = new Pelicula();
        System.out.println("Ingrese el titulo de la pelicula:");
        aux.setTitulo(sc.next());
        System.out.println("Ingrese el director de la pelicula:");
        aux.setDirector(sc.next());
        System.out.println("Ingrese la duracion de la pelicula en horas:");
        aux.setDuracion(sc.nextDouble());
        System.out.println(aux.toString());
        peliculas.add(aux);
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> peliculas){
        System.out.println("Las peliculas en lista son: ");
        for (Pelicula pelicula: peliculas) {
            System.out.println(pelicula.toString());
        }
    }
    
    public void mostrarPeliculasLargas(ArrayList<Pelicula> peliculas){
        System.out.println("Las peliculas de más de una hora en lista son: ");
        Iterator<Pelicula> it = peliculas.iterator();
        while(it.hasNext()){
            if(it.next().getDuracion()>=1){
                System.out.println(it.next().toString());
            }
        }
    }
    
    public void ordenarPorDuracionMayor(List<Pelicula> peliculas){
    }
    
    public void ordenarPorDuracionMenor(ArrayList<Pelicula> peliculas){
    }
    
    public void ordenarPorDirector(ArrayList<Pelicula> peliculas){
    }
    
    public void ordenarPorTitulo(ArrayList<Pelicula> peliculas){
    }
    
}
/*
4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
*/