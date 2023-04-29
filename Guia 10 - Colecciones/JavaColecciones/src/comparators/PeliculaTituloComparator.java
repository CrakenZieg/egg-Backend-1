
package comparators;

import entities.Pelicula;

public class PeliculaTituloComparator implements PeliculaComparator{

    @Override
    public int compare(Pelicula pelicula1, Pelicula pelicula2) {
        return 0;
        //return (int)String.compare(pelicula1.getTitulo(), pelicula2.getTitulo());
    }
    
}
