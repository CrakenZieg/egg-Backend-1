
package extra;

import javarelaciones.EjercicioModelo;
import domain.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import servicio.AdopcionEx1Servicio;

public class ExtraEjercicio1 implements EjercicioModelo{

    @Override
    public void ejercicio() {
        
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");
        List<PersonaEx1> personas = new ArrayList<>();
        List<PerroEx1> perros = new ArrayList<>();
        AdopcionEx1Servicio servicio = new AdopcionEx1Servicio();
        
        int opcion;
        do{
            System.out.println("Ingrese una opcion\n"+
                "1. Cargar persona\n"+
                "2. Cargar perro\n"+
                "3. Asignar parejas\n"+
                "4. Automatico\n"+
                "5. Mostrar Listas\n"+
                "6. Mostrar candidatos disponibles\n"+
                "0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 ->{
                    personas.add(servicio.crearPersona());
                }
                case 2 ->{
                    perros.add(servicio.crearPerro());
                }
                case 3 ->{
                    System.out.println("Automaticamente? (S/N)");
                    String op = sc.next();
                    if(op.equalsIgnoreCase("n")){
                        servicio.asignar(personas, perros);
                    } else {
                        servicio.asignarAuto(personas, perros);
                    }
                }
                case 4 ->{
                    System.out.println("Ingrese la cantidad de candidatos: ");
                    int n = sc.nextInt();
                    servicio.cargarListasAuto(personas, perros, n);
                }
                case 5 ->{
                    servicio.mostrarListas(personas, perros, "Los listas son: ");
                }
                case 6 ->{
                    servicio.mostrarListasFil(personas, perros);
                }
                case 0 ->{
                    System.out.println("Saludos!");
                }
                default->{
                    System.out.println("Opcion no valida");
                }
            }
        }while(opcion!=0);
        
    }
    
}
/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
*/