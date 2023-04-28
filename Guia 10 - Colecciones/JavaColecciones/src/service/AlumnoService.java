
package service;

import entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public double notaFinal(int indice, ArrayList<Alumno> alumnos){
        double retorno = 0;
        for(Integer nota: alumnos.get(indice).getNotas()){
            retorno = retorno + nota;
        }
        retorno = retorno/alumnos.get(indice).getNotas().size();
        System.out.println("La nota final de "+alumnos.get(indice).getNombre()+" es "+retorno);
        return retorno;
    }
    
    public int buscarAlumno(String nombre, ArrayList<Alumno> alumnos){
        int cont=0;
        for(Alumno alumno: alumnos){
            if(alumno.getNombre().equals(nombre)){
                return cont;
            }
            cont++;
        }
        return -1;
    }
    
    public void ingresarAlumnos(ArrayList<Alumno> alumnos){
        String opcion = "";
        do{
            crearAlumno(alumnos);
            System.out.println("Quiere ingresar otro alumno? (S/N)");
            opcion = sc.next().toUpperCase();
        }while(opcion.equals("S"));
    }
    
    public void crearAlumno(ArrayList<Alumno> alumnos){
        Alumno aux = new Alumno();
        System.out.println("Ingrese el nombre del alumno:");
        aux.setNombre(sc.next());
        System.out.println("Cuantas notas va a ingresar:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la nota "+(i+1)+":");
            aux.setNota(sc.nextInt());
        }
        System.out.println(aux.toString());
        alumnos.add(aux);
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