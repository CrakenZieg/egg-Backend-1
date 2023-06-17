
package ejercicios;

import ejercicio1.Persona;
import java.util.ArrayList;
import javamanejoexcepciones.EjercicioModelo;

public class Ejercicio2 implements EjercicioModelo{

    @Override
    public void ejercicio() throws Exception {
        System.out.println("Creado el array!");
        ArrayList<Persona> personas = new ArrayList<>();
        System.out.println("Llenando con 4 personas");
        for (int i = 0; i < 4; i++) {
            Persona persona = new Persona(); 
            persona.setEdad(i+20);
            System.out.println(persona+" edad: "+persona.getEdad());
            personas.add(persona);            
        }
        System.out.println("Mostrando 5 personas");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Persona "+(i+1)+":");
                System.out.println(personas.get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.fillInStackTrace()+" IndexOutOfBoundsException!");
        }
        
        
    }
    
}
/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
*/
