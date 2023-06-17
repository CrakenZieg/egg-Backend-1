
package test;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class testTRY {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");
        int a = 0;
        int b = 0;
        
        try {
            System.out.println("ingrese entero en a");
            a = Integer.parseInt(sc.next());
            System.out.println("ingrese entero en b");
            b = Integer.parseInt(sc.next());
        } catch (Exception e) {
            System.out.println(e.getMessage()+"\n a: "+a+" b: "+b);
        }
        
        
    }
    
}
