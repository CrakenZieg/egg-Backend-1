
package utilidad;

public enum Dureza {
    A("Tungsteno",90),
    B("Titanio",85),
    C("Cromo",80),
    D("Cobalto",75),
    E("Boro",70),
    F("Vanadio",65),
    G("Molibdeno",60),
    H("Manganeso",55),
    K("Niquel",50);
    
    private String material;
    private int durabilidad;
    
    Dureza(String material,int durabilidad){
        this.material = material;
        this.durabilidad = durabilidad;
    }

    public String getMaterial() {
        return material;
    }

    public int getDurabilidad() {
        return durabilidad;
    }
    
}
