
package com.Egg.EggNews.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="noticia")
public class Noticia{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_noticia")
    private long id;
    private String titulo;
    private String cuerpo;
    
}
