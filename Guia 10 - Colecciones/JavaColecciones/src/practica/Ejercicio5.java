
package practica;

import entities.Pais;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;
import javacolecciones.EjercicioModelo;
import service.PaisService;

public class Ejercicio5 implements EjercicioModelo{

    @Override
    public void ejercicio() {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        PaisService service = new PaisService();
        Set<Pais> paises = new TreeSet<>(Pais.compararPais);
        int opcion;
        
        service.cargar(paises);
        do{
            System.out.println("----------------------");
            System.out.println("Ingrese una opcion");
            System.out.println("1. Cargar paises");
            System.out.println("2. Mostrar paises");
            System.out.println("3. Ordenar paises");
            System.out.println("4. Eliminar pais");
            System.out.println("5. Cargar automaticamente");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            System.out.println("----------------------");
            switch (opcion){
                case 1 ->{
                    service.cargar(paises);
                }
                case 2 ->{
                    service.mostrar(paises);
                }
                case 3 ->{
                    System.out.println("El ordenar es innecesario por ser un TreeSet.");
                    System.out.println("Este conjunto se ordena a si mismo ya que la clase Pais");
                    System.out.println("cuenta con un comparador que introducimos como parametro");
                    System.out.println("en el constructor del TreeSet, de todas formas se resolvio:");
                    service.ordernar(paises);
                }
                case 4 ->{
                    System.out.println("Ingrese el pais a eliminar:");
                    service.eliminar(paises, sc.next());
                }
                case 5 ->{
                    System.out.println("Cuantos paises quisiera crear automaticamente?");
                    service.cargarPaises(paises, sc.nextInt());
                }
                case 0 ->{
                    System.out.println("Gracias, saludos!");
                }
                default ->{
                    System.out.println("Opcion incorrecta");
                }
            }
        } while(opcion!=0);
    }
}
/*
5. Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
*/