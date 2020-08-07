package proyect;

import java.io.Serializable;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Packet implements Serializable{
    
    private int numPlayer; 
    private int ganador;
    private boolean[] estadoEspeciales; //True en las que se muestran y false en las que no
    private final int dadoaux;

    public Packet(int numPlayer, int ganador, int dadoaux, boolean[] estadoEspeciales) {
        this.numPlayer = numPlayer;
        this.ganador = ganador;
        this.dadoaux = dadoaux;
        this.estadoEspeciales = estadoEspeciales;
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
