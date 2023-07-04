
package libreria;

import java.util.Random;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.*;

public class Libreria {

    public static void main(String[] args) {

        Random rand = new Random();
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("LibreriaPU");
        EntityManager em = factory.createEntityManager();
        
        try{
            
            Autor autor1 = new Autor(1, "Gato", true);
            Autor autor2 = new Autor(2, "Mau", true);
            Autor autor3 = new Autor(3, "Peludo", true);
            Editorial editorial1 = new Editorial(1, "Editorial Felina", true);
            Editorial editorial2 = new Editorial(2, "Editorial Gatuna", true);
            Editorial editorial3 = new Editorial(3, "Editorial Peluda", true);
            Libro libro1 = new Libro(rand.nextLong(999999, 9999999), "Gatos vol. I", 1900,
                    10, 3, 7, true, autor1, editorial1);
            Libro libro2 = new Libro(rand.nextLong(999999, 9999999), "Gatos vol. II", 1900,
                    10, 4, 6, true, autor1, editorial1);
            Libro libro3 = new Libro(rand.nextLong(999999, 9999999), "Gatos vol. III", 1900,
                    10, 5,5, true, autor1, editorial1);
            Libro libro4 = new Libro(rand.nextLong(999999, 9999999), "Maullidos vol. I", 1900,
                    10, 3, 7, true, autor2, editorial2);
            Libro libro5 = new Libro(rand.nextLong(999999, 9999999), "Maullidos vol. II", 1900,
                    10, 4, 6, true, autor2, editorial2);
            Libro libro6 = new Libro(rand.nextLong(999999, 9999999), "Maullidos vol. III", 1900,
                    10, 5,5, true, autor2, editorial2);
            Libro libro7 = new Libro(rand.nextLong(999999, 9999999), "Peludos vol. I", 1900,
                    10, 3, 7, true, autor3, editorial3);
            Libro libro8 = new Libro(rand.nextLong(999999, 9999999), "Peludos vol. II", 1900,
                    10, 4, 6, true, autor3, editorial3);
            Libro libro9 = new Libro(rand.nextLong(999999, 9999999), "Peludos vol. III", 1900,
                    10, 5,5, true, autor3, editorial3);
            
            em.getTransaction().begin();
            em.persist(autor1);
            em.persist(autor2);
            em.persist(autor3);
            em.persist(editorial1);
            em.persist(editorial2);
            em.persist(editorial3);
            em.persist(libro1);
            em.persist(libro2);
            em.persist(libro3);
            em.persist(libro4);
            em.persist(libro5);
            em.persist(libro6);
            em.persist(libro7);
            em.persist(libro8);
            em.persist(libro9);
            em.getTransaction().commit();
            
        
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
}
