
package utilidad;

import excepciones.*;
import java.util.Random;

public interface UsableInterface {
    
    Random rand = new Random();
    public double usar(ModificadorConsumo modificador, double tiempo)throws FaltaEnergiaException, EnergiaException, VidaException;
    
}
