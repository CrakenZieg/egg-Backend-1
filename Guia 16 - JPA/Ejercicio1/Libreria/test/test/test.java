package test;

import java.nio.charset.StandardCharsets;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import libreria.datos.ClienteJpaController;
import libreria.datos.PrestamoJpaController;
import libreria.entidades.Autor;
import libreria.entidades.Cliente;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");
        Random rand = new Random();

        AutorServicio autorServicio = new AutorServicio(sc);
        EditorialServicio editorialServicio = new EditorialServicio(sc);
        LibroServicio libroServicio = new LibroServicio(sc, autorServicio, editorialServicio);
        ClienteJpaController clienteJpa = new ClienteJpaController();
        PrestamoJpaController prestamoJpa = new PrestamoJpaController();

//        List<Autor> autores = null;
//        List<Editorial> editoriales = null;
//        List<Libro> libros = null;
//        try {
//            Libro libro = libroServicio.buscar(777L);
//            if(libro!=null){
//                System.out.println(libro.toString());
//            } else {
//                System.out.println("Null pa");
//            }
//            
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//            System.out.println("La agarro en main");
//        }
//        crear(autorServicio,editorialServicio,libroServicio,nombresLibros,nombresAutores,nombresEditoriales,rand);
//        for(int i = 0; i<100; i++){
//            crearClientes(rand, nombresAutores, clienteJpa);
//        }

