/*
Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
*/
package practica;

import java.util.Scanner;

public class Ejercicio7 {

    public final String PRINCIPIO = "X"; 
    public final String FINAL = "O";
    public final String FDE = "&&&&&";
    public final int LARGO = 5;
    
    public void ejercicio(){
    
        Scanner sc = new Scanner(System.in);
        String ingreso;
        int correctas, incorrectas;
        correctas = 0;
        incorrectas = 0;
        do {
            System.out.println("Ingrese una nueva secuencia: ");
            ingreso = sc.nextLine();
            if (ingreso.equals(FDE)){
                correctas++;
            } else if (ingreso.length()>LARGO || !ingreso.substring(0,1).equals(PRINCIPIO) || 
                    !ingreso.substring(ingreso.length()-1).equals(FINAL)){
                incorrectas++;
            } else {
                correctas++;
            }
        } while (!ingreso.equals(FDE));
        
        System.out.println("Informe final: ");
        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: "+ incorrectas);
    
    }
    
}
