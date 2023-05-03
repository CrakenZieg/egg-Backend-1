
package comparators;

import entities.Pelicula;

public class PeliculaTituloComparator implements PeliculaComparator{

    @Override
    public int compare(Pelicula pelicula1, Pelicula pelicula2) {
        return pelicula1.getTitulo().compareTo(pelicula2.getTitulo());
    }
    
}
