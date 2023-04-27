
package service;

import entities.ParDeNumeros;

public class ParDeNumerosServicio {
    
    public void mostrarValores(ParDeNumeros par){
        System.out.println("El num1 es: " + par.getNum1());
        System.out.println("El num2 es: " + par.getNum2());
    }
    
    public String devolverMayor(ParDeNumeros par){
        String mayor;
        if(par.getNum1()>par.getNum2()){
            mayor = par.getNum1()+" -> Num1 es el mayor";
        } else if(par.getNum2()>par.getNum1()){
            mayor = par.getNum2()+" -> Num2 es el mayor";
        } else {
            mayor = par.getNum1()+" -> Num1 y Num2 son iguales";
        }
        return mayor;
    }
    
    public int calcularPotencia(ParDeNumeros par){
        int potencia;
        if(par.getNum1()>par.getNum2()){
            potencia = (int)Math.pow((int)par.getNum1(), (int)par.getNum2());
        } else if(par.getNum2()>par.getNum1()){
            potencia = (int)Math.pow((int)par.getNum2(), (int)par.getNum1());
        } else {
            potencia = (int)Math.pow((int)par.getNum1(), (int)par.getNum2());
        }
        return potencia;
    }
    
    public double calrcularRaiz(ParDeNumeros par){
        double raiz;
        if(par.getNum1()>par.getNum2()){
            raiz = Math.sqrt(Math.abs(par.getNum2()));
        } else if(par.getNum2()>par.getNum1()){
            raiz = Math.sqrt(Math.abs(par.getNum1()));
        } else {
            raiz = Math.sqrt(Math.abs(par.getNum2()));
        }
        return raiz;
    }
    
}
/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos números 
reales con los cuales se realizarán diferentes operaciones matemáticas. La clase 
debe tener un constructor vacío, getters y setters.  En el constructor vacío 
se usará el Math.random para generar los dos números. Crear una clase 
ParDeNumerosService, en el paquete Servicios, que deberá además implementar los 
siguientes métodos:
-Método mostrarValores que muestra cuáles son los dos números guardados.
-Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
-Método calcularPotencia para calcular la potencia del mayor valor de la clase 
elevado al menor número. Previamente se deben redondear ambos valores.
-Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/