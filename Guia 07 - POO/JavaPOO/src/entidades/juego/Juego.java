
package entidades.juego;

import java.util.Scanner;

public class Juego {
    
    Scanner sc = new Scanner(System.in);
    private int rondas, intentos, max, min;
    private int[] victorias = {0,0};
    private int[] intentosTotales = {0,0};
    private String jugador1, jugador2;
    
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
        System.out.println("Ingrese el nombre del primer jugador: ");
        jugador1 = sc.next();
        System.out.println("Ingrese el nombre del segundo jugador: ");
        jugador2 = sc.next();
        
        juego();
        
    }
    
    public void juego(){
        System.out.println("Iniciando juego!");
        for (int i = 0; i < rondas; i++) {
            System.out.println("Iniciando ronda!");
            Ronda rondaJ = new Ronda(jugador1, jugador2, intentos, max, min);
            int[] ronda = rondaJ.ronda();
            if (ronda[0]==2){
                victorias[1]+=1;
                System.out.println("Gano "+ jugador2 +" en "+ronda[1]+" intentos!");
                intentosTotales[1]+=ronda[1];
            } else {
                System.out.println(jugador1 +" mantuvo su numero secreto!");
            }
            rondaJ = new Ronda(jugador2, jugador1, intentos, max, min);
            ronda = rondaJ.ronda();
            if (ronda[0]==2){
                victorias[0]+=1;
                System.out.println("Gano "+ jugador1 +" en "+ronda[1]+" intentos!");
                intentosTotales[0]+=ronda[1];
            } else {
                System.out.println(jugador2 +" mantuvo su numero secreto!");
            }
        }
        if(victorias[0]>victorias[1]){
            System.out.println("Gano "+ jugador1 +" con "+victorias[0]+" en "+intentosTotales[0]+" intentos");
            System.out.println(jugador2 +" estuvo cerca con "+ victorias[1]+" en "+intentosTotales[1]+" intentos");
        } else if(victorias[1]>victorias[0]){
            System.out.println("Gano "+ jugador2 +" con "+ victorias[1]+" en "+intentosTotales[1]+" intentos");
            System.out.println(jugador1 +" estuvo cerca con "+ victorias[0]+" en "+intentosTotales[0]+" intentos");
        } else if(intentosTotales[0]<intentosTotales[1]){
            System.out.println("Gano "+ jugador1 +" con "+victorias[0]+" en "+intentosTotales[0]+" intentos");
            System.out.println(jugador2 +" estuvo cerca con "+ victorias[1]+" en "+intentosTotales[1]+" intentos");
        } else if(intentosTotales[1]<intentosTotales[0]){
            System.out.println("Gano "+ jugador2 +" con "+ victorias[1]+" en "+intentosTotales[1]+" intentos");
            System.out.println(jugador1 +" estuvo cerca con "+ victorias[0]+" en "+intentosTotales[0]+" intentos");
        } else {
            System.out.println(jugador1+" y "+jugador2+" empataron!");
        }
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