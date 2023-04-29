
package comparators;

import entities.Pelicula;
import java.util.Comparator;

public interface PeliculaComparator extends Comparator<Pelicula>{
    
    @Override
    public int compare(Pelicula pelicula1, Pelicula pelicula2);
    
}
