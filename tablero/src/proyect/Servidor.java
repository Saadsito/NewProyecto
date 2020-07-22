package proyect;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Servidor{

    
    public static void main(String[] args) {
        
        Server inicio = new Server();
        inicio.run();
    }
    
    
    
}

class Server implements Runnable{
    public static ArrayList<Player> jugadores;

    public Server(){
        jugadores = new ArrayList<Player>();
        Thread hilo = new Thread(this);
    }

    public ArrayList<Player> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Player> jugadores) {
        this.jugadores = jugadores;
    }
    
    @Override
    public void run() {
        try {
            ServerSocket server = new ServerSocket(7777);
            while(true){
                Socket socket = server.accept();
                ObjectInputStream recibido = new ObjectInputStream(socket.getInputStream());
                
                Player jugador = (Player) recibido.readObject();
                jugadores.add(jugador);
                
                socket.close();
                recibido.close();
                
                for(Player nombre: jugadores)
                    System.out.println(nombre.getNombre());
                
                
            }
            
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
   }
        
    
        
}


