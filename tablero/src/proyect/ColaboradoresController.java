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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class ColaboradoresController implements Initializable {

    @FXML
    private Label jorge;
    @FXML
    private ImageView colaborador;
    @FXML
    private Label claudia;
    @FXML
    private Label tina;
    @FXML
    private Label hector;
    @FXML
    private Label maite;
    @FXML
    private Label jesus;
    @FXML
    private Label carlos;
    @FXML
    private Label crissel;
    @FXML
    private Label freddy;

    /**
     * Initializes the controller class.
     */
    
    AudioClip SonidoBot;
    @FXML
    private ImageView volver1;
    @FXML
    private ImageView volver2;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void jorgeabajo(MouseEvent event) {
        jorge.setOpacity(0.6);
        colaborador.setImage(null);
    }

    @FXML
    private void jorgearriba(MouseEvent event) {
        jorge.setOpacity(1.0);
        colaborador.setImage(new Image("Proyect/imagenes/jorge.jpeg"));
        SonidoBot = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/encimaNombre.wav"));
        SonidoBot.play();
    }

    @FXML
    private void claudiaabajo(MouseEvent event) {
        claudia.setOpacity(0.6);
        colaborador.setImage(null);
    }

    @FXML
    private void claudiaarriba(MouseEvent event) {
        claudia.setOpacity(1.0);
        colaborador.setImage(new Image("Proyect/imagenes/claudia.jpeg"));
        SonidoBot = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/encimaNombre.wav"));
        SonidoBot.play();
    }

    @FXML
    private void tinaabajo(MouseEvent event) {
        tina.setOpacity(0.6);
        colaborador.setImage(null);
    }

    @FXML
    private void tinaarriba(MouseEvent event) {
        tina.setOpacity(1.0);
        colaborador.setImage(new Image("Proyect/imagenes/tina.jpeg"));
        SonidoBot = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/encimaNombre.wav"));
        SonidoBot.play();
    }

    @FXML
    private void hectorabajo(MouseEvent event) {
        hector.setOpacity(0.6);
        colaborador.setImage(null);
    }

    @FXML
    private void hectorarriba(MouseEvent event) {
        hector.setOpacity(1.0);
        colaborador.setImage(new Image("Proyect/imagenes/hector.jpeg"));
        SonidoBot = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/encimaNombre.wav"));
        SonidoBot.play();
    }

    @FXML
    private void maiteabajo(MouseEvent event) {
        maite.setOpacity(0.6);
        colaborador.setImage(null);
    }

    @FXML
    private void maitearriba(MouseEvent event) {
        maite.setOpacity(1.0);
        colaborador.setImage(new Image("Proyect/imagenes/maite.jpeg"));
        SonidoBot = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/encimaNombre.wav"));
        SonidoBot.play();
    }

    @FXML
    private void jesusabajo(MouseEvent event) {
        jesus.setOpacity(0.6);
        colaborador.setImage(null);
    }

    @FXML
    private void jesusarriba(MouseEvent event) {
        jesus.setOpacity(1.0);
        colaborador.setImage(new Image("Proyect/imagenes/jesus.jpeg"));
        SonidoBot = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/encimaNombre.wav"));
        SonidoBot.play();
    }

    @FXML
    private void carlosabajo(MouseEvent event) {
        carlos.setOpacity(0.6);
        colaborador.setImage(null);
    }

    @FXML
    private void carlosarriba(MouseEvent event) {
        carlos.setOpacity(1.0);
        colaborador.setImage(new Image("Proyect/imagenes/carlos.jpeg"));
        SonidoBot = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/encimaNombre.wav"));
        SonidoBot.play();
    }


    @FXML
    private void freddyabajo(MouseEvent event) {
        freddy.setOpacity(0.6);
        colaborador.setImage(null);
    }

    @FXML
    private void freddyarriba(MouseEvent event) {
        freddy.setOpacity(1.0);
        colaborador.setImage(new Image("Proyect/imagenes/freddy.jpeg"));
        SonidoBot = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/encimaNombre.wav"));
        SonidoBot.play();
    }

    @FXML
    private void crisselabajo(MouseEvent event) {
        crissel.setOpacity(0.6);
        colaborador.setImage(null);
    }

    @FXML
    private void crisselarriba(MouseEvent event) {
        crissel.setOpacity(1.0);
        colaborador.setImage(new Image("Proyect/imagenes/crissel.jpeg"));
        SonidoBot = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/encimaNombre.wav"));
        SonidoBot.play();
    }

    @FXML
    private void volver1abajo(MouseEvent event) {
        volver1.setVisible(true);
        volver2.setVisible(false);
    }

    @FXML
    private void volver1arriba(MouseEvent event) {
        volver1.setVisible(false);
        volver2.setVisible(true);
    }

    @FXML
    private void volver2abajo(MouseEvent event) {
        volver1.setVisible(true);
        volver2.setVisible(false);
    }

    @FXML
    private void volver2arriba(MouseEvent event) {
        volver1.setVisible(false);
        volver2.setVisible(true);
    }

    @FXML
    private void volverclick(MouseEvent event) throws IOException {
        SonidoBot = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/sonidoboton.wav"));
        SonidoBot.play();
        
        Parent Ambiente = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene PantAmbiente = new Scene(Ambiente);
            
        Stage ventana = (Stage)((Node)event.getSource()).getScene().getWindow();
            
        ventana.setScene(PantAmbiente);
        ventana.show();
    }
    
}
