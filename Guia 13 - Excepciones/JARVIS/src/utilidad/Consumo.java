
package utilidad;

import armadura.Bateria;
import excepciones.*;

public interface Consumo {
    
    public static Bateria bateria = new Bateria();
    
    public double consumo(ModificadorConsumo modificador, double tiempo)
            throws FaltaEnergiaException,EnergiaException;
    
}
