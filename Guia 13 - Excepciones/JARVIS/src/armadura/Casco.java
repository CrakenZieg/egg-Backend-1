
package armadura;

import static armadura.PiezaArmadura.consola;
import excepciones.*;
import utilidad.*;

public class Casco extends PiezaArmadura implements UsableInterface{
    
    private Sintetizador sintetizador;
    private Radar radar;

    public Casco(Color primario, Color secundario,Dureza material, String nombre) {
        super(primario, secundario, material, nombre);
        this.consumoBase*=0.5;
        this.sintetizador = new Sintetizador(consola);      
    }
    
    public Consola getConsola(){
        return consola;
    }

    public Sintetizador getSintetizador() {
        return sintetizador;
    }
    
    @Override
    public double usar(ModificadorConsumo modificador, double tiempo)throws FaltaEnergiaException, EnergiaException{
        try {
            consola.escribir("Usando casco en nivel "+modificador.toString()+" por "+tiempo+" segundos");
            return super.consumo(modificador, tiempo);
        } catch (FaltaEnergiaException ex) {
            throw ex;
        } catch (EnergiaException ex) {
            throw ex;
        }
    }
    
}
