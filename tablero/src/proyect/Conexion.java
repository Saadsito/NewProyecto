package proyect;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;

public class Conexion implements Serializable{
    
    protected ArrayList<Player> jugadores;
    private int puerto;
    private static final String ipServer = "127.0.0.1";

    public Conexion(int puerto){
        this.puerto = puerto;
        jugadores = new ArrayList<>();
    }
    
    public ArrayList<Player> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Player> jugadores) {
        this.jugadores = jugadores;
    }
    
    public int getPuerto() {
            return puerto;
    }

    public static String getIpServer() {
        return ipServer;
    }    

   public void actualizarListaEnviar(String ip, ArrayList<Player> jugadores){
        try(Socket socket = new Socket(ip, puerto)) {
            Conexion conexion = new Conexion(puerto);
            conexion.setJugadores(jugadores);
            ObjectOutputStream flujo = new ObjectOutputStream(socket.getOutputStream());
            flujo.writeObject(conexion);
            flujo.close();
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        
    }
}