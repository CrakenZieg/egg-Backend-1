
package entidades;

public class Persona {
    
    private int DNI, edad;
    private String nombre;

    public Persona(){}
    
    public Persona(int DNI, int edad, String nombre) {
        this.DNI = DNI;
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", edad=" + edad + ", nombre=" + nombre + '}';
    }
    
}
