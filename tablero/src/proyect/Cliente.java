package proyect;

import java.applet.AudioClip;
import java.util.ArrayList;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Cliente extends Application {
   
    private static String nombre;
    private static ArrayList<Player> jugadores;

    
    
    public static ArrayList<Player> getJugadores() {
        return jugadores;
    }

    public static void setJugadores(ArrayList<Player> jugadores) {
        Cliente.jugadores = jugadores;
    }
    
    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Cliente.nombre = nombre;
    }
    
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


