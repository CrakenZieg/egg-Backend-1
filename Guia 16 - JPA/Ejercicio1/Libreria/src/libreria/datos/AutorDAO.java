
package libreria.datos;

import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import libreria.entidades.Autor;

public class AutorDAO extends DAO{
    
    LibroDAO libroDAO = new LibroDAO();

    public AutorDAO() {
    }
    
    public void guardar(Autor autor) throws Exception{
        if(autor==null){
            throw new Exception("Autor invalido");
        }
        persistir(autor);
    }
    
    public void actualizar(Autor autor) throws Exception{
        if(autor==null){
            throw new Exception("Autor invalido");
        }
        super.actualizar(autor);
    }
    
    public void eliminarPorId(int id) throws Exception{
        Autor autor = buscarPorId(id);
        libroDAO.eliminarPorAutor(autor);
        remover(autor);
    }
    
    public void eliminarPorNombre(String nombre) throws Exception{
        Autor autor = buscarPorNombre(nombre);
        libroDAO.eliminarPorAutor(autor);
        remover(autor);
    }
    
    public void eliminarPorAlta(boolean alta) throws Exception{
        List<Autor> autores = buscarPorAlta(alta);
        for (Autor autor : autores) {
            libroDAO.eliminarPorAutor(autor);
            remover(autor);
        }
    }
    
    public List<Autor> buscarTodos(){
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a")
                .getResultList();
        desconectar();
        return autores;
    }
    
    public Autor buscarPorId(int id) throws Exception{
        if(id<=0){
            throw new Exception("Id invalido");
        }
        String idL = Integer.toString(id);
        Autor autor = null;
        conectar();
        try{ 
            autor = (Autor)em.createQuery("SELECT a FROM Autor a WHERE a.id like :id")
                .setParameter("id", idL).getSingleResult();
        }catch(Exception ex){
        }finally{
            desconectar();        
            return autor;
        }
    }
    
    public Autor buscarPorNombre(String nombre) throws Exception{
        if(nombre.isBlank()){
            throw new Exception("Nombre invalido");
        }
        Autor autor = null;
        conectar();
        try{
            autor = (Autor)em.createQuery("SELECT a FROM Autor a WHERE a.nombre like :nombre")
                .setParameter("nombre", nombre).getSingleResult();  
        }catch(Exception ex){
        }finally{
            desconectar();        
            return autor;
        }
    }
    
    public List<Autor> buscarPorAlta(boolean alta){
        String altaL = ((alta)?"1":"0");
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.alta like :alta")
                .setParameter("alta", altaL).getResultList();
        desconectar();
        return autores;
    }    
    
    public int getAutorCount() {
        try {
            conectar();
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Autor> rt = cq.from(Autor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            desconectar();
        }
    }
    
}
