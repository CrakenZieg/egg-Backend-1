
package com.Egg.EggNews.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
    
   @Override
    public void addViewControllers(ViewControllerRegistry registro){
        registro.addViewController("/").setViewName("index");
        registro.addViewController("/usuario"); 
        registro.addViewController("/login");        
        registro.addViewController("/errores/403").setViewName("/errores/403");
        
    }
    
     /*puedo utilizar addViewControllers para no necesitar utlizar controllers que 
    manejen los request directamente
    
    También otrasconfiguraciones especificas
    
    */
}
