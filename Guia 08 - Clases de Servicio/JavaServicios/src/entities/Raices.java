
package entities;

import java.util.Scanner;

public class Raices {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    double a, b, c;

    public Raices() {
        System.out.println("Ingrese el coeficiente principal: ");
        a = sc.nextDouble();
        System.out.println("Ingrese el coeficiente lineal: ");
        b = sc.nextDouble();
        System.out.println("Ingrese el termino independiente: ");
        c = sc.nextDouble();
        System.out.println(this.toString());
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Pol.Grad.2 = (" + a + ")x^2 +(" + b + ")x +(" + c +")";
    }
    
}
/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de 
una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos, llamémosles 
a, b y c. Hay que insertar estos 3 valores para construir el objeto a través de 
un método constructor. Luego, en RaicesServicio las operaciones que se podrán 
realizar son las siguientes:
-Método getDiscriminante(): devuelve el valor del discriminante (double). 
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
-Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
para que esto ocurra, el discriminante debe ser mayor o igual que 0.
-Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
para que esto ocurra, el discriminante debe ser igual que 0.
-Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 
posibles soluciones.
-Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible.
-Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará 
por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo 
delante de -b
*/