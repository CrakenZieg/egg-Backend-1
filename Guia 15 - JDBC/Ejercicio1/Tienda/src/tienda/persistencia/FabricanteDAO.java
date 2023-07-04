
package tienda.persistencia;

import tienda.entidades.Fabricante;

public final class FabricanteDAO extends DAO{
    
    public Fabricante buscarPorCodigo(int id) throws Exception{    
        Fabricante fabricante = new Fabricante();
        try {
            if(id<=0){
                throw new Exception("Codigo invalido");
            }            
            String sql = "SELECT * FROM fabricante WHERE codigo="+id+";";
            consulta(sql);
            while(resultSet.next()){
                fabricante.setCodigo(resultSet.getInt("codigo"));
                fabricante.setNombre(resultSet.getString("nombre"));
            }
        } catch (Exception ex) {
            cerrar();
            throw ex;
        }finally{
            cerrar();
        }
        return fabricante;
    }
    
    public Fabricante buscarPorNombre(String nombre) throws Exception{    
        Fabricante fabricante = new Fabricante();
        try {
            if(nombre.isBlank()){
                throw new Exception("Nombre invalido");
            }            
            String sql = "SELECT * FROM fabricante WHERE nombre='"+nombre+"';";
            consulta(sql);
            while(resultSet.next()){
                fabricante.setCodigo(resultSet.getInt("codigo"));
                fabricante.setNombre(resultSet.getString("nombre"));
            }
        } catch (Exception ex) {
            cerrar();
            throw ex;
        }finally{
            cerrar();
        }
        return fabricante;
    }
    
    public void guardar(Fabricante fabricante) throws Exception{        
        try {
            if(fabricante==null){
                throw new Exception("Fabricante nulo");
            }            
            String sql = "INSERT INTO fabricante (codigo, nombre)"
                    + " VALUES ("+fabricante.getCodigo()+", '"+fabricante.getNombre()+"');";
            insertUpdateDelete(sql);            
        } catch (Exception ex) {
            throw ex;
        }        
    }
    
    public void modificar(Fabricante fabricante) throws Exception{        
        try {
            if(fabricante==null){
                throw new Exception("Fabricante nulo");
            }            
            String sql = "UPDATE fabricante SET nombre='"+fabricante.getNombre()+"'"
                    + " WHERE codigo="+fabricante.getCodigo()+";";
            insertUpdateDelete(sql);            
        } catch (Exception ex) {
            throw ex;
        }        
    }
    
    public void eliminarPorCodigo(Fabricante fabricante) throws Exception{        
        try {
            if(fabricante==null){
                throw new Exception("Fabricante nulo");
            }            
            String sql = "DELETE FROM fabricante WHERE codigo="+fabricante.getCodigo()+";";
            insertUpdateDelete(sql);            
        } catch (Exception ex) {
            throw ex;
        }        
    }
    
    public void eliminarPorNombre(Fabricante fabricante) throws Exception{        
        try {
            if(fabricante==null){
                throw new Exception("Fabricante nulo");
            }            
            String sql = "DELETE FROM fabricante WHERE nombre='"+fabricante.getNombre()+"';";
            insertUpdateDelete(sql);            
        } catch (Exception ex) {
            throw ex;
        }        
    }
    
}
