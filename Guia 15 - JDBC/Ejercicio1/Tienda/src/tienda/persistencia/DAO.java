
package tienda.persistencia;

import java.sql.*;

public abstract class DAO {
 
    protected Connection conexion = null;
    protected ResultSet resultSet = null;
    protected Statement sentencia = null;
    
    protected final String USER = "root";
    protected final String PASSWORD = "admin";
    protected final String DATABASE = "tienda";
    protected final String DRIVER = "com.mysql.jdbc.Driver";
    protected final String URL = "jdbc:mysql://localhost:3306/"+DATABASE+"?useSSL=false";
    
    protected void conectarDDBB() throws ClassNotFoundException, SQLException{    
        try {
            conexion = DriverManager.getConnection(URL,USER,PASSWORD);            
        } catch (SQLException ex) {
            throw ex;
        }     
    }
    
    protected void cerrar() throws Exception{    
        try {
            if(resultSet!=null){
                resultSet.close();
            }
            if(sentencia!=null){
                sentencia.close();
            }
            if(conexion!=null){
                conexion.close();
            }
        } catch (Exception ex) {
            throw ex;
        }        
    }
    
    protected void insertUpdateDelete(String sql) throws SQLException, ClassNotFoundException, Exception{   
        try {
            conectarDDBB();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException | ClassNotFoundException ex) {
            conexion.rollback();
            throw ex;
        } finally {
            cerrar();
        }        
    }
    
    protected void consulta(String sql) throws SQLException, ClassNotFoundException, Exception{   
        try {
            conectarDDBB();
            sentencia = conexion.createStatement();
            resultSet = sentencia.executeQuery(sql);
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }      
    }
    
/*
Me gustaria implementar DAO utilizando tipos genericos para poder    
    protected T getObjById(int i, Class<T> tclass){
        T t = tclass.newInstance();
        String frase = "SELECT * FROM "+T.get .toLowerCase()+" WHERE id="+i;
        
        try {
            conectarDDBB();
            sentencia=conexion.createStatement();
            resultSet=sentencia.executeQuery(frase);
        } catch (Exception e) {
        }
    }
*/
}
