
package servicio;

import domain.PerroEx1;
import domain.PersonaEx1;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdopcionEx1Servicio {
    
    Random rand = new Random();
    Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");
    String[] abecedario= {"A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    
    public int buscarPerro(List<PerroEx1> perros, String nombre){
        int index = -1;
        for (int i = 0; i < perros.size(); i++) {
            if(perros.get(i).getNombre().equals(nombre)){
                index = i;
            }
        }
        return index;
    }
    
    public PersonaEx1 crearPersona(){
        PersonaEx1 persona = new PersonaEx1();
        System.out.println("Ingrese el nombre: ");
        persona.setNombre(sc.next());
        System.out.println("Ingrese el apellido: ");
        persona.setApellido(sc.next());
        System.out.println("Ingrese la edad: ");
        persona.setEdad(sc.nextInt());
        System.out.println("Ingrese el DNI: ");
        persona.setDocumento(sc.nextInt());
        persona.setPerro(null);
        return persona;
    }
    
    public PerroEx1 crearPerro(){
        PerroEx1 perro = new PerroEx1();
        System.out.println("Ingrese el nombre: ");
        perro.setNombre(sc.next());
        System.out.println("Ingrese la raza: ");
        perro.setRaza(sc.next());
        System.out.println("Ingrese la edad: ");
        perro.setEdad(sc.nextInt());
        System.out.println("Ingrese el tamano: ");
        perro.setTamano(sc.next());
        perro.setAdoptado(false);
        return perro;
    }
    
    public void asignar(List<PersonaEx1> personas, List<PerroEx1> perros){
        mostrarListasFil(personas,perros);
        int cantidad = (personas.size()>perros.size())?perros.size():personas.size();
        int pers;
        int perr;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el indice del candidato: ");
            pers = sc.nextInt()-1;
            System.out.println(personas.get(pers).toString());
            while(pers>personas.size()||pers<0||personas.get(pers).getPerro()!=null){
                System.out.println("Ingrese un indice valido: ");
                pers = sc.nextInt();  
                System.out.println(personas.get(pers).toString());
            }
            System.out.println("Ingrese el nombre del CANdidato: ");
            perr = buscarPerro(perros, sc.next());
            System.out.println(perros.get(perr).toString());
            while(perr>perros.size()||perr<0||perros.get(perr).isAdoptado()){
                System.out.println("Ingrese un nombre valido: ");
                perr = buscarPerro(perros, sc.next());  
                System.out.println(perros.get(perr).toString());
            }
            personas.get(pers).setPerro(perros.get(perr));
            perros.get(perr).setAdoptado(true);
        }
    }
    
    public void mostrarListas(List<PersonaEx1> PersonaEx1, List<PerroEx1> perros, String mensaje){
        System.out.println(mensaje);
        int cont = 0;
        for (PersonaEx1 persona : PersonaEx1) {
            System.out.println(++cont+": "+ persona.toString());
        }
        cont = 0;
        for (PerroEx1 perro : perros) {
            System.out.println(++cont+": "+ perro.toString());
        }
    }
    public void mostrarListasFil(List<PersonaEx1> PersonaEx1, List<PerroEx1> perros){
        System.out.println("disponibles");
        int cont = 0;
        for (PersonaEx1 persona : PersonaEx1) {
            ++cont;
            if (persona.getPerro()==null){
                System.out.println(cont+": "+ persona.toString());
            }
        }
        cont = 0;
        for (PerroEx1 perro : perros) {
            ++cont;
            if(!perro.isAdoptado()){
                System.out.println(cont+": "+ perro.toString());
            }
        }
    }
    
    public void asignarAuto(List<PersonaEx1> personas, List<PerroEx1> perros){
        List<PersonaEx1> auxPersonas = personas.stream().filter((persona)->(persona.getPerro()==null)).toList();
        List<PerroEx1> auxPerros = perros.stream().filter((perro)->(!perro.isAdoptado())).toList();
        if(!auxPersonas.isEmpty()&&!auxPerros.isEmpty()){
            if(auxPersonas.size()>auxPerros.size()){
                for(PerroEx1 perro : auxPerros) {
                    PersonaEx1 candidato;
                    do{
                        candidato = auxPersonas.get(rand.nextInt(0,auxPersonas.size()));
                    } while (candidato.getPerro()!=null);
                    perro.setAdoptado(true);
                    candidato.setPerro(perro);                      
                }
            } else {
                for (PersonaEx1 persona : auxPersonas) {
                    PerroEx1 candidato;
                    do{
                        candidato = auxPerros.get(rand.nextInt(0,auxPerros.size()));
                    } while (candidato.isAdoptado());
                    candidato.setAdoptado(true);
                    persona.setPerro(candidato);
                }
            }
        } else {
            System.out.println("No hay candidatos disponibles!");
        }
    }
    
    public void cargarListasAuto(List<PersonaEx1> personas, List<PerroEx1> perros, int n){
        for(int j=0; j<n; j++){
            PersonaEx1 persona = crearPersonaAuto();
            personas.add(persona);
            System.out.println((j+1)+": "+persona.toString());
            PerroEx1 perro = crearPerroAuto();
            perros.add(perro);
            System.out.println((j+1)+": "+perro.toString());
        }
    }
    
    private PersonaEx1 crearPersonaAuto(){
        int largo = rand.nextInt(1,15);
        String nombre= "";
        for(int i=0; i<largo; i++){ 
            nombre = nombre.concat(abecedario[rand.nextInt(abecedario.length)]);
        }
        largo = rand.nextInt(1,15);
        String apellido= "";
        for(int i=0; i<largo; i++){ 
            apellido = apellido.concat(abecedario[rand.nextInt(abecedario.length)]);
        }
        largo = rand.nextInt(7,8);
        int edad = rand.nextInt(0,99);
        String aux= "";
        for(int i=0; i<largo; i++){ 
            aux = aux.concat(Integer.toString(rand.nextInt(0,9)));
        }
        int dniNum = Integer.valueOf(aux);
        return new PersonaEx1(nombre, apellido, edad, dniNum, null);
    }
    
    private PerroEx1 crearPerroAuto(){
        String[] tamano = {"chico","mediano","grande"};
        String[] raza = {"salchicha", "rope", "caniche", "chihuahua", "callejero", "perro"};
        int largo = rand.nextInt(1,15);
        String nombreP= "";
        for(int i=0; i<largo; i++){ 
            nombreP = nombreP.concat(abecedario[rand.nextInt(abecedario.length)]);
        }
        return new PerroEx1(nombreP, raza[rand.nextInt(0, raza.length-1)],
                tamano[rand.nextInt(0, tamano.length-1)],rand.nextInt(0, 18), false);
    }
    
}
/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
*/