
package libreria.datos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.TemporalType;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import libreria.datos.exceptions.NonexistentEntityException;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;

public class PrestamoJpaController implements Serializable {

    public PrestamoJpaController() {
        this.emf = Persistence.createEntityManagerFactory("LibreriaPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Prestamo prestamo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(prestamo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Prestamo prestamo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            prestamo = em.merge(prestamo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = prestamo.getId();
                if (findPrestamo(id) == null) {
                    throw new NonexistentEntityException("The prestamo with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Prestamo prestamo;
            try {
                prestamo = em.getReference(Prestamo.class, id);
                prestamo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The prestamo with id " + id + " no longer exists.", enfe);
            }
            em.remove(prestamo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Prestamo> findPrestamoEntities() {
        return findPrestamoEntities(true, -1, -1);
    }

    public List<Prestamo> findPrestamoEntities(int maxResults, int firstResult) {
        return findPrestamoEntities(false, maxResults, firstResult);
    }

    private List<Prestamo> findPrestamoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Prestamo.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Prestamo findPrestamo(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Prestamo.class, id);
        } finally {
            em.close();
        }
    }
    
    public List<Prestamo> findPrestamoByLibro(Libro libro) {
        EntityManager em = getEntityManager();
        List<Prestamo> prestamos = null;
        String id = Integer.toString(libro.getId());
        try {
            prestamos = em.createQuery("SELECT p FROM Prestamo p JOIN p.libro l WHERE l.id LIKE :id")
                .setParameter("idL", id).getResultList();
        } catch(Exception ex){
        } finally {
            em.close();
            return prestamos;
        }
    }
    
    public List<Prestamo> findPrestamoByCliente(Cliente Cliente) {
        EntityManager em = getEntityManager();
        List<Prestamo> prestamos = null;
        String id = Integer.toString(Cliente.getId());
        try {
            prestamos = em.createQuery("SELECT p FROM Prestamo p JOIN p.Cliente c WHERE c.id LIKE :id")
                .setParameter("idL", id).getResultList();
        } catch(Exception ex){
        } finally {
            em.close();
            return prestamos;
        }
    }
    
    public List<Prestamo> findPrestamoByFecha(Date inicio, Date finalizacion){
        EntityManager em = getEntityManager();
        List<Prestamo> prestamos = null;
        try {
            prestamos = em.createQuery("SELECT p FROM Prestamo p WHERE p.fechaPrestamo BETWEEN :inicio AND :finalizacion")
                .setParameter("inicio", inicio, TemporalType.DATE)
                .setParameter("finalizacion", finalizacion, TemporalType.DATE)
                .getResultList();
        } catch(Exception ex){
        } finally {
            em.close();
            return prestamos;
        }
    }    

    public int getPrestamoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Prestamo> rt = cq.from(Prestamo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
