
package ejercicio1;

public class Persona {
    
    private int edad = 0;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public boolean esMayor() throws Exception{
        if(edad==0){
            throw new Exception("Es recien nacido! (mensaje throweado por exception!)");
        }
        return true;
    }
    
}
/*
Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
*/
