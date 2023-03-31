
package entidades.cocina;

import java.util.ArrayList;

public class Receta {
    
    private String nombre, tipoCoccion;
    private int tiempoPreparacion;
    private boolean coccion;
    private ArrayList<String> ingredientes = new ArrayList<String>();

    public Receta() {
    }

    public Receta(String nombre, String tipoCoccion, int tiempoPreparacion, boolean coccion) {
        this.nombre = nombre;
        this.tipoCoccion = tipoCoccion;
        this.tiempoPreparacion = tiempoPreparacion;
        this.coccion = coccion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCoccion() {
        return tipoCoccion;
    }
    public void setTipoCoccion(String tipoCoccion) {
        this.tipoCoccion = tipoCoccion;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }
    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public boolean isCoccion() {
        return coccion;
    }
    public void setCoccion(boolean coccion) {
        this.coccion = coccion;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }
    
    public String concatIngredientes(){
        String retorno = "";
        for(String ingrediente : getIngredientes()){
            retorno = retorno.concat(ingrediente+", \n");
        }
        return retorno;
    }

    public void agregarIngrediente(String ingrediente){
        this.ingredientes.add(ingrediente.toLowerCase());
    }
    
    public boolean tieneIngrediente(String ingrediente){
        return this.ingredientes.contains(ingrediente.toLowerCase());
    }
    
    public boolean tieneIngredientes(ArrayList<String> ingredientes){
        return this.ingredientes.containsAll(ingredientes);
    }
    
    @Override
    public String toString(){
        return "---------\n"+this.getNombre()+":\n---------\nTipo de coccion: \n"+this.getTipoCoccion()+"\nTiempo de preparacion: \n"+this.getTiempoPreparacion()+"\nIngredientes: \n"+this.concatIngredientes()+"\n---------";
    }
    
}
/*
Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea métodos 
para agregar nuevas recetas a la lista, para buscar una receta por nombre y para 
obtener la lista de recetas que se pueden preparar con los ingredientes disponibles 
en la cocina.
*/