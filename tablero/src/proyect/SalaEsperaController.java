
package proyect;

import java.applet.AudioClip;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class SalaEsperaController implements Initializable{

    @FXML
    private ImageView vegetta1;
    @FXML
    private ImageView vegetta2;
    @FXML
    private ImageView lolito1;
    @FXML
    private ImageView lolito2;
    @FXML
    private ImageView rubius1;
    @FXML
    private ImageView rubius2;
    @FXML
    private ImageView auron1;
    @FXML
    private ImageView auron2;
    @FXML
    private ImageView willyrex1;
    @FXML
    private ImageView willyrex2;
    @FXML
    private ImageView luzu1;
    @FXML
    private ImageView luzu2;
    @FXML
    private ImageView equis1;
    @FXML
    private ImageView chulito1;
    @FXML
    private ImageView equis2;
    @FXML
    private ImageView equis3;
    @FXML
    private ImageView equis6;
    @FXML
    private ImageView equis5;
    @FXML
    private ImageView equis4;
    @FXML
    private ImageView chulito2;
    @FXML
    private ImageView chulito3;
    @FXML
    private ImageView chulito4;
    @FXML
    private ImageView chulito5;
    @FXML
    private ImageView chulito6;
    @FXML
    private ImageView botlisto1;
    @FXML
    private ImageView botlisto2;
    @FXML
    private Label labvegetta;
    
    private int actualListos = 0;
    private String nombre = Cliente.getNombre();
    private JugadorConexion conexionJugadores = new JugadorConexion(nombre, 7000);
    @FXML
    private Label nombre1;
    @FXML
    private Label nombre2;
    @FXML
    private Label nombre3;
    @FXML
    private Label nombre4;
    @FXML
    private Label nombre5;
    @FXML
    private Label nombre6;
    
    private int numjugador = -1;    //guarda la posicion en la lista del jugador
    @FXML
    private Label lablolito;
    @FXML
    private Label labrubius;
    @FXML
    private Label labauron;
    @FXML
    private Label labwilly;
    @FXML
    private Label labluzu;
    //Thread hiloLabel; //hilo para actualizar los label
    @Override
    public void initialize(URL url, ResourceBundle rb){
        
        Thread actualizarLista = new Thread(conexionJugadores);     //Pone al cliente a la escucha de la actualizacion de las listas e jugadores
        actualizarLista.setName("Hilo SalaEspera");
        actualizarLista.start();                                //comienza el hilo que actualiza la lista
        conexionJugadores.enviarJugador();
                        
        vegetta2.setVisible(false);
        lolito2.setVisible(false);
        rubius2.setVisible(false);
        auron2.setVisible(false);
        willyrex2.setVisible(false);
        luzu2.setVisible(false);
                
        Thread hiloLabel = new Thread(){
            @Override
            public void run(){
                actualizarLabel();
            }
        };
        
        hiloLabel.setName("HiloLabel");
        hiloLabel.start();
        
        while(numjugador == -1)
            if(!Objects.equals(null, conexionJugadores.getJugadores()))
                numjugador = buscarJugador(nombre, conexionJugadores.getJugadores());
        
        
    }    
 
    private boolean clickvegetta,clicklolito,clickrubius,clickauron,clickwillyrex,clickluzu,fijado=false;
    AudioClip SonidoPersonaje;
    
    @FXML
    private void vegetta1abajo(MouseEvent event) {
        if((!fijado) && (!clickvegetta)){
            vegetta1.setVisible(true);
            vegetta2.setVisible(false);
        }
    }

    @FXML
    private void vegetta1arriba(MouseEvent event) {
        if((!fijado) && (!clickvegetta)){
            vegetta2.setVisible(true);
            vegetta1.setVisible(false);
        }
    }

    @FXML
    private void vegetta2abajo(MouseEvent event) {
        if ((!fijado) && (!clickvegetta)){
            vegetta1.setVisible(true);
            vegetta2.setVisible(false);
        }
    }

    @FXML
    private void vegetta2arriba(MouseEvent event) {
        if((!fijado) && (!clickvegetta)){
            vegetta2.setVisible(true);
            vegetta1.setVisible(false);
        }
    }

    @FXML
    private void vegetta2click(MouseEvent event){
        conexionJugadores.getJugadores().get(numjugador).setSkin("Proyect/imagenes/vegetta777.png");
        clickvegetta=true;
        clicklolito=false;
        clickrubius=false;
        clickauron=false;
        clickwillyrex=false;
        clickluzu=false;
        lolito2.setVisible(false);
        rubius2.setVisible(false);
        auron2.setVisible(false);
        willyrex2.setVisible(false);
        luzu2.setVisible(false);
        lolito1.setVisible(true);
        rubius1.setVisible(true);
        auron1.setVisible(true);
        willyrex1.setVisible(true);
        luzu1.setVisible(true);
        vegetta1.setVisible(false);
        vegetta2.setVisible(true);
        SonidoPersonaje = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/vegetta777.wav"));
        SonidoPersonaje.play();
                
    }

    public void recibeNombre(String nombre){
        this.nombre = nombre;
    }
    
    @FXML
    private void lolito1abajo(MouseEvent event) {
        if((!fijado) && (!clicklolito)){
            lolito1.setVisible(true);
            lolito2.setVisible(false);
        }
    }

    @FXML
    private void lolito1arriba(MouseEvent event) {
        if((!fijado) && (!clicklolito)){
            lolito2.setVisible(true);
            lolito1.setVisible(false);
        }
    }

    @FXML
    private void lolito2abajo(MouseEvent event) {
        if((!fijado) && (!clicklolito)){
            lolito1.setVisible(true);
            lolito2.setVisible(false);
        }
    }

    @FXML
    private void lolito2arriba(MouseEvent event) {
        if((!fijado) && (!clicklolito)){
            lolito2.setVisible(true);
            lolito1.setVisible(false);
        }
    }

    @FXML
    private void lolito2click(MouseEvent event) {
        conexionJugadores.getJugadores().get(numjugador).setSkin("Proyect/imagenes/lolito.png");
        clickvegetta=false;
        clicklolito=true;
        clickrubius=false;
        clickauron=false;
        clickwillyrex=false;
        clickluzu=false;
        vegetta2.setVisible(false);
        rubius2.setVisible(false);
        auron2.setVisible(false);
        willyrex2.setVisible(false);
        luzu2.setVisible(false);
        vegetta1.setVisible(true);
        rubius1.setVisible(true);
        auron1.setVisible(true);
        willyrex1.setVisible(true);
        luzu1.setVisible(true);
        lolito1.setVisible(false);
        lolito2.setVisible(true);
        SonidoPersonaje = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/lolito.wav"));
        SonidoPersonaje.play();
    }

    @FXML
    private void rubius1abajo(MouseEvent event) {
        if((!fijado) && (!clickrubius)){
            rubius1.setVisible(true);
            rubius2.setVisible(false);
        }
    }

    @FXML
    private void rubius1arriba(MouseEvent event) {
        if((!fijado) && (!clickrubius)){
            rubius2.setVisible(true);
            rubius1.setVisible(false);
        }
    }

    @FXML
    private void rubius2abajo(MouseEvent event) {
        if((!fijado) && (!clickrubius)){
            rubius1.setVisible(true);
            rubius2.setVisible(false);
        }
    }

    @FXML
    private void rubius2arriba(MouseEvent event) {
        if((!fijado) && (!clickrubius)){
            rubius2.setVisible(true);
            rubius1.setVisible(false);
        }
    }

    @FXML
    private void rubius2click(MouseEvent event) {
        conexionJugadores.getJugadores().get(numjugador).setSkin("Proyect/imagenes/rubius.png");
        clickvegetta=false;
        clicklolito=false;
        clickrubius=true;
        clickauron=false;
        clickwillyrex=false;
        clickluzu=false;
        lolito2.setVisible(false);
        vegetta2.setVisible(false);
        auron2.setVisible(false);
        willyrex2.setVisible(false);
        luzu2.setVisible(false);
        lolito1.setVisible(true);
        vegetta1.setVisible(true);
        auron1.setVisible(true);
        willyrex1.setVisible(true);
        luzu1.setVisible(true);
        rubius1.setVisible(false);
        rubius2.setVisible(true);
        SonidoPersonaje = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/rubius.wav"));
        SonidoPersonaje.play();  
    }

    @FXML
    private void auron1abajo(MouseEvent event) {
        if((!fijado) && (!clickauron)){
            auron1.setVisible(true);
            auron2.setVisible(false);
        }
    }

    @FXML
    private void auron1arriba(MouseEvent event) {
        if((!fijado) && (!clickauron)){
            auron2.setVisible(true);
            auron1.setVisible(false);
        }
    }

    @FXML
    private void auron2abajo(MouseEvent event) {
        if((!fijado) && (!clickauron)){
            auron1.setVisible(true);
            auron2.setVisible(false);
        }
    }

    @FXML
    private void auron2arriba(MouseEvent event) {
        if((!fijado) && (!clickauron)){
            auron2.setVisible(true);
            auron1.setVisible(false);
        }
    }

    @FXML
    private void auron2click(MouseEvent event) {
        conexionJugadores.getJugadores().get(numjugador).setSkin("Proyect/imagenes/auronplay.png");
        clickvegetta=false;
        clicklolito=false;
        clickrubius=false;
        clickauron=true;
        clickwillyrex=false;
        clickluzu=false;
        lolito2.setVisible(false);
        rubius2.setVisible(false);
        vegetta2.setVisible(false);
        willyrex2.setVisible(false);
        luzu2.setVisible(false);
        lolito1.setVisible(true);
        rubius1.setVisible(true);
        vegetta1.setVisible(true);
        willyrex1.setVisible(true);
        luzu1.setVisible(true);
        SonidoPersonaje = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/auronplay.wav"));
        SonidoPersonaje.play();  
    }

    @FXML
    private void willyrex1abajo(MouseEvent event) {
        if((!fijado) && (!clickwillyrex)){
            willyrex1.setVisible(true);
            willyrex2.setVisible(false);
        }
    }

    @FXML
    private void willyrex1arriba(MouseEvent event) {
        if((!fijado) && (!clickwillyrex)){
            willyrex2.setVisible(true);
            willyrex1.setVisible(false);
        }
    }

    @FXML
    private void willyrex2abajo(MouseEvent event) {
        if((!fijado) && (!clickwillyrex)){
            willyrex1.setVisible(true);
            willyrex2.setVisible(false);
        }
    }

    @FXML
    private void willyrex2click(MouseEvent event) {
        conexionJugadores.getJugadores().get(numjugador).setSkin("Proyect/imagenes/willyrex.png");
        clickvegetta=false;
        clicklolito=false;
        clickrubius=false;
        clickauron=false;
        clickwillyrex=true;
        clickluzu=false;
        lolito2.setVisible(false);
        rubius2.setVisible(false);
        auron2.setVisible(false);
        vegetta2.setVisible(false);
        luzu2.setVisible(false);
        lolito1.setVisible(true);
        rubius1.setVisible(true);
        auron1.setVisible(true);
        vegetta1.setVisible(true);
        luzu1.setVisible(true);
        SonidoPersonaje = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/willyrex.wav"));
        SonidoPersonaje.play();   
    }

    @FXML
    private void luzu1abajo(MouseEvent event) {   
        if((!fijado) && (!clickluzu)){
            luzu1.setVisible(true);
            luzu2.setVisible(false);
        }
    }

    @FXML
    private void luzu1arriba(MouseEvent event) {
        if((!fijado) && (!clickluzu)){
            luzu2.setVisible(true);
            luzu1.setVisible(false);
        }
    }

    @FXML
    private void luzu2abajo(MouseEvent event) {
        if((!fijado) && (!clickluzu)){
            luzu1.setVisible(true);
            luzu2.setVisible(false);
        }
    }

    @FXML
    private void luzu2click(MouseEvent event) {
        conexionJugadores.getJugadores().get(numjugador).setSkin("Proyect/imagenes/luzu.png");
        clickvegetta=false;
        clicklolito=false;
        clickrubius=false;
        clickauron=false;
        clickwillyrex=false;
        clickluzu=true;
        lolito2.setVisible(false);
        rubius2.setVisible(false);
        auron2.setVisible(false);
        willyrex2.setVisible(false);
        vegetta2.setVisible(false);
        lolito1.setVisible(true);
        rubius1.setVisible(true);
        auron1.setVisible(true);
        willyrex1.setVisible(true);
        vegetta1.setVisible(true);
        SonidoPersonaje = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/luzu.wav"));
        SonidoPersonaje.play();   
    }

    @FXML
    private void willyrex2arriba(MouseEvent event) {
        if((!fijado) && (!clickwillyrex)){
            willyrex2.setVisible(true);
            willyrex1.setVisible(false);
        }
    }

    @FXML
    private void luzu2arriba(MouseEvent event) {
        if((!fijado) && (!clickluzu)){
            luzu2.setVisible(true);
            luzu1.setVisible(false);
        }
    }

    @FXML
    private void botlisto1abajo(MouseEvent event) {
        botlisto1.setVisible(true);
        botlisto2.setVisible(false);
    }

    @FXML
    private void botlisto1arriba(MouseEvent event) {
        botlisto1.setVisible(false);
        botlisto2.setVisible(true);
    }

    @FXML
    private void botlisto2abajo(MouseEvent event) {
        if(!fijado){
           botlisto1.setVisible(true);
           botlisto2.setVisible(false); 
        }
    }

    @FXML
    private void botlisto2arriba(MouseEvent event) {
        if(!fijado){
           botlisto1.setVisible(false);
           botlisto2.setVisible(true); 
        }
    }

    private int botlistoclick(){
        return 1;
    }
    
    @FXML
    private void botlistoclick(MouseEvent event) {
        /*
      if(nombre2.getText().equals("")){
        Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setHeaderText(null);
                    alert.setTitle("Se ha producido un error");
                    alert.setContentText("El juego debe empezar con mínimo 2 jugadores.");
                    alert.showAndWait();
                    return;  
      }  
        if(!Objects.equals(null, conexionJugadores.getJugadores().get(numjugador).getSkin())){     
            if(!fijado){
                          
                AudioClip SonidoBot = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/sonidolisto.wav"));
                SonidoBot.play();
                boolean alerta = false;
                if((clickvegetta && !(labvegetta.getText().equals(""))) || (clicklolito && !(lablolito.getText().equals(""))) || (clickwillyrex && !(labwilly.getText().equals(""))) || (clickauron && !(labauron.getText().equals(""))) || (clickrubius && !(labrubius.getText().equals(""))) || (clickluzu && !(labluzu.getText().equals(""))))
                    alerta = true;
                
                if(alerta){
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setHeaderText(null);
                    alert.setTitle("Error escogiendo personaje");
                    alert.setContentText("Este personaje ya se encuentra escogido");
                    alert.showAndWait();
                    return;
                }
                
                fijado=true;  
                conexionJugadores.getJugadores().get(numjugador).setListo(true); //El jugador esta listo
                
                if(clickvegetta)
                    labvegetta.setText(nombre);
                else if(clickwillyrex)
                    labwilly.setText(nombre);
                else if(clicklolito)
                    lablolito.setText(nombre);
                else if(clickauron)
                    labauron.setText(nombre);
                else if(clickrubius)
                    labrubius.setText(nombre);
                else
                    labluzu.setText(nombre);
                
                
                //ACTUALIZAR INFORMACION EN EL SERVIDOR
                Conexion paquete = new Conexion(8777);
                paquete.setJugadores(conexionJugadores.getJugadores());
                conexionJugadores.enviarActualizacion(paquete);
                
                Thread cerrarSala = new Thread(){
                    @Override
                    public void run(){
                        while(true){
                            if(todosListos(conexionJugadores.getJugadores())){
                                //AQUI IRA EL CODIGO DE PASAR AL TABLERO 
                                Parent tablero;
                                try {
                                    Thread.sleep(200);
                                    Platform.runLater(new Runnable(){
                                        @Override
                                        public void run(){
                                            Parent tablero;
                                            try {
                                                Cliente.setJugadores(conexionJugadores.getJugadores());
                                                tablero = FXMLLoader.load(getClass().getResource("Tablero.fxml"));
                                                Scene PanTablero = new Scene(tablero);
                                                Stage ventana = (Stage)((Node)event.getSource()).getScene().getWindow();
                                                ventana.setScene(PanTablero);
                                                ventana.setMaximized(true);
                                                ventana.setFullScreen(true);
                                                ventana.show();
                                                
                                                return;
                                            } catch (IOException ex) {
                                                System.out.println("AQUI EL ERROR Ah");
                                            }
                                            
                                        }
                                        
                                    });
                                } catch (InterruptedException ex) {
                                    System.out.println(ex);
                                }
                                return;
                            }
                        }
                    }
                };
                
                cerrarSala.setName("Hilo cerrar sala");
                cerrarSala.start();
                
        
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setTitle("Se ha producido un error");
            alert.setContentText("No puede jugar sin haber escogido un personaje");
            alert.showAndWait();
        }
        */
        Parent tablero;
                                            try {
                                                Cliente.setJugadores(conexionJugadores.getJugadores());
                                                tablero = FXMLLoader.load(getClass().getResource("Tablero.fxml"));
                                                Scene PanTablero = new Scene(tablero);
                                                Stage ventana = (Stage)((Node)event.getSource()).getScene().getWindow();
                                                ventana.setScene(PanTablero);
                                                ventana.setMaximized(true);
                                                ventana.setFullScreen(true);
                                                ventana.show();
                                                
                                                return;
                                            } catch (IOException ex) {
                                                System.out.println("AQUI EL ERROR Ah");
                                            }
        
    }
    
    private boolean todosListos(ArrayList<Player> lista){
        if(lista.size() < 2) return false;
        for(Player x: lista)
            if(!x.isListo())
                return false;
        return true;
    }   //retorna true si estan todos listos
    
    private int buscarJugador(String nombre, ArrayList<Player> jugadores){
        if(!Objects.equals(null, conexionJugadores.getJugadores()))
            for(int i = 0; i < jugadores.size(); i++)
                if(nombre.equals(jugadores.get(i).getNombre()))
                    return i;
        return -1;
    }   //retorna la posicion del juguador
    
    private void actualizarLabel(){
        int listos = 0, size = 0;
        Thread comprobarListos = new Thread(){
          @Override
          public void run(){
             actualizarListos(); 
          }  
        };
        comprobarListos.start();
        while(true){
            if(!Objects.equals(null, conexionJugadores.getJugadores())){
                try {
                    Thread.sleep(77);
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                if((size != conexionJugadores.getJugadores().size()) || (listos != actualListos)){
                    listos = actualListos;
                    size = conexionJugadores.getJugadores().size();
                    System.out.println("Listos: " + listos);
                    System.out.println("Size: " + size);
                    switch(size){
                        case 1:
                            Platform.runLater(new Runnable(){
                                @Override
                                public void run() {
                                    nombre1.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                    if(conexionJugadores.getJugadores().get(0).isListo()) {
                                        equis1.setVisible(false);
                                        chulito1.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                    }else equis1.setVisible(true);
                                }   
                            });
                            break;
                        case 2: 
                            Platform.runLater(new Runnable(){
                                @Override
                                public void run() {
                                    nombre1.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                    nombre2.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                    if(conexionJugadores.getJugadores().get(0).isListo()) {
                                        equis1.setVisible(false);
                                        chulito1.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                    }else equis1.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(1).isListo()){
                                        equis2.setVisible(false);
                                        chulito2.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                    }else equis2.setVisible(true);
                                }   
                            });
                            break;
                        case 3: 
                            Platform.runLater(new Runnable(){
                                @Override
                                public void run() {
                                    nombre1.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                    nombre2.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                    nombre3.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                    if(conexionJugadores.getJugadores().get(0).isListo()) {
                                        equis1.setVisible(false);
                                        chulito1.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                    }else equis1.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(1).isListo()){
                                        equis2.setVisible(false);
                                        chulito2.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                    }else equis2.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(2).isListo()) {
                                        equis3.setVisible(false);
                                        chulito3.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                    }else equis3.setVisible(true);
                                }   
                            });
                            break;
                        case 4: 
                            Platform.runLater(new Runnable(){
                                @Override
                                public void run() {
                                    nombre1.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                    nombre2.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                    nombre3.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                    nombre4.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                    if(conexionJugadores.getJugadores().get(0).isListo()) {
                                        equis1.setVisible(false);
                                        chulito1.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                    }else equis1.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(1).isListo()){
                                        equis2.setVisible(false);
                                        chulito2.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                    }else equis2.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(2).isListo()) {
                                        equis3.setVisible(false);
                                        chulito3.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                    }else equis3.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(3).isListo()) {
                                        equis4.setVisible(false);
                                        chulito4.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(3).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                        else if(conexionJugadores.getJugadores().get(3).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                        else if(conexionJugadores.getJugadores().get(3).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                        else if(conexionJugadores.getJugadores().get(3).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                        else if(conexionJugadores.getJugadores().get(3).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                    }else equis4.setVisible(true);
                                }   
                            });
                            break;
                        case 5: 
                            Platform.runLater(new Runnable(){
                                @Override
                                public void run() {
                                    nombre1.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                    nombre2.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                    nombre3.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                    nombre4.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                    nombre5.setText(conexionJugadores.getJugadores().get(4).getNombre());
                                    if(conexionJugadores.getJugadores().get(0).isListo()) {
                                        equis1.setVisible(false);
                                        chulito1.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                    }else equis1.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(1).isListo()){
                                        equis2.setVisible(false);
                                        chulito2.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                    }else equis2.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(2).isListo()) {
                                        equis3.setVisible(false);
                                        chulito3.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                    }else equis3.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(3).isListo()) {
                                        equis4.setVisible(false);
                                        chulito4.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(3).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                        else if(conexionJugadores.getJugadores().get(3).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                        else if(conexionJugadores.getJugadores().get(3).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                        else if(conexionJugadores.getJugadores().get(3).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                        else if(conexionJugadores.getJugadores().get(3).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                    }else equis4.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(4).isListo()) {
                                        equis5.setVisible(false);
                                        chulito5.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(4).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(4).getNombre());
                                        else if(conexionJugadores.getJugadores().get(4).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(4).getNombre());
                                        else if(conexionJugadores.getJugadores().get(4).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(4).getNombre());
                                        else if(conexionJugadores.getJugadores().get(4).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(4).getNombre());
                                        else if(conexionJugadores.getJugadores().get(4).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(4).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(4).getNombre());
                                    }else equis5.setVisible(true);
                                }   
                            });
                            break;
                        case 6: 
                            Platform.runLater(new Runnable(){
                                @Override
                                public void run() {
                                    nombre1.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                    nombre2.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                    nombre3.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                    nombre4.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                    nombre5.setText(conexionJugadores.getJugadores().get(4).getNombre());
                                    nombre6.setText(conexionJugadores.getJugadores().get(5).getNombre());
                                    if(conexionJugadores.getJugadores().get(0).isListo()) {
                                        equis1.setVisible(false);
                                        chulito1.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else if(conexionJugadores.getJugadores().get(0).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(0).getNombre());
                                    }else equis1.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(1).isListo()){
                                        equis2.setVisible(false);
                                        chulito2.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else if(conexionJugadores.getJugadores().get(1).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(1).getNombre());
                                    }else equis2.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(2).isListo()) {
                                        equis3.setVisible(false);
                                        chulito3.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else if(conexionJugadores.getJugadores().get(2).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(2).getNombre());
                                    }else equis3.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(3).isListo()) {
                                        equis4.setVisible(false);
                                        chulito4.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(3).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                        else if(conexionJugadores.getJugadores().get(3).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                        else if(conexionJugadores.getJugadores().get(3).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                        else if(conexionJugadores.getJugadores().get(3).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                        else if(conexionJugadores.getJugadores().get(3).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(3).getNombre());
                                    }else equis4.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(4).isListo()) {
                                        equis5.setVisible(false);
                                        chulito5.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(4).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(4).getNombre());
                                        else if(conexionJugadores.getJugadores().get(4).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(4).getNombre());
                                        else if(conexionJugadores.getJugadores().get(4).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(4).getNombre());
                                        else if(conexionJugadores.getJugadores().get(4).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(4).getNombre());
                                        else if(conexionJugadores.getJugadores().get(4).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(4).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(4).getNombre());
                                    }else equis5.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(5).isListo()) {
                                        equis6.setVisible(false);
                                        chulito6.setVisible(true);
                                        if(conexionJugadores.getJugadores().get(5).getSkin().equals("Proyect/imagenes/vegetta777.png"))
                                            labvegetta.setText(conexionJugadores.getJugadores().get(5).getNombre());
                                        else if(conexionJugadores.getJugadores().get(5).getSkin().equals("Proyect/imagenes/willyrex.png"))
                                            labwilly.setText(conexionJugadores.getJugadores().get(5).getNombre());
                                        else if(conexionJugadores.getJugadores().get(5).getSkin().equals("Proyect/imagenes/lolito.png"))
                                            lablolito.setText(conexionJugadores.getJugadores().get(5).getNombre());
                                        else if(conexionJugadores.getJugadores().get(5).getSkin().equals("Proyect/imagenes/auronplay.png"))
                                            labauron.setText(conexionJugadores.getJugadores().get(5).getNombre());
                                        else if(conexionJugadores.getJugadores().get(5).getSkin().equals("Proyect/imagenes/rubius.png"))
                                            labrubius.setText(conexionJugadores.getJugadores().get(5).getNombre());
                                        else 
                                            labluzu.setText(conexionJugadores.getJugadores().get(5).getNombre());
                                    }else equis6.setVisible(true);
                                }   
                            });
                            break;
                    }
                }
            }
        }
    }
    
    public void actualizarListos(){
        while(true){
            actualListos = 0; 
            if(!Objects.equals(null, conexionJugadores.getJugadores())){
                for(Player x: conexionJugadores.getJugadores())
                    if(x.isListo()) actualListos++;
                if(todosListos(conexionJugadores.getJugadores())) return;
            }
            try {
                Thread.sleep(77);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        
    }
    
}
