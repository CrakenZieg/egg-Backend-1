/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir 
que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando 
el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/
package practica;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {
    
    public void ejercicio(){
        
        Scanner sc = new Scanner(System.in);     
        double euro;
        String moneda;
        
        do {
            System.out.println("Ingresa la cantidad de Euros a convertir (0 para salir): ");
            euro = (double)sc.nextDouble();
            if(euro==0){break;}
            System.out.println("Ingrese la moneda a convertir (Libras, Dolares, Yenes): ");
            moneda = sc.next().toLowerCase();
        
            conversor(moneda, euro);
            
        } while (euro!=0);
        
      
    }    
    
    public void conversor(String moneda, double dinero){
        
        Map<String,Double> monedas = new HashMap<>();
        monedas = llenar(monedas);
        double conversion = monedas.get(moneda)*dinero;
        System.out.println(dinero+" Euros son "+conversion+" "+moneda);

    }
    
    public Map<String,Double> llenar(Map<String,Double> map){
        map.put("libras", 0.86);
        map.put("dolares", 1.28611);
        map.put("yenes", 129.852);
        return map;
    }
    
}
