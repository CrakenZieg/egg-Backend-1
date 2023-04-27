
package service;

import entities.Cadena;

public class CadenaServicio {
    
    public int mostrarVocales(Cadena cadena){
        int cont = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            String frase = cadena.getFrase().substring(i, i+1);
            if("a".equalsIgnoreCase(frase)||
                "e".equalsIgnoreCase(frase)||
                "i".equalsIgnoreCase(frase)||
                "o".equalsIgnoreCase(frase)||
                "u".equalsIgnoreCase(frase)){
                cont++;
            }
        }
        return cont;
    }
    
    public Cadena invertirFrase(Cadena cadena){
        Cadena retorno;
        String ret = "";
        for (int i = cadena.getLongitud()-1; i >= 0; i--) {
            ret = ret.concat(cadena.getFrase().substring(i, i+1));
        }
        retorno = new Cadena(ret);
        return retorno;
    }
    
    public int vecesRepetido(Cadena cadena, String letra){
        int cont = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            String frase = cadena.getFrase().substring(i, i+1);
            if(letra.equals(frase)){
                cont++;
            }
        }
        return cont;
    }

    public int compararLongitud(Cadena cadena, String frase){
    /*1 si Cadena es mayor, 0 si son iguales, -1 si Cadena es menor*/
        if(frase.length()<cadena.getLongitud()){
            return 1;
        } else if (frase.length()==cadena.getLongitud()){
            return 0;
        } else {
            return -1;
        }
    }

    public Cadena unirFrases(Cadena cadena, String frase){
        Cadena retorno = new Cadena(cadena.getFrase().concat(frase));
        return retorno;
    }
    
    public Cadena reemplazar(Cadena cadena, String letraO, String letraR){
    /*letraO (objetivo), letraR (reemplazo)*/
        Cadena retorno;
        String ret = "";
        for (int i = 0; i < cadena.getLongitud(); i++) {
            String letra = cadena.getFrase().substring(i, i+1);
            if(letra.equals(letraO)){
                ret = ret.concat(letraR);
            } else {
                ret = ret.concat(letra);
            }
        }
        retorno = new Cadena(ret);
        return retorno;
    }
    
    public boolean contiene(Cadena cadena, String letra){
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if(letra.equals(cadena.getFrase().substring(i, i+1))){
                return true;
            }
        }
        return false;
    }
    
//    contiene(String letra)
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