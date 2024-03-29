
package javaintrop2yextra;

import teoria.*;
import practica.*;
import java.util.Scanner;

public class JavaIntroP2YExtra {

    public static void main(String[] args) {
        String opcionA;
        int opcionB;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------------------------------------");
            System.out.println("Ingrese el tipo de ejercicio ('T'eorico, 'P'ractico, 'S'alir):");
            opcionA = sc.next().toUpperCase();
            if(!opcionA.equals("S")){
                System.out.println("Ingrese el número del ejercicio a mostrar (T:11-12, P:1-4, 0 salir): ");
                opcionB = sc.nextInt();
                System.out.println("------------------------------------------");
            } else {
                opcionB=0;
                System.out.println("------------------------------------------");
            }
            switch (opcionA){
                case "T" ->{
                    switch (opcionB){
                        case 11 -> {
                            TeoriaEjercicio11 teoriaEjercicios6 = new TeoriaEjercicio11();
                            teoriaEjercicios6.ejercicio();
                            break;
                        }
                        case 12 -> {
                            TeoriaEjercicio12 teoriaEjercicios7 = new TeoriaEjercicio12();
                            teoriaEjercicios7.ejercicio();
                            break;
                        }
                        
                    }
                    break;
                }
                case "P" ->{
                    switch (opcionB){
                        case 1 -> {
                            Ejercicio1 ejercicio1 = new Ejercicio1();
                            ejercicio1.ejercicio();
                            break;
                        }
                        case 2 -> {
                            Ejercicio2 ejercicio2 = new Ejercicio2();
                            ejercicio2.ejercicio();
                            break;
                        }
                        case 3 -> {
                            Ejercicio3 ejercicio3 = new Ejercicio3();
                            ejercicio3.ejercicio();
                            break;
                        }
                        case 4 -> {
                            Ejercicio4 ejercicio4 = new Ejercicio4();
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
    
