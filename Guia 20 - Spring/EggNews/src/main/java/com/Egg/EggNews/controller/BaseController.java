
package com.Egg.EggNews.controller;

import com.Egg.EggNews.domain.Noticia;
import com.Egg.EggNews.service.NoticiasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BaseController {
    
    @Autowired
    private NoticiasService noticiasService;
    
    @GetMapping(value = "/")
    public String home(ModelMap model){
        List<Noticia> noticias = noticiasService.todasLasNoticias();
        model.addAttribute("noticias", noticias);
        return "index";
    }
    
}
