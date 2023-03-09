
package javaintrop1;

import ejercicios.*;
import java.util.Scanner;

public class JavaIntroP1 {

    public static void main(String[] args) {
     
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese el número del ejercicio a mostrar (1-6 ejercicios, 0 salir): ");
            opcion = sc.nextInt();
            switch (opcion){
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
                    TeoriaEjercicios teoriaEjercicios = new TeoriaEjercicios();
                    teoriaEjercicios.ejercicio();
                    break;
                }
            }
        } while (opcion!=0);
        System.out.println("Gracias! Saludos!");
    }
}
