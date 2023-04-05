
package practica;

import java.util.Scanner;
import javaservicios.EjercicioModelo;
import service.CafeteraServicio;

public class Ejercicio2 implements EjercicioModelo {

    @Override
    public void ejercicio() {
        
        CafeteraServicio nespresso = new CafeteraServicio(); 
        Scanner sc = new Scanner(System.in).useDelimiter("\n");  
        int opcion;
        do{
            System.out.println("Ingrese una opcion:");
            System.out.println("1. Servir taza");
            System.out.println("2. Agregar cafe");
            System.out.println("3. Llenar cafetera");
            System.out.println("4. Vaciar cafetera");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    if(nespresso.cafetera.getCapacidadActual()<=0){
                        System.out.println("Debes llenar agregar cafe primero!");
                    } else {
                        int ml;
                        System.out.println("Ingrese los ml a servir:");
                        ml = sc.nextInt();
                        nespresso.servirTaza(ml);
                    }
                    break;
                case 2:
                    if(nespresso.cafetera.getCapacidadActual()==nespresso.cafetera.getCapacidadMaxima()){
                        System.out.println("Ya está llena!");
                    } else {
                        int ml;
                        System.out.println("Ingrese los ml a agregar:");
                        ml = sc.nextInt();
                        if(ml>=(nespresso.cafetera.getCapacidadMaxima()-nespresso.cafetera.getCapacidadActual())){
                            System.out.println(ml+"ml harian rebalsar la cafetera!");
                        } else {
                            nespresso.agregarCafe(ml);
                            System.out.println("Agregados "+ml+"ml de cafe!");
                        }
                    }
                    break;
                case 3:
                    if(nespresso.cafetera.getCapacidadActual()==nespresso.cafetera.getCapacidadMaxima()){
                        System.out.println("Ya está llena!");
                    } else {
                        nespresso.llenarCafetera();
                    }
                    break;
                case 4:
                    if(nespresso.cafetera.getCapacidadActual()==0){
                        System.out.println("Ya está vacia!");
                    } else {
                        nespresso.vaciarCafetera();
                    }
                    break;
                case 0:
                    System.out.println("Gracias por preferir Nespresso!");
                    break;
            }
        }while (opcion!=0);
        
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