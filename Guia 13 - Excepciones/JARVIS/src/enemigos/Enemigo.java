
package enemigos;

import java.util.Random;
import utilidad.Dureza;

public class Enemigo {
 
    private Random rand = new Random();
    private boolean hostil;    
    private int[] posicion = new int[3];
    private Dureza dureza;
    
    public Enemigo(){
        do{
            for (int i = 0; i < posicion.length; i++) {
                i = rand.nextInt(-250,250);
            }
        }while(posicion[0]==0&&posicion[1]==0&&posicion[2]==0&&enRango(posicion));
        hostil = rand.nextBoolean();
        dureza = Dureza.values()[rand.nextInt(0, Dureza.values().length)];
    }
    
    public boolean enRango(int[] p){
        return Math.sqrt(Math.pow(p[0],2)+Math.pow(p[1],2)+Math.pow(p[2],2))<=250;
    }
    
}
