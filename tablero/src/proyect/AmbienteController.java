/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class AmbienteController implements Initializable {

    @FXML
    private ImageView volverIni1;
    @FXML
    private ImageView volverIni2;

    /**
     * Initializes the controller class.
     */
    
    AudioClip SonidoBot;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void volverini1abajo(MouseEvent event) {
        volverIni1.setVisible(true);
        volverIni2.setVisible(false);
    }

    @FXML
    private void volverini1arriba(MouseEvent event) {
        volverIni1.setVisible(false);
        volverIni2.setVisible(true);
    }

    @FXML
    private void volverini2abajo(MouseEvent event) {
        volverIni1.setVisible(true);
        volverIni2.setVisible(false);
    }

    @FXML
    private void volverini2arriba(MouseEvent event) {
        volverIni1.setVisible(false);
        volverIni2.setVisible(true);
    }

    @FXML
    private void volverini2click(MouseEvent event) throws IOException {
        SonidoBot = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/sonidoboton.wav"));
        SonidoBot.play();
        
        Parent Ambiente = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene PantAmbiente = new Scene(Ambiente);
            
        Stage ventana = (Stage)((Node)event.getSource()).getScene().getWindow();
            
        ventana.setScene(PantAmbiente);
        ventana.show();
    }
    
}
