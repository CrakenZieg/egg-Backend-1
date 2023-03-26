/*
Los profesores del curso de programación de Egg necesitan llevar un registro de 
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados 
y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 2 por 
trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
-Primer trabajo práctico evaluativo 10%
-Segundo trabajo práctico evaluativo 15%
-Primer Integrador 25%
-Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad 
de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos 
con promedio mayor o igual al 7 de sus notas del curso.
*/
package extra;

import java.util.*;

public class ExtraEjercicio4 {

    public void ejercicio(){
    
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Ingrese la cantida de alumnos: ");
        n=sc.nextInt();
        
        double[][] curso = new double[n][4];
        double[] notaFinal = new double[n];
        
        cargarNotas(curso);
        System.out.println("Estas son las notas:");
        mostrarMatriz(curso);
        procesarNotas(curso,notaFinal);
        System.out.println("Estas son las notas finales:");
        mostrarVector(notaFinal);
        System.out.println("Estos son los resultados del curso:");
        aprobadosDesaprobados(notaFinal);
    }
    
    public void aprobadosDesaprobados(double[] notas){
    
        int aprobados, desaprobados;
        aprobados=0;
        desaprobados=0;
        for (int i = 0; i < 10; i++) {
            if(notas[i]<7){
                desaprobados+=1;
            } else {
                aprobados+=1;
            }
        }
        System.out.println("Aprobados: "+ aprobados);
        System.out.println("desaprobados: "+ desaprobados);
        System.out.println("-----------------------------");
    }
    
    public void cargarNota(double[] alumno){
    
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String[] categorias = {"TP1", "TP2", "Integrador 1", "Integrador 2"};
        for (int i = 0; i < alumno.length; i++) {
//            System.out.println("Ingrese la nota correspondiente al "+ categorias[i]+":");
//            alumno[i] = sc.nextInt();
              alumno[i] = rand.nextDouble(10);
        }
    }    
    public void cargarNotas(double[][] curso){
    
        for(int i = 0; i < curso.length; i++) {
            System.out.println("Ingrese las nota del alumno "+(i+1)+":");
            cargarNota(curso[i]);
        }
    
    }
    
    public void mostrarMatriz(double[][] matriz){
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
    
    public void procesarNotas(double[][] matriz, double[] vector){
        
        double[] modificadores = {0.1,0.15,0.25,0.5};
        
        for (int i = 0; i < matriz.length; i++) {
            vector[i]=0;
            for (int j = 0; j < matriz[i].length; j++) {
                vector[i]+=matriz[i][j]*modificadores[j];
            }
        }
    }
    
    public void mostrarVector(double[] vector){
        System.out.println("-----------------------------");
        System.out.print("[ ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
        }
        System.out.print("]");
        System.out.println("");
        System.out.println("-----------------------------");
    }
    
}
