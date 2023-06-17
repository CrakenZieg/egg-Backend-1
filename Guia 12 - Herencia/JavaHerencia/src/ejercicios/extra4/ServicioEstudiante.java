
package ejercicios.extra4;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ServicioEstudiante {
    String[] nombres = {
            "Juan","Pedro","Carlos","Luis","Miguel","José","Antonio","Francisco","David","Alberto",
            "María", "Ana", "Laura", "Sofía", "Carmen", "Isabel", "Luisa", "Patricia", "Rosa", "Elena"};
    String[] apellidos = {
            "García", "Rodríguez", "López", "Martínez", "González", "Hernández", "Pérez", "Sánchez", "Ramírez",
            "Flores", "Torres", "Rivera", "Vargas", "Castillo", "Romero", "Fernández", "Rojas", "Ortega", "Mendoza",
            "Silva", "Morales", "Guerrero", "Delgado", "Núñez", "Ramos", "Cruz", "Mejía", "Jiménez", "Luna", "Vega"};
    Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");
    Random rand = new Random();
    List<Estudiante> estudiantes = new ArrayList<>();
    int contador = 0;
    
    public Estudiante crearEstudiante(){
        Estudiante estudiante;
        System.out.println("Ingrese el nombre:");
        String nombre = sc.next();
        System.out.println("Ingrese el apellido:");
        String apellido = sc.next();
        System.out.println("Ingrese el numero de legajo:");
        int legajo = sc.nextInt();
        int opcion;
        do{
            System.out.println("Ingrese una opcion para el estado civil: \n");
            for (int i = 0; i<EstadoCivil.values().length; i++) {
                System.out.println((i+1)+". "+EstadoCivil.values()[i]);
            }
            opcion = sc.nextInt();
        }while(opcion<0||opcion>EstadoCivil.values().length);
        EstadoCivil estado = EstadoCivil.values()[opcion-1];
        do{
        System.out.println("Ingrese un departamento para el alumno: ");
            for (int i = 0; i<Departamento.values().length; i++) {
                System.out.println((i+1)+". "+Departamento.values()[i]);
            }
        opcion = sc.nextInt();
        }while(opcion<0||opcion>Departamento.values().length);
        Departamento departamento = Departamento.values()[opcion-1];
        estudiante = new Estudiante(nombre, apellido, legajo, estado, departamento);
        return estudiante;
    }
    
    public Estudiante crearEstudianteAuto(){        
        return new Estudiante(
                nombres[rand.nextInt(0, nombres.length)], 
                apellidos[rand.nextInt(0, apellidos.length)], 
                rand.nextInt(1000, 50000), 
                EstadoCivil.values()[rand.nextInt(0, EstadoCivil.values().length)],
                Departamento.values()[rand.nextInt(0, Departamento.values().length)]);        
    }
    
    public void cargarEstudiantes(int n){
        for (int i = 0; i < n; i++) {
            estudiantes.add(crearEstudianteAuto());
        }
    }
    
    public Estudiante getEstudianteAuto(){
        if(rand.nextBoolean()){            
            return estudiantes.get(rand.nextInt(0, estudiantes.size()));            
        }else{
            if(contador==estudiantes.size()){
                contador = 0;
            }
            return estudiantes.get(contador++);
        }
    }
    public Estudiante getEstudianteAuto(List<Estudiante> estudiantes){
        int contador = 0;
        if(rand.nextBoolean()){            
            return estudiantes.get(rand.nextInt(0, estudiantes.size()));            
        }else{
            if(contador==estudiantes.size()){
                contador = 0;
            }
            return estudiantes.get(contador++);
        }
    }
    
    public void mostrarEstudiantes(){
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
    
    public void mostrarEstudiantesDepartamento(Departamento departamento){
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getDepartamento().equals(departamento)){
                System.out.println(estudiante);
            }
        }
    }
    
    public boolean estudianteInscripto(int legajo){
        boolean ins = false;
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getLegajo()==legajo){
                ins=true;
                break;
            }
        }
        return ins;
    }
    
//    public Estudiante getEstudiante(){
//        
//    }
    
    public void eliminarEstudiante(Estudiante estudiante){
        estudiante.getCursos().remove(estudiante);
        estudiante.getDepartamento().getEstudiantes().remove(estudiante);
        estudiantes.remove(estudiante);
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