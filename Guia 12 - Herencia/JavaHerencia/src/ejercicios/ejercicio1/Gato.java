
package ejercicios.ejercicio1;

public class Gato extends Animal{
    
    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println(" y duermo!");
    }
    
}
