
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.datos.EditorialDAO;
import libreria.entidades.Editorial;

public class EditorialServicio {
    
    private EditorialDAO editorialDAO = new EditorialDAO();
    private Scanner sc;

    public EditorialServicio(Scanner sc) {
        this.sc = sc;
    }
    
    public Editorial guardar(String nombre, Boolean alta) throws Exception{   
        Editorial editorial = new Editorial(nombre, alta);       
        try{
            editorialDAO.guardar(editorial);            
        } catch (Exception ex){
            throw ex;
        }
        return editorial;
    }
    
    public void actualizar(Editorial editorial) throws Exception{
        try{
            editorialDAO.actualizar(editorial);            
        } catch (Exception ex){
            throw ex;
        }
    }
    
    public void altaBaja(Editorial editorial) throws Exception{
        editorial.setAlta(!editorial.getAlta());
        actualizar(editorial);
    }
    
    public Editorial buscar(int id) throws Exception{
        return editorialDAO.buscarPorId(id);
    }
    
    public Editorial buscar(String nombre) throws Exception{
        return editorialDAO.buscarPorNombre(nombre);
    }
    
    public List<Editorial> buscar(){
        return editorialDAO.buscarTodos();
    }
    
    public List<Editorial> buscar(boolean alta){
        return editorialDAO.buscarPorAlta(alta);
    }
    
    public void eliminar(int id) throws Exception{
        try{
            editorialDAO.eliminarPorId(id);
        } catch (Exception ex){
            throw ex;
        }
    }
    
    public void eliminar(String nombre) throws Exception{
        try{
            editorialDAO.eliminarPorNombre(nombre);
        } catch (Exception ex){
            throw ex;
        }
    }
    
    public void eliminar(boolean alta) throws Exception{
        try{
            editorialDAO.eliminarPorAlta(alta);
        } catch (Exception ex){
            throw ex;
        }
    }
    
    public void mostrarEditoriales(List<Editorial> e){        
        for (Editorial obj : e) {
            System.out.println(obj.toString());
        }
    } 
    
    public Editorial mostrarCrearEd() throws Exception{
        List<Editorial> editoriales = buscar();
        mostrarEditoriales(editoriales);
        int opcion;
        System.out.println("Introduzca el id de la editorial:");
        try{
            opcion = sc.nextInt();
            Editorial editorial = buscar(opcion);
            System.out.println("Seleccionaste la editorial:\n"
                    + editorial.toString());
            return editorial;
        }catch(Exception ex){
            sc.next();
            throw new Exception("Opcion no valida!\n"+ex.getMessage());            
        }        
    }
    
    public void crearEditorial(){
        Editorial editorial;
        System.out.println("Ingrese el nombre de la editorial:");
        String nombre = sc.next();
        try {
            if(nombre.isBlank()){
                throw new Exception("Nombre no puede estar en blanco!");
            }
            editorial = guardar(nombre, true);
            editorial = buscar(editorial.getNombre());
            System.out.println("Nueva editorial registrada:\n"
                    + editorial.toString());
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void modificarEditorial() {
        List<Editorial> editoriales = buscar();
        mostrarEditoriales(editoriales);
        int opcion;
        System.out.println("Introduzca el id de la editorial:");
        try{
            opcion = sc.nextInt();
            Editorial editorial = buscar(opcion);
            System.out.println("Seleccionaste a la editorial:\n"
                    + editorial.toString());  
            System.out.println("Ingrese el nuevo nombre:");
            String nombre = sc.next();
            if(nombre.isBlank()){
                throw new Exception("El nombre es requerido.");
            }
            editorial.setNombre(nombre);
            actualizar(editorial);
        }catch(Exception ex){
            sc.next();
            System.out.println("Opcion no valida!\n"+ex.getMessage());            
        }  
    }
    
    public void darDeAlta(){
        List<Editorial> editoriales = buscar();
        mostrarEditoriales(editoriales);
        int opcion;
        System.out.println("Ingrese el id del libro a dar de alta:");
        try{
            opcion = sc.nextInt();
            Editorial editorial = buscar(opcion);
            System.out.println("Selecionaste: "+editorial.toString());
            System.out.println("Queres modificar su estado?\n"
                    + "1. Si\n"
                    + "2. No");
            opcion = sc.nextInt();
            if(opcion==1){
                altaBaja(editorial);
                actualizar(editorial);
            }
        } catch (Exception ex){
            sc.next();
            System.out.println("Opcioon invalida: "+ex.getMessage());
        }   
    }
    
    public void mostrar(){        
        int opcion;
        System.out.println("Que editoriales desea ver?\n"
                + "1. Lista completa.\n"
                + "2. Filtrada por id.\n"
                + "3. Filtrado por nombre.\n"
                + "4. Filtrado por condicion de alta.\n"                
                + "0. Volver.");
        try{
            opcion = sc.nextInt();
            switch (opcion){
                case 1 ->{mostrarEditoriales(buscar());}
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
                    mostrarEditoriales(buscar(i==1));
                }
            }            
        } catch (Exception ex){
            sc.next();
            System.out.println("Opción invalida: "+ex.getMessage());
        }    
    }
    
    public void eliminar(){        
        int opcion;
        System.out.println("\nQUE EDITORIAL DESEA ELIMINAR PERMANENTEMENTE?\n\n"                
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
                        List<Editorial> editoriales = buscar();
                        for (Editorial editorial : editoriales) {
                            eliminar(editorial.getId());
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
