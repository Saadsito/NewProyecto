package proyect;

import java.io.Serializable;
import javafx.scene.image.Image;

public class Inventario implements Serializable{
    private Image[] armaduras;
    private Image[] objetos;
    
    public Inventario(){
        armaduras = new Image[5];
        objetos = new Image[8];
    }

    public Image[] getArmaduras() {
        return armaduras;
    }

    public Image[] getObjetos() {
        return objetos;
    }

    public void setArmaduras(Image[] armaduras) {
        this.armaduras = armaduras;
    }

    public void setObjetos(Image[] objetos) {
        this.objetos = objetos;
    }
    
    public void agregar(Image objeto){
        
    }
}
