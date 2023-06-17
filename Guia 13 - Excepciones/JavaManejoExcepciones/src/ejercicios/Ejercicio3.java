
package ejercicios;

import ejercicio3.DivisionNumero;
import javamanejoexcepciones.EjercicioModelo;

public class Ejercicio3 implements EjercicioModelo{
    
    DivisionNumero service = new DivisionNumero();

    @Override
    public void ejercicio() throws Exception {
        String a,b;
        System.out.println("Ingrese el valor a:");
        a = sc.next();
        System.out.println("Ingrese el valor b:");
        b = sc.next();
        try{
            service.setA(Integer.parseInt(a));
            service.setB(Integer.parseInt(b));
        } catch (NumberFormatException e){
            System.out.println("Trataste de convertir un 'String' en un 'int',"
                    + " capo.. Es un lenguaje fuertemente tipado pibe\n"
                    + "Setteando a y b a 1 por default en el bloque catch");
            service.setA(1);
            service.setB(1);
        }
        System.out.println("El metodo realizarDivision() de "+service.toString()+", retorna: "+service.realizarDivision());
        
    }
  
}
/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
*/
