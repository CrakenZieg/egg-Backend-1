
package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class TiendaService {
    
    private Map<String,Double> productos = new HashMap<>();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public void ingresarProducto(){
        System.out.println("Ingrese el nombre del producto:");
        String nombre = sc.next();
        System.out.println("Ingreese el valor del producto:");
        double precio = sc.nextDouble();
        productos.put(nombre, precio);
    }
    
    public void modificarPrecio(){
        boolean encontrado = false;
        System.out.println("Ingrese el nombre del producto:");
        String nombre = sc.next();
        for(Map.Entry<String,Double> entry: productos.entrySet()){
            if(entry.getKey().equals(nombre)){
                encontrado = true;
                System.out.println("Ingrese el nuevo precio:");
                entry.setValue(sc.nextDouble());
            }
        }
        if(!encontrado){
            System.out.println("Producto no encontrado");
        }
    }
    
    public void eliminarProducto(){
        System.out.println("Ingrese el nombre del producto:");
        String nombre = sc.next();
        if(productos.containsKey(nombre)){
            productos.remove(nombre);
        } else {
            System.out.println("Producto no encontrado");
        }
    }
    
    public void mostrarProductos(){
        int cont = 1;
        for(Map.Entry<String,Double> entry: productos.entrySet()){
            System.out.println(cont+"-> [Producto: "+entry.getKey()+
                    ", precio $"+entry.getValue()+"]");
            cont++;
        }
    }
    
    public void cargarProductos(){
        Random rand = new Random();
        String[] abecedario= {"A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"," ","' ","'"};
        System.out.println("Ingrese la cantida de productos:");
        int n = sc.nextInt();
        for(int j=0; j<n; j++){
            int largo = rand.nextInt(1,10);
            String nombre=": ";
            for(int i=0; i<largo; i++){ 
                nombre = nombre.concat(abecedario[rand.nextInt(abecedario.length)]);
            }
            productos.put(nombre, rand.nextDouble(0.1, 100));
        }
        mostrarProductos();
    }
}
/*
6. Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
*/