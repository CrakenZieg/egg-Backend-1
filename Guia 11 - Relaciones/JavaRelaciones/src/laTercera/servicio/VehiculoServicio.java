package laTercera.servicio;


import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import laTercera.entidades.Vehiculo;
import laTercera.entidades.TerceraOPT;
import java.util.List;
import java.util.Scanner;

public class VehiculoServicio {

    Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");

    private List<Vehiculo> vehiculos;

    public VehiculoServicio() {
        this.vehiculos = new ArrayList<>();
    }
    public Vehiculo crearVehiculo() {
        Vehiculo vehiculo = new Vehiculo();
        System.out.println("Ingrese la marca: ");
        vehiculo.setMarca(TerceraOPT.mostrarSeleccionar(TerceraOPT.MARCAS, sc));
        System.out.println("Ingrese el modelo: ");
        vehiculo.setModelo(sc.next());
        System.out.println("Ingrese el año: ");
        vehiculo.setAno(sc.nextInt());
        System.out.println("Ingrese el número de motor: ");
        vehiculo.setNumMotor(sc.nextInt());
        System.out.println("Ingrese el número de chasis: ");
        vehiculo.setNumChasis(sc.nextInt());
        System.out.println("Ingrese el color: ");
        vehiculo.setColor(TerceraOPT.mostrarSeleccionar(TerceraOPT.COLOR, sc));
        System.out.println("Ingrese el tipo: ");
        vehiculo.setTipo(TerceraOPT.mostrarSeleccionar(TerceraOPT.TIPO, sc));
        vehiculos.add(vehiculo);
        return vehiculo;
    }

    public Vehiculo eliminarVehiculo(Vehiculo eliminar) {
        Vehiculo vehiculo = (Vehiculo) vehiculos.stream().filter((vehic)->vehic.getNumChasis()==eliminar.getNumChasis());
        vehiculos.remove(vehiculo);
        return vehiculo;
    }

    public Vehiculo actualizarVehiculoChasis(Vehiculo actualizar) {
        Vehiculo vehiculo = (Vehiculo) vehiculos.stream().filter((vehic)->vehic.getNumChasis()==actualizar.getNumChasis());
        vehiculo = actualizar;
        return vehiculo;
    }

    public Vehiculo encontrarVehiculoChasis(int numChasis) {
        Vehiculo vehiculo = (Vehiculo) vehiculos.stream().filter((client)->client.getNumChasis()==numChasis);
        return vehiculo;
    }
    
    public Vehiculo actualizarVehiculoMotor(Vehiculo actualizar) {
        Vehiculo vehiculo = (Vehiculo) vehiculos.stream().filter((vehic)->vehic.getNumMotor()==actualizar.getNumMotor());
        vehiculo = actualizar;
        return vehiculo;
    }

    public Vehiculo encontrarVehiculoMotor(int numMotor) {
        Vehiculo vehiculo = (Vehiculo) vehiculos.stream().filter((client)->client.getNumMotor()==numMotor);
        return vehiculo;
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