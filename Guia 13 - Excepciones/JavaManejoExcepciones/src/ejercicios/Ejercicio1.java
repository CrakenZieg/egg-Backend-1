
package ejercicios;

import ejercicio1.Persona;
import javamanejoexcepciones.EjercicioModelo;

public class Ejercicio1 implements EjercicioModelo{

    @Override
    public void ejercicio() throws Exception{
        
        Persona persona = new Persona(); 
        System.out.println("Creando persona de edad '0'");
        try {            
            persona.esMayor();        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Haciendo null a la persona!");
        persona = null;
        
        try {
            persona.esMayor();
        } catch (Exception e) {
            System.out.println(e.getMessage()+" null pointer exception!");
        }
                
    }
    
}
/*
Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
*/
