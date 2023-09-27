
package com.Egg.EggNews.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(
                (requests) -> requests                       
                        .requestMatchers("/","/noticia/**",
                        "/panelAdmin/**","/login","/styles/**",
                        "/images/**"
                        ).permitAll()
        );
        return http.build();
    }
    
}
