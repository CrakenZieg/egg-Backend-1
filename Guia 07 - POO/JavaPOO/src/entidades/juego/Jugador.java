
package entidades.juego;

import java.util.Random;

public class Jugador {
    
    Random rand = new Random();
    private int adivinar, secreto, max, min;
    private String nombre;
    
    public Jugador(String nombre, int max, int min){
        this.nombre = nombre;
        this.max = max;
        this.min = min;
    }

    public boolean esSecreto(int adivinanza){
        return this.getSecreto()==adivinanza;
    }
    
    public boolean secretoGrande(int adivinanza){
        return this.getSecreto()>adivinanza;
    }
    
    public void tePasaste(){
        setMax(getAdivinar()-1);
    }
    
    public void teFalto(){
        setMin(getAdivinar()+1);
    }
    
    public void intSecreto(){
        this.setSecreto(rand.nextInt(min, max+1));
    }
    
    public void adivinar(){
        this.setAdivinar(rand.nextInt(min, max+1));
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAdivinar() {
        return adivinar;
    }
    public void setAdivinar(int adivinar) {
        this.adivinar = adivinar;
    }

    public int getSecreto() {
        return secreto;
    }
    public void setSecreto(int secreto) {
        this.secreto = secreto;
    }

    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }
    
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }
    
}

/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores 
jugar un juego de adivinanza de números. El primer jugador elige un número y el 
segundo jugador intenta adivinarlo. El segundo jugador tiene un número limitado 
de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento. 
El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
Registra el número de intentos necesarios para adivinar el número y el número de 
veces que cada jugador ha ganado.
*/