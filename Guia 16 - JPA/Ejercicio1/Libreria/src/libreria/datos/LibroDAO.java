
package libreria.datos;

import java.util.Calendar;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

public class LibroDAO extends DAO<Libro>{

    public LibroDAO() {
    }
        
    public void guardar(Libro libro) throws Exception{
        if(libro==null){
            throw new Exception("Libro invalido");
        }
        persistir(libro);
    }
    
    @Override
    public void actualizar(Libro libro) throws Exception{
        if(libro==null){
            throw new Exception("Libro invalido");
        }
        super.actualizar(libro);
    }
    
    public List<Libro> buscarTodos(){
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.autor a JOIN l.editorial e")
                .getResultList();
        desconectar();
        return libros;
    }
    
    public Libro buscarPorId(int id) throws Exception{
        if(id<=0){
            throw new Exception("Id invalido");
        }
        String idL = Integer.toString(id);
        Libro libro = null;
        conectar();
        try{ 
            libro = (Libro) em.createQuery("SELECT l FROM Libro l JOIN l.autor a JOIN l.editorial e WHERE l.id LIKE :id")
                .setParameter("id", idL).getSingleResult();
        }catch(Exception ex){
        }finally{
            desconectar();        
            return libro;
        }
    }
    
    public Libro buscarPorISBN(long isbn) throws Exception{
        if(isbn<0){
            throw new Exception("ISBN invalido");
        }
        String isbnL = Long.toString(isbn);
        Libro libro = null;
        conectar();
        try{ 
            libro = (Libro) em.createQuery("SELECT l FROM Libro l JOIN l.autor a JOIN l.editorial e WHERE l.isbn LIKE :isbn")
                .setParameter("isbn", isbnL).getSingleResult();
        }catch(Exception ex){
        }finally{
            desconectar();        
            return libro;
        }
    }
    
    public List<Libro> buscarPorNombre(String nombre) throws Exception{
        if(nombre.isBlank()){
            throw new Exception("Nombre invalido");
        }
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.autor a JOIN l.editorial e WHERE l.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getResultList();
        desconectar();
        return libros;
    }
    
    public List<Libro> buscarPorAnio(int anio) throws Exception{
        if(anio>Calendar.YEAR){
            throw new Exception("Año invalido");
        }
        String anioL = Integer.toString(anio);
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.autor a JOIN l.editorial e WHERE l.anio LIKE :anio")
                .setParameter("anio", anioL).getResultList();
        desconectar();
        return libros;
    }
    
    public List<Libro> buscarPorAlta(boolean alta){
        String altaL = ((alta)?"1":"0");
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.autor a JOIN l.editorial e WHERE l.alta LIKE :alta")
                .setParameter("alta", altaL).getResultList();
        desconectar();
        return libros;
    }
    
    public List<Libro> buscarPorAutor(Autor autor) throws Exception{
        if(autor==null){
            throw new Exception("Autor invalido");
        }
        String autorID = Integer.toString(autor.getId());
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.autor a JOIN l.editorial e WHERE a.id LIKE :autorID")
                .setParameter("autorID", autorID).getResultList();
        desconectar();
        return libros;
    }
    
    public List<Libro> buscarPorEditorial(Editorial editorial) throws Exception{
        if(editorial==null){
            throw new Exception("Editorial invalido");
        }
        String editorialID = Integer.toString(editorial.getId());
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.autor a JOIN l.editorial e WHERE e.id LIKE :editorialID")
                .setParameter("editorialID", editorialID).getResultList();
        desconectar();
        return libros;
    }
    
    public void eliminarPorId(int id) throws Exception{
        Libro libro = buscarPorId(id);
        remover(libro);
    }
    
    public void eliminarPorISBN(long isbn) throws Exception{
        Libro libro = buscarPorISBN(isbn);
        remover(libro);
    }
    
    public void eliminarPorNombre(String nombre) throws Exception{
        List<Libro> libros = buscarPorNombre(nombre);
        for (Libro libro : libros) {
            remover(libro);
        }
    }
    
    public void eliminarPorAnio(int anio) throws Exception{
        List<Libro> libros = buscarPorAnio(anio);
        for (Libro libro : libros) {
            remover(libro);
        }
    }
    
    public void eliminarPorAlta(boolean alta) throws Exception{
        List<Libro> libros = buscarPorAlta(alta);
        for (Libro libro : libros) {            
            remover(libro);
        }
    }
    
    public void eliminarPorAutor(Autor autor) throws Exception{
        List<Libro> libros = buscarPorAutor(autor);
        for (Libro libro : libros) {
            remover(libro);
        }
    }
    
    public void eliminarPorEditorial(Editorial editorial) throws Exception{
        List<Libro> libros = buscarPorEditorial(editorial);
        for (Libro libro : libros) {
            remover(libro);
        }
    }
    
    public int getLibroCount() {
        try {
            conectar();
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Libro> rt = cq.from(Libro.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            desconectar();
        }
    }
    
}
