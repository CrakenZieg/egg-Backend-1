/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
empleado en función de su edad y salario actual. El aumento salarial debe ser del 
10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
*/

package extra;

import entidades.*;
import javapoo.*;

public class ExtraEjercicio6 implements EjercicioModelo{
    
    @Override
    public void ejercicio(){
        
        Empleado empleado1 = new Empleado("Carlos", 90, 7800);
        System.out.println(empleado1.toString());
        Empleado empleado2 = new Empleado("Carlitos", 23, 150);
        System.out.println(empleado2.toString());
        
    }
}
