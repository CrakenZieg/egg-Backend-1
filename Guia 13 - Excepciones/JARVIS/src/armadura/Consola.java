
package armadura;

import utilidad.Consumo;
import utilidad.ModificadorConsumo;
import excepciones.EnergiaException;
import excepciones.FaltaEnergiaException;

public class Consola implements Consumo{
    
    private double consumoBase = 0.0001;
    
    public void escribir(String mensaje){
        try {
            consumo(ModificadorConsumo.I,consumoBase);
            System.out.println("Consola: "+mensaje);
        } catch (FaltaEnergiaException e) {
            System.out.println("Consola: "+mensaje);
            System.out.println(e.getMessage());
        }catch (EnergiaException e) {
            System.out.println("Consola: "+mensaje);
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public double consumo(ModificadorConsumo modificador, double consumo) throws FaltaEnergiaException,EnergiaException{
        try {
            return bateria.consumir(modificador,consumo,this.getClass().getSimpleName());
        }catch (FaltaEnergiaException e){
            throw e;
        } 
    }

}
