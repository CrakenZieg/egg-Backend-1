
package com.Egg.EggNews.dao;

import com.Egg.EggNews.domain.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticiasDAO extends JpaRepository<Noticia, Long> {    
}
