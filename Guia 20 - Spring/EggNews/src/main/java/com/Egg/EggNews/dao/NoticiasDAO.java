
package com.Egg.EggNews.dao;

import com.Egg.EggNews.domain.Noticia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticiasDAO extends JpaRepository<Noticia, String> {  
    
    List<Noticia> findAllByOrderByCreadaAsc();
    
    Noticia findByTitulo(String titulo);
    
}
