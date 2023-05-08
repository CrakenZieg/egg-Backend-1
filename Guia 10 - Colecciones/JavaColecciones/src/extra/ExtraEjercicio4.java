
package extra;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javacolecciones.EjercicioModelo;
import service.PostalesService;

public class ExtraEjercicio4 implements EjercicioModelo{

    @Override
    public void ejercicio() {
        
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ExtraEjercicio4.class.getName()).log(Level.SEVERE, null, ex);
        }
        PostalesService servicio = new PostalesService();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int opcion;
        
        do {
            System.out.println("Ingrese una opcion:");
            System.out.println("1. Ingresar");
            System.out.println("2. Mostrar");
            System.out.println("3. Buscar por codigo");
            System.out.println("4. Buscar por ciudad");
            System.out.println("5. Eliminar por codigo");
            System.out.println("6. Eliminar por ciudad");
            System.out.println("7. Cargar aleatorio");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1 ->{
                    servicio.ingresar();
                }
                case 2 ->{
                    servicio.mostrar();
                }
                case 3 ->{
                    servicio.buscarPorCodigo();
                }
                case 4 ->{
                    servicio.buscarPorCiudad();
                }
                case 5 ->{
                    servicio.eliminarPorCodigo();
                }
                case 6 ->{
                    servicio.eliminarPorCiudad();
                }
                case 7 ->{
                    System.out.println("Ingrese la cantidad de ciudades/codigos a generar:");
                    int n = sc.nextInt();
                    servicio.cargarCiudades(n);
                }
                case 0 ->{
                    System.out.println("Gracias! Hasta luego!");
                }
                default -> {
                    System.out.println("Opcion no valida!");
                }
            }
        } while(opcion!=0); 
        
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