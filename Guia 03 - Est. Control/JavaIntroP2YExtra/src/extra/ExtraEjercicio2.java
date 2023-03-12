/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar.
*/
package extra;

public class ExtraEjercicio2 {
    
    public void ejercicio(){
    
        int A, B, C, D, aux;
        
        A = (int) (Math.random() * 100);
        System.out.println("A = " + A);
        B = (int) (Math.random() * 100);
        System.out.println("B = " + B);
        C = (int) (Math.random() * 100);
        System.out.println("C = " + C);
        D = (int) (Math.random() * 100);
        System.out.println("D = " + D);
        
        //b=c c=a a=d d=b
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("El nuevo valor de A = " + A + " (antes era el valor de D)");
        System.out.println("El nuevo valor de B = " + B + " (antes era el valor de C)");
        System.out.println("El nuevo valor de C = " + C + " (antes era el valor de A)");
        System.out.println("El nuevo valor de D = " + D + " (antes era el valor de B)");
        
    }
    
}
