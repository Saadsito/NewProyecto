package proyect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerInicio extends Conexion implements Runnable{
    public ServerInicio(int puerto){      
        super(puerto);
    }
    
    public void abrirRecibirJugador() {      
    //Abre el servidor para que este a la escucha de todos los jugadores
        try {
            System.out.println("Iniciando Servidor");
            ServerSocket server = new ServerSocket(getPuerto());
            
            //Hilo que cierra el servidor cuando todos los jugadores estan listos
            Thread cerrarServer = new Thread(){
                @Override
                public void run(){
                    while(true){
                        boolean cerrar = true;     
                        for(Player x: jugadores)
                            if(!x.isListo()) cerrar = false;
                        if(cerrar){
                            try {
                                server.close();
                                return;
                            } catch (IOException ex) {
                                System.out.println(ex);
                            }     
                        }
                    }
                }
            };
            
            cerrarServer.setName("Hilo cerrar servidor");
            cerrarServer.start();
            
            while(true){
                //Cerrar servidor
                
                ////////////
                Socket socket = server.accept();
                ObjectInputStream recibido = new ObjectInputStream(socket.getInputStream());
                
                Player jugador = (Player) recibido.readObject();
                
                //Guarda la direccion ip del jugador en el campo ip de la clase Player 
                InetAddress iphost = socket.getInetAddress();
                jugador.setIp(iphost.getHostAddress());
                System.out.println(jugador.getIp());
                jugadores.add(jugador);
                
                for(Player x: jugadores)
                    new Conexion(7000).actualizarListaEnviar(x.getIp(),jugadores);
                
                
                
                socket.close();
                recibido.close();
                
            }
            
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
   }
    
  
    @Override
   public void run(){   //recibe y envia la lista actualizada a todos los jugadores conectados
       try {   
            ServerSocket servidor = new ServerSocket(8777);
            while(true){
                Socket socket = servidor.accept();
                System.out.println("Recibe actualizacion de lista del cliente");
                
                ObjectInputStream flujoEntrada = new ObjectInputStream(socket.getInputStream());
                Conexion paquete = (Conexion) flujoEntrada.readObject();
                
                //YA RECIBIO EL PAQUETE DEL JUGADOR AHORA PROCEDERA A ENVIARLO A TODOS
                
                jugadores = paquete.getJugadores();
                boolean cerrar = true;
                for(Player x: jugadores){
                    new Conexion(7000).actualizarListaEnviar(x.getIp(),jugadores);
                    if(!x.isListo()) cerrar = false;
                }
                //Cerrar servidor
                if(cerrar){
                    servidor.close();
                    return;
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
       
   }
    
}
