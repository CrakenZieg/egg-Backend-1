
package javapoo;

import entidades.Libro;
import java.util.Scanner;

public class metodoMain {
    
    public static void main(String[] args) {
        
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
