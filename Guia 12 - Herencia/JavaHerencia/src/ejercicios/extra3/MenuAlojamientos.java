
package ejercicios.extra3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class MenuAlojamientos {
    
    Scanner sc ;
    AlojamientoService service = new AlojamientoService();
    List<Alojamiento> alojamientos;
    List<Alojamiento> filtrado = new ArrayList<>();
    TreeSet<Hotel> hoteles = new TreeSet<>();

    public MenuAlojamientos(Scanner sc) {
        this.sc = sc;
        this.alojamientos=service.alojamientos;
        service.cargarAlojamientos(80);
    }

    public void menu(){
        
        int opcion;
        do{
            System.out.println("Ingrese una opcion:\n"+
                    "1. Mostrar todos los alojamientos disponibles\n"+
                    "2. Mostrar hoteles\n"+
                    "3. Mostrar otros alojamientos");
            opcion=sc.nextInt();
            switch(opcion){
                case 1 -> {mostrar(this.alojamientos);}
                case 2 -> {
                    for (Alojamiento alojamiento : alojamientos) {
                        if(alojamiento instanceof Hotel){
                            hoteles.add((Hotel)alojamiento);
                        }
                    }
                    System.out.println("Ingrese una opcion:\n"+
                    "1. Mostrar todos los hoteles disponibles\n"+
                    "2. Mostrar hoteles de 4 estrellas\n"+
                    "3. Mostrar hoteles de 5 estrellas");
                    opcion=sc.nextInt();
                    switch (opcion){                        
                        case 2 -> {
                            hoteles.removeIf((aloj) -> {return (aloj instanceof Hotel5);});                            
                        }
                        case 3 -> {
                            hoteles.removeIf((aloj) -> {return (aloj.getClass().getSimpleName().equals("Hotel4"));});
                            //como se extrana SQL 
                        }
                    }
                    mostrar(hoteles);
                }
                case 3 -> {
                    this.filtrado=(List<Alojamiento>) alojamientos.stream().filter((aloj) -> {return (aloj instanceof AlojamientoExtraHotelero);});
                    System.out.println("Ingrese una opcion:\n"+
                        "1. Mostrar todos alojamientos no hoteleros disponibles\n"+
                        "2. Mostrar campings\n"+
                        "3. Mostrar residencias");
                    opcion=sc.nextInt();
                    switch (opcion){                        
                        case 2 -> {
                            this.filtrado=(List<Alojamiento>) filtrado.stream().filter((aloj) -> {return (aloj instanceof Camping);});
                            System.out.println("Ingrese una opcion:\n"+
                                "1. Mostrar todos los campings\n"+
                                "2. Mostrar campings con restaurant\n"+
                                "3. Mostrar campings sin restaurant");
                            opcion=sc.nextInt();
                            switch (opcion){
                                case 2 ->{
                                    this.filtrado=(List<Alojamiento>) filtrado.stream().filter((aloj) -> 
                                    {if(aloj instanceof Camping){return ((Camping) aloj).isRestaurante();}else{return false;}});
                                }
                                case 3 ->{
                                    this.filtrado=(List<Alojamiento>) filtrado.stream().filter((aloj) -> 
                                    {if(aloj instanceof Camping){return !((Camping) aloj).isRestaurante();}else{return false;}});
                                }
                            }     
                        }
                        case 3 -> {
                            this.filtrado=(List<Alojamiento>) filtrado.stream().filter((aloj) -> {return (aloj instanceof Residencia);});
                            System.out.println("Ingrese una opcion:\n"+
                                "1. Mostrar todas las residencias\n"+
                                "2. Mostrar residencias con descuento gremial\n"+
                                "3. Mostrar residencias sin descuento gremial");
                            opcion=sc.nextInt();
                            switch (opcion){
                                case 2 ->{
                                    this.filtrado=(List<Alojamiento>) filtrado.stream().filter((aloj) -> 
                                    {if(aloj instanceof Residencia){return ((Residencia) aloj).isDescGremial();}else{return false;}});
                                }
                                case 3 ->{
                                    this.filtrado=(List<Alojamiento>) filtrado.stream().filter((aloj) -> 
                                    {if(aloj instanceof Residencia){return !((Residencia) aloj).isDescGremial();}else{return false;}});
                                }                                
                            }
                            System.out.println("Ingrese una opcion:\n"+
                                "1. Mostrar residencias con campo deportivo\n" +
                                "2. Mostrar residencias sin campo deportivo");
                            switch (opcion){
                                case 1 ->{
                                    this.filtrado=(List<Alojamiento>) filtrado.stream().filter((aloj) -> 
                                    {if(aloj instanceof Residencia){return ((Residencia) aloj).isCampoDeportivo();}else{return false;}});
                                }
                                case 2 ->{
                                    this.filtrado=(List<Alojamiento>) filtrado.stream().filter((aloj) -> 
                                    {if(aloj instanceof Residencia){return !((Residencia) aloj).isCampoDeportivo();}else{return false;}});
                                }
                            }
                        }
                    }                    
                mostrar(filtrado);
                }
            }            
        }while(opcion!=0);
        System.out.println("Gracias, saludos!");
        
    }
    
    public void mostrar(List<Alojamiento> alojamientos){
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento.toString());
        }
    }
    public void mostrar(TreeSet<Hotel> alojamientos){
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento.toString());
        }
    }
    
}
/*
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
*/