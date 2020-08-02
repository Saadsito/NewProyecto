package proyect;

import java.io.Serializable;
import javafx.scene.image.Image;


public class Player implements Serializable{
    
    private String nombre, ip, skin;
    private Inventario inventario;
    private boolean listo, turno; //true significa que esta listo, false que no 

    public Player() {
        nombre = "";
        listo = false;
        ip = "";
        skin = "";
        inventario = new Inventario();
        turno = false;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public boolean isListo() {
        return listo;
    }

    public void setListo(boolean listo) {
        this.listo = listo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Player(String nombre, String skin, String ip, Inventario inventario) {
        this.nombre = nombre;
        this.skin = skin;
        this.ip = ip;
        this.inventario = inventario;
    }
}
