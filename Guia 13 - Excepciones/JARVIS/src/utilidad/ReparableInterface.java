
package utilidad;

import excepciones.*;

public interface ReparableInterface {
    
    public boolean repararDanos()throws FaltaEnergiaException, EnergiaException, VidaException;
    
}
