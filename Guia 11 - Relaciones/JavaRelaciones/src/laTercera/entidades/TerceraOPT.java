
package laTercera.entidades;

import java.util.Scanner;

public class TerceraOPT {

    public static final String[] MARCAS = {"Chevrolet","Dodge","Fiat","Ford","Jeep",
            "Peugeot","Renault","Volkswagen","Mercedes-Benz","Nissan","Toyota",
            "Hyundai","Mitsubishi","BMW","Chery"};
    
    public static final String[] COLOR = {"Rojo","Marron","Negro","Azul","Verde",
            "Blanco"};
    
    public static final String[] TIPO = {"Microcoche","Minicompacto","Subcompacto",
            "Familiar pequeño","Mediano","Automóvil largo","SUV crossover","Lujo"};
    
    public static final String[] FORMA_PAGO = {"Efectivo","Debito","Credito","Cheque",
            "Bonificado"};
    
    public static final String[] GRANIZO = {"Nivel 1","Nivel 2","Nivel 3"};
    
    public static final String[] TIPO_POLIZA = {"Total","Contra terceros","Clima",
            "Robo/Hurto","Daños a terceros"};
    
    public static String mostrarSeleccionar(String[] categoria, Scanner sc){
        int cont = 0;
        int n = -1;
        for (String item : categoria) {
            System.out.println((++cont)+". "+item);
        }
        System.out.println("Cual es su opción?");
        do{
            try {
                n = sc.nextInt();
            } catch(Exception e) {
                System.out.println(e);
            }
        } while (n<0||n>(categoria.length-1));
        return categoria[n-1];
    }
    
}
/*
Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar que te
ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes
coberturas integrales para vehículos.
Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema
que quiere realizar la empresa.
12
a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono.
b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los
requerimientos arriba descriptos. Modelando clases con atributos y sus correspondientes
relaciones.
*/