
package ejercicios;

import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;
import javamanejoexcepciones.EjercicioModelo;

public class Ejercicio5 implements EjercicioModelo{

    @Override
    public void ejercicio() throws Exception {
        
        juego();
        
    }
    
    public void juego(){
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");
        int numero = rand.nextInt(1, 501);
        int adivinanza = 1000;
        boolean ganaste = false;
        int contador = 0;
        do{
            contador++;
            System.out.println("Introduce un numero entre 1 y 500:  (0 para salir)");
            try {
                adivinanza = Integer.parseInt(sc.next());
                if(numero==adivinanza){
                    System.out.println("Adivinaste!");
                    ganaste = true;
                } else {
                    System.out.println(((numero<adivinanza)?"Tu numero es mas grande!"
                            :"Tu numero es mas chico!"));
                }
            } catch (NumberFormatException e) {
                System.out.println("No ingresaste un numero entero.");
            }finally{
                if(adivinanza!=0){
                    if(ganaste){
                        System.out.println("Ganaste en "+contador);
                        System.out.println("Queres seguir jugando? (S/N)");
                        String opcion = sc.next().toUpperCase();
                        if(opcion.equals("N")){
                            adivinanza = 0;
                        }else{
                            adivinanza = 1000;
                            ganaste = false;
                            numero = rand.nextInt(1, 501);
                            contador = 0;
                        }
                    }
                }
            }            
        }while(adivinanza != 0);
    }
    
}
/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
*/
