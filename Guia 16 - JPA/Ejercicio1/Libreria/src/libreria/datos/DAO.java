
package libreria.datos;

import javax.persistence.*;

public abstract class DAO<T> {
    
    protected EntityManagerFactory factory = Persistence.createEntityManagerFactory("LibreriaPU");
    protected EntityManager em = factory.createEntityManager();
    
    protected void persistir(T obj) throws Exception{        
        conectar();
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
        desconectar();        
    }
    
    protected void remover(T obj) throws Exception{       
        conectar();
        em.getTransaction().begin();
        
        obj = em.merge(obj);
        
        em.remove(obj);
        em.getTransaction().commit();
        desconectar();        
    }
    
    protected void actualizar(T obj) throws Exception{        
        conectar();
        em.getTransaction().begin();
        em.merge(obj);
        em.getTransaction().commit();
        desconectar();                    
    }
        
    protected void conectar(){
        if(!em.isOpen()){
            em = factory.createEntityManager();
        }
    }
    
    protected void desconectar(){
        if(em.isOpen()){
            em.close();
        }
    }
}
