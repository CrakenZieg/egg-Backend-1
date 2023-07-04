
package tienda;

import java.util.ArrayList;
import tienda.entidades.*;
import tienda.servicio.*;

public class Menu {
    
    Fabricante fabricante;
    Producto producto;
    FabricanteServicio fabServicio = new FabricanteServicio();
    ProductoServicio prodServicio = new ProductoServicio();
    
    public void menu(){    
        System.out.println("Que accion desea realizar?\n"
                + "1. Mostrar productos."
                + "2. Mostrar fabricantes."
                + "3. Agregar productos."
                + "4. Agregar fabricantes."
                + "5. Modificar producto."
                + "6. Modificar fabricante."                
                + "7. Eliminar productos."
                + "8. Eliminar fabricantes."
                + "9. Mostrar productos filtrados."
                + "10. Mostrar fabricantes filtrados.");
    
    }
    
    public void mostrar(ArrayList<Object> array, String tipo){
        System.out.println("Mostrando: "+tipo);
        for (Object object : array) {
            System.out.println(object.toString());
        }
    }
    
}
