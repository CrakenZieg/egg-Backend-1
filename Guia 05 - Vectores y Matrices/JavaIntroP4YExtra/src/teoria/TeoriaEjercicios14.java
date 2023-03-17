/*
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros 
de equipo.
*/

package teoria;

public class TeoriaEjercicios14 {
    
    public void ejercicio(){
    
        TeoriaEjercicios13 completando = new TeoriaEjercicios13();
        String[] lista = {"Rodrigo","Francisco","Hector","Roberto","Antonela","Antonio","Gustavo"};
        
        System.out.println("Intanciada la clase 'TeoriaEjercicios13', se recupera "
                + "el arreglo de tipo String creado en el ejercicio T13, este ejercicio lo completa y muestra");
        
        for (int i = 0; i < completando.equipo7.length; i++) {
            completando.equipo7[i] = lista[i];
        }
        
        for (String equipo7 : completando.equipo7) {
            System.out.println(equipo7);
        }
        
        System.out.println("Gran equipo!");
                
    }
}
