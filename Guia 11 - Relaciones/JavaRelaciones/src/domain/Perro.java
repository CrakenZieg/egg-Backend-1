package domain;

public class Perro {

    private String nombre;

    private String raza;

    private String tamano;

    private int edad;

    public Perro() {
    }

    public Perro(String nombre, String raza, String tamano, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamano = tamano;
        this.edad = edad;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public String getTamano() {
        return this.tamano;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", raza=" + raza + ", tamano=" + tamano + ", edad=" + edad;
    }
    
}
/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
*/