
package tienda.servicio;

import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class FabricanteServicio {
    
    private FabricanteDAO dao = new FabricanteDAO();
    
    public void persistir(Fabricante fabricante){    
        try {
            dao.guardar(fabricante);
        } catch (Exception ex) {
            System.out.println("Excepcion: "+ex.getMessage());
        }        
    }
    
    public void modificar(Fabricante fabricante){    
        try {
            dao.modificar(fabricante);
        } catch (Exception ex) {
            System.out.println("Excepcion: "+ex.getMessage());
        }        
    }
    
    /**
     * Eliminar el fabricante/s en funcion de: 
     * @param fabricante fabricante a eliminar;
     * @param i parametro para eliminar:
     *  1 -> por codigo;
     *  2 -> por nombre;
    */
    public void eliminar(Fabricante fabricante, int i){   
        if(i!=1&&i!=2){
            System.out.println("Parametro de eliminacion invalido:\n"
                    + "1 -> por codigo\n"
                    + "2 -> por nombre");
            return;
        }        
        try {
            switch (i){
                case 1 ->{dao.eliminarPorCodigo(fabricante);}
                case 2 ->{dao.eliminarPorNombre(fabricante);}
            }            
        } catch (Exception ex) {
            System.out.println("Excepcion: "+ex.getMessage());
        }        
    }
    
    public Fabricante buscar(Fabricante fabricante){
        Fabricante fab = null;
        try {
            if(fabricante.getCodigo()>0){
                fab = dao.buscarPorCodigo(fabricante.getCodigo());
            } else if (fabricante.getNombre()!=null){
                fab = dao.buscarPorNombre(fabricante.getNombre());
            } else {
                throw new Exception("Fabricante no encontrado");
            }            
        } catch (Exception ex) {
            System.out.println("Excepcion: "+ex.getMessage());
        }   
        return fab;
    }
}
