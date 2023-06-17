
package ejercicio4;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Operaciones {
    
    Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");
    private int a, b;

    public Operaciones() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public void ingresarNumerosYDividir() throws Exception{
        String aString="",bString="";
        try {
            System.out.println("Ingrese el valor de a:");
            aString = sc.next();
            System.out.println("Ingrese el valor de b:");
            bString = sc.next();            
            if(aString.isBlank()||bString.isBlank()){
                throw new Exception("Debes ingresar algun valor! \na: "+aString+" b: "+bString);
            }
            this.a=Integer.parseInt(aString);
            this.b=Integer.parseInt(bString);
            System.out.println("El resultado de dividirlos es: "+ ((double)a/(double)b));
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Debes ingresar algun valor numerico entero! \na: "+aString+" b: "+bString);
        } catch (ArithmeticException e){
            throw new ArithmeticException("Intentaste dividir por cero!");
        } catch (Exception e){
            System.out.println(e.getMessage());
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
