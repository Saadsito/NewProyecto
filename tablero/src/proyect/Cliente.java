package proyect;

import java.applet.AudioClip;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Cliente extends Application {
   
    @Override
    public void start(Stage stage) throws Exception {
        
        stage.setTitle("Minecraft de Mesa");
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        stage.initStyle(StageStyle.UNDECORATED);        
        Scene scene = new Scene(root);
        AudioClip Musica;
        
        Musica = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/sweden.wav"));
        Musica.play();
        stage.setScene(scene);
        stage.show();
        
        
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

class NuevoJugador implements Runnable{
    private String nombre;
    
    public NuevoJugador(String nombre){
        this.nombre = nombre;
        Thread hilo = new Thread(this);
        hilo.start();
    }
    
    @Override
    public void run() {
        try {
            ///Se manda el nombre del nuevo usuario
            Socket socket = new Socket("192.168.0.181", 7777);
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
