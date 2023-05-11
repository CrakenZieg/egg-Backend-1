
package domain;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    
    private List<Jugador> equipo;

    public Equipo() {
        this.equipo = new ArrayList<>();
    }
    
    public void agregarJugador(Jugador jugador){
        equipo.add(jugador);
    }

    public List<Jugador> getEquipo() {
        return equipo;
    }

    public void setEquipo(List<Jugador> equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Equipo: "+ equipo;
    }
    
}
/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
*/