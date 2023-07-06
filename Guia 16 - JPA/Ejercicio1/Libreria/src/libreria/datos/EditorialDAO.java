
package libreria.datos;

import java.util.List;
import libreria.entidades.Editorial;

public class EditorialDAO extends DAO{

    LibroDAO libroDAO = new LibroDAO();
    
    public EditorialDAO() {
    }
        
    public void guardar(Editorial editorial) throws Exception{
        if(editorial==null){
            throw new Exception("Editorial invalido");
        }
        persistir(editorial);
    }
    
    public void actualizar(Editorial editorial) throws Exception{
        if(editorial==null){
            throw new Exception("Editorial invalido");
        }
        super.actualizar(editorial);
    }
    
    public void eliminarPorId(int id) throws Exception{
        Editorial editorial = buscarPorId(id);
        libroDAO.eliminarPorEditorial(editorial);
        remover(editorial);
    }
    
    public void eliminarPorNombre(String nombre) throws Exception{
        Editorial editorial = buscarPorNombre(nombre);
        libroDAO.eliminarPorEditorial(editorial);
        remover(editorial);
    }
    
    public void eliminarPorAlta(boolean alta) throws Exception{
        List<Editorial> editoriales = buscarPorAlta(alta);
        for (Editorial editorial : editoriales) {
            libroDAO.eliminarPorEditorial(editorial);
            remover(editorial);
        }
    }
    
    public List<Editorial> buscarTodos(){
        conectar();
        List<Editorial> autores = em.createQuery("SELECT e FROM Editorial e")
                .getResultList();
        desconectar();
        return autores;
    }
    
    public Editorial buscarPorId(int id) throws Exception{
        if(id<=0){
            throw new Exception("Id invalido");
        }
        String idL = Integer.toString(id);
        conectar();
        Editorial editorial = (Editorial)em.createQuery("SELECT e FROM Editorial e WHERE e.id like :id")
                .setParameter("id", idL).getSingleResult();
        desconectar();
        return editorial;
    }
    
    public Editorial buscarPorNombre(String nombre) throws Exception{
        if(nombre.isBlank()){
            throw new Exception("Nombre invalido");
        }
        conectar();
        Editorial editorial = (Editorial)em.createQuery("SELECT e FROM Editorial e WHERE e.nombre like :nombre")
                .setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return editorial;
    }
    
    public List<Editorial> buscarPorAlta(boolean alta){
        String altaL = ((alta)?"1":"0");
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e WHERE e.alta like :alta")
                .setParameter("alta", altaL).getResultList();
        desconectar();
        return editoriales;
    }    
    
}
