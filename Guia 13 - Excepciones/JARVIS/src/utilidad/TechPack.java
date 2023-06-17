
package utilidad;

import armadura.*;
import java.util.Random;
/**
*   Enum para posibles dropeos de armadura
* @return
*/
public enum TechPack {
    
    CASCO(1),
    TORZO(2),
    BRAZOIZQUIERDO(3),
    BRAZODERECHO(4),
    PIERNAIZQUIERDA(5),
    PIERNADERECHA(6);
    
    private int tipo;
    Random rand = new Random();
    
    TechPack(int tipo){
        this.tipo = tipo;
    }
    
    
    public Casco get1(){
        return new Casco(Color.values()[rand.nextInt(0, Color.values().length)],
                Color.values()[rand.nextInt(0, Color.values().length)],
                Dureza.values()[rand.nextInt(0, Dureza.values().length)],
                "Casco");
    }
    public Torzo get2(){
        return new Torzo(Color.values()[rand.nextInt(0, Color.values().length)],
                Color.values()[rand.nextInt(0, Color.values().length)],
                Dureza.values()[rand.nextInt(0, Dureza.values().length)],
                "Torzo");
    }
    public Guante get3y4(){
        return new Guante(Color.values()[rand.nextInt(0, Color.values().length)],
                Color.values()[rand.nextInt(0, Color.values().length)],
                Dureza.values()[rand.nextInt(0, Dureza.values().length)],
                (this.tipo==3)?"Braszo izquierdo":"Brazo derecho");
    }
    public Bota get5y6(){
        return new Bota(Color.values()[rand.nextInt(0, Color.values().length)],
                Color.values()[rand.nextInt(0, Color.values().length)],
                Dureza.values()[rand.nextInt(0, Dureza.values().length)],
                (this.tipo==3)?"Pierna izquierda":"Pierna derecha");
    }    
    
}
