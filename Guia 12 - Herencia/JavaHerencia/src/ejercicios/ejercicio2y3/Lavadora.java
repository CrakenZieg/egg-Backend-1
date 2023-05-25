package ejercicios.ejercicio2y3;

public class Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, String color, char consumoElectrico, double peso) {
        super(color, consumoElectrico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        this.crearElectrodomestico();
        System.out.println("Ingrese el peso de carga: ");
        carga = sc.nextDouble();
    }
    
    @Override
    public void precioFinal() {
        super.precioFinal();
        if(carga>=30){
            precio+=500;
        }
    }

    @Override
    public String toString() {
        return super.toString()+" Lavadora{" + "carga=" + carga + '}';
    }
    
}
