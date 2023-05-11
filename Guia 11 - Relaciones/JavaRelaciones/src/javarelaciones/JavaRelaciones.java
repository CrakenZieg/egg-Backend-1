
package javarelaciones;

import java.util.Scanner;
import teoria.*;
import practica.*;
import extra.*;

public class JavaRelaciones {

    public static void main(String[] args) {
        String opcionA;
        int opcionB;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------------------------------------");
            System.out.println("Ingrese el tipo de ejercicio ('T'eorico, 'P'ractico, 'E'xtra, 'S'alir):");
            opcionA = sc.next().toUpperCase();
            if(!opcionA.equals("S")){
                System.out.println("Ingrese el número del ejercicio a mostrar (T:1-2, P:1-3, E:1-4, 0 salir): ");
                opcionB = sc.nextInt();
                System.out.println("------------------------------------------");
            } else {
                opcionB=0;
                System.out.println("------------------------------------------");
            }
            switch (opcionA){
                case "T" ->{
                    switch (opcionB){
                        case 1 -> {
                            EjercicioModelo teoria = new Teoria1();
                            teoria.ejercicio();
                            break;
                        }
                        case 2 -> {
                            EjercicioModelo teoria = new Teoria2();
                            teoria.ejercicio();
                            break;
                        }
                    }
                    break;
                }
                case "P" ->{
                    switch (opcionB){
                        case 1 -> {
                            EjercicioModelo ejercicio1 = new Ejercicio1();
                            ejercicio1.ejercicio();
                            break;
                        }
                        case 2 -> {
                            EjercicioModelo ejercicio2 = new Ejercicio2();
                            ejercicio2.ejercicio();
                            break;
                        }
                        case 3 -> {
                            EjercicioModelo ejercicio3 = new Ejercicio3();
                            ejercicio3.ejercicio();
                            break;
                        }
                    }
                    break;
                }
                case "E" ->{
                    switch (opcionB){
                        case 1 -> {
                            EjercicioModelo ejercicio1 = new ExtraEjercicio1();
                            ejercicio1.ejercicio();
                            break;
                        }
                        case 2 -> {
                            EjercicioModelo ejercicio2 = new ExtraEjercicio2();
                            ejercicio2.ejercicio();
                            break;
                        }     
                        case 3 -> {
                            EjercicioModelo ejercicio3 = new ExtraEjercicio3();
                            ejercicio3.ejercicio();
                            break;
                        }
                        case 4 -> {
                            EjercicioModelo ejercicio4 = new ExtraEjercicio4();
                            ejercicio4.ejercicio();
                            break;
                        }
                    }
                    break;
                }
            }
        } while (opcionB!=0);
        System.out.println("Gracias! Saludos!");
    }
    
}
