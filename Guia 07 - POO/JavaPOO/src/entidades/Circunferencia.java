
package entidades;

public class Circunferencia {
    
    private double radio;
    
    public Circunferencia(){}
    
    public Circunferencia(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double area(){
        return Math.PI*Math.pow(radio, 2);
    }
    
    public double perimetro(){
        return Math.PI*radio*2;
    }
    
}
