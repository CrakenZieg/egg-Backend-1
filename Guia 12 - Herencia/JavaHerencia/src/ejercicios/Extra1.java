
package ejercicios;

import ejercicios.extra1.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javaherencia.EjercicioModelo;

public class Extra1 implements EjercicioModelo{

    @Override
    public void ejercicio() {
        
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");
        List<Alquiler> alquileres = new ArrayList<>();
        AlquilerService service = new AlquilerService(alquileres,sc);
        int opcion;
        
        do{
            System.out.println("Ingrese una opcion: "
                                +"\n1. Crear alquiler"                    
                                +"\n2. Pagar alquiler"                                
                                +"\n3. Mostrar alquiler"
                                +"\n4. Mostrar alquileres"
                                +"\n5. Modificar alquiler"
                                +"\n6. Eliminar alquiler"
                                +"\n0. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1 ->{service.crearAlquiler();}
                case 2 ->{service.pagarCuota();}
                case 3 ->{service.mostrarAlquiler();}
                case 4 ->{service.mostrarAlquileres();}
                case 5 ->{service.modificarAlquiler();}
                case 6 ->{service.eliminarAlquiler();}
                case 0 ->{System.out.println("Gracias por usar nuestros servicios");}
            }
        }while(opcion!=0);
        
    }
    
}
/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
*/