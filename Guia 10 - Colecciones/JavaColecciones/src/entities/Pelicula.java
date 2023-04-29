
package entities;

import java.util.Comparator;

public class Pelicula {
   
    private String titulo;
    private String director;
    private double duracion;
    private String horas;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        int hora = (int) duracion;
        horas = hora+":"+(int)((duracion-hora)*60);
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
        int hora = (int) duracion;
        horas = hora+":"+(int)((duracion-hora)*60);
    }

    public String getHoras() {
        return horas;
    }
    
    @Override
    public String toString(){
        return "[Titulo: "+titulo+", director: "+director+", duracion: "+horas+"hs]";
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