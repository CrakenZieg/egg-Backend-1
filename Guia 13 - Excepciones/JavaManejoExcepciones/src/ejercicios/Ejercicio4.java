
package ejercicios;

import ejercicio4.Operaciones;
import javamanejoexcepciones.EjercicioModelo;

public class Ejercicio4 implements EjercicioModelo{
    
    Operaciones operaciones = new Operaciones();
    
    @Override
    public void ejercicio() {
        try {
            operaciones.ingresarNumerosYDividir();
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
    
}
/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
*/
