
package com.Egg.EggNews.service;

import com.Egg.EggNews.dao.UsuariosDAO;
import com.Egg.EggNews.domain.Rol;
import com.Egg.EggNews.domain.Usuario;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")
public class UsuariosService implements UserDetailsService {
    
    @Autowired
    private UsuariosDAO usuariosDAO;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        Usuario usuario = usuariosDAO.findByUsername(username);
        
        if(usuario==null){
            throw new UsernameNotFoundException(username);
        } else if(!usuario.isAlta()){
            throw new UsernameNotFoundException(username);
        }
                
        var roles = new ArrayList<GrantedAuthority>();
        for (Rol rol : usuario.getRoles()) {
            roles.add(new SimpleGrantedAuthority(rol.getNombre()));
        }
        return new User(usuario.getUsername(), usuario.getPassword(), roles);
    }
    
    @Transactional(readOnly = true)
    public String getId(String username){        
        Usuario usuario = usuariosDAO.findByUsername(username);        
        return usuario.getIdUsuario();
    }
    
}
