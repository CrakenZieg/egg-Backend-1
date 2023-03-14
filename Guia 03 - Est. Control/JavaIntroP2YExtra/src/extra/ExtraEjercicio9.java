/*
Simular la división usando solamente restas. Dados dos números enteros mayores 
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo 
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor 
que el divisor, este resultado es el residuo, y el número de restas realizadas 
es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

*/
package extra;

import java.util.Scanner;

public class ExtraEjercicio9 {
    
    public void ejercicio(){
        
        Scanner sc = new Scanner(System.in);
        int num1, num2, aux, resto, cociente;
        cociente=0;
        resto=0;
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        aux = num1;
        System.out.println("------------------------------------");
        if (num1<num2){
            resto = num1;
            cociente = 0;
        } else {
            do {
                aux-=num2;
                cociente++;
                System.out.println(aux+num2+" - "+num2+" = "+aux+" | "+cociente+" restas realizadas");
            } while (aux>=num2);
            resto=aux;
        }
        System.out.println("------------------------------------");
        System.out.println("El cociente entre "+num1+" y "+num2+" es "+cociente+" y el resto es "+resto);
                
        
    }
    
}
