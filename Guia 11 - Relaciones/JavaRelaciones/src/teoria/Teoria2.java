
package teoria;

import domain.Equipo;
import domain.Jugador;
import java.util.List;
import java.util.Random;
import javarelaciones.EjercicioModelo;

public class Teoria2 implements EjercicioModelo{

    @Override
    public void ejercicio() {
        
        Equipo equipo = new Equipo();
        System.out.println("Ingrese un numero:");
        cargarPersonas(equipo, sc.nextInt());
        mostrar(equipo);
    }

    public void cargarPersonas(Equipo equipo, int n){
        Random rand = new Random();
        String[] abecedario= {"A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        for(int j=0; j<n; j++){
            int largo = rand.nextInt(1,15);
            String nombre= "";
            for(int i=0; i<largo; i++){ 
                nombre = nombre.concat(abecedario[rand.nextInt(abecedario.length)]);
            }
            largo = rand.nextInt(1,15);
            String apellido= "";
            for(int i=0; i<largo; i++){ 
                apellido = apellido.concat(abecedario[rand.nextInt(abecedario.length)]);
            }
            Jugador jugador = new Jugador(nombre, apellido, rand.nextInt(1, 11), rand.nextInt(1, 50));
            equipo.agregarJugador(jugador);
            System.out.println((j+1)+": "+jugador.toString());
        }
    }
    
    public void mostrar(Equipo equipo){
        for (Jugador jugador : equipo.getEquipo()) {
            System.out.println(jugador.toString());
        }
    }
}
/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
*/