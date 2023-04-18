
package extra;

import entities.Fraccion;
import java.util.Scanner;
import javaservicios.EjercicioModelo;
import static service.FraccionService.*;

public class Extra1 implements EjercicioModelo {
    
    Fraccion fracc = new Fraccion();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    @Override
    public void ejercicio() {

        int opcion=0;
        do{
            System.out.println("--------------------------");
            System.out.println("Ingrese una opcion:");
            System.out.println("1. Cargar nuevas fracciones");
            System.out.println("2. Mostrar las fracciones");
            System.out.println("3. Sumarlos");
            System.out.println("4. Restarlos");
            System.out.println("5. Multiplicarlos");
            System.out.println("6. Dividirlos");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1 -> {cargar();}
                case 2 -> {
                    System.out.println("Las fracciones son "
                    + fracc.getNum1()+"/"+fracc.getDen1() + " y "
                    + fracc.getNum2()+"/"+fracc.getDen2());
                }
                case 3 -> {
                    int[] res = sumar(fracc);
                    System.out.println("--------------------------");
                    System.out.println("El resultado de sumar "
                    + fracc.getNum1()+"/"+fracc.getDen1() + " y "
                    + fracc.getNum2()+"/"+fracc.getDen2() + " es "
                    + res[0]+"/"+res[1]);
                }
                case 4 -> {
                    int[] res = restar(fracc);
                    System.out.println("--------------------------");
                    System.out.println("El resultado de restar "
                    + fracc.getNum1()+"/"+fracc.getDen1() + " y "
                    + fracc.getNum2()+"/"+fracc.getDen2() + " es "
                    + res[0]+"/"+res[1]);
                }
                case 5 -> {
                    int[] res = multiplicar(fracc);
                    System.out.println("--------------------------");
                    System.out.println("El resultado de multiplicar "
                    + fracc.getNum1()+"/"+fracc.getDen1() + " y "
                    + fracc.getNum2()+"/"+fracc.getDen2() + " es "
                    + res[0]+"/"+res[1]);
                }
                case 6 -> {
                    int[] res = dividir(fracc);
                    System.out.println("--------------------------");
                    System.out.println("El resultado de dividir "
                    + fracc.getNum1()+"/"+fracc.getDen1() + " y "
                    + fracc.getNum2()+"/"+fracc.getDen2() + " es "
                    + res[0]+"/"+res[1]);
                }
                case 0 -> {
                    System.out.println("--------------------------");
                    System.out.println("Gracias, saludos!");
                }
            }
        } while (opcion!=0);
    }
    
    public void cargar(){
        System.out.println("Ingrese el numerador del 1er numero:");
        fracc.setNum1(sc.nextInt());
        System.out.println("Ingrese el denominador del 1er numero:");
        fracc.setDen1(sc.nextInt());
        System.out.println("Ingrese el numerador de 2do numero:");
        fracc.setNum2(sc.nextInt());
        System.out.println("Ingrese el denominador de 2do numero:");
        fracc.setDen2(sc.nextInt());
    }
    
}
/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
*/