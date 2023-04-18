
package service;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Date fechaNacimiento(){
        int dia, mes, anio;
        //System.out.print("Fecha de nacimiento (dd/mm/YYYY): ");
        //String[] fecha=leer.next().split("/");
        System.out.println("Ingrese el dia de nacimiento: ");
        dia = sc.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        mes = sc.nextInt();
        mes--;
        System.out.println("Ingrese el año de nacimiento: ");
        anio = sc.nextInt();
        anio -= 1900;
        return new Date(anio, mes, dia);
    }
    
    public Date fechaActual(){
        return new Date();
    }
    
    public int diferencia(Date nacimiento, Date actual){
        return (int)((((((actual.getTime()-nacimiento.getTime())/1000)/60)/60)/24)/365);
    }
    
}
/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, 
en paquete Servicios, que tenga los siguientes métodos:
-Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el 
objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
-Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos 
el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
-Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia 
de años entre una y otra (edad del usuario).
*/