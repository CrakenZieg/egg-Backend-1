
package integrador;

import entities.Estudiante;

public class Integrador {

    public static void main(String[] args) {
        
//        int n = 8;
//        Estudiante[] general = new Estudiante[n];
//        
//        double promedioGeneral = promedio(general);
//        System.out.println("Promedio general: "+promedioGeneral); 
//        
//        Estudiante[] mayorAlPromedio = mayorAlPromedio(general, promedioGeneral);
//        
//        System.out.println("Mayor al promedio");
//        for(Estudiante estudiante: mayorAlPromedio){
//            System.out.println("Nombre:"+estudiante.getNombre());
//        }
    int contador=1;
    for(int i=2;i<=128;i*=2){
        System.out.println("i: "+ i);
        System.out.println("Tenes que practicar como contar con los dedos capo:"+ contador++);
    }
        
    }
    
    public static double promedio(Estudiante[] estudiantes){
        int n = estudiantes.length;
        double suma = 0;
        for(Estudiante estudiante: estudiantes){
            suma += estudiante.getNota();
        }
        return (suma/n);
    }
    
    public static Estudiante[] mayorAlPromedio(Estudiante[] estudiantes, double promedio){
        int contador = 1;
        for(Estudiante estudiante: estudiantes){
            if(estudiante.getNota()>promedio){
                contador++;
            }
        }
        Estudiante[] retorno = new Estudiante[contador];
        int posicion = 0;
        for(Estudiante estudiante: estudiantes){
            if(estudiante.getNota()>promedio){
                retorno[posicion] = estudiante;
                posicion++;
            }
        }
        return retorno;
    }
    
}
/*
Ejercicio integrador
Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el
examen final. La escuela nos ha pedido que calculemos el promedio de notas
final de todos sus alumnos y saber qué alumnos han recibido una nota por
encima de ese promedio.
Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
van a ser nombre y nota (representando la nota obtenida en el final).
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un
arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
dos tareas que nos ha pedido la escuela.
1. Calcular y mostrar el promedio de notas de todo el curso
2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso
3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];
*/