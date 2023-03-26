/*
Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos 
pasados por parámetro y un constructor vacío. Crear un método para cargar un 
libro pidiendo los datos al usuario y luego informar mediante otro método el 
número de ISBN, el título, el autor del libro y el número de páginas.
*/

package practica;

import entidades.Libro;
import javapoo.*;
import java.util.Scanner;

public class Ejercicio1 extends EjercicioModelo{
    
    @Override
    public void ejercicio(){
                    
        System.out.println("----------------------------");
        Libro libro1 = new Libro();
        System.out.println("Creado el libro1, completa sus datos:");
        llenarLibro(libro1);
        System.out.println("----------------------------");
        System.out.println("Creando el libro2, completa sus datos:");
        Libro libro2 = llenarLibro();
        System.out.println("----------------------------");
        System.out.println("MostrarLibro1():");
        mostrarLibro1(libro1);
        System.out.println("----------------------------");
        System.out.println("MostrarLibro2():");
        mostrarLibro2(libro2);
        System.out.println("----------------------------");
        
    }
        
    public static void llenarLibro(Libro libro){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Ingrese el ISBN:");
        libro.setISBN(sc.next());
        System.out.println("Ingrese el Titulo:");
        libro.setTitulo(sc.next());
        System.out.println("Ingrese el Autor:");
        libro.setAutor(sc.next());
        System.out.println("Ingrese el numero de paginas:");
        libro.setNumPags(sc.nextInt());
    }
    
    public static Libro llenarLibro(){
        String ISBN, titulo, autor; 
        int numPags;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Ingrese el ISBN:");
        ISBN = sc.next();
        System.out.println("Ingrese el Titulo:");
        titulo = sc.next();
        System.out.println("Ingrese el Autor:");
        autor = sc.next();
        System.out.println("Ingrese el numero de paginas:");
        numPags = sc.nextInt();
        Libro libro = new Libro(ISBN, titulo, autor, numPags);
        return libro;
    }
    
    public static void mostrarLibro1(Libro libro){
        System.out.println(libro.toString());
    }
    
    public static void mostrarLibro2(Libro libro){
        System.out.println("ISBN:");
        System.out.println(libro.getISBN());
        System.out.println("Titulo:");
        System.out.println(libro.getTitulo());
        System.out.println("Autor:");
        System.out.println(libro.getAutor());
        System.out.println("Numero de paginas:");
        System.out.println(libro.getNumPags());
    }

}
