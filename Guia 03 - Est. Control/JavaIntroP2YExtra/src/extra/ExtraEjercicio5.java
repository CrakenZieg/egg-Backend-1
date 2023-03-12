/*
Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
*/
package extra;

import java.util.*;

public class ExtraEjercicio5 {
    
    public void ejercicio(){
    
        Scanner sc = new Scanner(System.in);
        Map<String, Double> descuentos = new HashMap<>();
        descuentos.put("A", 0.5);
        descuentos.put("B", 0.65);
        descuentos.put("C", 1.0);
        String opcion;
        int costo;
    
        do {
            System.out.println("Ingrese el plan (0 para salir): ");
            opcion = sc.next().toUpperCase();
            if(descuentos.containsKey(opcion)){
            System.out.println("Ingrese el costo del tratamiento: ");
            costo = sc.nextInt();
            System.out.println("El tratamiento cuesta $"+costo*descuentos.get(opcion)+
                    " ya que el afiliado tiene el plan "+ opcion);
            }
        } while (!opcion.equals("0"));
        
    }
    
}
