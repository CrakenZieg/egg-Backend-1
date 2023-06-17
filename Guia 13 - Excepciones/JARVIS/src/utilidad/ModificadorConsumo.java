
package utilidad;

public enum ModificadorConsumo {
    
    I(1),
    II(2),
    III(3);
    
    private int modificador;
    
    ModificadorConsumo(int modificador){
        this.modificador = modificador;
    };

    public int getModificador() {
        return modificador;
    }
    
}
