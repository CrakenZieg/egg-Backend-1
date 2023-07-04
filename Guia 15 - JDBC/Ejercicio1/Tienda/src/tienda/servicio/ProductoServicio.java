
package tienda.servicio;

import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

public class ProductoServicio {
    
    private ProductoDAO dao = new ProductoDAO();
    
    /**
     *Retorna una lista de productos: 
     * @param producto producto con datos a recabar;
     * @param i parametro para establecer la relacion con el precio:
     * -2 -> menor que, 
     * -1 -> menor o igual, 
     *  0 -> igual, 
     *  1 -> mayor o igual,
     *  2 -> mayor;
    */
    public void buscar(Producto producto, int mod){ 
        if(producto==null){
            System.out.println("Producto nulo");
        }
        try {
            dao.buscar(producto, mod);
        } catch (Exception ex) {
            System.out.println("Excepcion: "+ex.getMessage());
        }        
    }
    
    public void persistir(Producto producto){  
        if(producto==null){
            System.out.println("Producto nulo");
        }
        try {
            dao.guardar(producto);
        } catch (Exception ex) {
            System.out.println("Excepcion: "+ex.getMessage());
        }        
    }
    
    public void modificar(Producto producto){
        if(producto==null){
            System.out.println("Producto nulo");
        }
        try {
            dao.modificar(producto);
        } catch (Exception ex) {
            System.out.println("Excepcion: "+ex.getMessage());
        }        
    }
    
    /**
     * Eliminar el producto/s en funcion de: 
     * @param producto producto a eliminar;
     * @param i parametro para eliminar:
     *  1 -> por codigo;
     *  2 -> por nombre;
     *  3 -> por fabricante;
    */
    public void eliminar(Producto producto, int mod){ 
        if(producto==null){
            System.out.println("Producto nulo");
        }
        try {
            dao.eliminar(producto, mod);
        } catch (Exception ex) {
            System.out.println("Excepcion: "+ex.getMessage());
        }        
    }
    
    /**
     * Eliminar el producto/s en funcion de: 
     * @param producto producto a eliminar;
     * @param i parametro para eliminar:
     *  1 -> por codigo;
     *  2 -> por nombre;
     *  3 -> por fabricante;
    */
    public void eliminarD(Producto producto, int i){   
        if(i!=1&&i!=2&&i!=3){
            System.out.println("Parametro de eliminacion invalido:\n"
                    + "1 -> por codigo\n"
                    + "2 -> por nombre\n"
                    + "3 -> por fabricante");
            return;
        }
        if(producto==null){
            System.out.println("Producto nulo");
        }
        try {
            switch (i){
                case 1 ->{dao.eliminarPorCodigo(producto);}
                case 2 ->{dao.eliminarPorNombre(producto);}
                case 3 ->{dao.eliminarPorCodigoFabricante(producto);}
            }            
        } catch (Exception ex) {
            System.out.println("Excepcion: "+ex.getMessage());
        }        
    }
    
    public void buscarNombre(Producto producto){ 
        if(producto==null){
            System.out.println("Producto nulo");
        }
        try {
            dao.buscarPorNombre(producto.getNombre());
        } catch (Exception ex) {
            System.out.println("Excepcion: "+ex.getMessage());
        }        
    }
    
    public void buscarCodigoFabricante(Producto producto){ 
        if(producto==null){
            System.out.println("Producto nulo");
        }
        try {
            dao.buscarPorCodigoFabricante(producto.getCodigoFabricante());
        } catch (Exception ex) {
            System.out.println("Excepcion: "+ex.getMessage());
        }        
    }
    
    public void buscarCodigo(Producto producto){ 
        if(producto==null){
            System.out.println("Producto nulo");
        }
        try {
            dao.buscarPorCodigo(producto.getCodigo());
        } catch (Exception ex) {
            System.out.println("Excepcion: "+ex.getMessage());
        }        
    }  
    
}
