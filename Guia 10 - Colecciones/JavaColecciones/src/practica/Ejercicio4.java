
package practica;

import entities.Pelicula;
import java.util.ArrayList;
import javacolecciones.EjercicioModelo;
import service.PeliculaService;

public class Ejercicio4 implements EjercicioModelo{

    @Override
    public void ejercicio() {
        
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        PeliculaService servicio = new PeliculaService();
        int opcion;
        
        do {
            System.out.println("Ingrese una opcion:");
            System.out.println("1. Ingresar pelicula");
            System.out.println("2. Ingresar peliculas");
            System.out.println("3. Mostrar peliculas");
            System.out.println("4. Mostrar peliculas largas");
            System.out.println("5. Ordenar de mayor a menor duracion");
            System.out.println("6. Ordenar de menor a mayor duracion");
            System.out.println("7. Ordenar por titulo");
            System.out.println("8. Ordenar por director");
            System.out.println("9. Automatico");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1 ->{
                    servicio.crearPelicula(peliculas);
                }
                case 2 ->{
                    servicio.ingresarPeliculas(peliculas);
                }
                case 3 ->{
                    servicio.mostrarPeliculas(peliculas);
                }
                case 4 ->{
                    servicio.mostrarPeliculasLargas(peliculas);
                }
                case 5 ->{
                    servicio.ordenarPorDuracionMayor(peliculas);
                }
                case 6 ->{
                    servicio.ordenarPorDuracionMenor(peliculas);
                }
                case 7 ->{
                    servicio.ordenarPorTitulo(peliculas);
                }
                case 8 ->{
                    servicio.ordenarPorDirector(peliculas);
                }
                case 9 ->{
                    automatico(peliculas, servicio);
                }
                case 0 ->{
                    System.out.println("Gracias! Hasta luego!");
                }
                default -> {
                    System.out.println("Opcion no valida!");
                }
            }
        } while(opcion!=0);  
    }  
    
    public void automatico(ArrayList<Pelicula> peliculas, PeliculaService servicio){
        System.out.println("1. Creando 15 peliculas aleatorias:");
        servicio.cargarPeliculas(peliculas,15);
        System.out.println("-----------------------------------------");
        System.out.println("Mostrando las peliculas:");
        servicio.mostrarPeliculas(peliculas);
        System.out.println("-----------------------------------------");
        System.out.println("Mostrando las peliculas largas:");
        servicio.mostrarPeliculasLargas(peliculas);
        System.out.println("-----------------------------------------");
        System.out.println("Ordenando las peliculas por duracion (Mm):");
        servicio.ordenarPorDuracionMayor(peliculas);
        System.out.println("-----------------------------------------");
        System.out.println("Ordenando las peliculas por duracion (mM):");
        servicio.ordenarPorDuracionMenor(peliculas);
        System.out.println("-----------------------------------------");
        System.out.println("Ordenando las peliculas por titulo:");
        servicio.ordenarPorTitulo(peliculas);
        System.out.println("-----------------------------------------");
        System.out.println("Ordenando las peliculas por director:");
        servicio.ordenarPorDirector(peliculas);
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