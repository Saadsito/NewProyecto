package proyect;

import java.applet.AudioClip;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
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


