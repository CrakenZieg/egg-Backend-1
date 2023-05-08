
package practica;

import entities.Alumno;
import java.util.ArrayList;
import javacolecciones.EjercicioModelo;
import service.AlumnoService;

public class Ejercicio3 implements EjercicioModelo{

    @Override
    public void ejercicio() {
        
        ArrayList<Alumno> alumnos = new ArrayList<>();
        AlumnoService servicio = new AlumnoService();
        int opcion;
        
        do {
            System.out.println("Ingrese una opcion:");
            System.out.println("1. Ingresar alumno");
            System.out.println("2. Ingresar alumnos");
            System.out.println("3. Mostrar alumnos");
            System.out.println("4. Mostrar notas finales");
            System.out.println("5. Mostrar nota final");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1 ->{
                    servicio.crearAlumno(alumnos);
                }
                case 2 ->{
                    servicio.ingresarAlumnos(alumnos);
                }
                case 3 ->{
                    System.out.println("Los alumnos son: ");
                    for(Alumno alumno: alumnos){
                        System.out.println(alumno.toString());
                    }
                }
                case 4 ->{
                    System.out.println("Las notas finales son: ");
                    for(int i=0; i<alumnos.size(); i++){
                        servicio.notaFinal(i, alumnos);
                    }
                }
                case 5 ->{
                    System.out.println("Ingrese el nombre del alumno: ");
                    String nombre = sc.next();
                    int indice = servicio.buscarAlumno(nombre, alumnos);
                    if(indice!=-1){
                        servicio.notaFinal(indice, alumnos);
                    } else {
                        System.out.println("El alumno no está en la lista!");
                    }
                }
                case 0 ->{
                    System.out.println("Gracias! Hasta luego!");
                }
                default -> {
                    System.out.println("Opcion no valida!");
                }
            }
        } while(opcion!=0);  
    }
}
/*
3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
*/