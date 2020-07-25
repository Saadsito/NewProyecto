package proyect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerInicio extends Conexion implements Runnable{

    public ServerInicio(int puerto){
        super(puerto);
    }
    
    public void abrirRecibirJugador() {      
    //Abre el servidor para que este a la escucha de todos los jugadores
        try {
            ServerSocket server = new ServerSocket(getPuerto());
            while(true){
                Socket socket = server.accept();
                ObjectInputStream recibido = new ObjectInputStream(socket.getInputStream());
                
                Player jugador = (Player) recibido.readObject();
                jugadores.add(jugador);
                
                socket.close();
                recibido.close();
                
            }
            
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
   }
    
  
    @Override
   public void run(){   //envia la lista actualizada a todos los jugadores conectados
       for(Player x: jugadores)
                    new Conexion(7000).actualizarListaEnviar(x.getIp(),jugadores);
   }
    
}
