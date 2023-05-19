
package servicio;

import domain.Cine;
import domain.Espectador;
import domain.Pelicula;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Debería hacer muchas validaciones de tipo y demás, también separar este gran 
//servicio en 2/3 servicios diferentes para simplificar, probablemente se puedan 
//simplificar algunos metodos y haya mucha redundancia en ciertos datos, pero por
//ahora lo considero resuelto, sobre todo porque creo que está en un punto en el
//que sería más fácil directamente crear los nuevos servicios y dejar este servicio 
//como está

public class CineServicio {
    
    Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");
    private String[] columnas;
    private String[] filas;
    private Cine sala;
    private int contador;
    private List<Espectador> espectadores;

    public CineServicio(String[] filas, String[] columnas) {
        this.sala = new Cine(filas, columnas);
        this.contador = this.sala.getSala().length*this.sala.getSala()[0].length;
        this.espectadores = new ArrayList<>();
        this.filas = filas;
        this.columnas = columnas;
    }
    
    public void cargarPelicula(){
        Pelicula pelicula = new Pelicula();
        System.out.println("Ingrese el titulo:");
        pelicula.setTitulo(sc.next());
        System.out.println("Ingrese el director:");
        pelicula.setDirector(sc.next());
        System.out.println("Ingrese la duracion:");
        pelicula.setDuracion(sc.nextDouble());
        System.out.println("Ingrese la edad mínima:");
        pelicula.setEdadMin(sc.nextInt());
        sala.setPelicula(pelicula);
    }
    
    public void cargarEspectador(){
        if(contador!=0){
            Espectador espectador = new Espectador();
            System.out.println("Ingrese el nombre:");
            espectador.setNombre(sc.next());
            System.out.println("Ingrese la edad:");
            espectador.setEdad(sc.nextInt());
            System.out.println("Ingrese el dinero disponible:");
            espectador.setDinero(sc.nextDouble());
            System.out.println("Ingrese el asiento (fila columna):");
            int[] asiento = {sc.nextInt(),sc.nextInt()};
            if(validarAsiento(asiento)){
                espectador.setAsiento(asiento);
            } else {
                System.out.println("Asiento ocupado");
            }
            if(validarEspectador(espectador)){
                espectadores.add(espectador);
                contador--;
            } else {
                System.out.println("El espectador no es valido");
            }
        } else {
            System.out.println("Entradas no disponibles");
        }
    }
   
    public void cargarEspectador(Espectador espectador){   
        if(sala.getDisponibles()!=0){
            espectadores.add(espectador);
        } else {
            System.out.println("Entradas no disponibles");
        }
    }
    
    public void cargarPelicula(Pelicula pelicula ){
        sala.setPelicula(pelicula);
    }
    
    public void precio(){
        System.out.println("El precio actual de la entrada es: $"+sala.getPrecio());
        System.out.println("Desea modificarlo? (S/N)");
        if("S".equalsIgnoreCase(sc.next())){
            System.out.println("Ingrese el nuevo precio: \n$ ");
            sala.setPrecio(sc.nextDouble());
        }
    }
    
    public void ocuparLugar(){
        System.out.println("Ingrese el asiento (fila columna):");
        String[] asientoS = {sc.next(),sc.next().toUpperCase()};
        int pos = 0;
        while(!asientoS[1].equals(columnas[pos])){
            pos++;
        }
        int[] asiento = {Integer.parseInt(asientoS[0])-1,pos};
        Espectador espectador = (Espectador) espectadores.stream().filter(espec->espec.getAsiento()==asiento);
        ocuparLugar(espectador);
    }
    
    public void ocuparLugar(Espectador espectador){
        sala.setLugar(espectador.getAsiento()[0], espectador.getAsiento()[1], espectador);
    }
    
    public boolean validarAsiento(int[] asiento){
        return sala.getSala()[asiento[0]][asiento[1]]==null;
    }
    
    public boolean validarEspectador(Espectador espectador){
        boolean retorno = true;
        if(espectador.getEdad()<sala.getPelicula().getEdadMin()
                || espectador.getDinero()<sala.getPrecio()){
            retorno = false;
        }
        return retorno;  
    }
    
    public void mostrarSala(){
        sala.mostrarSala();
    }
    
    public void mostrarEspectadores(){
        System.out.println("Los "+espectadores.size()+" clientes de la función son: ");
        for (Espectador espectador : espectadores) {
            System.out.println(espectador.toString());
        }
    }
    
    public void mostrarEspectadoresSala(){ 
        int cont = 0;
        System.out.println("Los clientes en la sala son: ");
        for (Espectador[] espectadorF : sala.getSala()) {
            for (Espectador espectador : espectadorF) {
                if (espectador!=null){
                    cont++;
                    System.out.println(cont+": "+espectador.toString());
                }
            }
        }
    }
    
    public void mostrarPelicula(){
        System.out.println("La pelicula de la función es: ");
        System.out.println(sala.getPelicula().toString());
    }

    public String[] getColumnas() {
        return columnas;
    }

    public String[] getFilas() {
        return filas;
    }
    
}
/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X
7 A X | 7 B X | 7 C X | 7 D X | 7 E | 7 F X
6 A X | 6 B X | 6 C | 6 D X | 6 E X | 6 F
5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
3 A X | 3 B X | 3 C X | 3 D | 3 E X | 3 F X
2 A X | 2 B | 2 C X | 2 D X | 2 E X | 2 F
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
*/
