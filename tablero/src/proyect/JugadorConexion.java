package proyect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;

/**
 *
 * @author migue
 */
public class JugadorConexion extends Conexion implements Runnable{
    
    private ArrayList<Player> jugadores;
    private String nombre;

    @Override
    public ArrayList<Player> getJugadores() {
        return jugadores;
    }
  
    public JugadorConexion(String nombre, int puerto){
        super(puerto);
        this.nombre = nombre;
    }
    
    public void enviarJugador(){
        try {
            ///Se manda el nombre del nuevo usuario
            Socket socket = new Socket(getIpServer(), 7777);
            Player jugador = new Player();
            jugador.setNombre(nombre);
            
            ObjectOutputStream paquete = new ObjectOutputStream(socket.getOutputStream());
            paquete.writeObject(jugador);
            paquete.close();
            socket.close();
            
        } catch (IOException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error de Conexión");
            alert.setContentText("No se ha podido conectar con el servidor");
            alert.showAndWait();
        }
    }
    
    public void enviarActualizacion(Conexion jugadores){
        try {
            Socket socket = new Socket(jugadores.getIpServer(), 8777);
            ObjectOutputStream flujo = new ObjectOutputStream(socket.getOutputStream());
            flujo.writeObject(jugadores);
            
            flujo.close();
            socket.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    @Override
    public void run(){  //Recibir actualizado lista de jugadores 
        try{
            ServerSocket servidor = new ServerSocket(getPuerto());
            Thread cerrarServidor = new Thread(){
                public void run(){
                    while(true){
                        boolean cerrar = true;
                        for(Player x: jugadores)
                            if(!x.isListo()) cerrar = false;
                        if(cerrar){
                            try {
                                servidor.close();
                                return;
                            } catch (IOException ex) {
                                System.out.println(ex);
                            }
                        }
                    }
                }
            };
            cerrarServidor.setName("Cerrar servidor jugador");
            cerrarServidor.start();
            while(true){
                System.out.println("Jugador en espera de lista actualizada");
                Socket socket = servidor.accept();
            
                ObjectInputStream flujo = new ObjectInputStream(socket.getInputStream());
                Conexion jugadorConexion = (Conexion) flujo.readObject();
                jugadores = jugadorConexion.getJugadores();
                flujo.close();
                socket.close();
                
                
                
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("NO se puede castear");
        }     
    }
}    
    

