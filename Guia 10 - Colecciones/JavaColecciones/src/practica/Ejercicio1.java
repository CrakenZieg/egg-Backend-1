
package practica;

import javacolecciones.EjercicioModelo;
import service.RazaService1;

public class Ejercicio1 implements EjercicioModelo{

    @Override
    public void ejercicio() {
        
        RazaService1 servicio = new RazaService1();
        servicio.menu();
        
    }
    
}
/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
*/