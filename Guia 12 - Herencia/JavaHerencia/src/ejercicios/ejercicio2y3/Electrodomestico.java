package ejercicios.ejercicio2y3;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Electrodomestico {
    
    Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");

    protected double precio;

    protected String color;

    protected char consumoElectrico;

    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(String color, char consumoElectrico, double peso) {
        this.precio = 1000;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoElectrico);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(char consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    protected void comprobarConsumoEnergetico(char letra) {
        if(letra>='A'&&letra<='F'){
            this.consumoElectrico = letra;
        } else {
            this.consumoElectrico = 'F';
        }
    }

    protected void comprobarColor(String color) {
        String[] colorLista = {"BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS"};
        boolean col = false;
        for (String colorL : colorLista) {
            if (color.equalsIgnoreCase(colorL)){
                col = true;
            }
        }
        if(col){
            this.color = color;
        } else {
            this.color = "BLANCO";
        }
    }

    public void crearElectrodomestico() {
        this.precio = 1000;
        System.out.println("Ingrese el peso del Electrodomestico: ");
        this.peso = sc.nextDouble();
        System.out.println("Ingrese el color del Electrodomestico : ");
        System.out.println("\"BLANCO\", \"NEGRO\", \"ROJO\", \"AZUL\", \"GRIS\"");
        this.color = sc.next();
        System.out.println("Ingrese el consumo del Electrodomestico (A-F): ");
        this.consumoElectrico = sc.next().charAt(0);
    }

    public void precioFinal() {
        switch  (consumoElectrico){
            case 'A'->{ precio+=1000;}
            case 'B'->{ precio+=800;}
            case 'C'->{ precio+=600;}
            case 'D'->{ precio+=500;}
            case 'E'->{ precio+=300;}
            case 'F'->{ precio+=100;}
        }
        if(peso>80){
            precio+=1000;
        } else if(peso>50){
            precio+=800;
        } else if(peso>20){
            precio+=500;
        } else{
            precio+=100;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoElectrico=" + consumoElectrico + ", peso=" + peso + '}';
    }
    
}
