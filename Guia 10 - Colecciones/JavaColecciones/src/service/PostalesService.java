
package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class PostalesService {
    
    Integer[] postalCode = {1414, 1425, 1642, 2000, 4000, 4400, 5000, 5700, 8300, 9000};
    String[] cities = {"Ciudad Autónoma de Buenos Aires", "Palermo", "Beccar", "Rosario", "San Miguel de Tucumán", "Salta", "Córdoba", "Neuquén", "Bariloche", "Bahía Blanca"};
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Map<String, Integer> codigosPostales = new HashMap<>();

    public PostalesService() {
        for (int i = 0; i < postalCode.length; i++) {
            codigosPostales.put(cities[i], postalCode[i]);
        }
    }
    
    public void ingresar(){
        System.out.println("Ingresa el nombre de la ciudad:");
        String ciudad = sc.next();
        System.out.println("Ingrese el codigo postal:");
        int codigo = sc.nextInt();
        codigosPostales.put(ciudad, codigo);
    }
    
    public void mostrar(){
        for (Map.Entry<String, Integer> entry : codigosPostales.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue());    
        }
    }
    
    public void buscarPorCodigo(){
        boolean noFigura = true;
        System.out.println("Ingrese el codigo postal:");
        int codigo = sc.nextInt();
        for (Map.Entry<String, Integer> entry : codigosPostales.entrySet()) {
            if(codigo==entry.getValue()){
                System.out.println("La ciudad con este codigo postal es: "+entry.getKey());
                noFigura = false;
            } 
        }
        if(noFigura){
            System.out.println("La ciudad/codigo no esta registrada");
        }
    }
    
    public void buscarPorCiudad(){
        boolean noFigura = true;
        System.out.println("Ingrese la ciudad:");
        String ciudad = sc.next();
        for (Map.Entry<String, Integer> entry : codigosPostales.entrySet()) {
            if(entry.getKey().equals(ciudad)){
                System.out.println("El codigo postal de esta ciudad es: "+entry.getValue());
                noFigura = false;
            } 
        }
        if(noFigura){
            System.out.println("La ciudad/codigo no esta registrada");
        }
    }
    
    public void eliminarPorCodigo(){
        boolean noFigura = true;
        System.out.println("Ingrese el codigo postal:");
        int codigo = sc.nextInt();
        for (Map.Entry<String, Integer> entry : codigosPostales.entrySet()) {
            if(codigo==entry.getValue()){
                codigosPostales.remove(entry.getKey());
                noFigura = false;
                break;
            } 
        }
        if(noFigura){
            System.out.println("La ciudad/codigo no esta registrada");
        }
    }
    
    public void eliminarPorCiudad(){
        boolean noFigura = true;
        System.out.println("Ingrese el codigo postal:");
        String ciudad = sc.next();
        if(codigosPostales.containsKey(ciudad)){
            codigosPostales.remove(ciudad);
            noFigura = false;
        } 
        if(noFigura){
            System.out.println("La ciudad/codigo no esta registrada");
        }
    }
    
    public void cargarCiudades(int n){
        Random rand = new Random();
        String[] abecedario= {"A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"," ","'"};
        for(int j=0; j<n; j++){
            int largo = rand.nextInt(1,15);
            String ciudad= "";
            for(int i=0; i<largo; i++){ 
                ciudad = ciudad.concat(abecedario[rand.nextInt(abecedario.length)]);
            }
            int codigo = rand.nextInt(9999);
            codigosPostales.put(ciudad, codigo);
            System.out.println((j+1)+" -> "+ciudad+": "+codigo);
        }
    }
    
}
/*
4. Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap
*/