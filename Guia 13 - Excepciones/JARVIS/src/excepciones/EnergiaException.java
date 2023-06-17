
package excepciones;

public class EnergiaException extends Exception{

    public EnergiaException() {        
        System.out.println("Alerta: menos de 1% de bateria, se reserva para sistemas vitales");
    }

    public EnergiaException(String msg) {
        System.out.println("Alerta: "+msg+"% de bateria");
    }
}
