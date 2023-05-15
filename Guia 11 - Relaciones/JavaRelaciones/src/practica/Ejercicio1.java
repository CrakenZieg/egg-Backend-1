
package practica;

import domain.Perro;
import domain.PersonaEj1;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javarelaciones.EjercicioModelo;

public class Ejercicio1 implements EjercicioModelo{

    @Override
    public void ejercicio() {
        
        List<PersonaEj1> personas = new ArrayList<>();
        cargarPersonas(personas, 5);
        
    }
    
    public void cargarPersonas(List<PersonaEj1> personas, int n){
        Random rand = new Random();
        String[] abecedario= {"A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] tamano = {"chico","mediano","grande"};
        String[] raza = {"salchicha", "boludo", "caniche","chihuahua", "callejero", "perro"};
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
            int edad = rand.nextInt(0,99);
            String aux= "";
            for(int i=0; i<largo; i++){ 
                aux = aux.concat(Integer.toString(rand.nextInt(0,9)));
            }
            int dniNum = Integer.valueOf(aux);
            largo = rand.nextInt(1,15);
            String nombreP= "";
            for(int i=0; i<largo; i++){ 
                nombreP = nombreP.concat(abecedario[rand.nextInt(abecedario.length)]);
            }
            Perro perro = new Perro(nombreP, raza[rand.nextInt(0, raza.length-1)],tamano[rand.nextInt(0, tamano.length-1)],rand.nextInt(0, 18));
            PersonaEj1 persona = new PersonaEj1(nombre, apellido, edad, dniNum, perro);
            personas.add(persona);
            System.out.println((j+1)+": "+persona.toString());
        }
    }
    
    public void mostrar(List<PersonaEj1> personas){
        for (PersonaEj1 persona : personas) {
            System.out.println(persona.toString());
        }
    }
    
}
/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
*/