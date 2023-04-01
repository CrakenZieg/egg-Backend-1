/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, 
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el 
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera 
a pasar una división por cero, el método devuelve 0 y se le informa al usuario el 
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
*/

package practica;

import entidades.Operacion;
import javapoo.*;
import java.util.Scanner;

public class Ejercicio3 implements EjercicioModelo{
    
    @Override
    public void ejercicio(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Desea crear una operacion mediante setters(1) o por parametro(2)?");
            System.out.println("(0 para salir)");
            opcion = sc.nextInt();
            if(opcion==1){
                Operacion operacion = crearOperacionSet();
                menu(operacion);
            } else if (opcion == 2){
                Operacion operacion = crearOperacionParam();
                menu(operacion);
            }
        } while (opcion!=0);        
    }
        
    public void menu(Operacion operacion){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("-----------------------");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Mostrar los valores");
            System.out.println("6. Modificar los valores");
            System.out.println("0. Salir");
            System.out.println("Que operacion desea realizar?");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> System.out.println("Resultado: "+operacion.sumar());
                case 2 -> System.out.println("Resultado: "+operacion.restar());
                case 3 -> System.out.println("Resultado: "+operacion.multiplicar());
                case 4 -> System.out.println("Resultado: "+operacion.dividir());
                case 5 -> {
                    System.out.println("Primer numero: "+operacion.getNumero1());
                    System.out.println("Segundo numero: "+operacion.getNumero2());
                }
                case 6 -> {
                    System.out.println("Ingrese el primer numero: ");
                    operacion.setNumero1(sc.nextDouble());
                    System.out.println("Ingrese el segundo numero: ");
                    operacion.setNumero2(sc.nextDouble());
                }
            } 
            System.out.println("-----------------------");
        } while (opcion!=0);
    }
    
    public Operacion crearOperacionSet(){
        Operacion operacion = new Operacion();
        Scanner sc = new Scanner(System.in);
        double numero1, numero2;
        System.out.println("Ingrese el primer numero:");
        numero1 = sc.nextDouble();
        operacion.setNumero1(numero1);
        System.out.println("Ingrese el segundo numero:");
        numero2 = sc.nextDouble();
        operacion.setNumero2(numero2);
        return operacion;
    }
    
    public Operacion crearOperacionParam(){
        Scanner sc = new Scanner(System.in);
        double numero1, numero2;
        System.out.println("Ingrese el primer numero:");
        numero1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        numero2 = sc.nextDouble();
        Operacion operacion = new Operacion(numero1, numero2);
        return operacion;
    }
}
