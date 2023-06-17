
package ejercicios.extra2;

import java.util.List;
import java.util.Random;

public class EdificioServicio {
    
    Random rand;
    List<Edificio> construcciones;

    public EdificioServicio(List<Edificio> construcciones, Random rand) {
        this.construcciones = construcciones;
        this.rand = rand;
    }
    
    public void cargarConstrucciones(){
        int n = rand.nextInt(2, 8);
        String[] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
                        "o","p","q","r","s","t","u","v","w","x","y","z"," "};
        for (int i = 0; i < n; i++) {
            int largo = rand.nextInt(11,30);
            String nombre = "";
            for (int j = 0; j < largo; j++) {
                if(j==0){
                    nombre = nombre.concat(abc[rand.nextInt(0, abc.length-1)].toUpperCase());
                } else if(nombre.charAt(j-1)==' '){
                    nombre = nombre.concat(abc[rand.nextInt(0, abc.length-1)].toUpperCase());
                } else {
                    nombre = nombre.concat(abc[rand.nextInt(0, abc.length)]);
                }                
            }
            Edificio poli = new Polideportivo(nombre, rand.nextDouble(30, 100),
                    rand.nextDouble(8,16), rand.nextDouble(30, 100)
                    , rand.nextBoolean());
            double alto = rand.nextDouble(10, 100);
            int piso = (int)(alto/4);
            int oficinas= rand.nextInt(1, (int)(alto/4));
            Edificio ofi = new EdificioDeOficinas(rand.nextDouble(15, 35), alto,
                    rand.nextDouble(15, 35), piso, oficinas,
                     rand.nextInt(12,18));
            construcciones.add(poli);
            construcciones.add(ofi);
        }
    }
    
    public void mostrarContrucciones(){
        int poliA=0;
        int poliT=0;
        for (Edificio construccion : construcciones) {
            System.out.println(construccion.toString());
            if(construccion instanceof Polideportivo){
                if(((Polideportivo) construccion).isTechado()){
                    poliT++;
                } else {
                    poliA++;
                }
            }
        }
        System.out.println("Polideportivos abiertos: "+ poliA+"\nPolideportivos techados: "+poliT);
    }
    
    
}
/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:

• Método calcularSuperficie(): calcula la superficie del edificio.

• Método calcularVolumen(): calcula el volumen del edifico.

Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.

• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.

De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.

Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
*/