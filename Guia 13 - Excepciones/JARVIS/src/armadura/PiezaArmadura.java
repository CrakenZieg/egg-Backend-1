
package armadura;

import excepciones.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilidad.*;

public class PiezaArmadura implements Consumo, UsableInterface, ReparableInterface{
        
    public static Consola consola = new Consola();
    protected Dureza material;
    protected Color primario, secundario;
    protected double nivelSalud, consumoBase, nivelMaximoSalud; 
    protected String nombre;

    public PiezaArmadura(Color primario, Color secundario, Dureza material, String nombre){       
        this.nombre = nombre;
        this.material = material;
        this.consumoBase = 1+material.getDurabilidad()/100;
        this.nivelMaximoSalud = 100+material.getDurabilidad()/10;
        this.nivelSalud = this.nivelMaximoSalud;
    }
    
    public Color getPrimario() {
        return primario;
    }

    public void setPrimario(Color primario) {
        this.primario = primario;
    }

    public Color getSecundario() {
        return secundario;
    }

    public void setSecundario(Color secundario) {
        this.secundario = secundario;
    }

    public double getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(double nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public Dureza getMaterial() {
        return material;
    }
    
    public double getConsumoBase() {
        return consumoBase;
    }

    public void setConsumoBase(double consumoBase) {
        this.consumoBase = consumoBase;
    }
    
    public double getConsumoActual(){
        return consumoBase*(2-(nivelSalud/nivelMaximoSalud));
    }
    
    @Override
    public double consumo(ModificadorConsumo modificador, double tiempo) throws FaltaEnergiaException, EnergiaException {
        try {
            return bateria.consumir(modificador,getConsumoActual()*tiempo,this.getClass().getSimpleName());
        }catch (FaltaEnergiaException e){
            throw e;
        }catch (EnergiaException e){
            throw e;
        } 
    }
    
    @Override
    public double usar(ModificadorConsumo modificador, double tiempo)throws FaltaEnergiaException, EnergiaException, VidaException{
        try {
            if(nivelSalud<=0){
                throw new VidaException(this.getClass().getSimpleName()+" fue destruida!");
            }
            double resultado = this.consumo(modificador, tiempo);
            int n = rand.nextInt(0, 9);
            if(n<3){
                recibirDano(rand.nextDouble(nivelSalud/100, nivelSalud/2));
            }
            return resultado;
        } catch (FaltaEnergiaException ex) {
            throw ex;
        } catch (EnergiaException ex) {
            throw ex;
        } catch (VidaException ex) {
            throw ex;
        }
    }
    
    public double getSaludActual(){
        return (nivelSalud/nivelMaximoSalud)*100;
    }
    
    public String getSaludActualMSJ(){
        return (nivelSalud/nivelMaximoSalud)*100+"% de salud";
    }
    
    public double recibirDano(double daño) throws VidaException{
        nivelSalud -= daño*(1-material.getDurabilidad()/100);
        if(nivelSalud<=0){
            throw new VidaException(this.getClass().getSimpleName()+" fue destruida!");
        }        
        return nivelSalud;        
    }
        
    protected static Bateria getBateria() {
        return bateria;
    }
    
    public String mostrarEstado(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.nombre).append(": \n");
        sb.append(this.nivelSalud).append("/");
        sb.append(this.nivelMaximoSalud).append(" || ").append(this.getSaludActual()).append("%\n");
        sb.append("Consumo actual: ").append(getConsumoActual()).append("kW/s");
        return sb.toString();
    }

    @Override
    public boolean repararDanos() throws FaltaEnergiaException, EnergiaException, VidaException {
        boolean resultado = false;
        try {
            consola.escribir("Intentando reparar: "+this.getClass().getSimpleName());
            if(nivelSalud<=0){
                throw new VidaException(this.getClass().getSimpleName()+" fue destruida!");
            }
            if(nivelSalud==nivelMaximoSalud){
                throw new VidaException(this.getClass().getSimpleName()+" está intacta!");
            } else{
                int n = rand.nextInt(0, 9);
                if(n<4){
                    resultado = true;
                    double curar = rand.nextDouble(nivelMaximoSalud/50, nivelMaximoSalud/2);
                    if(curar>=(nivelMaximoSalud-nivelSalud)){
                        nivelSalud = nivelMaximoSalud;
                    } else {
                        nivelSalud += curar;
                    }
                } else if(n>6){
                    recibirDano(rand.nextDouble(nivelSalud/100, nivelSalud/2));
                }
            }
            consola.escribir(getSaludActualMSJ());
        } catch (VidaException ex) {
            throw ex;
        } finally{            
            return resultado;
        }
    }
    
}
