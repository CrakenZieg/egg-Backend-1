
package practica;

import entities.CuentaBancaria;
import java.util.Scanner;
import javaservicios.EjercicioModelo;
import service.CuentaBancariaServicio;

public class Ejercicio1 implements EjercicioModelo {

    @Override
    public void ejercicio() {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");  
        int opcion;
        CuentaBancariaServicio service = new CuentaBancariaServicio();
        CuentaBancaria cuenta1 = null;
        
        do{
            System.out.println("Ingrese una opcion:");
            System.out.println("1. Crear cuenta bancaria");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Extraccion rapida");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Consultar datos");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    cuenta1=service.crearCuentaBancaria();
                    break;
                case 2:
                    if(cuenta1==null){
                        System.out.println("Debe crear una cuenta primero!");
                    } else {
                        double ingreso;
                        System.out.println("Ingrese el monto a ingresar:");
                        ingreso = sc.nextDouble();
                        service.ingresar(cuenta1, ingreso);
                    }
                    break;
                case 3:
                    if(cuenta1==null){
                        System.out.println("Debe crear una cuenta primero!");
                    } else {
                        double retiro;
                        System.out.println("Ingrese el monto a retirar:");
                        retiro = sc.nextDouble();
                        service.retirar(cuenta1, retiro);
                    }
                    break;
                case 4:
                    if(cuenta1==null){
                        System.out.println("Debe crear una cuenta primero!");
                    } else {
                        service.extraccionRapida(cuenta1);
                    }
                    break;
                case 5:
                    if(cuenta1==null){
                        System.out.println("Debe crear una cuenta primero!");
                    } else {
                        service.consultarSaldo(cuenta1);
                    }
                    break;
                case 6:
                    if(cuenta1==null){
                        System.out.println("Debe crear una cuenta primero!");
                    } else {
                        service.consultarDatos(cuenta1);
                    }
                    break;
                case 0:
                    System.out.println("Gracias por usar nuestros servicios!");
                    break;
            }
        }while (opcion!=0);
    }
}
/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes 
atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar 
constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
-Método para crear cuenta pidiéndole los datos al usuario.
-Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará 
al saldo actual.
-Método retirar(double): recibe una cantidad de dinero a retirar y se le restara 
al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará 
el máximo posible hasta dejar la cuenta en 0.
-Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que 
el usuario no saque más del 20%.
-Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
-Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
*/