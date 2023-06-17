
package test;

import armadura.*;
import excepciones.EnergiaException;
import jarvis.Exoesqueleto;
import utilidad.*;

public class test {
    
    public static void main(String[] args) {
        
        Exoesqueleto exo = new Exoesqueleto();
        exo.completarExoesqueleto(Color.AMARILLO, Color.AMARILLO, Dureza.A);
        try {
            exo.caminar(20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            exo.correr(20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            exo.propulsarse(20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            exo.repulsores(20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            exo.volar(20);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
        try {
            exo.sintetizador(exo.getBateria().estadoBateria());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            exo.consola(exo.getBateria().estadoBateria());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
//        Casco casco = new Casco(Color.AMARILLO, Color.AMARILLO, Dureza.A);
//        Bota bota = new Bota(Color.AMARILLO, Color.AMARILLO, Dureza.A);
//        Guante guante = new Guante(Color.AMARILLO, Color.AMARILLO, Dureza.A);
//        
//        try {
//            System.out.println("Energia: "+casco.getBateria().getEnergia());
//            System.out.println("Energia: "+casco.usar(ModificadorConsumo.I, 2));
//            System.out.println("Energia: "+bota.usar(ModificadorConsumo.I, 2));
//            System.out.println("Energia: "+guante.usar(ModificadorConsumo.I, 2));
//            System.out.println("ConsumoBase: "+ casco.getConsumoBase());
//            System.out.println("ConsumoActual: "+ casco.getConsumoActual());
//            System.out.println("ConsumoBase: "+ bota.getConsumoBase());
//            System.out.println("ConsumoActual: "+ bota.getConsumoActual());
//            System.out.println("ConsumoBase: "+ guante.getConsumoBase());
//            System.out.println("ConsumoActual: "+ guante.getConsumoActual());
//            System.out.println("Consumiendo: "+casco.usar(ModificadorConsumo.III, 2));
//            System.out.println("Consumiendo: "+bota.usar(ModificadorConsumo.III, 2));
//            System.out.println("Consumiendo: "+guante.usar(ModificadorConsumo.III, 2));
//            System.out.println("Energia: "+casco.getBateria().getEnergia());
//            
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        System.out.println("Energia: "+casco.getBateria().getEnergia());
//        
//    }
    }
}
