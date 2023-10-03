
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class Prueba {
    
    public static void main(String[] args) {
        
        System.out.println("admin: "+encriptar("admin"));
        System.out.println("pepe: "+encriptar("pepe"));
        
    }
    
    public static String encriptar(String pass){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(pass);
    }
      
    
}
