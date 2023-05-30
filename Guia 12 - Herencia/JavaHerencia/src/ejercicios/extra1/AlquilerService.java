
package ejercicios.extra1;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AlquilerService {
    
    Scanner sc;
    List<Alquiler> alquileres;

    public AlquilerService(List<Alquiler> alquileres,Scanner sc) {
        this.alquileres = alquileres;
        this.sc = sc;
    }
    
    public void crearAlquiler(){
        Alquiler creado = new Alquiler();
        creado.crearAlquiler();
        alquileres.add(creado);
    }
    
    public void pagarCuota(){
        int dni;
        System.out.println("Ingrese el numero de DNI del titular:");
        dni = sc.nextInt();
        for (Alquiler alquiler : alquileres) {
            if(alquiler.getDni()==dni){
                alquiler.mostrarCuotas();
                System.out.println("Cuantas cuotas desea abonar?");
                int cant = sc.nextInt();
                for (int i = 0; i < cant; i++) {
                    System.out.println("Cual va a ser la forma de pago?");
                    String pago = sc.next();
                    System.out.println("Que cuota desea abonar?");
                    int cuota = sc.nextInt();
                    alquiler.getCuotas().get(cuota-1).pagar(pago);
                }
            }
        }
    }
    
    public void mostrarAlquiler(){
        int dni;
        System.out.println("Ingrese el numero de DNI del titular:");
        dni = sc.nextInt();
        for (Alquiler alquiler : alquileres) {
            if(alquiler.getDni()==dni){
                System.out.println(alquiler);
                alquiler.mostrarCuotas();
            }
        }
    }
    
    public void mostrarAlquileres(){
        System.out.println("Alquileres actuales:");
        for (Alquiler alquiler : alquileres) {
            System.out.println(alquiler);
        }
    }
    
    public void modificarAlquiler(){
        int dni;
        System.out.println("Ingrese el numero de DNI del titular:");
        dni = sc.nextInt();
        for (Alquiler alquiler : alquileres) {
            if(alquiler.getDni()==dni){
                System.out.println(alquiler.toString());
                int opc;
                do {
                    System.out.println("Que desea modificar?\n"
                        +"1. Nombre del titular\n"
                        +"2. DNI del titular\n"
                        +"3. Amarre\n");
                    opc = sc.nextInt();
                }while(opc<=0||opc>3);
                System.out.println("Has elegido la opción: "+opc+"\nIngrese el nuevo valor:");
                switch (opc){
                    case 1 -> {alquiler.setTitular(sc.next());}
                    case 2 -> {alquiler.setDni(sc.nextInt());}
                    case 3 -> {alquiler.setAmarre(sc.nextInt());}
                }
                
            }
        }
    }
    
    public void eliminarAlquiler(){
        int dni;
        System.out.println("Ingrese el numero de DNI del titular:");
        dni = sc.nextInt();
        Iterator<Alquiler> it = alquileres.iterator();
        while(it.hasNext()){
            Alquiler alquiler = it.next();
            if(alquiler.getDni()==dni){
                if(!alquiler.cuotasPendientes()){
                    alquiler = null;
                    it.remove();
                    System.out.println("Contrato de alquiler eliminado");
                } else {
                    System.out.println("Tiene cuotas pendientes");
                }
            }
        }
    }
    
}
