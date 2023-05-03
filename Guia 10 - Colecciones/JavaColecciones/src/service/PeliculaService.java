
package service;

import comparators.*;
import entities.Pelicula;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class PeliculaService {
   
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Comparator<Pelicula> comparadorPelicula;
    //PeliculaComparator comparadorPelicula;
    
    public void ingresarPeliculas(ArrayList<Pelicula> peliculas){
        String opcion = "";
        System.out.println("Quiere cargar peliculas aleatoriamente? (S/N)");
        opcion = sc.next().toUpperCase();
        if(opcion.equals("S")){
            System.out.println("Cuantas peliculas quiere cargar?");
            int n = sc.nextInt();
            cargarPeliculas(peliculas, n);
        } else {
            do{
                crearPelicula(peliculas);
                System.out.println("Quiere ingresar otro pelicula? (S/N)");
                opcion = sc.next().toUpperCase();
            }while(opcion.equals("S"));
        }
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
        int cont=1;
        System.out.println("Las peliculas en lista son: ");
        for (Pelicula pelicula: peliculas) {
            System.out.println(cont+": "+pelicula.toString());
            cont++;
        }
    }
    
    public void mostrarPeliculasLargas(ArrayList<Pelicula> peliculas){
        int cont=1;
        System.out.println("Las peliculas de más de una hora en lista son: ");
        for (Pelicula pelicula: peliculas) {
            if(pelicula.getDuracion()>=1){
                System.out.println(cont+": "+pelicula.toString());
                cont++;
            }
        }
    }
    
    public void ordenarPorDuracionMayor(ArrayList<Pelicula> peliculas){
        comparadorPelicula = new PeliculaDuracionComparator().reversed();
        //comparadorPelicula = Comparator.comparing(Pelicula::getDuracion).reversed();
        peliculas.sort(comparadorPelicula);
        mostrarPeliculas(peliculas);
    }
    
    public void ordenarPorDuracionMenor(ArrayList<Pelicula> peliculas){
        comparadorPelicula = new PeliculaDuracionComparator();
        //comparadorPelicula = Comparator.comparing(Pelicula::getDuracion);
        peliculas.sort(comparadorPelicula);
        mostrarPeliculas(peliculas);
    }
    
    public void ordenarPorDirector(ArrayList<Pelicula> peliculas){
        comparadorPelicula = new PeliculaDirectorComparator();
        //comparadorPelicula = Comparator.comparing(Pelicula::getDirector);
        peliculas.sort(comparadorPelicula);
        mostrarPeliculas(peliculas);
    }
    
    public void ordenarPorTitulo(ArrayList<Pelicula> peliculas){
        comparadorPelicula = new PeliculaTituloComparator();
        //comparadorPelicula = Comparator.comparing(Pelicula::getTitulo);
        peliculas.sort(comparadorPelicula);
        mostrarPeliculas(peliculas);
    }
    
    public void cargarPeliculas(ArrayList<Pelicula> peliculas, int n){
        Random rand = new Random();
        String[] abecedario= {"A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"," ","!","?"};
        for(int j=0; j<n; j++){
            int largo = rand.nextInt(1,15);
            String titulo= "";
            for(int i=0; i<largo; i++){ 
                titulo = titulo.concat(abecedario[rand.nextInt(abecedario.length)]);
            }
            String director= "";
            for(int i=0; i<largo; i++){ 
                director = director.concat(abecedario[rand.nextInt(abecedario.length)]);
            }
            Pelicula peli = new Pelicula(titulo, director, rand.nextDouble(0.1, 4));
            peliculas.add(peli);
            System.out.println((j+1)+": "+peli.toString());
        }
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