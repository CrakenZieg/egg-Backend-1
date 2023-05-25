package laTercera.entidades;


import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import java.util.List;

public class Poliza {

    private Cliente cliente;

    private Vehiculo vehiculo;

    private int numPoliza;
    
    private int numCuotas;
    
    private double montoTotal;

    private Calendar fechaInicio = Calendar.getInstance();

    private Calendar fechaFin;

    private List<Cuota> cuotas;

    public void setCuotas() {
        for (int i = 0; i < numCuotas; i++) {
            cuotas.add(new Cuota(i+1,montoTotal/numCuotas,fechaInicio));
        }
    }
    
    public Poliza() {
        this.cuotas = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public Calendar getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin() {
        this.fechaFin.set(fechaInicio.get(YEAR)+((numCuotas>12)?(int)(numCuotas/12):0),
                fechaInicio.get(MONTH)+((numCuotas>12)?(int)(numCuotas%12):numCuotas),
                fechaInicio.get(DAY_OF_MONTH));;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public List<Cuota> getCuotas() {
        return cuotas;
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