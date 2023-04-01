/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" 
que calcule y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" 
de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
*/

package extra;

import entidades.*;
import javapoo.*;

public class ExtraEjercicio7 implements EjercicioModelo{
    
    @Override
    public void ejercicio(){
        
        System.out.println("Creando un rectangulo de lado1=4 y lado2=6");
        RectanguloE rectangulo1 = new RectanguloE(4,6);
        System.out.println("El area de dicho rectangulo es: "+ rectangulo1.calcular_area());
        
    }
}
