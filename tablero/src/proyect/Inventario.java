package proyect;

import java.io.Serializable;
import javafx.scene.image.Image;

public class Inventario implements Serializable{
    private int[] inventario;

    public Inventario() {
        inventario = new int[13];
    }

    public int[] getArrayInventario() {
        return inventario;
    }

    public void setInventario(int[] inventario) {
        this.inventario = inventario;
    }
   
    public boolean addInv(int num){
        switch (num){
            case 9:
                if (inventario[0]==0){
                    inventario[0]=9;
                    return true;
                }break;

            case 12:
                if (inventario[1]==0){
                    inventario[1]=12;
                    return true;
                }break;

            case 8:
                if(inventario[2]==0){
                    inventario[2]=8;
                    return true;
                }break;

            case 10:
                if(inventario[3]==0){
                    inventario[3]=10;
                    return true;
                }break;

            case 11:
                if(inventario[4]==0){
                    inventario[4]=11;
                    return true;
                }break;

            default:
                for(int i=5;i<13;i++){
                    if(inventario[i]==0){
                        inventario[i]=num;
                        return true;
                    }
                }break;

        }
        return false;
    }

    public boolean verificarEspada(){
      for (int i=5;i<13;i++)
            if(inventario[i]>0 && inventario[i]<8) return true;
      return false;
    }

    public boolean verificarAgua(){
      for (int i=5;i<13;i++)
            if((inventario[i]>12) && (inventario[i]<19)) return true;
      return false;
    }

    public void eliminarAgua(){
       for (int i=5;i<13;i++)
          if((inventario[i]>12) && (inventario[i]<19)) inventario[i]=0;
      
    }
    
    public void eliminarEspada(){
        for (int i=5;i<13;i++)
            if(inventario[i]>0 && inventario[i]<8) inventario[i] = 0;
    }
    
    public boolean verificarEsmeralda(){
        for (int i=5;i<13;i++)
            if(inventario[i]>18 && inventario[i]<27) return true;
        return false;
    }
    
    public void eliminarEsmeralda(){
        for (int i=5;i<13;i++)
            if(inventario[i]>18 && inventario[i]<27) inventario[i] = 0;
    }
    
}
