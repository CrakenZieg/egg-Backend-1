/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo 
privado base y un atributo privado altura. La clase incluirá un método para 
crear el rectángulo con los datos del Rectángulo dados por el usuario. También 
incluirá un método para calcular la superficie del rectángulo y un método para 
calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará 
el rectángulo mediante asteriscos usando la base y la altura. Se deberán además 
definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
*/

package practica;

import entidades.Rectangulo;
import javapoo.*;
import java.util.Scanner;

public class Ejercicio4 extends EjercicioModelo{
    
    @Override
    public void ejercicio(){
        
        Scanner sc = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("Desea crear rectangulo(S/N)?");
            opcion = sc.next().toUpperCase();
            if(opcion.equals("S")){
                Rectangulo rectangulo = new Rectangulo();
                menu(rectangulo);
            }
        } while (!opcion.equals("N"));       
    }
    
    public void menu(Rectangulo rectangulo){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("-----------------------");
            System.out.println("1. Calcular perimetro");
            System.out.println("2. Calcular area");
            System.out.println("3. Dibujar");
            System.out.println("4. Mostrar los valores");
            System.out.println("5. Modificar los valores");
            System.out.println("0. Salir");
            System.out.println("Que operacion desea realizar?");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("-----------------------");
                    System.out.println("Resultado: "+rectangulo.perimetro());
                }
                case 2 -> {
                    System.out.println("-----------------------");
                    System.out.println("Resultado: "+rectangulo.superficie());
                }
                case 3 -> {
                    System.out.println("-----------------------");
                    System.out.println("Dibujando...");
                    rectangulo.dibujar();
                }
                case 4 -> {
                    System.out.println("-----------------------");
                    System.out.println("Base: "+rectangulo.getBase());
                    System.out.println("Altura: "+rectangulo.getAltura());
                }
                case 5 -> {
                    System.out.println("-----------------------");
                    System.out.println("Ingrese la base: ");
                    rectangulo.setBase(sc.nextDouble());
                    System.out.println("Ingrese la altura: ");
                    rectangulo.setAltura(sc.nextDouble());
                }
            } 
        } while (opcion!=0);
    }
    
}
