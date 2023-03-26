/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a 
medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación 
de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
funciones de Java substring(), Length() y Math.random().
*/
package extra;

import java.util.*;

public class ExtraEjercicio6 {
    
    public void ejercicio(){
    
        int nM, nV, min, max;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de la cuadricula: ");
        nM = sc.nextInt();
        String[][] sopa = new String[nM][nM];
        
        System.out.println("Ingrese la cantidad de palabras (sea razonable): ");
        nV = sc.nextInt();
        String[] palabras = new String[nV];
        
        do{
            System.out.println("Ingrese el tamano minimo de la palabras: ");
            min=sc.nextInt();
        }while(min<=0);
        do{
            System.out.println("Ingrese el tamano maximo de la palabras: ");
            max=sc.nextInt();
            if(max>nM){
                System.out.println("El tamano maximo de las palabras no puede "
                        + "superar el de la cuadricula");
            }
        }while(max<=0 || max>nM);
        
        llenarVectorStrings(palabras, min, max);
        ingresarPalabrasEnSopa(sopa, palabras);
        completarMatriz(sopa);
        mostrarMatriz(sopa);
    }
    
    public void ingresarPalabrasEnSopa(String[][] matriz, String[] vector){
    
        int fila, columna, direccion;
        Random rand = new Random();
        boolean libre;
        for (int i = 0; i < vector.length; i++) {
            do {
                direccion = rand.nextInt(2);
                if(direccion == 0){
                    fila = rand.nextInt(matriz.length);
                    columna = rand.nextInt(matriz[fila].length-vector[i].length());
                    libre = libreOcupado(matriz, fila, columna, direccion, vector[i]);
                } else {
                    fila = rand.nextInt(matriz.length-vector[i].length());
                    columna = rand.nextInt(matriz[fila].length);
                    libre = libreOcupado(matriz, fila, columna, direccion, vector[i]);
                }
            } while(!libre);
            if(direccion == 0){
                for (int j = 0; j < vector[i].length(); j++) {
                    matriz[fila][columna+j] = vector[i].substring(j, j+1);
                }
            } else {
                for (int j = 0; j < vector[i].length(); j++) {
                    matriz[fila+j][columna] = vector[i].substring(j, j+1);
                }
            }
        }
    }

    public boolean libreOcupado(String[][] matriz, int fila, int columna, int direccion, String palabra){
        boolean libre = true;
        for (int i = 0; i < palabra.length(); i++) {
            if(matriz[(direccion==0?fila:fila+i)][(direccion==0?columna+i:columna)]==null){
                matriz[(direccion==0?fila:fila+i)][(direccion==0?columna+i:columna)] = "";
            } else {
                libre = matriz[(direccion==0?fila:fila+i)][(direccion==0?columna+i:columna)].equals("") ||
                        matriz[(direccion==0?fila:fila+i)][(direccion==0?columna+i:columna)].equals(palabra.substring(i,i+1));
                if(!libre){
                    break;
                }
            }
        }
        return libre;
    }
  
    public void llenarVectorStrings(String[] palabras, int min, int max){
        Scanner sc = new Scanner(System.in);
        String palabra;
        for (int i = 0; i < palabras.length; i++) {
            do{
                System.out.println("Ingresa la palabra numero "+(i+1)+": ");
                palabra = sc.next();
            } while(palabra.length()<min || palabra.length()>max);
            palabras[i] = palabra.toUpperCase();
        }
    }
    
    public void completarMatriz(String[][] matriz){
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]==null || matriz[i][j].equals("")){
                    matriz[i][j] = Integer.toString(rand.nextInt(10));
//                    matriz[i][j] = " ";
                }
            }
        }
    }
    
    public void mostrarMatriz(String[][] matriz){
        System.out.println("-----------------------------");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("]");
            System.out.println("");
        }
        System.out.println("-----------------------------");
    }
    
}
