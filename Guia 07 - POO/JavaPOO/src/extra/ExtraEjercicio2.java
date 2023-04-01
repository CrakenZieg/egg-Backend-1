/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un 
objeto puntos usando un método crearPuntos() que le pide al usuario los dos 
números y los ingresa en los atributos del objeto. Después, a través de otro 
método calcular y devolver la distancia que existe entre los dos puntos que 
existen en la clase Puntos.
*/

package extra;

import entidades.Puntos;
import javapoo.*;
import java.util.Scanner;

public class ExtraEjercicio2 implements EjercicioModelo{
    
    @Override
    public void ejercicio(){
        
        Puntos puntos = crearPuntos();
        System.out.println("Has creado un objeto 'Puntos'!");
        puntos.toString();
        System.out.println("La distancia entre (x1, y1) y (x2, y2) es: "+puntos.distancia());
    }
    
    public Puntos crearPuntos(){
        Scanner sc = new Scanner(System.in);
        Puntos puntos = new Puntos();
        System.out.println("Ingrese x1:");
        puntos.setX1(sc.nextDouble());
        System.out.println("Ingrese y1:");
        puntos.setY1(sc.nextDouble());
        System.out.println("Ingrese x2:");
        puntos.setX2(sc.nextDouble());
        System.out.println("Ingrese y2:");
        puntos.setY2(sc.nextDouble());
        return puntos;
    }
}
