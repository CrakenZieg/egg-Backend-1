
package javaintrop2yextra;

import teoria.*;
import practica.*;
import extra.*;
import java.util.Scanner;

public class JavaIntroP2YExtra {

    public static void main(String[] args) {
        String opcionA;
        int opcionB;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------------------------------------");
            System.out.println("Ingrese el tipo de ejercicio ('T'eorico, 'P'ractico, 'E'xtra, 'S'alir):");
            opcionA = sc.next().toUpperCase();
            if(!opcionA.equals("S")){
                System.out.println("Ingrese el número del ejercicio a mostrar (T:6-10, P:1-8, E:1-14, 0 salir): ");
                opcionB = sc.nextInt();
                System.out.println("------------------------------------------");
            } else {
                opcionB=0;
                System.out.println("------------------------------------------");
            }
            switch (opcionA){
                case "T" ->{
                    switch (opcionB){
                        case 6 -> {
                            TeoriaEjercicios6 teoriaEjercicios6 = new TeoriaEjercicios6();
                            teoriaEjercicios6.ejercicio();
                            break;
                        }
                        case 7 -> {
                            TeoriaEjercicios7 teoriaEjercicios7 = new TeoriaEjercicios7();
                            teoriaEjercicios7.ejercicio();
                            break;
                        }
                        case 8 -> {
                            TeoriaEjercicios8 teoriaEjercicios8 = new TeoriaEjercicios8();
                            teoriaEjercicios8.ejercicio();
                            break;
                        }
                        case 9 -> {
                            TeoriaEjercicios9 teoriaEjercicios9 = new TeoriaEjercicios9();
                            teoriaEjercicios9.ejercicio();
                            break;
                        }
                        case 10 -> {
                            TeoriaEjercicios10 teoriaEjercicios10 = new TeoriaEjercicios10();
                            teoriaEjercicios10.ejercicio();
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
                        case 5 -> {
                            Ejercicio5 ejercicio5 = new Ejercicio5();
                            ejercicio5.ejercicio();
                            break;
                        }
                        case 6 -> {
                            Ejercicio6 ejercicio6 = new Ejercicio6();
                            ejercicio6.ejercicio();
                            break;
                        }
                        case 7 -> {
                            Ejercicio7 ejercicio7 = new Ejercicio7();
                            ejercicio7.ejercicio();
                            break;
                        }
                        case 8 -> {
                            Ejercicio8 ejercicio8 = new Ejercicio8();
                            ejercicio8.ejercicio();
                            break;
                        }
                    }
                    break;
                }
                case "E" ->{
                    switch (opcionB){
                        case 1 -> {
                            ExtraEjercicio1 ejercicio1 = new ExtraEjercicio1();
                            ejercicio1.ejercicio();
                            break;
                        }
                        case 2 -> {
                            ExtraEjercicio2 ejercicio2 = new ExtraEjercicio2();
                            ejercicio2.ejercicio();
                            break;
                        }
                        case 3 -> {
                            ExtraEjercicio3 ejercicio3 = new ExtraEjercicio3();
                            ejercicio3.ejercicio();
                            break;
                        }
                        case 4 -> {
                            ExtraEjercicio4 ejercicio4 = new ExtraEjercicio4();
                            ejercicio4.ejercicio();
                            break;
                        }
                        case 5 -> {
                            ExtraEjercicio5 ejercicio5 = new ExtraEjercicio5();
                            ejercicio5.ejercicio();
                            break;
                        }
                        case 6 -> {
                            ExtraEjercicio6 ejercicio6 = new ExtraEjercicio6();
                            ejercicio6.ejercicio();
                            break;
                        }
                        case 7 -> {
                            ExtraEjercicio7 ejercicio7 = new ExtraEjercicio7();
                            ejercicio7.ejercicio();
                            break;
                        }
                        case 8 -> {
                            ExtraEjercicio8 ejercicio8 = new ExtraEjercicio8();
                            ejercicio8.ejercicio();
                            break;
                        }
                        case 9 -> {
                            ExtraEjercicio9 ejercicio9 = new ExtraEjercicio9();
                            ejercicio9.ejercicio();
                            break;
                        }
                        case 10 -> {
                            ExtraEjercicio10 ejercicio10 = new ExtraEjercicio10();
                            ejercicio10.ejercicio();
                            break;
                        }
                        case 11 -> {
                            ExtraEjercicio11 ejercicio11 = new ExtraEjercicio11();
                            ejercicio11.ejercicio();
                            break;
                        }
                        case 12 -> {
                            ExtraEjercicio12 ejercicio12 = new ExtraEjercicio12();
                            ejercicio12.ejercicio();
                            break;
                        }
                        case 13 -> {
                            ExtraEjercicio13 ejercicio13 = new ExtraEjercicio13();
                            ejercicio13.ejercicio();
                            break;
                        }
                        case 14 -> {
                            ExtraEjercicio14 ejercicio14 = new ExtraEjercicio14();
                            ejercicio14.ejercicio();
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
    
