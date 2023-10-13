
package com.Egg.EggNews.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
@Table(name="noticia")
public class Noticia implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="id_noticia")
    private String id;
    private LocalDate creada;
    private LocalDate editada;
    @NotEmpty
    private String titulo;
    @NotEmpty
    private String cuerpo;
    @NotEmpty    
    @Column(name="id_autor")
    private String autor;
    private boolean alta;
    
    @PrePersist
    protected void onCreate() {
        creada = LocalDate.now();
        editada = LocalDate.now();
        alta = true;
    }
    
    @PreUpdate
    public void onPreUpdate(){
        editada = LocalDate.now();
    }
    
}

/*

https://stackoverflow.com/questions/221611/creation-timestamp-and-last-update-timestamp-with-hibernate-and-mysql

prepersist -> fue la solucion mas sencilla

fecha -> @creationtype = timeStamp


*/