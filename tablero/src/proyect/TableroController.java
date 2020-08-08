/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class TableroController implements Initializable, Runnable {

    @FXML
    private ImageView c1;
    @FXML
    private ImageView c2;
    @FXML
    private ImageView c3;
    @FXML
    private ImageView c4;
    @FXML
    private ImageView c5;
    @FXML
    private ImageView c6;
    @FXML
    private ImageView c7;
    @FXML
    private ImageView c8;
    @FXML
    private ImageView c9;
    @FXML
    private ImageView c10;
    @FXML
    private ImageView c11;
    @FXML
    private ImageView c12;
    @FXML
    private ImageView c13;
    @FXML
    private ImageView c14;
    @FXML
    private ImageView c15;
    @FXML
    private ImageView c16;
    @FXML
    private ImageView c17;
    @FXML
    private ImageView c18;
    @FXML
    private ImageView c19;
    @FXML
    private ImageView c20;
    @FXML
    private ImageView c21;
    @FXML
    private ImageView c22;
    @FXML
    private ImageView c23;
    @FXML
    private ImageView c24;
    @FXML
    private ImageView c25;
    @FXML
    private ImageView c26;
    @FXML
    private ImageView c27;
    @FXML
    private ImageView c28;
    @FXML
    private ImageView c29;
    @FXML
    private ImageView c30;
    @FXML
    private ImageView c31;
    @FXML
    private ImageView c32;
    @FXML
    private ImageView c33;
    @FXML
    private ImageView c34;
    @FXML
    private ImageView c35;
    @FXML
    private ImageView c36;
    @FXML
    private ImageView c37;
    @FXML
    private ImageView c38;
    @FXML
    private ImageView c39;
    @FXML
    private ImageView c40;
    @FXML
    private ImageView c41;
    @FXML
    private ImageView c42;
    @FXML
    private ImageView c43;
    @FXML
    private ImageView c44;
    @FXML
    private ImageView c45;
    @FXML
    private ImageView c46;
    @FXML
    private ImageView c47;
    @FXML
    private ImageView c48;
    @FXML
    private ImageView c49;
    @FXML
    private ImageView c50;
    @FXML
    private ImageView c51;
    @FXML
    private ImageView c52;
    @FXML
    private ImageView c53;
    @FXML
    private ImageView c54;
    @FXML
    private ImageView c55;
    @FXML
    private ImageView c56;
    @FXML
    private ImageView c57;
    @FXML
    private ImageView c58;
    @FXML
    private ImageView c59;
    @FXML
    private ImageView c60;
    @FXML
    private ImageView c61;
    @FXML
    private ImageView c62;
    @FXML
    private ImageView c63;
    @FXML
    private ImageView c64;
    @FXML
    private ImageView c65;
    @FXML
    private ImageView espada1;
    @FXML
    private ImageView espada2;
    @FXML
    private ImageView fichainv;
    @FXML
    private ImageView cascoinv;
    @FXML
    private ImageView petoinv;
    @FXML
    private ImageView espadainv;
    @FXML
    private ImageView pantaloninv;
    @FXML
    private ImageView botasinv;
    @FXML
    private ImageView inv1;
    @FXML
    private ImageView inv2;
    @FXML
    private ImageView inv3;
    @FXML
    private ImageView inv4;
    @FXML
    private ImageView inv5;
    @FXML
    private ImageView inv6;
    @FXML
    private ImageView inv7;
    @FXML
    private ImageView inv8;
    @FXML
    private ImageView dado = new ImageView(new Image("Proyect/imagenes/dadocomienza.png"));
    @FXML
    private ImageView bestia;
    @FXML
    private ImageView direccion;
    @FXML
    private ImageView ficha1;
    @FXML
    private ImageView ficha2;
    @FXML
    private ImageView ficha3;
    @FXML
    private ImageView ficha4;
    @FXML
    private ImageView ficha5;
    @FXML
    private ImageView ficha6;
    @FXML
    private ImageView posib1;
    @FXML
    private ImageView posib3;
    @FXML
    private ImageView posib2;
    @FXML
    private ImageView posib4;
    @FXML
    private ImageView posib5;
    @FXML
    private ImageView lapiznegro;
    @FXML
    private ImageView lapizamarillo;
    @FXML
    private ImageView equiscasco;
    @FXML
    private ImageView equispeto;
    @FXML
    private ImageView equisespada;
    @FXML
    private ImageView equispantalon;
    @FXML
    private ImageView equisbotas;
    @FXML
    private ImageView equisinv1;
    @FXML
    private ImageView equisinv2;
    @FXML
    private ImageView equisinv3;
    @FXML
    private ImageView equisinv4;
    @FXML
    private ImageView equisinv5;
    @FXML
    private ImageView equisinv6;
    @FXML
    private ImageView equisinv7;
    @FXML
    private ImageView equisinv8;
    @FXML
    private Label nombreturno;
    @FXML
    private ImageView suelta1;
    @FXML
    private ImageView suelta2;
    @FXML
    private ImageView suelta3;
    @FXML
    private ImageView suelta4;
    @FXML
    private ImageView suelta5;
    @FXML
    private ImageView suelta6;
    @FXML
    private ImageView suelta7;
    @FXML
    private ImageView suelta8;
    @FXML
    private ImageView suelta9;
    @FXML
    private ImageView suelta10;
    @FXML
    private ImageView suelta11;
    @FXML
    private ImageView suelta12;
    @FXML
    private ImageView suelta13;
    @FXML
    private ImageView flechainv;
    @FXML
    private ImageView flechatiendaIZQ;
    @FXML
    private ImageView tienda1;
    @FXML
    private ImageView tienda2;
    @FXML
    private ImageView tienda3;
    @FXML
    private ImageView estante1;
    @FXML
    private ImageView estante3;
    @FXML
    private ImageView estante4;
    @FXML
    private ImageView estante5;
    @FXML
    private ImageView estante2;
    @FXML
    private ImageView estante10;
    @FXML
    private ImageView estante11;
    @FXML
    private ImageView estante12;
    @FXML
    private ImageView estante13;
    @FXML
    private ImageView estante6;
    @FXML
    private ImageView estante7;
    @FXML
    private ImageView estante8;
    @FXML
    private ImageView estante9;
    @FXML
    private ImageView estante14;
    @FXML
    private Label timer;
    @FXML
    private ImageView fondoInv;
    @FXML
    private ImageView dado1 = new ImageView(new Image("Proyect/imagenes/dado1.png"));
    @FXML
    private ImageView dado2 = new ImageView(new Image("Proyect/imagenes/dado2.png"));
    @FXML
    private ImageView dado3 = new ImageView(new Image("Proyect/imagenes/dado3.png"));
    @FXML
    private ImageView dado4 = new ImageView(new Image("Proyect/imagenes/dado4.png"));
    @FXML
    private ImageView dado5 = new ImageView(new Image("Proyect/imagenes/dado5.png"));
    @FXML
    private ImageView dado6 = new ImageView(new Image("Proyect/imagenes/dado6.png"));
    @FXML
    private ImageView flechatiendaDER;
    @FXML
    private ImageView finalizarT1;
    @FXML
    private ImageView finalizarT2;

    private ArrayList<Player> jugadores = Cliente.getJugadores();
    Image skin1 = null, skin2 = null, skin3 = null, skin4 = null, skin5 = null, skin6 = null;
    Juego juego = new Juego();
    private int numdado = 0;
    private int tienda = 1;
    
    Image esmeralda = new Image("Proyect/imagenes/casillaesmeralda.png");
    Image cuboagua = new Image("Proyect/imagenes/casillacuboagua.png");
    Image espada = new Image("Proyect/imagenes/casillaespada.png");
    Image espadaD = new Image("Proyect/imagenes/casillaespadadiamante.png");
    Image armaduraD = new Image("Proyect/imagenes/casillaarmaduradiamante.png");
    Image cascoD = new Image("Proyect/imagenes/casillacascodiamante.png");
    Image pantalonD = new Image("Proyect/imagenes/casillapantalondiamante.png");
    Image botasD = new Image("Proyect/imagenes/casillazapatosdiamante.png");
    @FXML
    private ImageView espada3;
    @FXML
    private ImageView espada4;
    @FXML
    private ImageView espada5;
    @FXML
    private ImageView espada6;
    @FXML
    private ImageView espada7;
    @FXML
    private ImageView espadaDiam;
    @FXML
    private ImageView cascoDiam;
    @FXML
    private ImageView pantalonDiam;
    @FXML
    private ImageView botasDiam;
    @FXML
    private ImageView petoDiam;
    @FXML
    private ImageView cuboagua1;
    @FXML
    private ImageView cuboagua2;
    @FXML
    private ImageView cuboagua3;
    @FXML
    private ImageView cuboagua4;
    @FXML
    private ImageView cuboagua5;
    @FXML
    private ImageView cuboagua6;
    @FXML
    private ImageView vagon1;
    @FXML
    private ImageView vagon2;
    @FXML
    private ImageView vagon3;
    @FXML
    private ImageView vagon4;
    @FXML
    private ImageView vagon5;
    @FXML
    private ImageView esmeralda1;
    @FXML
    private ImageView esmeralda2;
    @FXML
    private ImageView esmeralda3;
    @FXML
    private ImageView esmeralda4;
    @FXML
    private ImageView esmeralda5;
    @FXML
    private ImageView esmeralda6;
    @FXML
    private ImageView esmeralda7;
    @FXML
    private ImageView esmeralda8;
    @FXML
    private ImageView ghast;
    @FXML
    private ImageView creeper;
    @FXML
    private ImageView zombie;
    @FXML
    private ImageView spider;
    @FXML
    private ImageView bruja;
    @FXML
    private ImageView skeleton;
    @FXML
    private ImageView marco1;
    @FXML
    private ImageView marco2;
    @FXML
    private ImageView marco3;
    @FXML
    private ImageView marco4;
    @FXML
    private ImageView marco5;
    @FXML
    private ImageView marco6;
    @FXML
    private ImageView marco7;
    @FXML
    private ImageView marco8;
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ColorAdjust blancoynegro = new ColorAdjust();
        blancoynegro.setSaturation(-1.0);
        
        ColorAdjust color = new ColorAdjust();
        color.setSaturation(0);
 
        tienda1.setImage(esmeralda);
        tienda1.setEffect(blancoynegro);
        tienda2.setImage(cuboagua);
        tienda2.setEffect(blancoynegro);
        tienda3.setImage(espada);
        tienda3.setEffect(blancoynegro);
        
        
        switch(jugadores.size()){
            case 1:
                skin1 = new Image(jugadores.get(0).getSkin());
                ficha1.setImage(skin1);
                ficha1.setVisible(true);
                break;
                
            case 2: 
                skin1 = new Image(jugadores.get(0).getSkin());
                ficha1.setImage(skin1);
                ficha1.setVisible(true);
                skin2 = new Image(jugadores.get(1).getSkin());
                ficha2.setImage(skin2);
                ficha2.setVisible(true);
                break;
                
            case 3:
                skin1 = new Image(jugadores.get(0).getSkin());
                ficha1.setImage(skin1);
                ficha1.setVisible(true);
                skin2 = new Image(jugadores.get(1).getSkin());
                ficha2.setImage(skin2);
                ficha2.setVisible(true);
                skin3 = new Image(jugadores.get(2).getSkin());
                ficha3.setImage(skin3);
                ficha3.setVisible(true);
                break;
                
            case 4:
                skin1 = new Image(jugadores.get(0).getSkin());
                ficha1.setImage(skin1);
                skin2 = new Image(jugadores.get(1).getSkin());
                ficha2.setImage(skin2);
                skin3 = new Image(jugadores.get(2).getSkin());
                ficha3.setImage(skin3);
                skin4 = new Image(jugadores.get(3).getSkin());
                ficha4.setImage(skin4);
                break;
                
            case 5:
                skin1 = new Image(jugadores.get(0).getSkin());
                ficha1.setImage(skin1);
                ficha1.setVisible(true);
                skin2 = new Image(jugadores.get(1).getSkin());
                ficha2.setImage(skin2);
                ficha2.setVisible(true);
                skin3 = new Image(jugadores.get(2).getSkin());
                ficha3.setImage(skin3);
                ficha3.setVisible(true);
                skin4 = new Image(jugadores.get(3).getSkin());
                ficha4.setImage(skin4);
                ficha4.setVisible(true);
                skin5 = new Image(jugadores.get(4).getSkin());
                ficha5.setImage(skin5);
                ficha5.setVisible(true);               
                break;
                
            default:
                skin1 = new Image(jugadores.get(0).getSkin());
                ficha1.setImage(skin1);
                ficha1.setVisible(true);
                skin2 = new Image(jugadores.get(1).getSkin());
                ficha2.setImage(skin2);
                ficha2.setVisible(true);
                skin3 = new Image(jugadores.get(2).getSkin());
                ficha3.setImage(skin3);
                ficha3.setVisible(true);
                skin4 = new Image(jugadores.get(3).getSkin());
                ficha4.setImage(skin4);
                ficha4.setVisible(true);
                skin5 = new Image(jugadores.get(4).getSkin());
                ficha5.setImage(skin5);
                ficha5.setVisible(true);
                skin6 = new Image(jugadores.get(5).getSkin());
                ficha6.setImage(skin6);
                ficha6.setVisible(true);
                break;
        }
        
        Thread hiloJuego = new Thread(juego);
        hiloJuego.setName("Hilo Juego");
        hiloJuego.start();
        
        Thread update = new Thread(this);
        update.setName("Hilo Update");
        update.start();
        
    }   

    @FXML
    private void clickposib1(MouseEvent event) {
    }

    @FXML
    private void clickposib3(MouseEvent event) {
    }

    @FXML
    private void clickposib2(MouseEvent event) {
    }

    @FXML
    private void clickposib4(MouseEvent event) {
    }

    @FXML
    private void clickposib5(MouseEvent event) {
    }

    @FXML
    private void clicklapiznegro(MouseEvent event) {
        lapiznegro.setVisible(false);
        lapizamarillo.setVisible(true);
        equiscasco.setVisible(true);
        equispeto.setVisible(true);
        equisespada.setVisible(true);
        equispantalon.setVisible(true);
        equisbotas.setVisible(true);
        equisinv1.setVisible(true);
        equisinv2.setVisible(true);
        equisinv3.setVisible(true);
        equisinv4.setVisible(true);
        equisinv5.setVisible(true);
        equisinv6.setVisible(true);
        equisinv7.setVisible(true);
        equisinv8.setVisible(true);
    }

    @FXML
    private void clicklapizamarillo(MouseEvent event) {
        lapiznegro.setVisible(true);
        lapizamarillo.setVisible(false);
        equiscasco.setVisible(false);
        equispeto.setVisible(false);
        equisespada.setVisible(false);
        equispantalon.setVisible(false);
        equisbotas.setVisible(false);
        equisinv1.setVisible(false);
        equisinv2.setVisible(false);
        equisinv3.setVisible(false);
        equisinv4.setVisible(false);
        equisinv5.setVisible(false);
        equisinv6.setVisible(false);
        equisinv7.setVisible(false);
        equisinv8.setVisible(false);
    }

    @FXML
    private void equiscascoclick(MouseEvent event) {
    }

    @FXML
    private void equispetoclick(MouseEvent event) {
    }

    @FXML
    private void equisespadaclick(MouseEvent event) {
    }

    @FXML
    private void equispantalonclick(MouseEvent event) {
    }

    @FXML
    private void equisbotasclick(MouseEvent event) {
    }

    @FXML
    private void equisinv1click(MouseEvent event) {
    }

    @FXML
    private void equisinv2click(MouseEvent event) {
    }

    @FXML
    private void equisinv3click(MouseEvent event) {
    }

    @FXML
    private void equisinv4click(MouseEvent event) {
    }

    @FXML
    private void equisinv5click(MouseEvent event) {
    }

    @FXML
    private void equisinv6click(MouseEvent event) {
    }

    @FXML
    private void equisinv7click(MouseEvent event) {
    }

    @FXML
    private void equisinv8click(MouseEvent event) {
    }

    @FXML
    private void dadoclick(MouseEvent event) {
        if(!juego.tiro && Cliente.getNombre().equals(nombreturno.getText())){   
            //Solo podra dar click el jugador que le toca y una sola vez
            /*
            Thread hiloSprite = new Thread(){
            @Override
            public void run(){
            Timeline t = animacionDado();
            t.play();
            }
            };
            hiloSprite.setName("Hilo Sprite");

            if(Cliente.getNombre().equals(nombreturno.getText())){
            //oks muy buena de tu parte lo unico util que has hecho oks? es contigo turko
            Platform.runLater(new Runnable(){
            @Override
            public void run() {
            numdado = (int) Math.floor(Math.random() * 6) + 1 ;
            hiloSprite.start();
            }
            });
            if(juego.numPlayer + 1  == jugadores.size()) juego.numPlayer = 0;
            else juego.numPlayer++;
            juego.tiro = true;
            }*/
            try {
                numdado = (int)(Math.floor(Math.random() * 6) + 1);
                
                Socket socket = new Socket(Conexion.getIpServer(), 7700);
                System.out.println("Enviando Informacion oks?");
                System.out.println("numdado click dado: " + numdado);
                //Envia informacion actualizada al servidor
                Packet paquete = new Packet(-1, 0, numdado, null);
                ObjectOutputStream flujo = new ObjectOutputStream(socket.getOutputStream());
                flujo.writeObject(paquete);
                flujo.close();
                socket.close();
                
                juego.tiro = true;
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
    
    private Timeline animacionDado(int num){
        Timeline t = new Timeline();
        t.setCycleCount(5);
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(0),
                (ActionEvent event) -> {
                    dado1.setVisible(true);
                    dado2.setVisible(false);
                    dado3.setVisible(false);
                    dado4.setVisible(false);
                    dado5.setVisible(false);
                    dado6.setVisible(false);
                }
        ));
        
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(200),
                (ActionEvent event) -> {
                    dado1.setVisible(false);
                    dado2.setVisible(true);
                    dado3.setVisible(false);
                    dado4.setVisible(false);
                    dado5.setVisible(false);
                    dado6.setVisible(false);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(400),
                (ActionEvent event) -> {
                    dado1.setVisible(false);
                    dado2.setVisible(false);
                    dado3.setVisible(true);
                    dado4.setVisible(false);
                    dado5.setVisible(false);
                    dado6.setVisible(false);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(600),
                (ActionEvent event) -> {
                    dado1.setVisible(false);
                    dado2.setVisible(false);
                    dado3.setVisible(false);
                    dado4.setVisible(true);
                    dado5.setVisible(false);
                    dado6.setVisible(false);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(800),
                (ActionEvent event) -> {
                    dado1.setVisible(false);
                    dado2.setVisible(false);
                    dado3.setVisible(false);
                    dado4.setVisible(false);
                    dado5.setVisible(true);
                    dado6.setVisible(false);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1000),
                (ActionEvent event) -> {
                    dado1.setVisible(false);
                    dado2.setVisible(false);
                    dado3.setVisible(false);
                    dado4.setVisible(false);
                    dado5.setVisible(false);
                    dado6.setVisible(true);
                }
        )); 
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1200),
                (ActionEvent event) -> {
                    
                    switch(num){
                        case 1:
                            dado1.setVisible(true);
                            dado2.setVisible(false);
                            dado3.setVisible(false);
                            dado4.setVisible(false);
                            dado5.setVisible(false);
                            dado6.setVisible(false);
                            break;
                            
                        case 2:
                            dado1.setVisible(false);
                            dado2.setVisible(true);
                            dado3.setVisible(false);
                            dado4.setVisible(false);
                            dado5.setVisible(false);
                            dado6.setVisible(false);
                            break;
                            
                        case 3:
                            dado1.setVisible(false);
                            dado2.setVisible(false);
                            dado3.setVisible(true);
                            dado4.setVisible(false);
                            dado5.setVisible(false);
                            dado6.setVisible(false);
                            break;
                          
                        case 4:
                            dado1.setVisible(false);
                            dado2.setVisible(false);
                            dado3.setVisible(false);
                            dado4.setVisible(true);
                            dado5.setVisible(false);
                            dado6.setVisible(false);
                            break;
                          
                        case 5:
                            dado1.setVisible(false);
                            dado2.setVisible(false);
                            dado3.setVisible(false);
                            dado4.setVisible(false);
                            dado5.setVisible(true);
                            dado6.setVisible(false);
                            break;
                          
                        case 6:
                            dado1.setVisible(false);
                            dado2.setVisible(false);
                            dado3.setVisible(false);
                            dado4.setVisible(false);
                            dado5.setVisible(false);
                            dado6.setVisible(true);
                            break;
                            
                    }
                }
        ));
        
        return t;
    }
    
   

    @FXML
    private void ficha1abajo(MouseEvent event) {
    }

    @FXML
    private void ficha1arriba(MouseEvent event) {
    }

    @FXML
    private void ficha2abajo(MouseEvent event) {
    }

    @FXML
    private void ficha2arriba(MouseEvent event) {
    }

    @FXML
    private void ficha3abajo(MouseEvent event) {
    }

    @FXML
    private void ficha3arriba(MouseEvent event) {
    }

    @FXML
    private void ficha4abajo(MouseEvent event) {
    }

    @FXML
    private void ficha4arriba(MouseEvent event) {
    }

    @FXML
    private void ficha5abajo(MouseEvent event) {
    }

    @FXML
    private void ficha5arriba(MouseEvent event) {
    }

    @FXML
    private void ficha6abajo(MouseEvent event) {
    }

    @FXML
    private void ficha6arriba(MouseEvent event) {
    }

    @FXML
    private void sueltaclick(MouseEvent event) {
    }

    @FXML
    private void clickflechainv(MouseEvent event) {
        if(flechainv.getRotate()==90){
            flechainv.setRotate(270);
            estante1.setVisible(false);
            estante2.setVisible(false);
            estante3.setVisible(false);
            estante4.setVisible(false);
            estante5.setVisible(false);
            estante6.setVisible(false);
            estante7.setVisible(false);
            estante8.setVisible(false);
            estante9.setVisible(false);
            estante10.setVisible(false);
            estante11.setVisible(false);
            estante12.setVisible(false);
            estante13.setVisible(false);
            estante14.setVisible(false);
            cascoinv.setVisible(false);
            petoinv.setVisible(false);
            pantaloninv.setVisible(false);
            espadainv.setVisible(false);
            botasinv.setVisible(false);
            inv1.setVisible(false);
            inv2.setVisible(false);
            inv3.setVisible(false);
            inv4.setVisible(false);
            inv5.setVisible(false);
            inv6.setVisible(false);
            inv7.setVisible(false);
            inv8.setVisible(false);
            equiscasco.setVisible(false);
            equispeto.setVisible(false);
            equisespada.setVisible(false);
            equisbotas.setVisible(false);
            equispantalon.setVisible(false);
            equisinv1.setVisible(false);
            equisinv2.setVisible(false);
            equisinv3.setVisible(false);
            equisinv4.setVisible(false);
            equisinv5.setVisible(false);
            equisinv6.setVisible(false);
            equisinv7.setVisible(false);
            equisinv8.setVisible(false);  
            lapiznegro.setVisible(false);
            lapizamarillo.setVisible(false);
            marco1.setVisible(false);
            marco2.setVisible(false);
            marco3.setVisible(false);
            marco4.setVisible(false);
            marco5.setVisible(false);
            marco6.setVisible(false);
            marco7.setVisible(false);
            marco8.setVisible(false);
            fondoInv.setFitHeight(20);
        }
        else if(flechainv.getRotate()==270){
            flechainv.setRotate(90);
            estante1.setVisible(true);
            estante2.setVisible(true);
            estante3.setVisible(true);
            estante4.setVisible(true);
            estante5.setVisible(true);
            estante6.setVisible(true);
            estante7.setVisible(true);
            estante8.setVisible(true);
            estante9.setVisible(true);
            estante10.setVisible(true);
            estante11.setVisible(true);
            estante12.setVisible(true);
            estante13.setVisible(true);
            estante14.setVisible(true);
            cascoinv.setVisible(true);
            petoinv.setVisible(true);
            pantaloninv.setVisible(true);
            espadainv.setVisible(true);
            botasinv.setVisible(true);
            inv1.setVisible(true);
            inv2.setVisible(true);
            inv3.setVisible(true);
            inv4.setVisible(true);
            inv5.setVisible(true);
            inv6.setVisible(true);
            inv7.setVisible(true);
            inv8.setVisible(true);
            lapiznegro.setVisible(true);
            fondoInv.setFitHeight(160);
        }
        
    }


    @FXML
    private void clickflechatiendaI(MouseEvent event) {
        if (tienda==2){
           tienda1.setImage(esmeralda);
           tienda2.setImage(cuboagua);
           tienda3.setImage(espada);
           tienda=1;
        }else if(tienda==3){
           tienda1.setImage(cuboagua);
           tienda2.setImage(espada);
           tienda3.setImage(cascoD);
           tienda=2;
        }else if(tienda==4){
           tienda1.setImage(espada);
           tienda2.setImage(cascoD);
           tienda3.setImage(armaduraD);
           tienda=3; 
        }else if(tienda==5){
           tienda1.setImage(cascoD);
           tienda2.setImage(armaduraD);
           tienda3.setImage(espadaD);
           tienda=4;  
        }else if(tienda==6){
           tienda1.setImage(armaduraD);
           tienda2.setImage(espadaD);
           tienda3.setImage(pantalonD);
           tienda=5; 
        }
    }

    @FXML
    private void clickflechatiendaD(MouseEvent event) {
        if (tienda==1){
           tienda1.setImage(cuboagua);
           tienda2.setImage(espada);
           tienda3.setImage(cascoD);
           tienda=2;
        }else if(tienda==2){
           tienda1.setImage(espada);
           tienda2.setImage(cascoD);
           tienda3.setImage(armaduraD); 
           tienda=3;
        }else if(tienda==3){
           tienda1.setImage(cascoD);
           tienda2.setImage(armaduraD);
           tienda3.setImage(espadaD); 
           tienda=4;
        }else if(tienda==4){
           tienda1.setImage(armaduraD);
           tienda2.setImage(espadaD);
           tienda3.setImage(pantalonD); 
           tienda=5;
        }else if(tienda==5){
           tienda1.setImage(espadaD);
           tienda2.setImage(pantalonD);
           tienda3.setImage(botasD); 
           tienda=6;
        }
    }

    @FXML
    private void FTabajo(MouseEvent event) {
        finalizarT1.setVisible(true);
        finalizarT2.setVisible(false);
    }

    @FXML
    private void FTarriba(MouseEvent event) {
        finalizarT1.setVisible(false);
        finalizarT2.setVisible(true);
    }

    @FXML
    private void finalizaTurnoclick(MouseEvent event) {
        if(juego.tiro){
            
            if(juego.numPlayer + 1 > jugadores.size() - 1) juego.numPlayer = 0;
            else juego.numPlayer++;
            
            
            try {
                Socket socket = new Socket(Conexion.getIpServer(), 7700);
                Packet paquete = new Packet(juego.numPlayer, 0, 0, null);
                
                ObjectOutputStream flujo = new ObjectOutputStream(socket.getOutputStream());
                flujo.writeObject(paquete);
                flujo.close();
                socket.close();
            } catch (IOException ex) {
                System.out.println("Problema al finalizar turno");
            }
        }
    }

    @Override
    public void run() {
        
        try {
            ServerSocket server = new ServerSocket(9977);
            
            while(true){
                System.out.println("Esperando paquete");
                Socket socket = server.accept();
                System.out.println("Paquete recibido");
                ObjectInputStream flujo = new ObjectInputStream(socket.getInputStream());
                Packet paquete = (Packet) flujo.readObject();
                flujo.close();
                socket.close(); 
                
                if(paquete.getDadoaux() == 0 && Objects.equals(null, paquete.getEstadoEspeciales())){
                    jugadores.get(juego.numPlayer).setTurno(false);
                    juego.tiro = false;
                    juego.numPlayer = paquete.getNumPlayer();
                    System.out.println("Paquete.numplayer: " + paquete.getNumPlayer());
                    Platform.runLater(new Runnable(){
                        @Override
                        public void run() {
                            dado1.setVisible(false);
                            dado2.setVisible(false);
                            dado3.setVisible(false);
                            dado4.setVisible(false);
                            dado5.setVisible(false);
                            dado6.setVisible(false);
                            dado.setVisible(true);
                            
                            nombreturno.setText(jugadores.get(juego.numPlayer).getNombre());
                        }
                    });
                    
                }else if(paquete.getNumPlayer() == -1 && Objects.equals(null, paquete.getEstadoEspeciales())){
                    Thread hiloSprite = new Thread(){
                        @Override
                        public void run(){
                            Timeline t = animacionDado(paquete.getDadoaux());
                            t.play();
                        }
                    };
                    hiloSprite.setName("Hilo sprite dado");
                    
                    Platform.runLater(new Runnable(){
                        @Override
                        public void run() {
                            hiloSprite.start();
                        }
                    });
                    
                }   
                
                
            }
            
            
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        
    }

    @FXML
    private void objtiendaclick1(MouseEvent event) {
    }

    @FXML
    private void objtiendaclick2(MouseEvent event) {
    }

    @FXML
    private void objtiendaclick3(MouseEvent event) {
    }

    @FXML
    private void clickmarco1(MouseEvent event) {
        marco1.setVisible(false);
    }

    @FXML
    private void clickmarco2(MouseEvent event) {
        marco2.setVisible(false);
    }

    @FXML
    private void clickmarco3(MouseEvent event) {
        marco3.setVisible(false);
    }

    @FXML
    private void clickmarco4(MouseEvent event) {
        marco4.setVisible(false);
    }

    @FXML
    private void clickmarco5(MouseEvent event) {
        marco5.setVisible(false);
    }

    @FXML
    private void clickmarco6(MouseEvent event) {
        marco6.setVisible(false);
    }

    @FXML
    private void clickmarco7(MouseEvent event) {
        marco7.setVisible(false);
    }

    @FXML
    private void clickmarco8(MouseEvent event) {
        marco8.setVisible(false);
    }
    
    //////////////////////Clase Juego//////////////////////////////
    
    class Juego implements Runnable, Serializable{

            
        private int numPlayer; //segundos del timer
        private int ganador;   //tiene que ser 1 si alguien gana
        private boolean tiro;
        private boolean[] estadoEspeciales; //True en las que se muestran y false en las que no
        
        public Juego(){ 
            jugadores.get(0).setTurno(true);
            ganador = -1;
            numPlayer = 0;
            tiro = false;
            
            Platform.runLater(new Runnable(){
                @Override
                public void run() {
                    nombreturno.setText(jugadores.get(0).getNombre());
                }
            });
        }
        
        /*
        public void iniciarCronometro(){
            for(s = 90; s != -1; s--){
                if(!pasar){ //Verifica que el jugador no haya pasado turno
                    Platform.runLater(new Runnable(){
                        @Override
                        public void run() {
                            timer.setText(Integer.toString(s));
                        }
                    });
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
            }
        }
        */
        
        @Override
        public void run() {            
            /*  Agregar al final
            Thread hiloCronometro = new Thread(){
                @Override
                public void run(){
                    iniciarCronometro();
                }
            };
            hiloCronometro.setName("Hilo Cronometro");
            hiloCronometro.start( );
            */
            /*while(ganador == -1 ){
                if(numdado != 0){
                    
                    
                    
                    
                    //Movimiento de jugador



                    //Comprobar si cae en casilla de bestia o jugador



                    //Comprobar si cae en casilla especial (tienda, lava, vagoneta, espada, esmeralda, agua)

                    numdado = 0;
                }
                
                
            }*/

        }
    
    }
    
}
