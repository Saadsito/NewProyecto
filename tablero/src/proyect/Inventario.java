package proyect;

import java.io.Serializable;
import javafx.scene.image.Image;

public class Inventario implements Serializable{
    private byte[] armaduras;
    private byte[] objetos;
    
    public Inventario(){
        armaduras = new byte[5];
        objetos = new byte[8];
    }

    public byte[] getArmaduras() {
        return armaduras;
    }

    public void setArmaduras(byte[] armaduras) {
        this.armaduras = armaduras;
    }

    public byte[] getObjetos() {
        return objetos;
    }

    public void setObjetos(byte[] objetos) {
        this.objetos = objetos;
    }
    
    public void agregar(Image objeto){
        
    }
}
