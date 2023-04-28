
package entities;

import java.util.ArrayList;

public class Razas1 {
    
    private ArrayList<String> razas;

    public Razas1() {
        this.razas = new ArrayList<>();
    }
    
    public void agregar(String raza){
        razas.add(raza);
    }
    
    public boolean vacio(){
        return razas.isEmpty();
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
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
*/