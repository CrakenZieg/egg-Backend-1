
package practica;

import java.util.ArrayList;
import javaservicios.EjercicioModelo;
import service.ArregloService;

public class Ejercicio3 implements EjercicioModelo {

    @Override
    public void ejercicio() {
            
        ArregloService service = new ArregloService();
        double[] A = new double[50];
        double[] B = new double[20];
        ArrayList<Double> arrayA = new ArrayList<Double>();
        ArrayList<Double> arrayB = new ArrayList<Double>();
        
        System.out.println("Inicializa A:");
        service.inicializarA(A);
        System.out.println("Muestra A");
        service.mostrar(A);
        System.out.println("Ordena A");
        service.ordenar(A);
        System.out.println("Inicializa B");
        service.inicializarB(A, B);
        System.out.println("Muestra A");
        service.mostrar(A);
        System.out.println("Muestra B");
        service.mostrar(B);
        
        System.out.println("Inicializa A:");
        service.inicializarA(arrayA);
        System.out.println("Muestra A");
        service.mostrar(arrayA);
        System.out.println("Ordena A");
        service.ordenar(arrayA);
        System.out.println("Inicializa B");
        service.inicializarB(arrayA, arrayB);
        System.out.println("Muestra A");
        service.mostrar(arrayA);
        System.out.println("Muestra B");
        service.mostrar(arrayB);
    }
}
/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo 
B de 20 números reales. Crear la clase ArregloService, en el paquete servicio, 
con los siguientes métodos:
-Método inicializarA recibe un arreglo por parámetro y lo inicializa con números 
aleatorios.
-Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
-Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
-Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, 
mostrar A y B.
*/