package proyect;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javafx.scene.control.Alert;

class NuevoJugador extends Conexion{
    private String nombre;
    
    public NuevoJugador(String nombre, int puerto){
        super(puerto);
        this.nombre = nombre;
    }
    
    public void enviarJugador(){
        try {
            ///Se manda el nombre del nuevo usuario
            Socket socket = new Socket(getIpServer(), getPuerto());
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
    
}