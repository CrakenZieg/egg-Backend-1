
package entidades.juego;

import java.util.Random;

public class Jugador {
    
    Random rand = new Random();
    private int num, adivinar, secreto, max, min;
    
    public Jugador(int num, int max, int min){
        this.num = num;
        this.max = max;
        this.min = min;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    
    public void intSecreto(){
        this.setSecreto(rand.nextInt(min, max+1));
    }
    
    public void adivinar(){
        this.setAdivinar(rand.nextInt(min, max+1));
    }
    
    public void jugadorReset(int max, int min){
        this.setMax(max);
        this.setMin(min);
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
        return "Jugador{"+this.getNum()+"}";
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