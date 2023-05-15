
package domain;

import java.util.ArrayList;
import java.util.Random;

public class Baraja {
    
    Random rand = new Random();
    String[] palos = {"Espada", "Basto", "Oro", "Copa"};
    int[] numeros = {1,2,3,4,5,6,7,10,11,12};
    ArrayList<CartaEj3> baraja = new ArrayList<>();
    ArrayList<CartaEj3> pilaDescarte = new ArrayList<>();
    
    public Baraja(){
        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                baraja.add(new CartaEj3(numeros[j], palos[i]));
            }
        }
    }
    
    public void barajar(){
        ArrayList<CartaEj3> aux = new ArrayList<>();
        while(!baraja.isEmpty()){
            if((baraja.size()-1)>1){
                aux.add(baraja.remove(rand.nextInt(0, baraja.size()-1)));
            } else {
                aux.add(baraja.remove(0));
            }
        }
        baraja = aux;
    }
    
    public CartaEj3 siguienteCarta(){
        if(!baraja.isEmpty()){
            pilaDescarte.add(baraja.remove(baraja.size()-1));
            return pilaDescarte.get(pilaDescarte.size()-1);
        } else {
            System.out.println("La baraja está vacía");
            return null;
        }
    }
    
    public int cartasDisponibles(){
        System.out.println("Cartas disponibles: "+baraja.size());
        return baraja.size();
    }
    
    public ArrayList<CartaEj3> darCartas(int n){
        ArrayList<CartaEj3> mano = new ArrayList<>();
        if(cartasDisponibles()>=n){
            for (int i = 0; i < n; i++) {
                mano.add(siguienteCarta());
            }
        } else {
            System.out.println("No alcanzan las cartas de la baraja");
        }
        return mano;
    }
    
    public void cartasMonton(){
        if(pilaDescarte.isEmpty()){
            System.out.println("No han salido cartas todavia");
        } else {
            System.out.println("Cartas en la pila de descarte: ");
            for (CartaEj3 cartaEj3 : pilaDescarte) {
                System.out.println(cartaEj3.toString());
            }
        }
    }
    
    public void mostrarBaraja(){
        if(baraja.isEmpty()){
            System.out.println("No quedan cartas en la baraja");
        } else {
            System.out.println("Cartas en la baraja: ");
            for (CartaEj3 cartaEj3 : baraja) {
                System.out.println(cartaEj3.toString());
            }
        }
    } 
    
}
/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
*/