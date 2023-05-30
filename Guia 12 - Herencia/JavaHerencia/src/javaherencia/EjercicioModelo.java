
package javaherencia;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public interface EjercicioModelo {
    
    Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");
    Random rand = new Random();
    public void ejercicio();
    
}