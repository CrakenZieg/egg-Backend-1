
package teoria;

import domain.DNI;
import domain.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javarelaciones.EjercicioModelo;

public class Teoria1 implements EjercicioModelo{

    @Override
    public void ejercicio() {
        
        List<Persona> personas = new ArrayList<>();
        System.out.println("Ingrese un numero:");
        cargarPersonas(personas, sc.nextInt());
        mostrar(personas);
    }

    public void cargarPersonas(List<Persona> personas, int n){
        Random rand = new Random();
        String[] abecedario= {"A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        for(int j=0; j<n; j++){
            int largo = rand.nextInt(1,15);
            String nombre= "";
            for(int i=0; i<largo; i++){ 
                nombre = nombre.concat(abecedario[rand.nextInt(abecedario.length)]);
            }
            largo = rand.nextInt(1,15);
            String apellido= "";
            for(int i=0; i<largo; i++){ 
                apellido = apellido.concat(abecedario[rand.nextInt(abecedario.length)]);
            }
            largo = rand.nextInt(7,8);
            String aux= "";
            for(int i=0; i<largo; i++){ 
                aux = aux.concat(Integer.toString(rand.nextInt(1,9)));
            }
            int dniNum = Integer.valueOf(aux);
            DNI dni = new DNI(abecedario[rand.nextInt(abecedario.length)],dniNum);
            Persona persona = new Persona(nombre, apellido, dni);
            personas.add(persona);
            System.out.println((j+1)+": "+persona.toString());
        }
    }
    
    public void mostrar(List<Persona> personas){
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }
}
