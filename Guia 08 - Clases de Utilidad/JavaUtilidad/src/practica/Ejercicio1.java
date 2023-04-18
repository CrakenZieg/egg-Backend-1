
package practica;

import entities.Cadena;
import java.util.Scanner;
import javaservicios.EjercicioModelo;
import service.CadenaServicio;

public class Ejercicio1 implements EjercicioModelo {

    @Override
    public void ejercicio() {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");    
        int opc;
        Cadena cadena = null;
        CadenaServicio servicio = new CadenaServicio();
        
        do{
            System.out.println("----------------------------------");
            System.out.println("Ingrese una opcion: ");
            System.out.println("1. Inicializar cadena");
            System.out.println("2. Mostrar cantidad de vocales");
            System.out.println("3. Mostrar la frase invertida");
            System.out.println("4. Comparar longitud con una frase");
            System.out.println("5. Concatenar con una frase");
            System.out.println("6. Mostrar si contiene una letra");
            System.out.println("7. Mostrar repeticiones de una letra");
            System.out.println("8. Reemplazar una letra");
            System.out.println("0. Salir");
            opc = sc.nextInt();
            switch(opc){
                case 1 -> {
                    System.out.println("----------------------------------");
                    System.out.println("Ingrese la cadena:");
                    cadena = new Cadena(sc.next());
                    System.out.println("Cadena inicializada!");
                    System.out.println(cadena.getFrase());
                }
                case 2 -> {
                    System.out.println("----------------------------------");
                    if(cadena==null) {
                        System.out.println("Inicializa la cadena primero!");
                    } else {
                        System.out.println("La cantidad de vocales en la frase es " + servicio.mostrarVocales(cadena));
                    }
                }
                case 3 -> {
                    System.out.println("----------------------------------");
                    if(cadena==null) {
                        System.out.println("Inicializa la cadena primero!");
                    } else {
                        System.out.println("La frase invertida es " + servicio.invertirFrase(cadena).toString());
                    }
                }
                case 4 -> {
                    System.out.println("----------------------------------");
                    if(cadena==null) {
                        System.out.println("Inicializa la cadena primero!");
                    } else {
                        String frase;
                        System.out.println("Ingresa la frase:");
                        frase = sc.next();
                        int n = servicio.compararLongitud(cadena, frase);
                        switch (n) {
                            case 1 -> {System.out.println("Cadena tiene mayor longitud!");}
                            case 0 -> {System.out.println("Tienen la misma longitud!");}
                            case -1 -> {System.out.println("La frase tiene mayor longitud!");}
                        }
                    }
                }
                case 5 -> {
                    System.out.println("----------------------------------");
                    if(cadena==null) {
                        System.out.println("Inicializa la cadena primero!");
                    } else {
                        String frase;
                        System.out.println("Ingresa la frase:");
                        frase = sc.next();
                        System.out.println("El resultado es: " + servicio.unirFrases(cadena, frase).toString());
                    }
                }
                case 6 -> {
                    System.out.println("----------------------------------");
                    if(cadena==null) {
                        System.out.println("Inicializa la cadena primero!");
                    } else {
                        String letra;
                        System.out.println("Ingresa la letra:");
                        letra = sc.next();
                        System.out.println("La cadena contiene la letra " + letra + ": " + servicio.contiene(cadena, letra));
                    }
                }
                case 7 -> {
                    System.out.println("----------------------------------");
                    if(cadena==null) {
                        System.out.println("Inicializa la cadena primero!");
                    } else {
                        String letra;
                        System.out.println("Ingresa la letra:");
                        letra = sc.next();
                        System.out.println("La cadena contiene la letra " + letra + " " + servicio.vecesRepetido(cadena, letra) + " veces");
                    }
                }
                case 8 -> {
                    System.out.println("----------------------------------");
                    if(cadena==null) {
                        System.out.println("Inicializa la cadena primero!");
                    } else {
                        String letraO, letraR;
                        System.out.println("Ingresa la letra objetivo:");
                        letraO = sc.next();
                        System.out.println("Ingresa la letra reemplazo:");
                        letraR = sc.next();
                        System.out.println("La cadena con la letra " + letraO + " cambiada por la letra " + letraR + " es:" );
                        System.out.println(servicio.reemplazar(cadena, letraO, letraR).toString());
                    }
                }
                case 0 -> {
                    System.out.println("----------------------------------");
                    System.out.println("Gracias y saludos!");
                }
            }
        }while(opc!=0);
    }
    
}
/*
Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como 
atributos una frase (String) y su longitud. Agregar constructor vacío y con 
atributo frase solamente. Agregar getters y setters. El constructor con frase 
como atributo debe setear la longitud de la frase de manera automática. Crear 
una clase CadenaServicio en el paquete servicios que implemente los siguientes 
métodos:
-Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene 
la frase ingresada.
-Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
-Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario 
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
-Método compararLongitud(String frase), deberá comparar la longitud de la frase 
que compone la clase con otra nueva frase ingresada por el usuario.
-Método unirFrases(String frase), deberá unir la frase contenida en la clase 
Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
-Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y 
mostrar la frase resultante.
-Método contiene(String letra), deberá comprobar si la frase contiene una letra 
que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/