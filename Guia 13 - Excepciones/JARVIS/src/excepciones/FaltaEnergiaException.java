
package excepciones;

public class FaltaEnergiaException extends Exception{

    public FaltaEnergiaException() {
    }

    public FaltaEnergiaException(String msg) {
        System.out.println(msg+": la bateria no es suficiente!");
    }
}
