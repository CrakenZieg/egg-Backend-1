
package service;

import entities.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    FechaService fechaService = new FechaService();
    
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.next();
        Date nacimiento = fechaService.fechaNacimiento();
        return new Persona(nombre, nacimiento);
    }
    
    public int calcularEdad(Persona persona){
        return fechaService.diferencia(persona.getFechaNacimiento(), new Date());
    }
    
    public boolean menorQue(Persona persona, int edad){
        return calcularEdad(persona)<edad;
    }
    
    public void mostrarPersona(Persona persona){
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Fecha de nacimiento: "+persona.getFechaNacimiento().getDate()+"/"
        +persona.getFechaNacimiento().getMonth()+"/"+(persona.getFechaNacimiento().getYear()+1900));
    }
    
}
/*
Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre 
y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, 
get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes 
métodos:
-Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona 
a crear. Retornar el objeto Persona creado.
-Método calcularEdad que calcule la edad del usuario utilizando el atributo de 
fecha de nacimiento y la fecha actual.
-Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la 
persona es menor que la edad consultada o false en caso contrario.
-Método mostrarPersona que muestra la información de la persona deseada.
*/