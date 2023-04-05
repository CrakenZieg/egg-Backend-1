
package practica;

import entities.Persona;
import java.util.ArrayList;
import javaservicios.EjercicioModelo;
import service.PersonaServicio;

public class Ejercicio3 implements EjercicioModelo {
    
    @Override
    public void ejercicio() {
        
        int imcMenos=0, imcMed=0, imcMas=0, edM=0;
        int n = 50;
        PersonaServicio service = new PersonaServicio();
        ArrayList<Persona> lista = new ArrayList<Persona>();
        int[] imc = new int[n];
        boolean[] ed = new boolean[n];
        for (int i = 0; i < n; i++) {
            lista.add(service.crearPersona());
            imc[i] = service.calcularIMC(lista.get(i));
            ed[i] = service.esMAyorDeEdad(lista.get(i));
            System.out.println("Mayor de edad: "+(lista.get(i).getEdad()>=18));
            System.out.println("IMC: "+service.calcularIMC(lista.get(i)));
        }
        for(int i:imc){
            switch (i){
                case -1:
                    imcMenos++;
                    break;
                case 0:
                    imcMed++;
                    break;
                case 1:
                    imcMas++;
                    break;
            }
        }
        for(boolean i: ed){
            if(i){
                edM++;
            }
        }
        System.out.println("Muestra de "+n+" sujetos:");
        System.out.println("Mayores de edad: "+(edM*100/n));
        System.out.println("Menores de edad: "+((n-edM)*100/n));
        System.out.println("IMC alto: "+(imcMas*100/n));
        System.out.println("IMC medio: "+(imcMed*100/n));
        System.out.println("IMC bajo: "+(imcMenos*100/n));
        
    }
    
    
    
}
/*
Realizar una clase llamada Persona en el paquete de entidades que tengan los 
siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ 
para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo. 
Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
-Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
un booleano.
-Metodo crearPersona(): el método crear persona, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
Si no es correcto se deberá mostrar un mensaje.
-Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, 
significa que la persona está por debajo de su peso ideal y la función devuelve 
un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
significa que la persona está en su peso ideal y la función devuelve un 0. 
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que 
la persona tiene sobrepeso, y la función devuelve un 1.
-A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos 
todos los métodos para cada objeto, deberá comprobar si la persona está en su peso 
ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada 
objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad 
en distintas variables(arrays), para después calcular un porcentaje de esas 4 
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, 
por encima, y también calcularemos un porcentaje de cuantos son mayores de edad 
y cuantos menores. Para esto, podemos crear unos métodos adicionales.
*/