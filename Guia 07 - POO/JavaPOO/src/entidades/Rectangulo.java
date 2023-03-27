
package entidades;

import java.util.Scanner;

public class Rectangulo {
    
    Scanner sc = new Scanner(System.in);
    private double base, altura;
    
    public Rectangulo(){
        System.out.println("Ingrese el tamano de la base: ");
        this.base = sc.nextDouble();
        System.out.println("Ingrese el tamano de la altura: ");
        this.altura = sc.nextDouble();
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double superficie(){
        return base*altura;
    }
    
    public double perimetro(){
        return 2*(base+altura);
    }
    
    public void dibujar(){
        int n, m;
        if(altura<1||base<1){
            System.out.println("Es tan pequeno que haremos zoom!");
            n = (int) (altura*10);
            m = (int) (base*10);
        } else {
            n = (int) (altura);
            m = (int) (base);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i==0||j==0||i==(n-1)||j==(m-1)){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}