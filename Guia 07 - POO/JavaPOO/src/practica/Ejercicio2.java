/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el 
radio de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
e) Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
*/

package practica;

import entidades.Circunferencia;
import javapoo.*;
import java.util.Scanner;

public class Ejercicio2 implements EjercicioModelo{
    
    @Override
    public void ejercicio(){
        
        Circunferencia circ = crearCircunferencia();
        
        System.out.println("La circunferencia tiene radio "+circ.getRadio());
        System.out.println("La circunferencia tiene perimetro "+circ.perimetro());
        System.out.println("La circunferencia tiene area "+circ.area());
        
    }
    
    public Circunferencia crearCircunferencia(){
        double radio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
        radio = sc.nextDouble();
        Circunferencia circ = new Circunferencia(radio);
        return circ;
    }
    
}
