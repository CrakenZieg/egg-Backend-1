
package entidades;

public class Cuenta {
    
    private String titular;
    private double saldo=0;

    public Cuenta() {
    }
    
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void agregar_dinero(double dinero){
        System.out.println("Saldo actual: $"+this.saldo);
        this.saldo+=dinero;
        System.out.println("Saldo nuevo: $"+this.saldo);
    }
    
    public void retirar_dinero(double dinero){
        if(this.saldo<dinero){
            System.out.println("Fondos insuficientes!");
            System.out.println("$"+this.saldo+"<$"+dinero);
        } else {
            System.out.println("Saldo actual: $"+this.saldo);
            saldo-=dinero;
            System.out.println("Saldo nuevo: $"+this.saldo);
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }
    
    
    
}

/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea 
un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo 
de la cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar 
una transacción de retiro.
*/