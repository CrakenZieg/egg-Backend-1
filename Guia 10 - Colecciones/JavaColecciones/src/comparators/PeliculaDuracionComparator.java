
package comparators;

import entities.Pelicula;

public class PeliculaDuracionComparator implements PeliculaComparator{

    @Override
    public int compare(Pelicula pelicula1, Pelicula pelicula2) {
        return Integer.compare((int)pelicula1.getDuracion(), (int)pelicula2.getDuracion());
    }
    
}
