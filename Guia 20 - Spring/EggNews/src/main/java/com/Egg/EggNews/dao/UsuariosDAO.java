
package com.Egg.EggNews.dao;

import com.Egg.EggNews.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosDAO extends JpaRepository<Usuario, Long>{
    
}
