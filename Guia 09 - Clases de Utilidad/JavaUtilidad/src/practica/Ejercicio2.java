
package practica;

import entities.ParDeNumeros;
import javaservicios.EjercicioModelo;
import service.ParDeNumerosServicio;

public class Ejercicio2 implements EjercicioModelo {

    @Override
    public void ejercicio() {
        
        ParDeNumerosServicio service = new ParDeNumerosServicio();
        ParDeNumeros auto = new ParDeNumeros();
        ParDeNumeros mano = new ParDeNumeros(2,4);
        
        System.out.println("Contructor vacio: ");
        System.out.println("Los valores son: ");
        service.mostrarValores(auto);
        System.out.println("El mayor es: "+service.devolverMayor(auto));
        System.out.println("Potencia: "+service.calcularPotencia(auto));
        System.out.println("Raiz: "+service.calrcularRaiz(auto));
        System.out.println("Constructor con parametros (2,4):");
        System.out.println("Los valores son: ");
        service.mostrarValores(mano);
        System.out.println("El mayor es: "+service.devolverMayor(mano));
        System.out.println("Potencia: "+service.calcularPotencia(mano));
        System.out.println("Raiz: "+service.calrcularRaiz(mano));
        
    }
    
}
/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos números 
reales con los cuales se realizarán diferentes operaciones matemáticas. La clase 
debe tener un constructor vacío, getters y setters.  En el constructor vacío 
se usará el Math.random para generar los dos números. Crear una clase 
ParDeNumerosService, en el paquete Servicios, que deberá además implementar los 
siguientes métodos:
-Método mostrarValores que muestra cuáles son los dos números guardados.
-Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
-Método calcularPotencia para calcular la potencia del mayor valor de la clase 
elevado al menor número. Previamente se deben redondear ambos valores.
-Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/