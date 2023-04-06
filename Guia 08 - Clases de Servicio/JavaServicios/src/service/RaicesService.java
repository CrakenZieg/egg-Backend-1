
package service;

import entities.Raices;

public class RaicesService {
    
    public static double getDiscriminante(Raices pol){
        double disc;
        disc = Math.pow(pol.getB(), 2)-4*pol.getA()*pol.getC();
        return disc;
    }
    
    public static boolean tieneRaices(Raices pol){
        boolean tiene;
        tiene = (getDiscriminante(pol)>0);
        return tiene;
    }
    
    public static boolean tieneRaiz(Raices pol){
        boolean tiene;
        tiene = (getDiscriminante(pol)==0);
        return tiene;
    }
    
    public static double[] obtenerRaices(Raices pol){
        double[] raices = new double[2];
        if(tieneRaices(pol)){
            raices[0] = ((-pol.getB()+Math.sqrt(getDiscriminante(pol)))/(2*pol.getA()));
            raices[1] = ((-pol.getB()-Math.sqrt(getDiscriminante(pol)))/(2*pol.getA()));
        }
        return raices;
    }
    
    public static double obtenerRaiz(Raices pol){
        double raiz = 0;
        if(tieneRaiz(pol)){
            raiz = ((-pol.getB())/(2*pol.getA()));
        }
        return raiz;
    }
    
    public static void calcular(Raices pol){
        if(tieneRaices(pol)){
            double[] raices = obtenerRaices(pol);
            System.out.println(pol.toString()+" tiene 2 raices reales:");
            System.out.println("X1 = "+ raices[0]);
            System.out.println("X2 = "+ raices[1]);
        } else if (tieneRaiz(pol)){
            double raiz = obtenerRaiz(pol);
            System.out.println(pol.toString()+" tiene una raiz real:");
            System.out.println("X = "+raiz);
        } else {
            System.out.println(pol.toString()+" no tiene raices reales");
        }
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