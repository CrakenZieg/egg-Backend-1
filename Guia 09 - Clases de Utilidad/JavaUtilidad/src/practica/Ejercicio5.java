
package practica;

import entities.Persona;
import javaservicios.EjercicioModelo;
import service.PersonaService;

public class Ejercicio5 implements EjercicioModelo {

    @Override
    public void ejercicio() {
        
        Persona persona;
        PersonaService personaService = new PersonaService();
        
        persona = personaService.crearPersona();
        personaService.calcularEdad(persona);
        personaService.mostrarPersona(persona);
        System.out.println(persona.getNombre()+" es menor que alguien de 99 años? "+personaService.menorQue(persona, 99));
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