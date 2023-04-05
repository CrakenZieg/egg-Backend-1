
package service;

import entities.Persona;
import java.util.Random;
import java.util.Scanner;

public class PersonaServicio {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Random rand = new Random();
    
    public Persona crearPersona(){
        String s;
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre:");
        //persona.setNombre(sc.next());
        persona.setNombre(String.valueOf(rand.nextInt(0, 1501)));
        System.out.println(persona.getNombre());
        System.out.println("Ingrese el edad:");
        //persona.setEdad(sc.nextInt());
        persona.setEdad(rand.nextInt(0, 121));
        System.out.println(persona.getEdad());
        //do { 
        System.out.println("Ingrese el sexo(H/M/O):");
        //    s = sc.next().toUpperCase();
        //} while (!s.equals("H")||!s.equals("M")||!s.equals("O"));
        persona.setSexo(sexo());   
        System.out.println(persona.getSexo());
        System.out.println("Ingrese el peso:");
        //persona.setPeso(sc.nextDouble());
        persona.setPeso(rand.nextDouble(35, 250));
        System.out.println(persona.getPeso());
        System.out.println("Ingrese el altura:");
        //persona.setAltura(sc.nextDouble());
        persona.setAltura(rand.nextDouble(1, 2.5));
        System.out.println(persona.getAltura());
        return persona;
    }
    
    public boolean esMAyorDeEdad(Persona persona){
        int mayoria = 18;
        return persona.getEdad() >= mayoria;
    }
    
    public int calcularIMC(Persona persona){
        double IMC = (persona.getPeso()/(Math.pow(persona.getAltura(),2)));
        if(IMC<20){
            System.out.println("Bajo IMC");
            return -1;
        } else if (IMC>25){
            System.out.println("Alto IMC");
            return 1;
        } else {
            System.out.println("IMC normal");
            return 0;
        }
    }
    
    public String sexo(){
        String sexo = "";
        int s = rand.nextInt(0, 3);
        switch (s){
            case 0:
                sexo = "M";
                break;
            case 1:
                sexo = "H";
                break;
            case 2: 
                sexo = "O";
                break;
        }
        return sexo;
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