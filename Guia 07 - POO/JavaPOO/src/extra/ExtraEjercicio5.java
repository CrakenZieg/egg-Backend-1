/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea 
un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo 
de la cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar 
una transacción de retiro.
*/

package extra;

import entidades.*;
import javapoo.*;
import java.util.Scanner;

public class ExtraEjercicio5 implements EjercicioModelo{
    
    @Override
    public void ejercicio(){
        
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        
        System.out.println("Cuenta creada!");
        System.out.println("Ingrese Titular:");
        cuenta.setTitular(sc.next());
        System.out.println("Ingrese fondos:");
        cuenta.agregar_dinero(sc.nextDouble());
        System.out.println(cuenta.toString());
        System.out.println("Retire fondos:");
        cuenta.retirar_dinero(sc.nextDouble());
       
    }
}
