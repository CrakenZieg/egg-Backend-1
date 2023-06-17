
package ejercicios.extra4;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class ServicioCursos {
    
    String[] nombres = {"Analisis","Calculo","Laboratorio","Metodologias","Mapeado",
                        "I","II","III","IV","Introduccion","Practica"};
    String[] apellidos = {"Fisica","Matematica","Quimica","Cuantica","Historia",
                        "Linguistica","Materiales", "Estadistica"};
    Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");
    Random rand = new Random();
    List<Curso> cursos = new ArrayList<>();
    ServicioEstudiante estudiantesService;
    ServicioDocente docentesService;
    
    public ServicioCursos(ServicioEstudiante estudiantesService, ServicioDocente docentesService){
        this.estudiantesService = estudiantesService;
        this.docentesService = docentesService;
    }
    
    public Curso crearCurso(){
        System.out.println("Ingrese el nombre de la materia: ");
        String nombre = sc.next();
        Docente docente;
        do{
            docente = docentesService.getDocente();    
        } while(docente.getCurso()!=null);
        Departamento departamento = docente.getDepartamento();
        Curso curso = new Curso(docente, departamento, nombre);
        cursos.add(curso);
        docente.setCurso(curso);
        departamento.agregarCurso(curso);
        agregarEstudiantes(curso);
        return curso;
    }
    
    public Curso crearCurso(Docente profesor, Departamento departamento, String nombre){
        Curso curso = new Curso(profesor, departamento, nombre);    
        profesor.setCurso(curso);
        departamento.agregarCurso(curso);
        cursos.add(curso);
        return curso;
    }
    
    public Curso crearCursoAuto(){
        String nombre = nombres[rand.nextInt(0, nombres.length)]+" "
                +apellidos[rand.nextInt(0, apellidos.length)];
        Docente profesor = docentesService.getDocenteAuto();
        Departamento departamento = Departamento.values()[rand.nextInt(0, Departamento.values().length)];
        Curso curso = new Curso(profesor, departamento, nombre);
        int n = rand.nextInt(3, 130);
        for (int i = 0; i < 10; i++) {
            Estudiante estudiante = estudiantesService.getEstudianteAuto();
            curso.agregarEstudiante(estudiante);
            estudiante.agregarCurso(curso, 0);
        }      
        cursos.add(curso);
        return curso;
    }
    
    public void agregarEstudiantes(Curso curso){
        System.out.println("Ingrese la cantidad de inscriptos:");
        int cantidad = sc.nextInt();
        estudiantesService.mostrarEstudiantes();
        List<Integer> legajos = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) { 
            int legajo;
            do{
                System.out.println("Ingrese el legajo del estudiante "+(i+1)+" a agregar:");
                legajo=sc.nextInt();
            }while(legajo<0&&!estudiantesService.estudianteInscripto(legajo));
            legajos.add(legajo);
        }
        for (Estudiante estudiante : estudiantesService.estudiantes) {
            Iterator it = legajos.iterator();
            while(it.hasNext()){
                if((Integer)it.next()==estudiante.getLegajo()){
                    estudiante.agregarCurso(curso, 0);
                    curso.agregarEstudiante(estudiante);
                    it.remove();
                }
            }            
        }
    }
    
}
