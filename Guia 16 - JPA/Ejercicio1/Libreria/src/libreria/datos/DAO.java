
package libreria.datos;

import javax.persistence.*;

public abstract class DAO {
    
    protected EntityManagerFactory factory = Persistence.createEntityManagerFactory("LibreriaPU");
    protected EntityManager em = factory.createEntityManager();
    
    protected void persistir(Object obj){        
        conectar();
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
        desconectar();        
    }
    
    protected void remover(Object obj){       
        conectar();
        em.getTransaction().begin();
        Object enContexto = obj;
        if (!em.contains(obj)) {
            enContexto = em.merge(obj);
        }
        em.remove(enContexto);
        em.getTransaction().commit();
        desconectar();        
    }
    
    protected void actualizar(Object obj){        
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
