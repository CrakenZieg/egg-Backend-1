
package extra;

import entities.LibroExtra;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javacolecciones.EjercicioModelo;
import service.LibreriaService;

public class ExtraEjercicio3 implements EjercicioModelo{

    @Override
    public void ejercicio() {
        
        Set<LibroExtra> libreria = new HashSet<>();
        LibreriaService servicio = new LibreriaService();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        
        do {
            System.out.println("Ingrese una opcion:");
            System.out.println("1. Ingresar");
            System.out.println("2. Prestar");
            System.out.println("3. Devolver");
            System.out.println("4. Mostrar libreria");
            System.out.println("5. Cargar aleatorio");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1 ->{
                    servicio.ingresarLibro(libreria);
                }
                case 2 ->{
                    servicio.prestar(libreria);
                }
                case 3 ->{
                    servicio.devolver(libreria);
                }
                case 4 ->{
                    servicio.mostrarLista(libreria);
                }
                case 5 ->{
                    System.out.println("Ingrese la cantidad de libros a generar:");
                    int n = sc.nextInt();
                    servicio.cargarLibro(libreria,n);
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
3. Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.
*/