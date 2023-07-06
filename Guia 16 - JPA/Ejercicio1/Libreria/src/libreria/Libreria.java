
package libreria;

public class Libreria {
    /**
     * Funciona en JDK zulu 17.0.7+7
     */    
    public static void main(String[] args) {
        
        Menu menu = new Menu();
        boolean booleanMenu = true;
        
        do{
            booleanMenu = menu.menu();
        } while(booleanMenu);
        
    }
}
