
package com.Egg.EggNews.controller;

import com.Egg.EggNews.domain.Noticia;
import com.Egg.EggNews.service.NoticiasService;
import com.Egg.EggNews.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class AdminController {
    
    @Autowired
    private NoticiasService noticiasService;
    
    @Autowired
    private UsuariosService userService;
    
    @GetMapping(value = "/")
    public String usuario(ModelMap model, @AuthenticationPrincipal UserDetails user, Noticia noticia){
        model.addAttribute("idAutor", userService.getId(user.getUsername()));
        model.addAttribute("noticias", noticiasService.todasLasNoticias());
        model.addAttribute("noticia", noticia);
        return "usuario";
    }
    @PostMapping(value = "/guardar")
    public String guardar(Noticia noticia){
        try{
            this.noticiasService.guardarNoticia(noticia);
        }catch(Exception ex){
            System.out.println("Error"+ ex);
        }        
        return "usuario";
    }
    
    @GetMapping(value = "/editar/{id}")
    public String editar(ModelMap model, Noticia noticia){
        noticia = this.noticiasService.noticia(noticia);
        model.addAttribute("noticia", noticia);
        return "usuario";
    }
    @PostMapping(value = "/editar")
    public String editar(Noticia noticia){
        try{
            this.noticiasService.guardarNoticia(noticia);
        }catch(Exception ex){
            System.out.println("Error"+ ex);
        }        
        return "usuario";
    }
    
    @GetMapping(value = "/eliminar")
    public String eliminar(Noticia noticia){
        try{
            this.noticiasService.eliminarNoticia(noticia);
        }catch(Exception ex){
            System.out.println("Error"+ ex);
        }        
        return "usuario";
    }
    
}
/*

*/
