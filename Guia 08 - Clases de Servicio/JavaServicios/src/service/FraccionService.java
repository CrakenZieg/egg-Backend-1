
package service;

import entities.Fraccion;
import java.util.ArrayList;

public class  FraccionService {
    
    public static int[] sumar(Fraccion fr){
        int[] fracc = new int[2];
        if(fr.getDen1() == fr.getDen2()){
            fracc[0] = fr.getNum1()+fr.getNum2();
            fracc[1] = fr.getDen1();
        } else {
            fracc[0] = fr.getNum1()*fr.getDen2()+fr.getNum2()*fr.getDen1();
            fracc[1] = fr.getDen1()*fr.getDen2();
        }
        if(fracc[0]%fracc[1]==0){
            fracc[0] = fracc[0]/fracc[1];
            fracc[1] = 1;
        }
        fracc = simplificar(fracc);
        return fracc;
    } 
    public static int[] restar(Fraccion fr){
        int[] fracc = new int[2];
        if(fr.getDen1() == fr.getDen2()){
            fracc[0] = fr.getNum1()-fr.getNum2();
            fracc[1] = fr.getDen1();
        } else {
            fracc[0] = fr.getNum1()*fr.getDen2()-fr.getNum2()*fr.getDen1();
            fracc[1] = fr.getDen1()*fr.getDen2();
        }
        if(fracc[0]%fracc[1]==0){
            fracc[0] = fracc[0]/fracc[1];
            fracc[1] = 1;
        }
        fracc = simplificar(fracc);
        return fracc;
    } 
    public static int[] multiplicar(Fraccion fr){
        int[] fracc = new int[2];
        fracc[0] = fr.getNum1()*fr.getNum2();
        fracc[1] = fr.getDen1()*fr.getDen2();
        if(fracc[0]%fracc[1]==0){
            fracc[0] = fracc[0]/fracc[1];
            fracc[1] = 1;
        }
        fracc = simplificar(fracc);
        return fracc;
    } 
    public static int[] dividir(Fraccion fr){
        int[] fracc = new int[2];
        fracc[0] = fr.getNum1()*fr.getDen2();
        fracc[1] = fr.getDen1()*fr.getNum2();
        if(fracc[0]%fracc[1]==0){
            fracc[0] = fracc[0]/fracc[1];
            fracc[1] = 1;
        }
        fracc = simplificar(fracc);
        return fracc;
    } 
    
    private static int[] simplificar(int[] fracc){
    //Aguante Euclides
        int[] res = {1, 1};
        int pri, sec, aux=1;
        if(fracc[1]==1){
            res = fracc;
        } else {
            if(fracc[0]<fracc[1]){
                pri = fracc[1];
                sec = fracc[0];
            } else {
                pri = fracc[0];
                sec = fracc[1];
            }
            while (aux!=0){
                aux = pri%sec;
                pri = sec;
                sec = aux;
            }
            res[0]=fracc[0]/pri;
            res[1]=fracc[1]/pri;
        }
        return res;
    }
    
    
//    private static int[] simplificar(int[] fracc){
//        int[] res = {1, 1};
//        if(fracc[1]!=1){
//            int fact = 2;
//            ArrayList<Integer> factNum = new ArrayList<Integer>();
//            ArrayList<Integer> factDen = new ArrayList<Integer>();
//            do {
//                if(fracc[0]%fact==0){
//                    factNum.add(fact);
//                    fracc[0]/=fact;
//                }
//                if(fracc[0]%fact!=0){
//                    fact++;
//                }
//            } while (fracc[0]!=1);
//            fact = 2;
//            do {
//                if(fracc[1]%fact==0){
//                    factDen.add(fact);
//                    fracc[1]/=fact;
//                }
//                if(fracc[1]%fact!=0){
//                    fact++;
//                }
//            } while (fracc[1]!=1);
//            if (factNum.size()<factDen.size()){
//                for(int num: factNum) {
//                    if(factDen.contains(num)){
//                        factNum.remove((Integer)num);
//                        factDen.remove(factDen.indexOf(num));
//                    }
//                }
//            } else {
//                for(int num: factDen) {
//                    if(factNum.contains(num)){
//                        factDen.remove((Integer)num);
//                        factNum.remove(factNum.indexOf(num));
//                    }
//                }
//            }
//            for(int num: factNum){
//                res[0]*=num;
//            }
//            for(int num: factDen){
//                res[1]*=num;
//            }
//        } else { 
//            res = fracc;
//        }
//        return res;
//    }  
}
/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
*/