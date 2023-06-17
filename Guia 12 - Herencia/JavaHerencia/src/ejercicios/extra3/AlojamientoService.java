
package ejercicios.extra3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlojamientoService {
    
    Random rand = new Random();
    List<Alojamiento> alojamientos = new ArrayList<>();
        
    public void cargarAlojamientos(int n){
        for (int i = 0; i < n; i++) {
            int opc = rand.nextInt(1,5);
            switch (opc) {
                case 1->{alojamientos.add(crearCamping());}
                case 2->{alojamientos.add(crearResidencia());}
                case 3->{alojamientos.add(crearHotel4());}
                case 4->{alojamientos.add(crearHotel5());}
            }
        }
    }
    
    public void mostrarAlojamientos(){
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento.toString());
        }
    }
    
    public Camping crearCamping(){
        return new Camping(rand.nextInt(15, 40), rand.nextInt(4, 10), rand.nextBoolean(), rand.nextBoolean(), rand.nextDouble(3000, 10000), crearNombre(), crearNombre(), crearNombre(), crearNombre());
    }
    
    public Residencia crearResidencia(){
        return new Residencia(rand.nextInt(5, 25), rand.nextBoolean(), rand.nextBoolean(), rand.nextBoolean(), rand.nextDouble(50, 350), crearNombre(), crearNombre(), crearNombre(), crearNombre());
    } 
    
    public Hotel5 crearHotel5(){
        int hab = rand.nextInt(15, 100);
        return new Hotel5(rand.nextInt(1, 20),rand.nextInt(1, 20),rand.nextInt(1, 20),crearGimnasio(), crearRestaurante(), hab, (int)(hab*rand.nextDouble(1, 2)), (int)hab/10, crearNombre(), crearNombre(), crearNombre(), crearNombre());   
    }
    
    public Hotel4 crearHotel4(){
        int hab = rand.nextInt(15, 100);
        return new Hotel4(crearGimnasio(), crearRestaurante(), hab, (int)(hab*rand.nextDouble(1, 2)), (int)hab/10, crearNombre(), crearNombre(), crearNombre(), crearNombre());
    }
    
    public Restaurante crearRestaurante(){
        return  new Restaurante(crearNombre(),rand.nextInt(10, 80));
    }
    
    public Gimnasio crearGimnasio(){
        return (rand.nextBoolean()?Gimnasio.A:Gimnasio.B);
    }
    
    public String crearNombre(){
        String[] abc = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
                        "o","p","q","r","s","t","u","v","w","x","y","z"," "};
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
        return nombre;
    }
    
    public String crearAltura(){
        String[] num = {"1","2","3","4","5","6","7","8","9"};
        int largo = rand.nextInt(11,30);
        String altura = " ";
        for (int j = 0; j < largo; j++) {            
            altura = altura.concat(num[rand.nextInt(0, num.length)]);              
        }
        return altura;
    }
    
}

/*
Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.

En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
*/