
package ejercicios.extra2;

public class EdificioDeOficinas extends Edificio{

    private int numPisos;
    private int numOficinas;
    private int numPersonasPorOficina;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(double ancho, double alto, double largo, int numPisos, int numOficinas, int numPersonasPorOficina) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.numPisos = numPisos;
        this.numOficinas = numOficinas;
        this.numPersonasPorOficina = numPersonasPorOficina;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getNumPersonasPorOficina() {
        return numPersonasPorOficina;
    }

    public void setNumPersonasPorOficina(int numPersonasPorOficina) {
        this.numPersonasPorOficina = numPersonasPorOficina;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    public String cantPersonasString(){
        return "Entran "+numPersonasPorOficina+" por oficina, "+(numPersonasPorOficina*numPisos)+" en total.";
    }
    
    public void cantPersonas(){
        System.out.println(cantPersonasString());
    }
            
    @Override
    public double calcularSuperficie() {
        return ancho*largo*numPisos;
    }

    @Override
    public double calcularVolumen() {
        return ancho*alto*largo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Edificio de oficinas: \n");
        sb.append(numPisos+" pisos");
        sb.append(" con "+calcularSuperficie()+" m2");
        sb.append(" y "+calcularVolumen()+" m3");
        sb.append(", distribuidos en "+numOficinas+" oficinas. \n");
        sb.append(cantPersonasString());
        return sb.toString();
    }
    
}
/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:

• Método calcularSuperficie(): calcula la superficie del edificio.

• Método calcularVolumen(): calcula el volumen del edifico.

Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.

• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.

De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.

Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
*/