//        crearPrestamo(rand, libroServicio, clienteJpa, prestamoJpa, 150);
    }
    
    /*
    (Date fechaPrestamo, Date fechaDevolucion, Libro libro, Cliente cliente)
     */
    public static void crearPrestamo(Random rand, LibroServicio libroServicio, ClienteJpaController clienteJpa, PrestamoJpaController prestamoJpa, int n){
        List<Libro> biblio = libroServicio.buscar();
        List<Cliente> clientes = clienteJpa.findClienteEntities();
        for(int i = 0; i < n; i++){
            int anio = 2023-rand.nextInt(0, 6);
            int mes = rand.nextInt(0, 12);
            int dia = rand.nextInt(1, 32);
            Calendar inicio = Calendar.getInstance();
            inicio.set(anio, mes, dia);
            Calendar finalizacion = Calendar.getInstance();
            int tiempo = rand.nextInt(2, 14);
    //        if(dia+tiempo>31){
    //            if(mes+1>11){
    //                mes = 0;
    //                anio++;
    //                dia = dia+tiempo-31;
    //            }else{
    //                mes++;
    //                dia = dia+tiempo-31;
    //            }            
    //        } else {
    //            dia += tiempo;
    //        }
            finalizacion.set(anio, mes, dia);
            finalizacion.add(Calendar.DAY_OF_MONTH, tiempo);         
            Cliente cliente = clientes.get(rand.nextInt(0, clientes.size()));
            Libro libro;
            do{
                libro = biblio.get(rand.nextInt(0, biblio.size()));
            }while(!libro.prestar());        
            Prestamo prestamo = new Prestamo(inicio.getTime(), finalizacion.getTime(), libro, cliente);
            try {
                prestamoJpa.create(prestamo);
            } catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void crearClientes(Random rand, String[] nombresAutores, ClienteJpaController clienteJpa) {
        Long documento = rand.nextLong(0, 10000000);
        String nombre = getStringR(nombresAutores, rand);
        String apellido = getStringR(nombresAutores, rand);
        Long telefono = rand.nextLong(150000000, 160000000);
        Cliente cliente = new Cliente(documento, nombre, apellido, telefono.toString());
        try {
            clienteJpa.create(cliente);
        } catch (Exception ex) {
            System.out.println("Algo fallo!");
        }
    }

    public static String getStringR(String[] nombresAutores, Random rand) {
        String[] nombre = nombresAutores[rand.nextInt(0, nombresAutores.length)].split(" ");
        if (nombre.length == 1) {
            return nombre[0];
        } else {
            return nombre[rand.nextInt(0, nombre.length)];
        }

    }

    public static void crear(AutorServicio autorServicio, EditorialServicio editorialServicio, LibroServicio libroServicio,
            String[] nombresLibros, String[] nombresAutores, String[] nombresEditoriales, Random rand) {
//        for (String nombresEditorial : nombresEditoriales) {
//            try {
//                editorialServicio.guardar(nombresEditorial, Boolean.TRUE);
//            } catch (Exception ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
        for (int i = 0; i < nombresLibros.length; i++) {
            Autor autor = null;
            try {
                if (autorServicio.buscar(nombresAutores[i]) != null) {
                    autor = autorServicio.buscar(nombresAutores[i]);
                } else {
                    autor = autorServicio.guardar(nombresAutores[i], Boolean.TRUE);
                }
                int ejemplares = rand.nextInt(2, 16);
                libroServicio.guardar(rand.nextLong(99999999), nombresLibros[i],
                        rand.nextInt(1000, 2023),
                        ejemplares,
                        0,
                        ejemplares,
                        Boolean.TRUE,
                        autor,
                        editorialServicio.buscar(rand.nextInt(1, editorialServicio.recuento() + 1)));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}

/*
String[] nombresLibros = {
            "Cien años de soledad",
            "1984",
            "Don Quijote de la Mancha",
            "Orgullo y prejuicio",
            "En busca del tiempo perdido",
            "Matar a un ruiseñor",
            "Crimen y castigo",
            "Ulises",
            "Los miserables",
            "Anna Karenina",
            "El gran Gatsby",
            "El principito",
            "Rayuela",
            "La Odisea",
            "El amor en los tiempos del cólera",
            "Hamlet",
            "El retrato de Dorian Gray",
            "La metamorfosis",
            "Lolita",
            "Crónica de una muerte anunciada",
            "Los juegos del hambre",
            "100 años de soledad",
            "Harry Potter y la piedra filosofal",
            "La sombra del viento",
            "El Señor de los Anillos",
            "El código Da Vinci",
            "El Alquimista",
            "El perfume",
            "Rebelión en la granja",
            "Los pilares de la Tierra",
            "Romeo y Julieta",
            "Drácula",
            "Frankenstein",
            "Fahrenheit 451",
            "El diario de Ana Frank",
            "El nombre del viento",
            "Las aventuras de Tom Sawyer",
            "La catedral del mar",
            "Los hombres que no amaban a las mujeres",
            "La guerra y la paz",
            "Pedro Páramo",
            "Los hermanos Karamazov",
            "La iliada",
            "Alicia en el país de las maravillas",
            "Moby Dick",
            "Las mil y una noches",
            "El guardián entre el centeno",
            "El viejo y el mar",
            "Madame Bovary",
            "La vuelta al mundo en 80 días",
            "El gato negro",
            "Cumbres borrascosas",
            "Veinte mil leguas de viaje submarino",
            "El castillo",
            "La Divina Comedia",
            "Los cuatro jinetes del Apocalipsis",
            "El extranjero",
            "Oliver Twist",
            "David Copperfield",
            "La naranja mecánica",
            "La ladrona de libros",
            "La montaña mágica",
            "La casa de los espíritus",
            "El señor de las moscas",
            "Ve y pon un centinela",
            "Los hombres que no amaban a las mujeres",
            "Cincuenta sombras de Grey",
            "La chica del tren",
            "Yo antes de ti",
            "La ladrona de libros",
            "La historia interminable",
            "El principito",
            "La caverna",
            "La sombra del viento",
            "El fuego invisible",
            "Los ojos amarillos de los cocodrilos",
            "Los santos inocentes",
            "Lo que el viento se llevó",
            "El jardín olvidado",
            "El niño con el pijama de rayas",
            "El último adiós",
            "Los hombres que no amaban a las mujeres",
            "Cien años de soledad",
            "1984",
            "Don Quijote de la Mancha",
            "Orgullo y prejuicio",
            "En busca del tiempo perdido",
            "Matar a un ruiseñor",
            "Crimen y castigo",
            "Ulises",
            "Los miserables",
            "Anna Karenina",
            "El gran Gatsby",
            "El principito",
            "Rayuela",
            "La Odisea",
            "El amor en los tiempos del cólera",
            "Hamlet",
            "El retrato de Dorian Gray",
            "La metamorfosis",
            "Lolita",
            "Crónica de una muerte anunciada",
            "Los juegos del hambre",
            "100 años de soledad",
            "Harry Potter y la piedra filosofal",
            "La sombra del viento",
            "El Señor de los Anillos",
            "El código Da Vinci",
            "El Alquimista",
            "El perfume",
            "Rebelión en la granja",
            "Los pilares de la Tierra",
            "Romeo y Julieta",
            "Drácula",
            "Frankenstein",
            "Fahrenheit 451",
            "El diario de Ana Frank",
            "El nombre del viento",
            "Las aventuras de Tom Sawyer",
            "La catedral del mar",
            "Los hombres que no amaban a las mujeres",
            "La guerra y la paz",
            "Pedro Páramo",
            "Los hermanos Karamazov",
            "La iliada",
            "Alicia en el país de las maravillas",
            "Moby Dick",
            "Las mil y una noches",
            "El guardián entre el centeno",
            "El viejo y el mar",
            "Madame Bovary",
            "La vuelta al mundo en 80 días",
            "El gato negro",
            "Cumbres borrascosas",
            "Veinte mil leguas de viaje submarino",
            "El castillo",
            "La Divina Comedia",
            "Los cuatro jinetes del Apocalipsis",
            "El extranjero",
            "Oliver Twist",
            "David Copperfield",
            "La naranja mecánica",
            "La ladrona de libros",
            "La montaña mágica",
            "La casa de los espíritus",
            "El señor de las moscas",
            "Ve y pon un centinela",
            "Los hombres que no amaban a las mujeres",
            "Cincuenta sombras de Grey",
            "La chica del tren",
            "Yo antes de ti",
            "La ladrona de libros",
            "La historia interminable",
            "El principito",
            "La caverna",
            "La sombra del viento",
            "El fuego invisible",
            "Los ojos amarillos de los cocodrilos",
            "Los santos inocentes",
            "Lo que el viento se llevó",
            "El jardín olvidado",
            "El niño con el pijama de rayas",
            "El último adiós",
            "Los hombres que no amaban a las mujeres"
        };
        
        String[] nombresAutores = {
            "Gabriel García Márquez",
            "George Orwell",
            "Miguel de Cervantes Saavedra",
            "Jane Austen",
            "Marcel Proust",
            "Harper Lee",
            "Fyodor Dostoyevsky",
            "James Joyce",
            "Victor Hugo",
            "Leo Tolstoy",
            "F. Scott Fitzgerald",
            "Antoine de Saint-Exupéry",
            "Julio Cortázar",
            "Homero",
            "Gabriel García Márquez",
            "William Shakespeare",
            "Oscar Wilde",
            "Franz Kafka",
            "Vladimir Nabokov",
            "Gabriel García Márquez",
            "Suzanne Collins",
            "Gabriel García Márquez",
            "J.K. Rowling",
            "Carlos Ruiz Zafón",
            "J.R.R. Tolkien",
            "Dan Brown",
            "Paulo Coelho",
            "Patrick Süskind",
            "George Orwell",
            "Ken Follett",
            "William Shakespeare",
            "Bram Stoker",
            "Mary Shelley",
            "Ray Bradbury",
            "Ana Frank",
            "Patrick Rothfuss",
            "Mark Twain",
            "Ildefonso Falcones",
            "Stieg Larsson",
            "Leo Tolstoy",
            "Juan Rulfo",
            "Fyodor Dostoyevsky",
            "Homero",
            "Lewis Carroll",
            "Herman Melville",
            "Anónimo",
            "J.D. Salinger",
            "Ernest Hemingway",
            "Gustave Flaubert",
            "Julio Verne",
            "Edgar Allan Poe",
            "Emily Brontë",
            "Julio Verne",
            "Franz Kafka",
            "Dante Alighieri",
            "Vicente Blasco Ibáñez",
            "Albert Camus",
            "Charles Dickens",
            "Charles Dickens",
            "Dan Brown",
            "Anthony Burgess",
            "Ken Follett",
            "Bram Stoker",
            "Fyodor Dostoyevsky",
            "Markus Zusak",
            "Thomas Mann",
            "Isabel Allende",
            "William Golding",
            "Harper Lee",
            "Gabriel García Márquez",
            "Homero",
            "Homero",
            "Isaac Asimov",
            "Salman Rushdie",
            "José Saramago",
            "Jorge Luis Borges",
            "Julio Verne",
            "Laura Gallego García",
            "Roberto Bolaño",
            "Yuval Noah Harari",
            "Dante Gebel",
            "Gabriel García Márquez",
            "Stieg Larsson",
            "Suzanne Collins",
            "Suzanne Collins",
            "Suzanne Collins",
            "Paulo Coelho",
            "Hermann Hesse",
            "Hermann Hesse",
            "John Green",
            "Alexandre Dumas",
            "Gabriel García Márquez",
            "Dante Gebel",
            "Ernest Cline",
            "Michael Ende",
            "Antoine de Saint-Exupéry",
            "José Saramago",
            "Carlos Ruiz Zafón",
            "Javier Sierra",
            "Katherine Pancol",
            "Miguel Delibes",
            "Margaret Mitchell",
            "Kate Morton",
            "John Boyne",
            "Kate Morton",
            "Stieg Larsson",
            "Gabriel García Márquez",
            "George Orwell",
            "Miguel de Cervantes Saavedra",
            "Jane Austen",
            "Marcel Proust",
            "Harper Lee",
            "Fyodor Dostoyevsky",
            "James Joyce",
            "Victor Hugo",
            "Leo Tolstoy",
            "F. Scott Fitzgerald",
            "Antoine de Saint-Exupéry",
            "Julio Cortázar",
            "Homero",
            "Gabriel García Márquez",
            "William Shakespeare",
            "Oscar Wilde",
            "Franz Kafka",
            "Vladimir Nabokov",
            "Gabriel García Márquez",
            "Suzanne Collins",
            "Gabriel García Márquez",
            "J.K. Rowling",
            "Carlos Ruiz Zafón",
            "J.R.R. Tolkien",
            "Dan Brown",
            "Paulo Coelho",
            "Patrick Süskind",
            "George Orwell",
            "Ken Follett",
            "William Shakespeare",
            "Bram Stoker",
            "Mary Shelley",
            "Ray Bradbury",
            "Ana Frank",
            "Patrick Rothfuss",
            "Mark Twain",
            "Ildefonso Falcones",
            "Stieg Larsson",
            "Leo Tolstoy",
            "Juan Rulfo",
            "Fyodor Dostoyevsky",
            "Homero",
            "Lewis Carroll",
            "Herman Melville",
            "Anónimo",
            "J.D. Salinger",
            "Ernest Hemingway",
            "Gustave Flaubert",
            "Julio Verne",
            "Edgar Allan Poe",
            "Emily Brontë",
            "Julio Verne",
            "Franz Kafka",
            "Dante Alighieri",
            "Vicente Blasco Ibáñez",
            "Albert Camus",
            "Charles Dickens",
            "Charles Dickens",
            "Dan Brown",
            "Anthony Burgess",
            "Ken Follett",
            "Bram Stoker",
            "Fyodor Dostoyevsky",
            "Markus Zusak",
            "Thomas Mann",
            "Isabel Allende",
            "William Golding",
            "Harper Lee",
            "Gabriel García Márquez",
            "Homero",
            "Homero",
            "Isaac Asimov",
            "Salman Rushdie",
            "José Saramago",
            "Jorge Luis Borges",
            "Julio Verne",
            "Laura Gallego García",
            "Roberto Bolaño",
            "Yuval Noah Harari",
            "Dante Gebel",
            "Gabriel García Márquez",
            "Stieg Larsson",
            "Suzanne Collins",
            "Suzanne Collins",
            "Suzanne Collins",
            "Paulo Coelho",
            "Hermann Hesse",
            "Hermann Hesse",
            "John Green",
            "Alexandre Dumas",
            "Gabriel García Márquez",
            "Dante Gebel",
            "Ernest Cline",
            "Michael Ende",
            "Antoine de Saint-Exupéry",
            "José Saramago",
            "Carlos Ruiz Zafón",
            "Javier Sierra",
            "Katherine Pancol",
            "Miguel Delibes",
            "Margaret Mitchell",
            "Kate Morton",
            "John Boyne",
            "Kate Morton",
            "Stieg Larsson"
        };

        String[] nombresEditoriales = {
            "Penguin Random House",
            "HarperCollins",
            "Simon & Schuster",
            "Macmillan Publishers",
            "Hachette Livre",
            "Wiley",
            "Scholastic",
            "Pearson Education",
            "Oxford University Press",
            "Cambridge University Press",
            "Elsevier",
            "Springer",
            "MIT Press",
            "Bloomsbury Publishing",
            "Penguin Books",
            "Vintage Books",
            "Random House",
            "Grove Atlantic",
            "Farrar, Straus and Giroux",
            "McGraw-Hill Education"
        };
 */
