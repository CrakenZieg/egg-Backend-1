
package entidades;

public class Libro {
    
    private String ISBN, titulo, autor;
    private int numPags;
    
    public Libro(){}

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public Libro(String ISBN, String titulo, String autor, int numPags){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPags = numPags;
    }

    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPags() {
        return numPags;
    }
    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numPags=" + numPags + '}';
    }
    
}
