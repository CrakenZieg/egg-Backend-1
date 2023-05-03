
package comparators;

import entities.Pelicula;

public class PeliculaDirectorComparator implements PeliculaComparator{

    @Override
    public int compare(Pelicula pelicula1, Pelicula pelicula2) {
        return pelicula1.getDirector().compareTo(pelicula2.getDirector());
    }
    
}
