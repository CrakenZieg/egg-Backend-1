
package tienda.persistencia;

import java.util.ArrayList;
import java.util.List;
import tienda.entidades.Producto;

public final class ProductoDAO extends DAO{
        
    public void guardar(Producto producto) throws Exception{
        try {
            if(producto==null){
                throw new Exception("Producto nulo");
            }            
            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante)"
                    + " VALUES ("+producto.getCodigo()+", '"+producto.getNombre()+"', "
                    + producto.getPrecio()+", "+producto.getCodigoFabricante()+" );";
            insertUpdateDelete(sql);            
        } catch (Exception ex) {
            throw ex;
        }        
    }

    public void modificar(Producto producto) throws Exception{        
        try {
            if(producto==null){
                throw new Exception("Producto nulo");
            }            
            String sql = "UPDATE producto SET nombre='"+producto.getNombre()+"', "
                    + " precio=" +producto.getPrecio()+", codigo_fabricante="+producto.getCodigoFabricante()
                    + " WHERE codigo="+producto.getCodigo()+";";
            insertUpdateDelete(sql);            
        } catch (Exception ex) {
            throw ex;
        }        
    }
    
    /**
     *Elimina productos: 
     * @param producto producto con datos a usar de parametros;
     * @param i parametro para establecer la relacion con el precio:
     * -2 -> menor que, 
     * -1 -> menor o igual, 
     *  0 -> igual, 
     *  1 -> mayor o igual,
     *  2 -> mayor;
    */
    public void eliminar(Producto producto, int i) throws Exception{
        boolean bandera = false;
        String sql = "DELETE FROM producto WHERE ";
        if(producto.getCodigo()>0){
            sql = sql.concat("codigo="+producto.getCodigo()+" ");
            bandera = true;
        }
        if(producto.getCodigoFabricante()>0){
            sql = sql.concat(((bandera)?"AND ":"")+
                    "codigo_fabricante="+producto.getCodigoFabricante()+" ");
            bandera = true;
        }
        if(producto.getNombre()!=null){
            sql = sql.concat(((bandera)?"AND ":"")+
                    "nombre LIKE '%"+producto.getNombre()+"%' ");
            bandera = true;
        }
        if(producto.getPrecio()>0){
            if(i!=(-2)&&i!=(-1)&&i!=0&&i!=(1)&&i!=(2)){
                throw new Exception("Parametro de evaluacion invalido\n" + "1 -> '<'\n"
                    + "2 -> '<='\n" + "3 -> '='\n" + "1 -> '>='\n" + "2 -> '>'");            
            }
            String mod="";
            switch (i){
                case (-2)->{mod="<";}
                case (-1)->{mod="<=";}
                case ( 0)->{mod="=";}
                case ( 1)->{mod=">=";}
                case ( 2)->{mod=">";}
            }
            sql = sql.concat(((bandera)?"AND ":"")+
                    "precio"+mod+producto.getPrecio());
            bandera=true;
        }
        sql = sql.concat(";");
        try {
            if(producto==null){
                throw new Exception("Producto nulo");
            }                        
            insertUpdateDelete(sql);            
        } catch (Exception ex) {
            throw ex;
        }    
    }
    
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
    public List<Producto> buscar(Producto producto, int i) throws Exception{
        List<Producto> productos = new ArrayList<>();        
        boolean bandera = false;
        String sql = "SELECT * FROM producto WHERE ";
        if(producto.getCodigo()>0){
            sql = sql.concat("codigo="+producto.getCodigo()+" ");
            bandera = true;
        }
        if(producto.getCodigoFabricante()>0){
            sql = sql.concat(((bandera)?"AND ":"")+
                    "codigo_fabricante="+producto.getCodigoFabricante()+" ");
            bandera = true;
        }
        if(producto.getNombre()!=null){
            sql = sql.concat(((bandera)?"AND ":"")+
                    "nombre LIKE '%"+producto.getNombre()+"%' ");
            bandera = true;
        }
        if(producto.getPrecio()>0){
            if(i!=(-2)&&i!=(-1)&&i!=0&&i!=(1)&&i!=(2)){
                throw new Exception("Parametro de evaluacion invalido\n" + "1 -> '<'\n"
                    + "2 -> '<='\n" + "3 -> '='\n" + "1 -> '>='\n" + "2 -> '>'");            
            }
            String mod="";
            switch (i){
                case (-2)->{mod="<";}
                case (-1)->{mod="<=";}
                case ( 0)->{mod="=";}
                case ( 1)->{mod=">=";}
                case ( 2)->{mod=">";}
            }
            sql = sql.concat(((bandera)?"AND ":"")+
                    "precio"+mod+producto.getPrecio());
            bandera=true;
        }
        sql = sql.concat(";");
        if (!bandera) {
            throw new Exception("Hay que ingresar parametros de busqueda!");
        }
        try{
            consulta(sql);
            while(resultSet.next()){
                Producto prod = new Producto();
                prod.setCodigo(resultSet.getInt("codigo"));
                prod.setNombre(resultSet.getString("nombre"));
                prod.setPrecio(resultSet.getDouble("precio"));
                prod.setCodigoFabricante(resultSet.getInt("codigo_fabricante"));
                
                productos.add(prod);
            }
        } catch(Exception ex){
            throw ex;
        } finally {
            cerrar();
        }
        return productos;
    }
    
    public Producto buscarPorCodigo(int id) throws Exception{    
        Producto producto = new Producto();
        try {
            if(id<=0){
                throw new Exception("Codigo invalido");
            }            
            String sql = "SELECT * FROM producto WHERE codigo="+id+";";
            consulta(sql);
            while(resultSet.next()){
                producto.setCodigo(resultSet.getInt("codigo"));
                producto.setNombre(resultSet.getString("nombre"));
                producto.setPrecio(resultSet.getDouble("precio"));
                producto.setCodigoFabricante(resultSet.getInt("codigo_fabricante"));
            }
        } catch (Exception ex) {
            cerrar();
            throw ex;
        }finally{
            cerrar();
        }
        return producto;
    }
    
    public Producto buscarPorNombre(String nombre) throws Exception{    
        Producto producto = new Producto();
        try {
            if(nombre.isBlank()){
                throw new Exception("Nombre invalido");
            }            
            String sql = "SELECT * FROM producto WHERE nombre='"+nombre+"';";
            consulta(sql);
            while(resultSet.next()){
                producto.setCodigo(resultSet.getInt("codigo"));
                producto.setNombre(resultSet.getString("nombre"));
                producto.setPrecio(resultSet.getDouble("precio"));
                producto.setCodigoFabricante(resultSet.getInt("codigo_fabricante"));
            }
        } catch (Exception ex) {
            cerrar();
            throw ex;
        }finally{
            cerrar();
        }
        return producto;
    }
    
    /**
     *Retorna una lista de productos en funcion del precio: 
     * @param precio precio a evaluar;
     * @param i parametro para establecer la relacion con el precio:
     * -2 -> menor que, 
     * -1 -> menor o igual, 
     *  0 -> igual, 
     *  1 -> mayor o igual,
     *  2 -> mayor;
    */
    public List<Producto> buscarPorPrecio(double precio, int i) throws Exception{
        List<Producto> productos= new ArrayList<>();
        if(i!=(-2)&&i!=(-1)&&i!=0&&i!=(1)&&i!=(2)){
            throw new Exception("Parametro de evaluacion invalido\n"
                    + "1 -> '<'\n"
                    + "2 -> '<='\n"
                    + "3 -> '='\n"
                    + "1 -> '>='\n"
                    + "2 -> '>'");
        }
        String mod="";
        switch (i){
            case (-2)->{mod="<";}
            case (-1)->{mod="<=";}
            case ( 0)->{mod="=";}
            case ( 1)->{mod=">=";}
            case ( 2)->{mod=">";}
        }
        try {
            Producto producto;
            if(precio<=0){
                throw new Exception("Precio invalido");
            }            
            String sql = "SELECT * FROM producto WHERE precio"+mod+precio+";";
            consulta(sql);
            while(resultSet.next()){
                producto = new Producto();
                producto.setCodigo(resultSet.getInt("codigo"));
                producto.setNombre(resultSet.getString("nombre"));
                producto.setPrecio(resultSet.getDouble("precio"));
                producto.setCodigoFabricante(resultSet.getInt("codigo_fabricante"));
                productos.add(producto);
            }
        } catch (Exception ex) {
            cerrar();
            throw ex;
        }finally{
            cerrar();
        }
        return productos;
    }
    
    public List<Producto> buscarPorCodigoFabricante(int codigoFabricante) throws Exception{
        List<Producto> productos= new ArrayList<>();
        try {
            Producto producto;
            if(codigoFabricante<=0){
                throw new Exception("Codigo de fabricante invalido");
            }            
            String sql = "SELECT * FROM producto WHERE codigo_fabricante="+codigoFabricante+";";
            consulta(sql);
            while(resultSet.next()){
                producto = new Producto();
                producto.setCodigo(resultSet.getInt("codigo"));
                producto.setNombre(resultSet.getString("nombre"));
                producto.setPrecio(resultSet.getDouble("precio"));
                producto.setCodigoFabricante(resultSet.getInt("codigo_fabricante"));
                productos.add(producto);
            }
        } catch (Exception ex) {
            cerrar();
            throw ex;
        }finally{
            cerrar();
        }
        return productos;
    }    
    
    
    public void eliminarPorCodigo(Producto producto) throws Exception{        
        try {
            if(producto==null){
                throw new Exception("Producto nulo");
            }            
            String sql = "DELETE FROM producto WHERE codigo="+producto.getCodigo()+";";
            insertUpdateDelete(sql);            
        } catch (Exception ex) {
            throw ex;
        }        
    }
    
    public void eliminarPorNombre(Producto producto) throws Exception{        
        try {
            if(producto==null){
                throw new Exception("Producto nulo");
            }            
            String sql = "DELETE FROM producto WHERE nombre='"+producto.getNombre()+"';";
            insertUpdateDelete(sql);            
        } catch (Exception ex) {
            throw ex;
        }        
    }
    
    public void eliminarPorCodigoFabricante(Producto producto) throws Exception{        
        try {
            if(producto==null){
                throw new Exception("Producto nulo");
            }            
            String sql = "DELETE FROM producto WHERE codigo_fabricante="+producto.getCodigoFabricante()+";";
            insertUpdateDelete(sql);            
        } catch (Exception ex) {
            throw ex;
        }        
    }
    
}

