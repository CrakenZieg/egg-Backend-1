
package ejercicios.extra4;

import java.nio.charset.StandardCharsets;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ServicioDocente {
    String[] nombres = {
            "Juan","Pedro","Carlos","Luis","Miguel","José","Antonio","Francisco","David","Alberto",
            "María", "Ana", "Laura", "Sofía", "Carmen", "Isabel", "Luisa", "Patricia", "Rosa", "Elena"};
    String[] apellidos = {
            "García", "Rodríguez", "López", "Martínez", "González", "Hernández", "Pérez", "Sánchez", "Ramírez",
            "Flores", "Torres", "Rivera", "Vargas", "Castillo", "Romero", "Fernández", "Rojas", "Ortega", "Mendoza",
            "Silva", "Morales", "Guerrero", "Delgado", "Núñez", "Ramos", "Cruz", "Mejía", "Jiménez", "Luna", "Vega"};
    Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");
    Random rand = new Random();
    List<Docente> docentes = new ArrayList<>();
    private int contador = 0; 
    
    public Docente getDocente(){
        System.out.println("Ingrese numero de legajo: ");
        int legajo = sc.nextInt();
        int index = -1;
        for (Docente docente : docentes) {
            if(docente.getLegajo()==legajo){
                index = docentes.indexOf(docente);
            }
        }
        return (index!=-1)?docentes.get(index):null;
    }
    
    public Docente crearDocente(){
        Docente docente;
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
        System.out.println("Ingrese una opcion mes de ingreso: \n");
            for (int i = 0; i<Month.values().length; i++) {
                System.out.println((i+1)+". "+Month.values()[i]);
            }
        opcion = sc.nextInt();
        }while(opcion<0||opcion>Month.values().length);
        int mes = opcion;
        do{
        System.out.println("Ingrese una opcion año de ingreso: ");            
        opcion = sc.nextInt();
        }while(opcion<1900||opcion>Year.now().getValue());
        int anio = opcion;
        do{
        System.out.println("Ingrese el numero de despacho: ");            
        opcion = sc.nextInt();
        }while(opcion<=0);
        int despacho = opcion;
        do{
        System.out.println("Ingrese una opcion para el cargo: ");
            for (int i = 0; i<Cargo.values().length; i++) {
                System.out.println((i+1)+". "+Cargo.values()[i]);
            }
        opcion = sc.nextInt();
        }while(opcion<0||opcion>Cargo.values().length);
        int cargo = opcion-1;
        do{
        System.out.println("Ingrese un departamento para el cargo: ");
            for (int i = 0; i<Departamento.values().length; i++) {
                System.out.println((i+1)+". "+Departamento.values()[i]);
            }
        opcion = sc.nextInt();
        }while(opcion<0||opcion>Departamento.values().length);
        int departamento = opcion-1;
        docente = new Docente(Departamento.values()[departamento], Cargo.values()[cargo], anio, mes, despacho, nombre, apellido, legajo, estado);
        return docente;
    }
    
    public Docente crearDocenteAuto(){        
        return new Docente(Departamento.values()[rand.nextInt(0, Departamento.values().length)], 
                Cargo.values()[rand.nextInt(0, Cargo.values().length)], 
                rand.nextInt(1950, Year.now().getValue()), 
                rand.nextInt(1, 13), rand.nextInt(0, 2000), 
                nombres[rand.nextInt(0, nombres.length)], 
                apellidos[rand.nextInt(0, apellidos.length)], 
                rand.nextInt(1000, 50000), 
                EstadoCivil.values()[rand.nextInt(0, EstadoCivil.values().length)]);        
    }
    
    public void cargarDocentes(int n){
        for (int i = 0; i < n; i++) {
            docentes.add(crearDocenteAuto());      
        }
    }
    
    public Docente getDocenteAuto(){
        Docente docente;
        do{
            if(rand.nextBoolean()){            
                docente = docentes.get(rand.nextInt(0, docentes.size()));            
            }else{
                if(contador==docentes.size()){
                    contador = 0;
                }                
                docente = docentes.get(contador++);
            }
        }while(docente.getCurso()!=null);
        return docente;
    }
    
    public void mostrarDocentes(){
        for (Docente docente : docentes) {
            System.out.println(docente);
        }
    }
    
    public void mostrarDocentesDepartamento(Departamento departamento){
        for (Docente docente : docentes) {
            if(docente.getDepartamento().equals(departamento)){
                System.out.println(docente);
            }
        }
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