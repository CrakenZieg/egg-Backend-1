
package teoria;

import java.util.Random;
import javapoo.EjercicioModelo;
import entidades.Persona;

public class EjercicioPersona implements EjercicioModelo {
    
    @Override
    public void ejercicio(){
        
        Random rand = new Random();
        Persona persona1 = new Persona(123456789, 99, "Carlos");
        Persona persona2 = new Persona();
        System.out.println("------------------------");
        System.out.println("persona1: "+persona1.toString());
        System.out.println("------------------------");
        System.out.println("persona2: "+persona2.toString());
        System.out.println("------------------------");
        System.out.println("Ingresando datos de persona2...");
        System.out.println("------------------------");
        persona2.setDNI(rand.nextInt(99999999));
        persona2.setEdad(rand.nextInt(99));
        persona2.setNombre("Aleatorio Funalito");
        
        System.out.println("persona2: "+persona2.toString());
        System.out.println("------------------------");
    }
}
