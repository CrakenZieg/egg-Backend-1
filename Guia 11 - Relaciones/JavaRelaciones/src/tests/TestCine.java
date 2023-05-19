
package tests;

import domain.Cine;
import domain.Pelicula;
import domain.Espectador;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import servicio.CineServicio;

public class TestCine {
    
    Random rand = new Random();
    String[] abecedario= {"A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    CineServicio servicio;
    List<Espectador> espectadores = new ArrayList<>();

    public TestCine(CineServicio servicio) {
        this.servicio = servicio;
    }
    
    public void testearSala(){
        Pelicula pelicula = crearPeliculaAuto();
        servicio.cargarPelicula(pelicula);
        System.out.println("Pelicula: "+ pelicula);
        crearColaEspectadores(60);
        List<int[]> asientos = new ArrayList<>();
        for (int i = 0; i < servicio.getFilas().length; i++) {
            for (int j = 0; j < servicio.getColumnas().length; j++) {
                int[] aux = {i,j};
                asientos.add(aux);
            }
        }
        for (Espectador espectador : espectadores) {
            int cont = 1;
            System.out.println("Espectador "+cont+": "+ espectador.toString());
            if(servicio.validarEspectador(espectador)&&!asientos.isEmpty()){
                System.out.println("Valido");
                servicio.cargarEspectador(espectador);
                espectador.setAsiento(asientos.remove(rand.nextInt(0, asientos.size())));
                servicio.ocuparLugar(espectador);
                System.out.println("Asiento: "+Arrays.toString(espectador.getAsiento()));
            }
            cont++;
        }
    }
    
    public void crearColaEspectadores(int n){
        for (int i = 0; i < n; i++) {
            espectadores.add(crearEspectadorAuto());
        }
    }
    
    private Espectador crearEspectadorAuto(){
        int largo = rand.nextInt(1,15);
        String nombre= "";
        for(int i=0; i<largo; i++){ 
            nombre = nombre.concat(abecedario[rand.nextInt(abecedario.length)]);
        }   
        int edad = rand.nextInt(0,99);
        double dinero = rand.nextDouble(0, 5000);
        return new Espectador(nombre, edad, dinero);
    }
    
    private Pelicula crearPeliculaAuto(){
        int largo = rand.nextInt(1,15);
        String titulo= "";
        for(int i=0; i<largo; i++){ 
            titulo = titulo.concat(abecedario[rand.nextInt(abecedario.length)]);
        }  
        largo = rand.nextInt(1,15);
        String director = ""; 
        for(int i=0; i<largo; i++){ 
            director = director.concat(abecedario[rand.nextInt(abecedario.length)]);
        }   
        double duracion = rand.nextDouble(0.5, 4);
        int edadMin = rand.nextInt(0,18);
        return new Pelicula(titulo, director, duracion, edadMin);
    }
    
    
}
