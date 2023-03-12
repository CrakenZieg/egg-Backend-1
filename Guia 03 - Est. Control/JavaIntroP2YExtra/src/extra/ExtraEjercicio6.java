/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
*/
package extra;

import java.util.*;

public class ExtraEjercicio6 {
    
    public void ejercicio(){
    
        Scanner sc = new Scanner(System.in);
        List<Double> alturas;
        int n;
        
        System.out.println("Ingrese el numero de personas a medir: ");
        n = sc.nextInt();
        
        alturas = llenarLista(n, sc);
        mostrarInformacion(alturas, sc);
    }
    
    public List<Double> llenarLista(int n, Scanner sc){
        List<Double> alturas = new ArrayList<>();
        double alt;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la altuna numero "+(i+1)+":");
            alt = Double.parseDouble(sc.next());
            alturas.add(alt);
        }
        return alturas;
    }
    
    public void mostrarInformacion(List<Double> alturas, Scanner sc){
        
        double lim, suma, sumaMenor;
        int contador, contadorMenor;
        suma = 0;
        sumaMenor = 0;
        contador = 0;
        contadorMenor = 0;
        
        System.out.println("Ingrese el limite inferior: ");
        lim = Double.parseDouble(sc.next());
        
        for(double altura: alturas){
            suma += altura;
            contador++;
            if(altura<lim){
                sumaMenor += altura;
                contadorMenor++;
            }
        }
        System.out.println("El promedio general es: "+(suma/contador));
        System.out.println("El promedio debajo del limite "+lim+" es: "+(sumaMenor/contadorMenor));
    }
    
}
