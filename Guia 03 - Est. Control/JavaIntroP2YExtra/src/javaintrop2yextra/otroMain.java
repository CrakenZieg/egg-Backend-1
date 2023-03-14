/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
HECHO EN GRUPO
*/

package javaintrop2yextra;

import java.util.Scanner;

public class otroMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.print("Ingrese la nota (0-10): ");
        nota = sc.nextInt();
        while (nota<0 || nota>10){
            System.out.print("Nota incorrecta, ingrese una nota valida (0-10): ");
            nota = sc.nextInt();
            System.out.println("");
        }
        System.out.println("La nota es de " + nota);
    }
}
