
package ejercicios.extra4;

import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;

public class Estudiante extends Persona{
    
    private Map<Curso, Integer> cursos= new HashMap<>();

    public Estudiante(String nombre, String apellido, int legajo, EstadoCivil estadoCivil, Departamento departamento) {
        super(nombre, apellido, legajo, estadoCivil, departamento);        
    }

    public Estudiante(Curso curso, int nota, String nombre, String apellido, int legajo, EstadoCivil estadoCivil, Departamento departamento) {
        super(nombre, apellido, legajo, estadoCivil, departamento);
        this.cursos.put(curso, nota);
    }

    public Map<Curso, Integer> getCursos() {
        return cursos;
    }
    
    public void agregarCurso(Curso curso, int nota){
        this.cursos.put(curso, nota);
    }
    
    public void eliminarCurso(Curso curso){
        this.cursos.remove(curso);
    }
    
    public String historial(){
        StringBuilder sb = new StringBuilder();
        sb.append("Historial academico: ");
        for (Map.Entry<Curso, Integer> entry : cursos.entrySet()) {
            sb.append(entry.getKey().getNombre()+", nota: "+entry.getValue()+"; ");            
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        return sb.toString();
    }
    
}
/*
Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
*/
