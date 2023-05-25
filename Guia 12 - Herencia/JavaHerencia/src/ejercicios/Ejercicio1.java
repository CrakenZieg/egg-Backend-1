
package ejercicios;

import ejercicios.ejercicio1.*;
import javaherencia.EjercicioModelo;

public class Ejercicio1 implements EjercicioModelo{

    @Override
    public void ejercicio() {
        
        System.out.println("Creando animales: ");
        Animal gato = new Gato("Mau", "pajaritos", 10, "peluda");
        Animal perro = new Perro("Guau", "huesos", 15, "calle");
        Animal caballo = new Caballo("Bufa", "pasto", 12, "criollo");
        
        gato.mostrar();
        perro.mostrar();
        caballo.mostrar();
    }
    
}
/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.
*/