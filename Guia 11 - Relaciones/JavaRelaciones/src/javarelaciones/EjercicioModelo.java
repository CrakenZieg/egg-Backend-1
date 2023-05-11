
package javarelaciones;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public interface EjercicioModelo {
    
    Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");
    public void ejercicio();
    
}
/*
try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ExtraEjercicio4.class.getName()).log(Level.SEVERE, null, ex);
        }
*/