
package ejercicio3;

public class DivisionNumero {
    
    private int a,b;

    public DivisionNumero() {
    }
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public double realizarDivision(){
        return (double)a/b;
    }

    @Override
    public String toString() {
        return "a=" + a + ", b=" + b;
    }
    
}
/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
*/
