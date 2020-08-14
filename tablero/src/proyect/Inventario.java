package proyect;

import java.io.Serializable;

public class Inventario implements Serializable{
    private int[] inventario;
    private int numPlayer;

    public Inventario(int[] inventario, int numPlayer) {
        this.inventario = inventario;
        this.numPlayer = numPlayer;
    }

    public int[] getInventario() {
        return inventario;
    }

    public int getNumPlayer() {
        return numPlayer;
    }
    
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
    
    public void eliminarObj(boolean[] estadoEspeciales,int num){
        devolverObj(estadoEspeciales, inventario[num]);
        inventario[num]=0;
        
    }

 /* esmeralda = -1  /   cuboagua = -2   /   espada = -3   /   cascoD = -4   /   armaduraD = -5   /   espadaD = -6   /   pantalonD = -7   /   botasD = -8 */

    
    public void devolverObj(boolean[] estadoEspeciales, int num){
    if(num>0) estadoEspeciales[num-1]=true;
}

    public boolean verificaCascoD(){
      return (inventario[0]==9) || (inventario[0] == -4);
    }
    
    public boolean verificaPetoD(){
      return (inventario[1]==12) || (inventario[1] == -5); 
    }
    
    public boolean verificaEspadaD(){
      return (inventario[2]==8) || (inventario[2] ==-6); 
    }
    
    public boolean verificaPantalonD(){
      return (inventario[3]==10) || (inventario[3] ==-7); 
    }
    
    public boolean verificaBotasD(){
      return (inventario[4]==11) || (inventario[4] ==-8); 
    }
    
    

public boolean verificarEspada(){
      for (int i=5;i<13;i++)
            if((inventario[i]>0 && inventario[i]<8) || (inventario[i] == -3) || (inventario[i] == -6)) return true;
      return false;
    }

    public boolean verificarAgua(){
      for (int i=5;i<13;i++)
            if((inventario[i]>12) && (inventario[i]<19) || (inventario[i] == -2)) return true;
      return false;
    }

    public void eliminarAgua(boolean[] estadoEspeciales){
       for (int i=5;i<13;i++){
          if((inventario[i]>12) && (inventario[i]<19) || inventario[i] == -2){
            devolverObj(estadoEspeciales, inventario[i]);
            inventario[i]=0;
          }
      }
    }
   
    public void eliminarEspada(boolean[] estadoEspeciales){
        for (int i=5;i<13;i++){
            if((inventario[i]>0 && inventario[i]<8) || inventario[i] == -3){
              devolverObj(estadoEspeciales, inventario[i]);
              inventario[i]=0;
            }
        }
    }
   
    public boolean verificarEsmeralda(){
        for (int i=5;i<13;i++)
            if((inventario[i]>18 && inventario[i]<27) || inventario[i] == -1) return true;
        return false;
    }
   
    public void eliminarEsmeralda(boolean[] estadoEspeciales){
        for (int i=5;i<13;i++)
            if((inventario[i]>18 && inventario[i]<27) || inventario[i] == -1){
              devolverObj(estadoEspeciales, inventario[i]);
              inventario[i]=0;
            }
    }
    
    public void borrar(boolean[] estadoEspeciales){
        for (int i = 0; i < 13; i++){
            if(inventario[i] > 0) 
                estadoEspeciales[inventario[i]-1] = true;
            inventario[i] = 0;
        }
    }
    
}
