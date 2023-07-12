
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.datos.*;
import libreria.entidades.Autor;

public class AutorServicio {
    
    private AutorDAO autorDAO = new AutorDAO();
    private Scanner sc;

    public AutorServicio(Scanner sc) {
        this.sc = sc;
    }
    public Autor guardar(String nombre, Boolean alta) throws Exception{   
        Autor autor = new Autor(nombre, alta);;       
        try{
            autorDAO.guardar(autor);            
        } catch (Exception ex){
            throw ex;
        }
        return autor;
    }
    
    public void actualizar(Autor autor) throws Exception{
        try{
            autorDAO.actualizar(autor);            
        } catch (Exception ex){
            throw ex;
        }
    }
    
    public void altaBaja(Autor autor) throws Exception{
        autor.setAlta(!autor.getAlta());
        actualizar(autor);
    }
    
    public Autor buscar(int id) throws Exception{
        return autorDAO.buscarPorId(id);
    }
    
    public Autor buscar(String nombre) throws Exception{
        return autorDAO.buscarPorNombre(nombre);
    }
    
    public List<Autor> buscar(){
        return autorDAO.buscarTodos();
    }
    
    public List<Autor> buscar(boolean alta){
        return autorDAO.buscarPorAlta(alta);
    }
    
    public int recuento(){
        return autorDAO.getAutorCount();
    }
    
    public void eliminar(int id) throws Exception{
        try{
            autorDAO.eliminarPorId(id);
        } catch (Exception ex){
            throw ex;
        }
    }
    
    public void eliminar(String nombre) throws Exception{
        try{
            autorDAO.eliminarPorNombre(nombre);
        } catch (Exception ex){
            throw ex;
        }
    }
    
    public void eliminar(boolean alta) throws Exception{
        try{
            autorDAO.eliminarPorAlta(alta);
        } catch (Exception ex){
            throw ex;
        }
    }
    
    public void mostrarAutores(List<Autor> a){        
        for (Autor obj : a) {
            System.out.println(obj.toString());
        }
    } 
    
    public Autor mostrarCrearAu() throws Exception{
        List<Autor> autores = buscar();
        mostrarAutores(autores);
        int opcion;
        System.out.println("Introduzca el id del autor:");
        try{
            opcion = sc.nextInt();
            Autor autor = buscar(opcion);
            System.out.println("Seleccionaste al autor:\n"
                    + autor.toString());
            return autor;
        }catch(Exception ex){
            sc.next();
            throw new Exception("Opcion no valida!\n"+ex.getMessage());
        }        
    }
    
    public void crearAutor(){
        Autor autor;
        System.out.println("Ingrese el nombre del autor:");
        String nombre = sc.next();        
        try {
            if(nombre.isBlank()){
                throw new Exception("Nombre no puede estar en blanco!");
            }
            autor = guardar(nombre, true);
            autor = buscar(autor.getNombre());
            System.out.println("Nuevo autor registrado:\n"
                    + autor.toString());
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void modificarAutor() {
        List<Autor> autores = buscar();
        mostrarAutores(autores);
        int opcion;
        System.out.println("Introduzca el id del autor:");
        try{
            opcion = sc.nextInt();
            Autor autor = buscar(opcion);
            System.out.println("Seleccionaste al autor:\n"
                    + autor.toString());  
            System.out.println("Ingrese el nuevo nombre:");
            String nombre = sc.next();
            if(nombre.isBlank()){
                throw new Exception("El nombre es requerido.");
            }
            autor.setNombre(nombre);
            actualizar(autor);
        }catch(Exception ex){
            sc.next();
            System.out.println("Opcion no valida!\n"+ex.getMessage());            
        }  
    }
    
    public void darDeAlta(){
        List<Autor> libros = buscar();
        mostrarAutores(libros);
        int opcion;
        System.out.println("Ingrese el id del libro a dar de alta:");
        try{
            opcion = sc.nextInt();
            Autor autor = buscar(opcion);
            System.out.println("Selecionaste: "+autor.toString());
            System.out.println("Queres modificar su estado?\n"
                    + "1. Si\n"
                    + "2. No");
            opcion = sc.nextInt();
            if(opcion==1){
                altaBaja(autor);
                actualizar(autor);
            }
        } catch (Exception ex){
            sc.next();
            System.out.println("Opcioon invalida: "+ex.getMessage());
        }   
    }
    public void mostrar(){
        int opcion;
        System.out.println("Que autores desea ver?\n"
                + "1. Lista completa.\n"
                + "2. Filtrada por id.\n"
                + "3. Filtrado por nombre.\n"
                + "4. Filtrado por condicion de alta.\n"                
                + "0. Volver.");
        try{
            opcion = sc.nextInt();
            switch (opcion){
                case 1 ->{mostrarAutores(buscar());}
                case 2 ->{
                    System.out.println("Ingrese el id:");
                    int i = sc.nextInt();
                    System.out.println("Resultado: \n"+buscar(i).toString());
                }                
                case 3 ->{
                    System.out.println("Ingrese el nombre:");
                    String nombre = sc.next();
                    System.out.println("Resultado: \n"+buscar(nombre).toString());
                }    
                case 4 ->{
                    System.out.println("Ingrese la condicion de alta:\n"
                            + "1. Alta.\n"
                            + "2. Baja.");
                    int i = sc.nextInt();
                    mostrarAutores(buscar(i==1));
                }
            }            
        } catch (Exception ex){
            sc.next();
            System.out.println("Opción invalida: "+ex.getMessage());
        }    
    }
    
    public void eliminar(){        
        int opcion;
        System.out.println("\nQUE AUTOR DESEA ELIMINAR PERMANENTEMENTE?\n\n"                
                + "1. ELIMINAR LISTA COMPLETA.\n"
                + "2. ELIMINAR POR ID.\n"
                + "3. ELIMINAR POR NOMBRE.\n"
                + "4. ELIMINAR POR CONDICION DE ALTA.\n"
                + "0. Volver.");
        try{
            opcion = sc.nextInt();
            System.out.println("\nESTA SEGURO QUE DESEA CONTINUAR? (S/N)");
            String f = sc.next().toLowerCase();
            if(f.equals("s")){
                switch (opcion){
                    case 1 ->{
                        List<Autor> autores = buscar();
                        for (Autor autor : autores) {
                            eliminar(autor.getId());
                        }
                    }
                    case 2 ->{
                        System.out.println("Ingrese el id:");
                        int i = sc.nextInt();
                        eliminar(i);
                    }
                    case 4 ->{
                        System.out.println("Ingrese el nombre:");
                        String nombre = sc.next();
                        eliminar(nombre);
                    }
                    case 6 ->{
                        System.out.println("Ingrese la condicion de alta:\n"
                                + "1. Alta.\n"
                                + "2. Baja.");
                        int i = sc.nextInt();
                        eliminar(i==1);
                    }                    
                }
            }
        } catch (Exception ex){
            sc.next();
            System.out.println("Opción invalida: "+ex.getMessage());
        }
    }
}
