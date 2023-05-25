package laTercera.entidades;

import java.util.Calendar;
import static java.util.Calendar.*;

public class Cuota {

    private int numCuota;

    private double monto;

    private boolean pagado;

    private Calendar vencimiento;

    private String formaPago;

    public Cuota(int numCuota, double monto, Calendar vencimiento) {
        this.numCuota = numCuota;
        this.monto = monto;
        this.pagado = false;
        this.vencimiento.set(vencimiento.get(YEAR)+((numCuota>12)?(int)(numCuota/12):0),
                vencimiento.get(MONTH)+((numCuota>12)?(int)(numCuota%12):numCuota),
                vencimiento.get(DAY_OF_MONTH));
        this.formaPago = "";
    }
    
    public void pagar(String formaPago){
        this.formaPago = formaPago;
        this.pagado = true;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public Calendar getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Calendar vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuota{");
        sb.append("numero=").append(numCuota);
        sb.append(", monto=").append(monto);
        sb.append(", pagado=").append(pagado);
        sb.append(", vencimiento=").append(vencimiento);
        sb.append(", formaPago=").append(formaPago);
        sb.append('}');
        return sb.toString();
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