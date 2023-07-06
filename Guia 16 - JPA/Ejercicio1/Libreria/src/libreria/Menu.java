
package libreria;

import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import libreria.servicios.*;
import libreria.entidades.*;

public class Menu {
    
    Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");
    AutorServicio autorServicio = new AutorServicio(sc);
    EditorialServicio editorialServicio = new EditorialServicio(sc);
    LibroServicio libroServicio = new LibroServicio(sc,autorServicio,editorialServicio);
    
    public boolean menu(){
        boolean retorno = true;
        int opcion;
        System.out.println(""
                + "*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*--*"
                + "Bienvenido al sistema de gestion de la libreria\n"
                + "Seleccione una opcion:\n"
                + "1. Crear registro\n"
                + "2. Modificar registro\n"
                + "3. Dar de alta registro\n"
                + "4. Mostrar registros\n"
                + "5. Eliminar registro\n"
                + "0. Salir");
        try {
            opcion = sc.nextInt();            
        } catch (Exception ex){
            sc.next();
            System.out.println("Opcion no valida!\n"+ex.getMessage());
            opcion = -1;
        }
        switch (opcion){
            case 1 ->{menuCrear();}
            case 2 ->{menuModificar();}
            case 3 ->{menuAlta();}
            case 4 ->{menuMostrar();}
            case 5 ->{menuEliminar();}
            case 0 ->{
                System.out.println("Gracias por elegirnos!");
                retorno = false;
            }
        }
        return retorno;
    }
    
    public void menuEliminar(){
        int opcion;        
        try {
            System.out.println("Esta seguro que desea eliminar registros?\n"
                    + "\nLA ELIMINACION ES PERMANENTE\n\n"
                    + "1. Si\n"
                    + "2. No");
            opcion = sc.nextInt();
            if(opcion==1){
                System.out.println("Que desea eliminar?\n"
                        + "\nELIMINAR UN AUTOR O EDITORIAL RESULTA EN LA\n"
                        + "ELIMINACION DE LOS LIBROS ASOCIADOS\n\n"
                        + "1. Autor\n"
                        + "2. Editorial\n"
                        + "3. Libro\n"
                        + "0. Volver");
                opcion = sc.nextInt();
                switch(opcion){
                    case 1->{autorServicio.eliminar();}
                    case 2->{editorialServicio.eliminar();}
                    case 3->{libroServicio.eliminar();}
                }
            }
            
        } catch (Exception ex) {
            sc.next();
            System.out.println("Opcion no valida!\n"+ex.getMessage());
            opcion = -1;
        }  
    }
    
    public void menuMostrar(){
        int opcion;
        System.out.println("Que registro desea mostrar?\n"
                + "1. Autores\n"
                + "2. Editoriales\n"
                + "3. Libros\n"
                + "0. Volver");
        try {
            opcion = sc.nextInt();            
        } catch (Exception ex){
            sc.next();
            System.out.println("Opcion no valida!\n"+ex.getMessage());
            opcion = -1;
        }
        switch (opcion){
            case 1->{autorServicio.mostrar();}
            case 2->{editorialServicio.mostrar();}
            case 3->{libroServicio.mostrar();}
        }
    }
    
    public void menuAlta(){
        int opcion;
        System.out.println("Que registro desea modificar?\n"
                + "1. Dar de alta autor\n"
                + "2. Dar de alta editorial\n"
                + "3. Dar de alta libro\n"
                + "0. Volver");
        try {
            opcion = sc.nextInt();            
        } catch (Exception ex){
            sc.next();
            System.out.println("Opcion no valida!\n"+ex.getMessage());
            opcion = -1;
        }
        switch (opcion){
            case 1->{autorServicio.darDeAlta();}
            case 2->{editorialServicio.darDeAlta();}
            case 3->{libroServicio.darDeAlta();}
        }
    }
    
    public void menuModificar(){
        int opcion;
        System.out.println("Que registro desea modificar?\n"
                + "1. Modificar autor\n"
                + "2. Modificar editorial\n"
                + "3. Modificar libro\n"
                + "0. Volver");
        try {
            opcion = sc.nextInt();            
        } catch (Exception ex){
            sc.next();
            System.out.println("Opcion no valida!\n"+ex.getMessage());
            opcion = -1;
        }
        switch (opcion){
            case 1->{autorServicio.modificarAutor();}
            case 2->{editorialServicio.modificarEditorial();}
            case 3->{libroServicio.modificarLibro();}
        }
    }
    
    public void menuCrear(){
        int opcion;
        System.out.println("Que registro desea crear?\n"
                + "1. Crear autor\n"
                + "2. Crear editorial\n"
                + "3. Crear libro\n"
                + "0. Volver");
        try {
            opcion = sc.nextInt();            
        } catch (Exception ex){
            sc.next();
            System.out.println("Opcion no valida!\n"+ex.getMessage());
            opcion = -1;
        }
        switch (opcion){
            case 1->{autorServicio.crearAutor();}
            case 2->{editorialServicio.crearEditorial();}
            case 3->{libroServicio.crearLibro();}
        }
    }
    
}
/*
Al alumno le toca desarrollar, las siguientes funcionalidades:  
1) Crear base de datos Librería 
2) Crear unidad de persistencia 
3) Crear entidades previamente mencionadas (excepto Préstamo)  
4) Generar las tablas con JPA 
5) Crear servicios previamente mencionados. 
6) Crear los métodos para persistir entidades en la base de datos librería 
7) Crear los métodos para dar de alta/bajo o editar dichas entidades. 
8) Búsqueda de un Autor por nombre. 9) Búsqueda de un libro por ISBN. 
10) Búsqueda de un libro por Título.  
11) Búsqueda de un libro/s por nombre de Autor. 
12) Búsqueda de un libro/s por nombre de Editorial. 
13) Agregar las siguientes validaciones a todas las funcionalidades de la aplicación:  
• Validar campos obligatorios. 
• No ingresar datos duplicados. 
 */
