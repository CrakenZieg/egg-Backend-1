
package com.Egg.EggNews.controller;

import com.Egg.EggNews.domain.Noticia;
import com.Egg.EggNews.service.NoticiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/noticia")
public class NoticiaController {
    
    @Autowired
    private NoticiasService noticiasService;
    
    @GetMapping(value = "/{id}")
    public String noticia(Noticia noticia, ModelMap model){
        noticia = noticiasService.noticia(noticia);
        model.addAttribute("noticia", noticia);
        return "noticia";
    }
}
