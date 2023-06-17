
package armadura;

import utilidad.Consumo;
import utilidad.ModificadorConsumo;
import excepciones.EnergiaException;
import excepciones.FaltaEnergiaException;

public class Sintetizador implements Consumo{

    private double consumoBase = 0.0001;
    
    Consola consola;
    public Sintetizador(Consola consola) {
        this.consola=consola;
    }
    
    public void leer(String mensaje) throws FaltaEnergiaException,EnergiaException{
        try {
            consumo(ModificadorConsumo.I,consumoBase);
            System.out.println("Escuchas "+mensaje+"...");
        } catch (FaltaEnergiaException e) {
            consola.escribir(e.getMessage());
        } catch (EnergiaException e) {
            consola.escribir(e.getMessage());
        }   
    }
    
    @Override
    public double consumo(ModificadorConsumo modificador, double consumo) throws FaltaEnergiaException,EnergiaException {
        try {
            return bateria.consumir(modificador,consumo,this.getClass().getSimpleName());
        }catch (FaltaEnergiaException e){
            throw e;
        }catch (EnergiaException e) {
            throw e;            
        }
    }
}
