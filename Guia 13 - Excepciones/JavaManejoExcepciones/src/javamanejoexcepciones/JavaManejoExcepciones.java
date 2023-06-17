
package javamanejoexcepciones;

import ejercicios.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaManejoExcepciones {

    public static void main(String[] args) throws Exception {
        String opcionA;
        int opcionB;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------------------------------------");
            System.out.println("Ingrese el tipo de ejercicio ('P'ractico, 'E'xtra, 'S'alir):");
            opcionA = sc.next().toUpperCase();
            if(!opcionA.equals("S")){
                System.out.println("Ingrese el número del ejercicio a mostrar (P:1-9, E:1-4, 0 salir): ");
                try{
                    opcionB = sc.nextInt();                    
                } catch(InputMismatchException e){
                    System.out.println("Ingresaste una letra! \n"
                            + "La segunda opcion es el numero de ejercicio!\n"
                            + "Ahora ingresa el numero de ejercicio..");                    
                    opcionB=-1;
                }
                System.out.println("------------------------------------------");
            } else {
                opcionB=0;
                System.out.println("------------------------------------------");
            }
            switch (opcionA){                
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
                        case 4 -> {
                            EjercicioModelo ejercicio4 = new Ejercicio4();
                            ejercicio4.ejercicio();
                            break;
                        }
                        case 5 -> {
                            EjercicioModelo ejercicio5 = new Ejercicio5();
                            ejercicio5.ejercicio();
                            break;
                        }
//                        case 6 -> {
//                            EjercicioModelo ejercicio6 = new Ejercicio6();
//                            ejercicio6.ejercicio();
//                            break;
//                        }
//                        case 7 -> {
//                            EjercicioModelo ejercicio7 = new Ejercicio7();
//                            ejercicio7.ejercicio();
//                            break;
//                        }
//                        case 8 -> {
//                            EjercicioModelo ejercicio8 = new Ejercicio8();
//                            ejercicio8.ejercicio();
//                            break;
//                        }
//                        case 9 -> {
//                            EjercicioModelo ejercicio9 = new Ejercicio9();
//                            ejercicio9.ejercicio();
//                            break;
//                        }
                    }
//                    break;
                }
                case "E" ->{
                    switch (opcionB){
//                        case 1 -> {
//                            EjercicioModelo ejercicio1 = new Extra1();
//                            ejercicio1.ejercicio();
//                            break;
//                        }
//                        case 2 -> {
//                            EjercicioModelo ejercicio2 = new Extra2();
//                            ejercicio2.ejercicio();
//                            break;
//                        }     
//                        case 3 -> {
//                            EjercicioModelo ejercicio3 = new Extra3();
//                            ejercicio3.ejercicio();
//                            break;
//                        }
//                        case 4 -> {
//                            EjercicioModelo ejercicio4 = new Extra4();
//                            ejercicio4.ejercicio();
//                            break;
//                       }
                    }
//                    break;
                }
            }
        } while (opcionB!=0);
        System.out.println("Gracias! Saludos!");
    }
    
}
