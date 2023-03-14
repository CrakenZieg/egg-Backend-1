/*
Realice un programa para que el usuario adivine el resultado de una multiplicación 
entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar 
al usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta 
se debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este 
ejercicio investigue como utilizar la función Math.random() de Java.
*/
package extra;

import java.util.Scanner;

public class ExtraEjercicio10 {
    
    public void ejercicio(){
        
        Scanner sc = new Scanner(System.in);
        int num, alea;
        System.out.println("Bienvenido, creando multiplicacion aleatoria entre 2 numeros enteros entre 0 y 10...");
        alea = (int) (Math.random()*10) * (int) (Math.random()*10);

        do {
            System.out.println("¡Intenta adivinar el numero!");
            num = sc.nextInt();
        } while (num!=alea);
        System.out.println("Acertaste, el numero era "+alea+"!");
    }
}
