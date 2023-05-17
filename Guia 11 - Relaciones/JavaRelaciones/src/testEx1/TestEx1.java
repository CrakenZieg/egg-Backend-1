
package testEx1;

import domain.PerroEx1;
import domain.PersonaEx1;
import java.util.ArrayList;
import java.util.List;
import servicio.AdopcionEx1Servicio;


public class TestEx1 {
 
    public static void main(String[] args) {
        
        List<PersonaEx1> personas = new ArrayList<>();
        List<PerroEx1> perros = new ArrayList<>();
        AdopcionEx1Servicio servicio = new AdopcionEx1Servicio();
        servicio.cargarListasAuto(personas, perros, 4);
        servicio.asignarAuto(personas, perros);
        servicio.mostrarListas(personas, perros, "listas:");
    }
    
}
