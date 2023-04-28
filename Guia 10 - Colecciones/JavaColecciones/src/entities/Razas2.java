
package entities;

import java.util.ArrayList;
import java.util.Iterator;

public class Razas2 {
    
    private ArrayList<String> razas;

    public Razas2() {
        this.razas = new ArrayList<>();
    }
    
    public void agregar(String raza){
        razas.add(raza);
    }
    
    public boolean vacio(){
        return razas.isEmpty();
    }
    
    public boolean tieneRaza(String raza){
        return razas.contains(raza);
    }
    
    public Iterator<String> iterador(){
        return razas.iterator();
    }

    public ArrayList<String> getRazas() {
        return razas;
    }
    public void setRazas(ArrayList<String> razas) {
        this.razas = razas;
    }
    
    @Override
    public String toString(){
        String retorno = "Razas: ";
        for(String raza: razas) {
            retorno = retorno.concat(raza+", ");
        }
        return retorno;
    }
    
}
/*
2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
*/