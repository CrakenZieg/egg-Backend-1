
package ejercicios.extra4;

import java.util.ArrayList;

public enum Departamento {
    
    MATEMATICA("MATEMATICA", new ArrayList<Curso>(), new ArrayList<Docente>(), new ArrayList<Estudiante>(),new ArrayList<NoDocente>()),
    FISICA("FISICA", new ArrayList<Curso>(), new ArrayList<Docente>(), new ArrayList<Estudiante>(),new ArrayList<NoDocente>()),
    QUIMICA("QUIMICA", new ArrayList<Curso>(), new ArrayList<Docente>(), new ArrayList<Estudiante>(),new ArrayList<NoDocente>()),   
    INGMECANICA("INGMECANICA", new ArrayList<Curso>(), new ArrayList<Docente>(), new ArrayList<Estudiante>(),new ArrayList<NoDocente>()),
    INGELECTRICA("INGELECTRICA", new ArrayList<Curso>(), new ArrayList<Docente>(), new ArrayList<Estudiante>(),new ArrayList<NoDocente>()),
    INGCIVIL("INGCIVIL", new ArrayList<Curso>(), new ArrayList<Docente>(), new ArrayList<Estudiante>(),new ArrayList<NoDocente>()),
    HUMANIDADES("HUMANIDADES", new ArrayList<Curso>(), new ArrayList<Docente>(), new ArrayList<Estudiante>(),new ArrayList<NoDocente>()),
    COMPUTACION("COMPUTACION", new ArrayList<Curso>(), new ArrayList<Docente>(), new ArrayList<Estudiante>(),new ArrayList<NoDocente>());
    
    private String departamento;
    private ArrayList<Curso> cursos;
    private ArrayList<Docente> profesores;    
    private ArrayList<NoDocente> noDocentes;
    private ArrayList<Estudiante> estudiantes;

    private Departamento() {
        this.cursos = new ArrayList<Curso>();
        this.profesores = new ArrayList<Docente>();
        this.estudiantes = new ArrayList<Estudiante>();
        this.noDocentes = new ArrayList<NoDocente>();
    }
        
    Departamento(String departamento, ArrayList<Curso> cursos, ArrayList<Docente> profesores, ArrayList<Estudiante> alumnos, ArrayList<NoDocente> noDocentes){
        this.departamento = departamento;
        this.cursos = cursos;
        this.profesores = profesores;
        this.estudiantes = alumnos;
    }    
    
    public String getDepartamento(){
        return this.departamento;
    }
    
    public void setCursos(ArrayList<Curso> cursos){
        this.cursos = cursos; 
    }
    
    public void setProfesores(ArrayList<Docente> profesores){
        this.profesores = profesores; 
    }
    
    public void setEstudiantes(ArrayList<Estudiante> alumnos){
        this.estudiantes = alumnos; 
    }
    
    public void agregarDocente(Docente docente){
        this.profesores.add(docente);
    }
    
    public void agregarNoDocente(NoDocente noDocente){
        this.noDocentes.add(noDocente);
    }
    
    public void agregarAlumno(Estudiante estudiante){
        this.estudiantes.add(estudiante);
    }
    
    public void agregarCurso(Curso curso){
        this.cursos.add(curso);
    }
    
    public void eliminarDocente(Docente docente){
        this.profesores.remove(docente);
    }
    
    public void eliminarNoDocente(NoDocente noDocente){
        this.noDocentes.remove(noDocente);
    }
    
    public void eliminarAlumno(Estudiante estudiante){
        this.estudiantes.remove(estudiante);
    }
    
    public void eliminarCurso(Curso curso){
        this.cursos.remove(curso);
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public ArrayList<Docente> getProfesores() {
        return profesores;
    }

    public ArrayList<NoDocente> getNoDocentes() {
        return noDocentes;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
    @Override
    public String toString(){
        return this.departamento;
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