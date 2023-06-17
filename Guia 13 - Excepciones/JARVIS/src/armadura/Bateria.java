
package armadura;

import utilidad.ModificadorConsumo;
import excepciones.*;

public class Bateria {
    
    private final double energiaTotal = 1000;
    private double energia = 1000;
    private boolean override = false;

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }
    
    public String estadoBateria(){
        return getPorcentaje()+"% de bateria";
    }
    
    public double getPorcentaje(){
        return (energia/energiaTotal)*100;
    }
    
    public double consumir(ModificadorConsumo modificador, double consumo, String consumidor) throws FaltaEnergiaException, EnergiaException {
        if(getPorcentaje()<=0){            
            throw new Error("Sin batería");            
        }else if(getPorcentaje()<=1){            
            throw new EnergiaException();
        }
        try {
            double cosumoFinal = consumo*modificador.getModificador();
            if(cosumoFinal>energia){
                throw new FaltaEnergiaException(consumidor);
            } else {
                energia-=cosumoFinal;
                return cosumoFinal;
            }
        } catch (FaltaEnergiaException e) {
            throw e;
        }
    }
   
}
