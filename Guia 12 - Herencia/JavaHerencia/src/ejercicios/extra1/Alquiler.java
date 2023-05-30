
package ejercicios.extra1;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Alquiler {
    
    Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");
    private String titular;
    private int dni;
    private Calendar fechaInicio = Calendar.getInstance();
    private Calendar fechaFinal;
    private int amarre;
    private List<Cuota> cuotas = new ArrayList<>();
    private Barco barco;

    public Alquiler() {
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Calendar fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getAmarre() {
        return amarre;
    }

    public void setAmarre(int amarre) {
        this.amarre = amarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public List<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }
    
    public boolean isFinalizado(){
        boolean fin = true;        
        if(Calendar.getInstance().compareTo(fechaFinal)<0||cuotasPendientes()){
            fin = false;
        }
        return fin;
    }
    
    public boolean cuotasPendientes(){
        boolean fin = false;
        for (Cuota cuota : cuotas) {
            if(!cuota.isPaga()){
                fin=true;
                break;
            }
        }
        return fin;
    }
    
    public void crearAlquiler(){
        do{
            System.out.println("Ingrese el nombre del responsable:");
            titular = sc.next();
        }while(titular.isBlank());
        do{
            System.out.println("Ingrese el DNI:");
            dni = sc.nextInt();
        }while(dni<1000000);
            System.out.println("El inicio es hoy: ");
            System.out.println(fechaInicio.get(Calendar.DAY_OF_MONTH)+"/"
                    +(fechaInicio.get(Calendar.MONTH)+1)+"/"
                    +fechaInicio.get(Calendar.YEAR));
        int meses;
        do{
            System.out.println("Ingrese la cantidad de meses de contrato: ");
            meses = sc.nextInt();
            fechaFinal = Calendar.getInstance();
            fechaFinal.add(Calendar.MONTH,meses);
        }while(meses==0);
        System.out.println("El contrato terminará en la fecha: "
                +fechaFinal.get(Calendar.DAY_OF_MONTH)+"/"
                +(fechaFinal.get(Calendar.MONTH)+1)+"/"
                +fechaFinal.get(Calendar.YEAR));
        do{
            System.out.println("Ingrese el numero de amarre: ");
            amarre = sc.nextInt();
        }while(amarre<=0);
        int aux;
        do{
            System.out.println("Que tipo de barco desea ingresar: \n1. Barco\n2. Velero\n3. Motor\n4. Yate");        
            aux = sc.nextInt();
        }while(aux<1||aux>4);
        switch (aux){
            case 1 ->{
                barco = new Barco();
                barco.crearBarco();
            }
            case 2 ->{
                barco = new Velero();
                barco.crearBarco();
            }
            case 3 ->{
                barco = new BarcoMotor();
                barco.crearBarco();
            }
            case 4 ->{
                barco = new Yate();
                barco.crearBarco();
            }
        }  
        int pagos;
        do{
            System.out.println("Cuantos pagos desea realizar?");
            pagos = sc.nextInt();
        }while(pagos<=0||pagos>meses);
        double valor = calcularCosto()/pagos;        
        for (int i = 1; i <= pagos; i++) {
            Calendar fecha = Calendar.getInstance();
            fecha.add(Calendar.MONTH, i+1);
            cuotas.add(new Cuota(i,fecha,valor));
        }
    }
    
    public double calcularCosto(){
        long dias = (fechaFinal.getTimeInMillis()-fechaInicio.getTimeInMillis())/86400000;
        double costo = dias*barco.getModulo();
        return costo;
    }
    
    public void mostrarCuotas(){
        if(cuotas.isEmpty()){
            System.out.println("No hay cuotas");
        } else {
            for (Cuota cuota : cuotas) {
                System.out.println(cuota.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Alquiler: \n" + "Titular: " + titular + ", dni: " + dni 
                + "\nInicio: " + fechaInicio.get(Calendar.DAY_OF_MONTH)+"/"
                    +(fechaInicio.get(Calendar.MONTH)+1)+"/"
                    +fechaInicio.get(Calendar.YEAR) 
                + ", final: " +fechaFinal.get(Calendar.DAY_OF_MONTH)+"/"
                +(fechaFinal.get(Calendar.MONTH)+1)+"/"
                +fechaFinal.get(Calendar.YEAR)  
                + "\nFinalizado: "+isFinalizado()+", cuotas perdientes: "+cuotasPendientes() 
                + "\nAmarre: " + amarre + "\nBarco: \n" + barco;
    }
    
}
/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
titular, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
*/