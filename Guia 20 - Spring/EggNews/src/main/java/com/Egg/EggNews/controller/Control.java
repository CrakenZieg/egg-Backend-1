
package com.Egg.EggNews.controller;

import com.Egg.EggNews.domain.Noticia;
import com.Egg.EggNews.service.NoticiasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Control {
    
    @Autowired
    private NoticiasService noticiasService;
    
    @GetMapping(value = "/")
    public String home(ModelMap model){
        List<Noticia> noticias = noticiasService.todasLasNoticias();
        model.addAttribute("noticias", noticias);
        return "index";
    }
    
    @GetMapping(value = "/noticia/{id}")
    public String noticia(Noticia noticia, ModelMap model){
        noticia = noticiasService.noticia(noticia);
        model.addAttribute("noticia", noticia);
        return "noticia";
    }
    
    @GetMapping(value = "/panelAdmin")
    public String admin(){
        return "panelAdmin";
    }
    
}
