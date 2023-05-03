
package comparators;

import entities.Pelicula;

public class PeliculaDuracionComparator implements PeliculaComparator{

    @Override
    public int compare(Pelicula pelicula1, Pelicula pelicula2) {
        return Double.compare(pelicula1.getDuracion(), pelicula2.getDuracion());
    }
    
}
