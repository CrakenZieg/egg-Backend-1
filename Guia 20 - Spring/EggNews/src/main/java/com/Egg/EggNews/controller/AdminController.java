
package com.Egg.EggNews.controller;

import com.Egg.EggNews.service.NoticiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/panelAdmin")
public class AdminController {
    
    @Autowired
    private NoticiasService noticiasService;
    
    @GetMapping(value = "/")
    public String admin(){
        return "panelAdmin";
    }
    
    
}
