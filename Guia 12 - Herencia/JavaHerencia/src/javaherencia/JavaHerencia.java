
package javaherencia;

import java.util.Scanner;
import ejercicios.*;

public class JavaHerencia {

    public static void main(String[] args) {
        String opcionA;
        int opcionB;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------------------------------------");
            System.out.println("Ingrese el tipo de ejercicio ('T'eorico, 'P'ractico, 'E'xtra, 'S'alir):");
            opcionA = sc.next().toUpperCase();
            if(!opcionA.equals("S")){
                System.out.println("Ingrese el número del ejercicio a mostrar (T:1, P:1-4, E:1-4, 0 salir): ");
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
                    }
                }
                case "P" ->{
                    switch (opcionB){
                        case 1 -> {
                            EjercicioModelo ejercicio1 = new Ejercicio1();
                            ejercicio1.ejercicio();
                            break;
                        }
                        case 2,3 -> {
                            EjercicioModelo ejercicio2 = new Ejercicio2y3();
                            ejercicio2.ejercicio();
                            break;
                        }
                        case 4 -> {
                            EjercicioModelo ejercicio4 = new Ejercicio4();
                            ejercicio4.ejercicio();
                            break;
                        }
                    }
                    break;
                }
                case "E" ->{
                    switch (opcionB){
                        case 1 -> {
                            EjercicioModelo ejercicio1 = new Extra1();
                            ejercicio1.ejercicio();
                            break;
                        }
                        case 2 -> {
                            EjercicioModelo ejercicio2 = new Extra2();
                            ejercicio2.ejercicio();
                            break;
                        }     
                        case 3 -> {
                            EjercicioModelo ejercicio3 = new Extra3();
                            ejercicio3.ejercicio();
                            break;
                        }
//                        case 4 -> {
//                            EjercicioModelo ejercicio4 = new Extra4();
//                            ejercicio4.ejercicio();
//                            break;
//                        }
                    }
                    break;
                }
            }
        } while (opcionB!=0);
        System.out.println("Gracias! Saludos!");
    }
    
}
