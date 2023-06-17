
package armadura;

import static armadura.PiezaArmadura.consola;
import excepciones.*;
import utilidad.*;

public class Guante extends PiezaArmadura{
    
    public Guante(Color primario, Color secundario, Dureza material, String nombre) {
        super(primario, secundario, material, nombre);
        this.consumoBase*=1.1;
        this.nivelMaximoSalud*=1.3;        
        this.nivelSalud = this.nivelMaximoSalud;
    }
    
    @Override
    public double usar(ModificadorConsumo modificador, double tiempo)throws FaltaEnergiaException, EnergiaException{
        try {
            consola.escribir("Usando guantes en nivel "+modificador.toString()+" por "+tiempo+" segundos");
            return super.consumo(modificador, tiempo);
        } catch (FaltaEnergiaException ex) {
            throw ex;
        } catch (EnergiaException ex) {
            throw ex;
        }
    }
    
}
