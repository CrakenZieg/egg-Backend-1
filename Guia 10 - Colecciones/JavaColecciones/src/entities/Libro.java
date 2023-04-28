
package entities;

import java.util.Random;

public class Libro {
    
    Random rand = new Random();
    private String titulo;
    private String ISBN;
    private final String[] abecedario= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    
    public Libro(){
        int largo = rand.nextInt(1,15);
        String nombre= "Libro ";
        for(int i=0; i<largo; i++){ 
            nombre = nombre.concat(abecedario[rand.nextInt(abecedario.length)]);
        }
        this.titulo = nombre;
        this.ISBN = rand.nextInt(1000, 9999)+" "+rand.nextInt(1000, 9999)+" "+rand.nextInt(1000, 9999)+" "+rand.nextInt(1000, 9999);
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Titulo=" + titulo + ", ISBN=" + ISBN;
    }
    
}
