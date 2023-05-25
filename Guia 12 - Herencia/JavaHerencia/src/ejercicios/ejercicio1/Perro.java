
package ejercicios.ejercicio1;

public class Perro extends Animal{
    
    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println(" y juego!");
    }    
    
}
