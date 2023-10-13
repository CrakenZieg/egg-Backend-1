
package com.Egg.EggNews.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Entity
@Data
@Table(name="usuario")
public class Usuario implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="id_usuario")
    private String idUsuario;
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
    @NotEmpty
    private boolean alta;
    @OneToMany
    @JoinColumn(name="id_usuario")
    private List<Rol> roles;
    
    @PrePersist
    protected void onCreate() {
        alta = false;
    }
}

