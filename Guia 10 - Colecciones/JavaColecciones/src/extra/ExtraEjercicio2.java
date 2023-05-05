
package extra;

import java.util.Scanner;
import javacolecciones.EjercicioModelo;
import service.CantanteService;

public class ExtraEjercicio2 implements EjercicioModelo{

    @Override
    public void ejercicio() {
        
        CantanteService servicio = new CantanteService();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        
        do {
            System.out.println("Ingrese una opcion:");
            System.out.println("1. Ingresar cantante");
            System.out.println("2. Eliminar alumnos");
            System.out.println("3. Mostrar Lista");
            System.out.println("4. Mostrar log");
            System.out.println("5. Cargar aleatorio");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1 ->{
                    servicio.agregarCantante();
                }
                case 2 ->{
                    servicio.eliminarCantante();
                }
                case 3 ->{
                    servicio.mostrar();
                }
                case 4 ->{
                    servicio.mostraLog();
                }
                case 5 ->{
                    System.out.println("Ingrese la cantidad de cantantes a generar:");
                    int n = sc.nextInt();
                    servicio.cargarCantantes(n);
                }
                case 0 ->{
                    System.out.println("Gracias! Hasta luego!");
                }
                default -> {
                    System.out.println("Opcion no valida!");
                }
            }
        } while(opcion!=0); 
        
    }
    
}
/*
2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
*/