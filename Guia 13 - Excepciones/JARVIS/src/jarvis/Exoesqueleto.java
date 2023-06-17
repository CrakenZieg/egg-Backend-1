
package jarvis;

import armadura.*;
import excepciones.*;
import java.util.ArrayList;
import java.util.List;
import utilidad.*;

public class Exoesqueleto {
    
    private Bateria bateria;
    private Consola consola;
    private Sintetizador sintetizador;
    private Casco casco;
    private Torzo torzo;
    private Guante brazoIzquierdo;
    private Guante brazoDerecho;
    private Bota piernaIzquierda;
    private Bota piernaDerecha;
    List<PiezaArmadura> partes = new ArrayList<>();

    public Exoesqueleto() {
    }
    
    public void completarExoesqueleto(Color primario, Color secundario, Dureza material){
        casco = new Casco(primario, secundario, material, "Casco"); 
        partes.add(casco);
        torzo = new Torzo(primario, secundario, material, "Torzo");
        partes.add(torzo);
        this.bateria = this.torzo.getBateria();
        brazoIzquierdo = new Guante(primario, secundario, material, "Brazo izquierdo");
        partes.add(brazoIzquierdo);
        brazoDerecho = new Guante(primario, secundario, material, "Brazo derecho");
        partes.add(brazoDerecho);
        piernaIzquierda = new Bota(primario, secundario, material, "Pierna izquierda");
        partes.add(piernaIzquierda);
        piernaDerecha = new Bota(primario, secundario, material, "Pierna derecho");
        partes.add(piernaDerecha);
        this.consola = casco.getConsola();
        this.sintetizador = casco.getSintetizador();
    }
    
    public double caminar(double tiempo) throws FaltaEnergiaException, EnergiaException{
        double retorno = 0;
        try {
            if(piernaIzquierda!=null&&piernaDerecha!=null){
                retorno += piernaIzquierda.usar(ModificadorConsumo.I, tiempo);
                retorno += piernaDerecha.usar(ModificadorConsumo.I, tiempo);
            } else if(piernaIzquierda!=null){
                consola.escribir("Tu pierna derecha no responde!");
                retorno += piernaIzquierda.usar(ModificadorConsumo.I, tiempo);
            } else if(piernaDerecha!=null){
                consola.escribir("Tu pierna izquierda no responde!");
                retorno += piernaDerecha.usar(ModificadorConsumo.I, tiempo);
            } else {
                consola.escribir("Tus piernas no responden, estas inmobil!");
            }
        } catch (Exception e){
            consola.escribir(e.getMessage());
        }
        return retorno;
    }
    
    public double correr(double tiempo) throws FaltaEnergiaException, EnergiaException{
        double retorno = 0;
        try {
            if(piernaIzquierda!=null&&piernaDerecha!=null){
                retorno += piernaIzquierda.usar(ModificadorConsumo.II, tiempo);
                retorno += piernaDerecha.usar(ModificadorConsumo.II, tiempo);
            } else if(piernaIzquierda!=null){
                consola.escribir("Tu pierna derecha no responde!");
                retorno += piernaIzquierda.usar(ModificadorConsumo.II, tiempo);
            } else if(piernaDerecha!=null){
                consola.escribir("Tu pierna izquierda no responde!");
                retorno += piernaDerecha.usar(ModificadorConsumo.II, tiempo);
            } else {
                consola.escribir("Tus piernas no responden, estas inmobil!");
            }
        } catch (Exception e){
            consola.escribir(e.getMessage());
        }
        return retorno;
    }
    
    public double propulsarse(double tiempo) throws FaltaEnergiaException, EnergiaException{
        double retorno = 0;
        try {
            if(piernaIzquierda!=null&&piernaDerecha!=null){
                retorno += piernaIzquierda.usar(ModificadorConsumo.III, tiempo);
                retorno += piernaDerecha.usar(ModificadorConsumo.III, tiempo);
            } else if(piernaIzquierda!=null){
                consola.escribir("Tu pierna derecha no responde!");
                retorno += piernaIzquierda.usar(ModificadorConsumo.III, tiempo);
            } else if(piernaDerecha!=null){
                consola.escribir("Tu pierna izquierda no responde!");
                retorno += piernaDerecha.usar(ModificadorConsumo.III, tiempo);
            } else {
                consola.escribir("Tus piernas no responden, estas inmobil!");
            }
        } catch (Exception e){
            consola.escribir(e.getMessage());
        }
        return retorno;
    }
    
    public double volar(double tiempo) throws FaltaEnergiaException, EnergiaException{
        double retorno = 0;
        try {
            if(piernaIzquierda==null){
                consola.escribir("Tu pierna izquierda no responde!");
            } else {
                retorno += piernaIzquierda.usar(ModificadorConsumo.III, tiempo);
            }             
            if(piernaDerecha==null){
                consola.escribir("Tu pierna derecha no responde!");
            } else {
                retorno += piernaDerecha.usar(ModificadorConsumo.III, tiempo);
            }
            if(brazoDerecho==null){
                consola.escribir("Tu brazo derecho no responde!");
            } else {
                retorno += brazoDerecho.usar(ModificadorConsumo.II, tiempo);
            } 
            if(brazoIzquierdo==null) {
                consola.escribir("Tus brazo izquierdo, no responde!");
            } else {
                retorno += brazoIzquierdo.usar(ModificadorConsumo.II, tiempo);
            }
        } catch (Exception e){
            consola.escribir(e.getMessage());
        }
        return retorno;
    }
    
    public double repulsores(double tiempo) throws FaltaEnergiaException,EnergiaException{
        double retorno = 0;
        try{
            if(brazoDerecho==null){
                consola.escribir("Tu brazo derecho no responde!");
            } else {
                retorno += brazoDerecho.usar(ModificadorConsumo.III, tiempo);
            } 
            if(brazoIzquierdo==null) {
                consola.escribir("Tus brazo izquierdo, no responde!");
            } else {
                retorno += brazoIzquierdo.usar(ModificadorConsumo.III, tiempo);
            }
        } catch (Exception e){
            consola.escribir(e.getMessage());
        }
        return retorno;
    }

    public Bateria getBateria() {
        return bateria;
    }
    
    public void sintetizador(String mensaje)throws FaltaEnergiaException,EnergiaException{
        try {
            this.sintetizador.leer(mensaje);
        } catch (Exception e){
            consola.escribir(e.getMessage());
        }
    }
    public void consola(String mensaje)throws FaltaEnergiaException,EnergiaException{
        try {
            this.consola.escribir(mensaje);
        } catch (Exception e){
            consola.escribir(e.getMessage());
        }
    }
    
    public void estadoDeLaBateria(){
        consola.escribir(getBateria().estadoBateria());
    }
    
    public void mostrarInformacionDelReactor(){
        double energia = getBateria().getEnergia();
        consola.escribir("Reactor: "+energia+" kWh, "+(energia*3.6)+" MJ");
    }
    
    public void RevisandoDispositivos(){
        for (PiezaArmadura parte : partes) {
            while(parte.getSaludActual()>0&&parte.getSaludActual()<=100){
                try {
                    parte.repararDanos();
                } catch (FaltaEnergiaException ex) {
                    consola.escribir(ex.getMessage());
                } catch (EnergiaException ex) {                
                    consola.escribir(ex.getMessage());
                } catch (VidaException ex) {                
                    consola.escribir(ex.getMessage());
                }
            }    
        }           
    }
    
}
