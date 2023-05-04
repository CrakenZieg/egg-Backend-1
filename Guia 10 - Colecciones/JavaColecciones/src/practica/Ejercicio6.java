
package practica;

import java.util.Scanner;
import javacolecciones.EjercicioModelo;
import service.TiendaService;

public class Ejercicio6 implements EjercicioModelo{

    @Override
    public void ejercicio() {
        
        TiendaService service = new TiendaService();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        
        do{
            System.out.println("Ingrese una opcion:\n"+
                    "1. Ingresar un producto\n"+
                    "2. Modificar el precio de un producto\n"+
                    "3. Eliminar un producto\n"+
                    "4. Mostrar productos\n"+
                    "5. Ingresar productos aleatorios\n"+
                    "0. Salir\n");
            opcion = sc.nextInt();
            switch (opcion){
                case 1 ->{service.ingresarProducto();}
                case 2 ->{service.modificarPrecio();}
                case 3 ->{service.eliminarProducto();}
                case 4 ->{service.mostrarProductos();}
                case 5 ->{service.cargarProductos();}
                case 0 ->{System.out.println("Gracias, saludos!");}
                default ->{System.out.println("Opcion no valida");}
            }
        }while(opcion!=0);
    }
    
}
/*
6. Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
*/