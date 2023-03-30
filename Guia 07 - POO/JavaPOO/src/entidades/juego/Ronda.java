
package entidades.juego;

public class Ronda {
    
    private int[] retorno;
    private Jugador jugador1, jugador2;
    private int intentos;
    
    public Ronda(String jugador1, String jugador2, int intentos, int max, int min){
        this.jugador1 = new Jugador(jugador1, max, min);
        this.jugador2 = new Jugador(jugador2, max, min);
        this.intentos = intentos;
    }

    public int[] getRetorno() {
        return retorno;
    }
    public void setRetorno(int[] retorno) {
        this.retorno = retorno;
    }

    public Jugador getJugador1() {
        return jugador1;
    }
    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }
    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public int getIntentos() {
        return intentos;
    }
    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int[] ronda(){
        int[] reset = {1,0};
        setRetorno(reset);
        jugador1.intSecreto();
        System.out.println("El numero secreto de "+ jugador1 + " es "+jugador1.getSecreto());
        for (int i = 0; i < intentos; i++) {
            retorno[1]+=1;
            jugador2.adivinar();
            System.out.println("El "+jugador2+" supone "+ jugador2.getAdivinar());
            if(jugador2.getAdivinar()==jugador1.getSecreto()){
                System.out.println(jugador2+" acerto!");
                retorno[0] = 2;
                return retorno;
            } else {
                if(jugador2.getAdivinar()>jugador1.getSecreto()){
                    jugador2.setMax(jugador2.getAdivinar()-1);
                    System.out.println(jugador2+" se paso de largo!");
                } else {
                    jugador2.setMin(jugador2.getAdivinar()+1);
                    System.out.println(jugador2+" se fue a menos!");
                }
            }
        }
        return retorno;
    }
    
}