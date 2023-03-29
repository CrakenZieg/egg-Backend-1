
package entidades.juego;

import java.util.Scanner;

public class Juego {
    
    Scanner sc = new Scanner(System.in);
    private int rondas, intentos, max, min;
    private int[] victorias = {0,0};
    private int[] intentosTotales = {0,0};
    private Jugador jugador1, jugador2;
    
    public Juego(){}
    
    public void iniciar_juego(){
    
        System.out.println("Ingrese la cantidad de rondas: ");
        rondas = sc.nextInt();
        System.out.println("Ingrese la cantidad de intentos: ");
        intentos = sc.nextInt();
        System.out.println("Ingrese el numero maximo: ");
        max = sc.nextInt();
        System.out.println("Ingrese el numero minimo: ");
        min = sc.nextInt();
        
        jugador1 = new Jugador(1, max, min);
        jugador2 = new Jugador(2, max, min);
        
        juego(jugador1, jugador2);
        
    }
    
    public void juego(Jugador jugador1, Jugador jugador2){
        System.out.println("Iniciando juego!");
        for (int i = 0; i < rondas; i++) {
            System.out.println("Iniciando ronda!");
            int[] ronda = ronda(jugador1,jugador2);
            if (ronda[0]==2){
                victorias[1]+=1;
                System.out.println("Gano el jugador2 en "+ronda[1]+" intentos!");
                intentosTotales[1]+=ronda[1];
            } else {
                victorias[0]+=1;
                System.out.println("Gano el jugador1!");
            }
            ronda = ronda(jugador2,jugador1);
            if (ronda[0]==2){
                victorias[0]+=1;
                System.out.println("Gano el jugador1 en "+ronda[1]+" intentos!");
                intentosTotales[0]+=ronda[1];
            } else {
                victorias[1]+=1;
                System.out.println("Gano el jugador2!");
            }
        }
        if(victorias[0]>victorias[1]){
            System.out.println("Gano el jugador1 con "+victorias[0]+" en "+intentosTotales[0]+" intentos");
            System.out.println("El jugador2 estuvo cerca con "+ victorias[1]+" en "+intentosTotales[1]+" intentos");
        } else {
            System.out.println("Gano el jugador2 con "+ victorias[1]+" en "+intentosTotales[1]+" intentos");
            System.out.println("El jugador1 estuvo cerca con "+ victorias[0]+" en "+intentosTotales[0]+" intentos");
        }
    }
    
    public int[] ronda(Jugador jugador1, Jugador jugador2){
        int[] retorno = {1,0};
        jugador1.intSecreto();
        System.out.println("El numero secreto de "+ jugador1 + " es "+jugador1.getSecreto());
        for (int i = 0; i < intentos; i++) {
            retorno[1]+=1;
            jugador2.adivinar();
            System.out.println("El "+jugador2+" supone "+ jugador2.getAdivinar());
            if(jugador2.getAdivinar()==jugador1.getSecreto()){
                System.out.println(jugador2+" acerto!");
                retorno[0] = 2;
                jugador1.jugadorReset(max,min);
                jugador2.jugadorReset(max,min);
                return retorno;
            } else {
                if(jugador2.getAdivinar()>jugador1.getSecreto()){
                    jugador2.setMax(jugador2.getAdivinar()-1);
                    System.out.println(jugador2+" se paso de largo!");
                } else {
                    jugador2.setMin(jugador2.getAdivinar()+1);
                    System.out.println(jugador2+" se fue a menos!");
                }
            }
        }
        jugador1.jugadorReset(max,min);
        jugador2.jugadorReset(max,min);
        return retorno;
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