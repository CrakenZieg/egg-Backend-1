
package com.Egg.EggNews.service;

import com.Egg.EggNews.dao.NoticiasDAO;
import com.Egg.EggNews.domain.Noticia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NoticiasService {
    
    @Autowired
    private NoticiasDAO noticiasDAO;
    
    @Transactional(readOnly = true)
    public List<Noticia> todasLasNoticias(){
        return noticiasDAO.findAll();
    }
    
    @Transactional(readOnly = true)
    public Noticia noticia(Noticia noticia){        
        return noticiasDAO.findById(noticia.getId()).orElse(null);
    }
    
    @Transactional
    public void guardarNoticia(Noticia noticia){
        noticiasDAO.save(noticia);
    }
    
    @Transactional
    public void eliminarNoticia(Noticia noticia){
        noticiasDAO.delete(noticia);
    }
    
}
