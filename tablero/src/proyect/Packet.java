package proyect;

import java.io.Serializable;

public class Packet implements Serializable{
    
    private int numPlayer, nbestia, x, y; 
    private int ganador;
    private boolean[] estadoEspeciales; //True en las que se muestran y false en las que no
    private int dadoaux;
    private boolean primerTiro;

    public Packet(boolean[] estadoEspeciales) {
        this.estadoEspeciales = estadoEspeciales;
    }

    //[0-6] espadas
    //[7-11] diamanteobjetos
    //[12-17] cuboagua
    //[18-25] esmeraldas
    public Packet(int x, int y, int numPlayer) {
        this.x = x;
        this.y = y;
        nbestia = 0;
        dadoaux = 0;
        this.numPlayer = numPlayer;
        estadoEspeciales = null;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getNbestia() {
        return nbestia;
    }
    
    

    public Packet(int numPlayer, int ganador, int dadoaux, int nbestia, boolean[] estadoEspeciales, boolean primerTiro) {
        this.nbestia = nbestia;
        this.numPlayer = numPlayer;
        this.ganador = ganador;
        this.dadoaux = dadoaux;
        this.estadoEspeciales = estadoEspeciales;
        this.primerTiro = primerTiro;
        y = 0;
        x = 0;
    }

    public void setDadoaux(int dadoaux) {
        this.dadoaux = dadoaux;
    }

    public boolean isPrimerTiro() {
        return primerTiro;
    }

    public void setPrimerTiro(boolean primerTiro) {
        this.primerTiro = primerTiro;
    }

    public int getNumPlayer() {
        return numPlayer;
    }

    public int getGanador() {
        return ganador;
    }

    public boolean[] getEstadoEspeciales() {
        return estadoEspeciales;
    }

    public int getDadoaux() {
        return dadoaux;
    }

    
    
   
    
}
