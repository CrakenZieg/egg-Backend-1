
package entities;

import java.util.Random;

public class MesSecreto {
    
    private String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", 
            "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", 
            "diciembre"};
    private Random rand = new Random();
    private String mesSecreto = meses[rand.nextInt(0, 12)];

    public MesSecreto() {
    }

    public String[] getMeses() {
        return meses;
    }
    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }
    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
}
