
package extra;

import javaservicios.EjercicioModelo;
import static service.RaicesService.*;
import entities.Raices;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ExtraEjercicio1 implements EjercicioModelo {

    @Override
    public void ejercicio() {
        
        int n;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Raices> raizDoble = new ArrayList<Raices>();
        ArrayList<Raices> raizSimple = new ArrayList<Raices>();
        ArrayList<Raices> raizComp = new ArrayList<Raices>();
        System.out.println("Cuantos polinomios de grado 2 desea crear (x3)?");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double a, b, c, a1, b1, c1, a2, b2, c2;
            a = (double)rand.nextInt(-50, 50);
            b = (double)rand.nextInt(-50, 50);
            c = (double)rand.nextInt(-50, 50);
            a1 = a;
            b1 = -2*a*b;
            c1 = a*b*b;
            a2 = a;
            b2 = -a*(c+b);
            c2 = a*b*c;
            Raices[] polinomios = new Raices[3];
            polinomios[0] = new Raices(a,b,c);
            polinomios[1] = new Raices(a1,b1,c1);
            polinomios[2] = new Raices(a2,b2,c2);
            for(Raices pol: polinomios){
                if(tieneRaices(pol)){
                    raizDoble.add(pol);
                } else if (tieneRaiz(pol)){
                    raizSimple.add(pol);
                } else {
                    raizComp.add(pol);
                }
            }
        }
        System.out.println("Creados los polinomios!");
        System.out.println("Los polinomios con 2 raices son: " + raizDoble.size());
        for(Raices pol: raizDoble){
            calcular(pol);
        }
        System.out.println("Los polinomios con una raiz son: " + raizSimple.size());
        for(Raices pol: raizSimple){
            calcular(pol);
        }
        System.out.println("Los polinomios con raices complejas son: " + raizComp.size());
        for(Raices pol: raizComp){
            System.out.println(pol);
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