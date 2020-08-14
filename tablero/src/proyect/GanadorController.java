package proyect;

import java.applet.AudioClip;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class GanadorController implements Initializable {

    @FXML
    private ImageView fichaganador;
    @FXML
    private Label labelganador;
    @FXML
    private ImageView botvolver;
    @FXML
    private ImageView botvolver2;

    AudioClip SonidoBot, victoria;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fichaganador.setImage(new Image(TableroController.getFichaGanadora()));
        labelganador.setText("Felicidades "+ TableroController.getNombreGanador());
        
        switch(TableroController.getFichaGanadora()){
            case "Proyect/imagenes/lolito.png":
                victoria = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/lolitoVictoria.wav"));
                victoria.play();
                break;
            case "Proyect/imagenes/vegetta777.png":
                victoria = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/vegettaVictoria.wav"));
                victoria.play();
                break;
            case "Proyect/imagenes/rubius.png":
                victoria = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/rubiusVictoria.wav"));
                victoria.play();
                break;
            case "Proyect/imagenes/auronplay.png":
                victoria = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/auronVictoria.wav"));
                victoria.play();
                break;
            case "Proyect/imagenes/willyrex.png":
                victoria = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/willyrexVictoria.wav"));
                victoria.play();
                break;
            case "Proyect/imagenes/luzu.png":
                victoria = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/luzuVictoria.wav"));
                victoria.play();
                break;
        }
        
    }    

    @FXML
    private void volverAbajo(MouseEvent event) {
        botvolver.setVisible(true);
        botvolver2.setVisible(false);
    }

    @FXML
    private void volverArriba(MouseEvent event) {
        botvolver.setVisible(false);
        botvolver2.setVisible(true);
    }

    @FXML
    private void volver2Abajo(MouseEvent event) {
        botvolver.setVisible(true);
        botvolver2.setVisible(false);
    }

    @FXML
    private void volver2Arriba(MouseEvent event) {
        botvolver.setVisible(false);
        botvolver2.setVisible(true);
    }

    @FXML
    private void volver2click(MouseEvent event) throws IOException {
        SonidoBot = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/sonidoboton.wav"));
        SonidoBot.play();
        Parent Inicio = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene PantInicio = new Scene(Inicio);    
        Stage ventana = (Stage)((Node)event.getSource()).getScene().getWindow();
        ventana.setScene(PantInicio);
        ventana.show();
    }
    
}
