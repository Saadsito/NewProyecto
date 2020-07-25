package proyect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion implements Serializable{
    
    protected static ArrayList<Player> jugadores;
    private int puerto;
    private final String ipServer = "192.168.0.181";

    public Conexion(int puerto){
        this.puerto = puerto;
        jugadores = new ArrayList<>();
    }

    public ArrayList<Player> getJugadores() {
        return jugadores;
    }

    public int getPuerto() {
        return puerto;
    }

    public String getIpServer() {
        return ipServer;
    }    

   class ListadoJugadores implements Serializable{
        private ArrayList<Player> lista;

        public ArrayList<Player> getLista() {
            return lista;
        }
        
        private ListadoJugadores(ArrayList<Player> jugadores){
            lista = jugadores;
        }
    }
   
   public void actualizarListaEnviar(String ip, ArrayList<Player> jugadores){
        try(Socket socket = new Socket(ip, puerto)) {
            
            ObjectOutputStream flujo = new ObjectOutputStream(socket.getOutputStream());
            flujo.writeObject(new ListadoJugadores(jugadores));
            flujo.close();
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        
    }
       
   public ArrayList<Player> actualizarListaRecibir() {
        try {
            ServerSocket servidor = new ServerSocket(puerto);
            Socket socket = servidor.accept();
            
            ObjectInputStream flujo = new ObjectInputStream(socket.getInputStream());
            ListadoJugadores paquete = (ListadoJugadores) flujo.readObject();
            
            flujo.close();
            socket.close();
            servidor.close();
            
            return paquete.getLista();
            
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
            return null;
        }     
        
   }
    
        
}