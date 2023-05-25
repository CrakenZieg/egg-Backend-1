package ejercicios.ejercicio2y3;

public class Televisor extends Electrodomestico {

    private int resolucion;

    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, String color, char consumoElectrico, double peso) {
        super(color, consumoElectrico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("Ingrese el tamaño (pulgadas):");
        this.resolucion = sc.nextInt();
        System.out.println("Posee sintonizador TDT? (S/N)");
        String opcion = sc.next().toUpperCase();
        this.sintonizadorTDT = (opcion.equals("S"));
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if(resolucion>40){
            precio*=1.3;
        }
        if(sintonizadorTDT){
            precio+=500;
        }
    }

    @Override
    public String toString() {
        return super.toString()+" Televisor{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }
}
