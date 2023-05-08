
package service;

import entities.LibroExtra;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LibreriaService {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public void mostrarLista(Set<LibroExtra> libreria){
        for (LibroExtra libroExtra : libreria) {
            System.out.println(libroExtra.toString());
        }
    }
    
    public void ingresarLibro(Set<LibroExtra> libreria){
        LibroExtra libro = new LibroExtra();
        System.out.println("Ingrese el titulo:");
        libro.setTitulo(sc.next());
        System.out.println("Ingrese el autor:");
        libro.setAutor(sc.next());
        System.out.println("Ingrese el numero de ejemplares:");
        libro.setEjemplaresDisponibles(sc.nextInt());
        libro.setEjemplaresPrestados(0);
        libreria.add(libro);
    }
    
    public void prestar(Set<LibroExtra> libreria){
        boolean noExistencia = true;
        boolean noEncontrado = true;
        System.out.println("Ingrese el titulo:");
        String titulo = sc.next();
        for (LibroExtra libroExtra : libreria) {
            if(libroExtra.getTitulo().equals(titulo)){
                noExistencia = false;
                if(libroExtra.prestamo()){
                    System.out.println("Prestamo realizado: "+titulo);
                    noEncontrado = false;
                }
            }
        }
        if(noExistencia){
            System.out.println("Libro no disponible en la libreria");
        } else if(noEncontrado){
            System.out.println("Libro sin stock");
        }
    }
    
    public void devolver(Set<LibroExtra> libreria){
        boolean noPerteneceE = true;
        boolean noPerteneceP = true;
        System.out.println("Ingrese el titulo:");
        String titulo = sc.next();
        for (LibroExtra libroExtra : libreria) {
            if(libroExtra.getTitulo().equals(titulo)){
                noPerteneceE = false;
                if(libroExtra.devolucion()){
                    System.out.println("Devolucion realizada: "+titulo);
                    noPerteneceP = false;
                }
            }
        }
        if(noPerteneceE||noPerteneceP){
            System.out.println("Libro no pertenece a la libreria");
        }
    }
    
    public void cargarLibro(Set<LibroExtra> libreria, int n){
        Random rand = new Random();
        String[] abecedario= {"A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"," ","'"};
        for(int j=0; j<n; j++){
            int largo = rand.nextInt(1,15);
            String titulo= "";
            for(int i=0; i<largo; i++){ 
                titulo = titulo.concat(abecedario[rand.nextInt(abecedario.length)]);
            }
            largo = rand.nextInt(1,15);
            String autor= "";
            for(int i=0; i<largo; i++){ 
                autor = autor.concat(abecedario[rand.nextInt(abecedario.length)]);
            }
            LibroExtra libro = new LibroExtra(titulo, autor, rand.nextInt(3,15));
            libreria.add(libro);
            System.out.println((j+1)+": "+libro.toString());
        }
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