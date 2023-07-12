
package libreria.servicios;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import libreria.datos.LibroDAO;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

public class LibroServicio {
        
    LibroDAO libroDAO = new LibroDAO();
    Scanner sc;
    AutorServicio autorServicio;
    EditorialServicio editorialServicio;

    public LibroServicio(Scanner sc,AutorServicio autorServicio,EditorialServicio editorialServicio) {
        this.sc = sc;
        this.autorServicio = autorServicio;
        this.editorialServicio = editorialServicio;
    }
    
    public Libro guardar(Long isbn, String titulo, int anio, int ejemplares, 
            int ejemplaresPrestados, int ejemplaresRestantes, Boolean alta, 
            Autor autor, Editorial editorial) throws Exception{
        Libro libro = new Libro( isbn,  titulo,  anio,  ejemplares, 
             ejemplaresPrestados,  ejemplaresRestantes,  alta, 
             autor,  editorial);
        try {
            libroDAO.guardar(libro);
        } catch (Exception ex) {
            throw ex;
        }
        return libro;
    }
    
    public void actualizar(Libro libro) throws Exception{
        try {
            libroDAO.actualizar(libro);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    public void altaBaja(Libro libro) throws Exception{
        libro.setAlta(!libro.getAlta());
        actualizar(libro);
    }
    
    public List<Libro> buscar(){
        return libroDAO.buscarTodos();
    }
    
    public Libro buscar(int id) throws Exception{
        return libroDAO.buscarPorId(id);
    }
    
    public Libro buscar(long isbn) throws Exception{
        return libroDAO.buscarPorISBN(isbn);
    }
    
    public List<Libro> buscarAnio(int anio) throws Exception{
        return libroDAO.buscarPorAnio(anio);
    }
    
    public List<Libro> buscar(String nombre) throws Exception{
        return libroDAO.buscarPorNombre(nombre);
    }
    
    public List<Libro> buscar(boolean alta){
        return libroDAO.buscarPorAlta(alta);
    }
    
    public List<Libro> buscar(Autor autor) throws Exception{
        return libroDAO.buscarPorAutor(autor);
    }
    
    public List<Libro> buscar(Editorial editorial) throws Exception{
        return libroDAO.buscarPorEditorial(editorial);
    }
    
    public int recuento(){
        return libroDAO.getLibroCount();
    }
    
    public void eliminar(int id) throws Exception{
        libroDAO.eliminarPorId(id);
    }
    
    public void eliminar(long isbn) throws Exception{
        libroDAO.eliminarPorISBN(isbn);
    }
    
    public void eliminar(String nombre) throws Exception{
        libroDAO.eliminarPorNombre(nombre);
    }
    
    public void eliminarAnio(int anio) throws Exception{
        libroDAO.eliminarPorAnio(anio);
    }    
    
    public void eliminar(boolean alta) throws Exception{
        libroDAO.eliminarPorAlta(alta);
    } 
    
    public void eliminar(Autor autor) throws Exception{
        libroDAO.eliminarPorAutor(autor);
    }
    
    public void eliminar(Editorial editorial) throws Exception{
        libroDAO.eliminarPorEditorial(editorial);
    }
    
    public void mostrarLibro(List<Libro> l){        
        for (Libro obj : l) {
            System.out.println(obj.toString());
        }
    } 
    
    public void crearLibro(){
        Long isbn;
        String nombre;
        int anio, ejemplares;
        Autor autor;
        Editorial editorial;
        try{
            System.out.println("Ingrese el numero de ISBN:");
            isbn = sc.nextLong();
            if(isbn<=0){
                throw new Exception("ISBN invalido.");
            }
            System.out.println("Ingrese el nombre:");
            nombre = sc.next();
            if(nombre.isBlank()){
                throw new Exception("El nombre es requerido.");
            }
            System.out.println("Ingrese el año de publicacion:");
            anio = sc.nextInt();
            if(anio>Calendar.getInstance().get(Calendar.YEAR)){
                throw new Exception("Año invalido.");
            }
            System.out.println("Ingrese el numero de ejemplares:");
            ejemplares = sc.nextInt();
            if(ejemplares<=0){
                throw new Exception("Numero de ejemplares invalido.");
            }
            autor = autorServicio.mostrarCrearAu();
            editorial = editorialServicio.mostrarCrearEd();
            if(!autor.getAlta()||!editorial.getAlta()){
                throw new Exception("El autor y la editorial deben estar activas");
            }
            guardar(isbn, nombre, anio, ejemplares, 0, 0, true, autor, editorial);
            System.out.println("Nuevo libro registrado:\n"
                    + buscar(isbn).toString());
        } catch(Exception ex){
            sc.next();
            System.out.println("Excepcion: "+ex.getMessage());       
        }        
    }    
    
    public void modificarLibro(){
        List<Libro> libros = buscar();
        mostrarLibro(libros);
        int opcion;
        System.out.println("Introduzca el id del libro:");
        try{
            opcion = sc.nextInt();
            Libro libro = buscar(opcion);
            System.out.println("Seleccionaste el libro:\n"
                    + libro.toString());
            System.out.println("Ingrese el campo a modificar:\n"
                    + "1. Titulo.\n"
                    + "2. ISBN.\n"
                    + "3. Año.\n"
                    + "4. Ejemplares.\n"
                    + "5. Autor.\n"
                    + "6. Editorial.\n"
                    + "0. Volver.");
            opcion = sc.nextInt();
            switch (opcion){
                case 1 ->{libro = modificarTitulo(libro);}
                case 2 ->{libro = modificarISBN(libro);}
                case 3 ->{libro = modificarAnio(libro);}
                case 4 ->{libro = modificarEjemplares(libro);}
                case 5 ->{libro.setAutor(autorServicio.mostrarCrearAu());}
                case 6 ->{libro.setEditorial(editorialServicio.mostrarCrearEd());}
            }
            actualizar(libro);
        }catch(Exception ex){
            sc.next();
            System.out.println("Opcion no valida!\n"+ex.getMessage());            
        } 
    }
    
    public Libro modificarEjemplares(Libro libro) throws Exception{        
        System.out.println("Ingrese el nuevo total de ejemplares:");        
        int ejemplares = sc.nextInt();
        if(ejemplares<=0){
            throw new Exception("Cantidad invalida.");
        }
        System.out.println("Ingrese la cantidad de ejemplares prestados:");
        int prestados = sc.nextInt();
        if(prestados<0||prestados>ejemplares){
            throw new Exception("Cantidad invalida.");
        }
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(prestados);
        libro.setEjemplaresRestantes(ejemplares-prestados);
        return libro;
    }
    
    public Libro modificarAnio(Libro libro) throws Exception{
        System.out.println("Ingrese el nuevo Año:");        
        int anio = sc.nextInt();
        if(anio>Calendar.getInstance().get(Calendar.YEAR)){
            throw new Exception("El nuevo año es invalido.");
        }
        libro.setAnio(anio);
        return libro;
    }
    
    public Libro modificarISBN(Libro libro) throws Exception{
        System.out.println("Ingrese el nuevo ISBN:");        
        Long isbn = sc.nextLong();
        if(isbn<=0){
            throw new Exception("El ISBN es invalido.");
        }
        libro.setIsbn(isbn);
        return libro;
    }
    
    public Libro modificarTitulo(Libro libro) throws Exception{
        System.out.println("Ingrese el nuevo titulo:");        
        String nombre = sc.next();
        if(nombre.isBlank()){
            throw new Exception("El titulo es requerido.");
        }
        libro.setTitulo(nombre);
        return libro;
    }
    
    public void darDeAlta(){
        List<Libro> libros = buscar();
        mostrarLibro(libros);
        int opcion;
        System.out.println("Ingrese el id del libro a dar de alta:");
        try{
            opcion = sc.nextInt();
            Libro libro = buscar(opcion);
            System.out.println("Selecionaste: "+libro.toString());
            System.out.println("Queres modificar su estado?\n"
                    + "1. Si\n"
                    + "2. No");
            opcion = sc.nextInt();
            if(opcion==1){
                altaBaja(libro);
                actualizar(libro);
            }
        } catch (Exception ex){
            sc.next();
            System.out.println("Opcioon invalida: "+ex.getMessage());
        }
    }
    
    public void mostrar(){
        List<Libro> libros = null;
        int opcion;
        System.out.println("Que libros desea ver?\n"
                + "1. Lista completa.\n"
                + "2. Filtrado por id.\n"
                + "3. Filtrado por ISBN.\n"
                + "4. Filtrado por nombre.\n"
                + "5. Filtrado por año.\n"
                + "6. Filtrado por condicion de alta.\n"
                + "7. Filtrado por autor.\n"
                + "8. Filtrado por editorial.\n"
                + "0. Volver.");
        try{
            opcion = sc.nextInt();
            switch (opcion){
                case 1 ->{libros = buscar();}
                case 2 ->{
                    System.out.println("Ingrese el id:");
                    int i = sc.nextInt();
                    System.out.println("Resultado: \n"+buscar(i).toString());
                }
                case 3 ->{
                    System.out.println("Ingrese el ISBN:");
                    Long l = sc.nextLong();
                    System.out.println("Resultado: \n"+buscar(l).toString());
                }
                case 4 ->{
                    System.out.println("Ingrese el nombre:");
                    String nombre = sc.next();
                    libros = buscar(nombre);
                }
                case 5 ->{
                    System.out.println("Ingrese el año:");
                    int anio = sc.nextInt();
                    libros = buscarAnio(anio);
                }
                case 6 ->{
                    System.out.println("Ingrese la condicion de alta:\n"
                            + "1. Alta.\n"
                            + "2. Baja.");
                    int i = sc.nextInt();
                    libros = buscar(i==1);
                }
                case 7 ->{
                    Autor autor = autorServicio.mostrarCrearAu();
                    libros = buscar(autor);
                }
                case 8 ->{
                    Editorial editorial = editorialServicio.mostrarCrearEd();
                    libros = buscar(editorial);
                }
            }
            if(libros!=null){
                mostrarLibro(libros);
            }
        } catch (Exception ex){
            sc.next();
            System.out.println("Opción invalida: "+ex.getMessage());
        }
    }
    
    public void eliminar(){        
        int opcion;
        System.out.println("\nQUE LIBROS DESEA ELIMINAR PERMANENTEMENTE?\n\n"                
                + "1. ELIMINAR LISTA COMPLETA.\n"
                + "2. ELIMINAR POR ID.\n"
                + "3. ELIMINAR POR ISBN.\n"
                + "4. ELIMINAR POR NOMBRE.\n"
                + "5. ELIMINAR POR AÑO.\n"
                + "6. ELIMINAR POR CONDICION DE ALTA.\n"
                + "7. ELIMINAR POR AUTOR.\n"
                + "8. ELIMINAR POR EDITORIAL.\n"
                + "0. Volver.");
        try{
            opcion = sc.nextInt();
            System.out.println("\nESTA SEGURO QUE DESEA CONTINUAR? (S/N)");
            String f = sc.next().toLowerCase();
            if(f.equals("s")){
                switch (opcion){
                    case 1 ->{
                        List<Libro> libros = buscar();
                        for (Libro libro : libros) {
                            eliminar(libro.getId());
                        }
                    }
                    case 2 ->{
                        System.out.println("Ingrese el id:");
                        int i = sc.nextInt();
                        eliminar(i);
                    }
                    case 3 ->{
                        System.out.println("Ingrese el ISBN:");
                        Long l = sc.nextLong();
                        eliminar(l);
                    }
                    case 4 ->{
                        System.out.println("Ingrese el nombre:");
                        String nombre = sc.next();
                        eliminar(nombre);
                    }
                    case 5 ->{
                        System.out.println("Ingrese el año:");
                        int anio = sc.nextInt();
                        eliminar(anio);
                    }
                    case 6 ->{
                        System.out.println("Ingrese la condicion de alta:\n"
                                + "1. Alta.\n"
                                + "2. Baja.");
                        int i = sc.nextInt();
                        eliminar(i==1);
                    }
                    case 7 ->{
                        Autor autor = autorServicio.mostrarCrearAu();
                        eliminar(autor);
                    }
                    case 8 ->{
                        Editorial editorial = editorialServicio.mostrarCrearEd();
                        eliminar(editorial);
                    }
                }
            }
        } catch (Exception ex){
            sc.next();
            System.out.println("Opción invalida: "+ex.getMessage());
        }
    }
    
}
