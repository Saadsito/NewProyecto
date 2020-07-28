
package proyect;

import java.applet.AudioClip;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


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
    private void vegetta2click(MouseEvent event) {
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
        conexionJugadores.getJugadores().get(numjugador).setSkin("Proyect/imagenes/auron.png");
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

    @FXML
    private void botlistoclick(MouseEvent event) {
        if(!Objects.equals(null, conexionJugadores.getJugadores().get(numjugador).getSkin())){     
            if(!fijado){
                AudioClip SonidoBot = java.applet.Applet.newAudioClip(getClass().getResource("/proyect/sounds/sonidolisto.wav"));
                SonidoBot.play();
                fijado=true;  
                conexionJugadores.getJugadores().get(numjugador).setListo(true); //El jugador esta listo
                System.out.println("numjugador = " + numjugador);
                
                
                
                //ACTUALIZAR INFORMACION EN EL SERVIDOR
                Conexion paquete = new Conexion(8777);
                paquete.setJugadores(conexionJugadores.getJugadores());
                conexionJugadores.enviarActualizacion(paquete);
                
                if(conexionJugadores.getJugadores().size() > 1 && todosListos(conexionJugadores.getJugadores())){
                    
                    //AQUI IRA EL CODIGO DE PASAR AL TABLERO 
                }
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Se ha producido un error");
            alert.setContentText("No puede jugar sin haber escogido un personaje");
            alert.showAndWait();
        }
        
        
    }
    
    private boolean todosListos(ArrayList<Player> lista){
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
                                    }else equis1.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(1).isListo()){
                                        equis2.setVisible(false);
                                        chulito2.setVisible(true);
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
                                    }else equis1.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(1).isListo()){
                                        equis2.setVisible(false);
                                        chulito2.setVisible(true);
                                    }else equis2.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(2).isListo()) {
                                        equis3.setVisible(false);
                                        chulito3.setVisible(true);
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
                                    }else equis1.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(1).isListo()){
                                        equis2.setVisible(false);
                                        chulito2.setVisible(true);
                                    }else equis2.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(2).isListo()) {
                                        equis3.setVisible(false);
                                        chulito3.setVisible(true);
                                    }else equis3.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(3).isListo()) {
                                        equis4.setVisible(false);
                                        chulito4.setVisible(true);
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
                                    }else equis1.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(1).isListo()){
                                        equis2.setVisible(false);
                                        chulito2.setVisible(true);
                                    }else equis2.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(2).isListo()) {
                                        equis3.setVisible(false);
                                        chulito3.setVisible(true);
                                    }else equis3.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(3).isListo()) {
                                        equis4.setVisible(false);
                                        chulito4.setVisible(true);
                                    }else equis4.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(4).isListo()) {
                                        equis5.setVisible(false);
                                        chulito5.setVisible(true);
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
                                    }else equis1.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(1).isListo()){
                                        equis2.setVisible(false);
                                        chulito2.setVisible(true);
                                    }else equis2.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(2).isListo()) {
                                        equis3.setVisible(false);
                                        chulito3.setVisible(true);
                                    }else equis3.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(3).isListo()) {
                                        equis4.setVisible(false);
                                        chulito4.setVisible(true);
                                    }else equis4.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(4).isListo()) {
                                        equis5.setVisible(false);
                                        chulito5.setVisible(true);
                                    }else equis5.setVisible(true);
                                    
                                    if(conexionJugadores.getJugadores().get(5).isListo()) {
                                        equis6.setVisible(false);
                                        chulito6.setVisible(true);
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
