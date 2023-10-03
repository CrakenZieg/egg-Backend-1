
package com.Egg.EggNews.config;

import com.Egg.EggNews.util.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Autowired
    private UserDetailsService userDetailsService;
    
    @Autowired
    private Encoder enconder;
        
    @Autowired 
    public void configurerGlobal(AuthenticationManagerBuilder builder) throws Exception{
        builder.userDetailsService(userDetailsService).passwordEncoder(enconder.passwordEncoder());
    }
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(
                (requests) -> requests                       
                        .requestMatchers("/","/noticia/**",                        
                        "/styles/**", "/images/**"
                        ).permitAll()
                        .requestMatchers("/usuario", "/usuario/**"
                        ).hasAnyRole("ADMIN", "USER")
        ).formLogin((form) -> form
                .loginPage("/login")
                .permitAll()
        ).exceptionHandling((exception) -> exception
                .accessDeniedPage("/errores/403"))
        .logout((logout) -> logout.permitAll());
        return http.build();
    }
    
}