
package service;

import entities.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public Cafetera cafetera;
    public CafeteraServicio(){
        System.out.println("Ingrese la capacidad maxima(ml) de su cafetera:");
        int cap = sc.nextInt();
        System.out.println("Ingrese la cantidad actual(ml) de su cafetera:");
        int act = sc.nextInt();
        cafetera = new Cafetera(cap, act);
    }
    
    public void llenarCafetera(){
        cafetera.setCapacidadActual(cafetera.getCapacidadMaxima());
        System.out.println("Cafetera llena!");
    }
    
    public void servirTaza(int taza){
        int cafeFinal = cafetera.getCapacidadActual();
        if(cafeFinal<taza){
            System.out.println("No es posible servir "+taza+"ml, su cantidad de cafe es menor ("+cafetera.getCapacidadActual()+"ml)");
            System.out.println("Sirviendo el total");
            cafeFinal = 0;
        } else {
            cafeFinal -= taza;
        }
        cafetera.setCapacidadActual(cafeFinal);
        System.out.println("Quedan "+cafetera.getCapacidadActual()+"ml de cafe");
    }
    
    public void vaciarCafetera(){
        cafetera.setCapacidadActual(0);
        System.out.println("Cafetera limpia!");
    }
    
    public void agregarCafe(int cafe){
        cafetera.setCapacidadActual(cafetera.getCapacidadActual()+cafe);
        System.out.println("La cafetera tiene ahora "+cafetera.getCapacidadActual()+"ml");
    }
}
/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con 
los atributos capacidadMáxima (la cantidad máxima de café que puede contener la 
cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). 
Agregar constructor vacío y con parámetros así como setters y getters. Crear clase 
CafeteraServicio en el paquete Servicios con los siguiente:
-Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
-Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que 
quede. El método le informará al usuario si se llenó o no la taza, y de no haberse 
llenado en cuanto quedó la taza.
-Método vaciarCafetera(): pone la cantidad de café actual en cero. 
-Método agregarCafe(int): se le pide al usuario una cantidad de café, el método 
lo recibe y se añade a la cafetera la cantidad de café indicada.
*/