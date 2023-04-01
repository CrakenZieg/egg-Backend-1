/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
Se deberá́ definir además dos constructores: uno vacío que inicializa el título 
y el autor a cadenas vacías y otro que reciba como parámetros el título y el 
autor de la canción. Se deberán además definir los métodos getters y setters 
correspondientes.
*/

package extra;

import entidades.Cancion;
import javapoo.*;
import java.util.Scanner;

public class ExtraEjercicio1 implements EjercicioModelo{
    
    @Override
    public void ejercicio(){
        
        Scanner sc = new Scanner(System.in);
        String autor, titulo;
        
        System.out.println("Crea una cancion!");
        System.out.println("Ingresa el autor: ");
        autor = sc.next();
        System.out.println("Ingresa el titulo: ");
        titulo = sc.next();
        
        Cancion cancion = new Cancion(autor, titulo);
        
        System.out.println(cancion.toString());
        
    }
}
