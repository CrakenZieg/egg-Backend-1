
package ejercicios;

import ejercicios.teoria1.*;
import java.util.ArrayList;
import java.util.List;
import javaherencia.EjercicioModelo;

public class Teoria1 implements EjercicioModelo{

    @Override
    public void ejercicio() {
        
        List<Animal> animales = new ArrayList<>();
        animales.add(new Animal());
        animales.add(new Gato());
        animales.add(new Perro());
        for (Animal animal : animales) {
            animal.hacerRuido();
        }
        
    }
    
}
