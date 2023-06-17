
package armadura;

import static armadura.PiezaArmadura.consola;
import excepciones.*;
import utilidad.*;

public class Torzo extends PiezaArmadura{
    
    public Torzo(Color primario, Color secundario, Dureza material, String nombre) {
        super(primario, secundario, material, nombre);
        this.consumoBase*=1.5;
        this.nivelMaximoSalud*=2;        
        this.nivelSalud = this.nivelMaximoSalud;
    }

    public static Bateria getBateria() {
        return bateria;
    }
    
    @Override
    public double usar(ModificadorConsumo modificador, double tiempo)throws FaltaEnergiaException, EnergiaException{
        try {
            consola.escribir("Usando torzo en nivel "+modificador.toString()+" por "+tiempo+" segundos");
            return super.consumo(modificador, tiempo);
        } catch (FaltaEnergiaException ex) {
            throw ex;
        } catch (EnergiaException ex) {
            throw ex;
        }
    }
    
}
