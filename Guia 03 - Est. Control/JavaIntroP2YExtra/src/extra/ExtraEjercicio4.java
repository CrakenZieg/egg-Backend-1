/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.
*/
package extra;

import java.util.*;

public class ExtraEjercicio4 {

    public void ejercicio(){
    
        Scanner sc = new Scanner(System.in);
        int num, aux;
        String respuesta="";
        Map<String,Integer> m = new LinkedHashMap<String,Integer>();
        m = llenarMapa(m);
        System.out.println("Ingrese el numero a convertir:");
        num = sc.nextInt();
        aux = num;
        for(Map.Entry<String,Integer> n : m.entrySet()){
            while(aux>=n.getValue()){
                aux-=n.getValue();
                respuesta = respuesta.concat(n.getKey());
            }
        }
        System.out.println(num+" es "+respuesta+" en numeros romanos!");    
    }
    
    public Map llenarMapa(Map m){
        m.put("M",1000);
        m.put("CM",900);
        m.put("D",500);
        m.put("CD",400);
        m.put("C",100);
        m.put("XC",90);
        m.put("L",50);
        m.put("XL",40);
        m.put("X",10);
        m.put("IX",9);
        m.put("V",5);
        m.put("IV",4);
        m.put("I",1);
        return m;
    } 
    
}
