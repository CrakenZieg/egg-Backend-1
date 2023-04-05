
package service;

import entities.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCuentaBancaria(){
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        System.out.println("Ingrese el numeroCuenta:");
        cuentaBancaria.setNumeroCuenta(sc.nextInt());
        System.out.println("Ingrese el numero de DNI:");
        cuentaBancaria.setDniCliente(sc.nextLong());
        System.out.println("Ingrese saldo actual:");
        cuentaBancaria.setSaldoActual(sc.nextDouble());  
        return cuentaBancaria;
    }
    
    public void ingresar(CuentaBancaria cuenta, double ingreso){
        double saldoFinal = cuenta.getSaldoActual();
        System.out.println("Saldo actual: $"+cuenta.getSaldoActual());
        saldoFinal += ingreso;
        cuenta.setSaldoActual(saldoFinal);
        System.out.println("Nuevo saldo actual: $"+cuenta.getSaldoActual());
    }
    
    public void retirar(CuentaBancaria cuenta, double retiro){
        double saldoFinal = cuenta.getSaldoActual();
        if(saldoFinal<retiro){
            System.out.println("No es posible retirar $"+retiro+", su saldo es menor ($"+cuenta.getSaldoActual()+")");
            System.out.println("Retirando el total");
            saldoFinal = 0;
        } else {
            saldoFinal -= retiro;
        }
        cuenta.setSaldoActual(saldoFinal);
        System.out.println("Saldo actual: $"+cuenta.getSaldoActual());
    }
    
    public void extraccionRapida(CuentaBancaria cuenta){
        double maximo = 0.2*cuenta.getSaldoActual();
        double retiro;
        System.out.println("El maximo a retirar por extraccion rapida es: $"+maximo);
        do {
            System.out.println("Cuanto desea retirar?");
            retiro = sc.nextDouble();
        } while (retiro>maximo || retiro<0);
        cuenta.setSaldoActual(cuenta.getSaldoActual()-retiro);
        System.out.println("Saldo actual: $"+cuenta.getSaldoActual());
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("Saldo actual: $"+cuenta.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println(cuenta.toString());
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