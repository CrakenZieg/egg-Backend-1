
package ejercicios;

import ejercicios.ejercicio4.*;
import javaherencia.EjercicioModelo;

public class Ejercicio4 implements EjercicioModelo{

    @Override
    public void ejercicio() {

        int n;
        System.out.println("Ingrese la cantidad de formas a crear:");
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            CalculosFormas forma;
            int par = rand.nextInt(0, 9);
            if(par%2==0){
                forma = new Circulo(rand.nextDouble(0.1, 15));
            } else {
                forma = new Rectangulo(rand.nextDouble(0.1, 15),
                        rand.nextDouble(0.1, 15));
            }
            System.out.println("Forma "+(i+1)+": \n"+forma.toString()+"\nperimetro: \n"
                        +forma.calcularPerimetro()+"\narea: \n"+forma.calcularArea());
        }
        
    }
    
}
/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.

Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.

Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
*/