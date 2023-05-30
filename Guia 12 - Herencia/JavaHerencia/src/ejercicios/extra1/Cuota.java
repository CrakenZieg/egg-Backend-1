
package ejercicios.extra1;

import java.util.Calendar;

public class Cuota {
    
    private int idCuota;
    private Calendar fechaVencimiento;
    private double valor;
    private String formaDePago = "";
    private boolean paga = false;

    public Cuota() {
    }

    public Cuota(int idCuota, Calendar fechaVencimiento, double valor) {
        this.idCuota = idCuota;
        this.fechaVencimiento = fechaVencimiento;
        this.valor = valor;
    }

    public int getIdCuota() {
        return idCuota;
    }

    public void setIdCuota(int idCuota) {
        this.idCuota = idCuota;
    }

    public Calendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Calendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }
    
    public boolean vencida(){
        if(!paga&&Calendar.getInstance().after(this.fechaVencimiento)){
            return true;
        } else {
            return false;
        }
    }
    
    public void pagar(String pago){
        this.formaDePago = pago;
        this.paga = true;
    }

    @Override
    public String toString() {
        return "Cuota: " + idCuota + ", vencimiento:" 
                + fechaVencimiento.get(Calendar.DAY_OF_MONTH)+"/"
                + fechaVencimiento.get(Calendar.MONTH)+"/"
                + fechaVencimiento.get(Calendar.YEAR)
                + ", valor: $" + valor 
                + ", forma de pago: " + formaDePago
                + ", pagada: "+paga;
    }
    
}
