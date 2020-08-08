package proyect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerInicio extends Conexion implements Runnable{
    public ServerInicio(int puerto){      
        super(puerto);
    }
    
    public void actualizarJugador() {      
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
                
                if(cerrar){
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                    servidor.close();
                    System.out.println("Cerrando servidor de ServerInicio de actualizar lista");
                    return;
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
   }
    
  
    @Override
   public void run(){   
       //Abre el servidor para que este a la escucha de todos los jugadores
        try {
            System.out.println("Iniciando Servidor");
            ServerSocket server = new ServerSocket(getPuerto());
            
            Thread cerrarServer = new Thread(){
                @Override
                public void run(){
                    while(true){
                        if(!jugadores.isEmpty() && jugadores.size() > 1){
                            boolean cerrar = true;
                            for(Player x: jugadores)
                                if(!x.isListo()) cerrar = false;
                            if(cerrar){
                                try {
                                    Thread.sleep(200);
                                    server.close();
                                    return;
                                } catch (InterruptedException | IOException ex) {
                                    System.out.println(ex);
                                }
                            }
                        }
                    }
                }
            };
            
            cerrarServer.setName("Servidor de nuevos jugadores");
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
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println("Cerrando servidor de nuevos jugadores");
            return;
        }
       
   }
    
   
   public void updateTablero() throws IOException, ClassNotFoundException{
       
       ServerSocket server = new ServerSocket(7700);
       while(true){
            System.out.println("Esperando cliente");
            Socket socket = server.accept();
           
            ObjectInputStream flujoIn = new ObjectInputStream(socket.getInputStream());
            Packet paquete = (Packet) flujoIn.readObject();
            flujoIn.close();
            socket.close();
           
            for(Player x: jugadores){
                Thread enviar = new Thread(){
                    @Override
                    public void run(){
                        try {
                            System.out.println("Enviando paquete a " + x.getNombre());
                            Socket mysocket = new Socket(x.getIp(), 9977);
                            ObjectOutputStream flujoOut = new ObjectOutputStream(mysocket.getOutputStream());
                            flujoOut.writeObject(paquete);
                            flujoOut.close();
                            mysocket.close();
                        } catch (IOException ex) {
                            System.out.println("Error en hilo enviar");
                        }
                    }
                };
                enviar.start();
            }
           
           
       }
       
   }

}


