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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import static javafx.scene.paint.Color.color;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
    private ImageView inv1 = new ImageView();
    @FXML
    private ImageView inv2 = new ImageView();
    @FXML
    private ImageView inv3 = new ImageView();
    @FXML
    private ImageView inv4 = new ImageView();
    @FXML
    private ImageView inv5 = new ImageView();
    @FXML
    private ImageView inv6 = new ImageView();
    @FXML
    private ImageView inv7 = new ImageView();
    @FXML
    private ImageView inv8 = new ImageView();
        
    @FXML
    private ImageView dado = new ImageView(new Image("Proyect/imagenes/dadocomienza.png"));
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

    //Se necesita crear bestias ,1 ,2 ,3...
    
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
    private int nbestia,tienda = 1;
    
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
    
    ImageView ficha, fichaB;
    
    int tradeo[] = {0,0,0,0,0,0,0,0};
        
    private int casillas[][] = { {0,0,0} , {2,5,5} , {1,45,5} , {1,85,5} , {1,125,5} , {1,165,5} , {1,205,5} , {1,205,45} , {1,205,85} , {1,205,125} , {1,205,165} , {1,45,45} , {2,45,85} , {1,45,125} , {1,45,165} , {1,85,165} , {1,125,165} , {2,165,165} , {1,125,45} , {1,125,205} , {1,125,245} , {3,125,285} , {1,125,325} , {1,125,365} , {4,125,405} , {1,125,445} , {1,45,485} , {1,165,485} , {1,125,485} , {1,205,485} , {4,245,445} , {1,85,485} , {5,85,525} , {1,85,565} , {1,85,605} , {1,125,645} , {2,165,645} , {1,125,565} , {1,205,645} , {1,245,645} , {1,245,565} , {1,245,525} , {1,245,485} , {1,245,405} , {1,285,405} , {7,325,405} , {1,325,365} , {1,245,605} , {1,285,565} , {4,325,565} , {1,365,565} , {5,325,325} , {1,325,285} , {1,325,245} , {6,325,205} , {1,325,165} , {1,325,125} , {4,325,85} , {6,85,645} , {1,365,85} , {1,405,85} , {1,445,85} , {1,445,45} , {6,445,5} , {1,445,125} , {1,445,165} , {2,485,165} , {1,485,5} , {1,525,5} , {1,565,5} , {1,605,5} , {1,645,5} , {1,605,45} , {1,605,85} , {1,565,85} , {1,605,125} , {1,605,165} , {1,565,165} , {1,525,165} , {5,645,85} , {7,685,85} , {1,725,85} , {1,765,85} , {4,805,85} , {1,845,85} , {1,885,85} , {1,885,45} , {2,885,5} , {1,1045,85} , {1,1045,45} , {6,1045,5} , {1,1005,5} , {1,965,5} , {1,925,5} , {1,965,45} , {1,1045,125} , {1,1045,165} , {1,1085,165} , {1,1005,165} , {1,885,125} , {5,885,165} , {1,925,165} , {1,965,165} , {1,965,205} , {7,965,245} , {1,965,285} , {1,965,325} , {1,925,325} , {6,885,325} , {1,1005,325} , {1,1045,325} , {1,1085,325} , {1,1045,365} , {1,1045,405} , {2,1045,445} , {1,1045,485} , {1,1005,405} , {1,885,365} , {1,885,405} , {5,885,445} , {1,885,485} , {1,925,485} , {1,965,485} , {1,1005,485} , {1,1005,525} , {4,1005,565} , {1,1005,605} , {1,965,605} , {6,925,605} , {1,885,605} , {1,845,605} , {1,405,565} , {1,405,525} , {6,405,485} , {1,405,605} , {1,405,645} , {1,365,645} , {1,445,485} , {1,485,485} , {1,525,485} , {1,565,485} , {5,445,645} , {1,485,645} , {1,525,645} , {1,565,525} , {2,565,645} , {1,565,565} , {1,565,605} , {1,485,605} , {1,605,605} , {1,685,605} , {7,645,605} , {2,365,325} , {1,405,325} , {6,445,325} , {1,485,325} , {1,525,325} , {1,565,325} , {1,605,325} , {1,645,325} , {1,765,325} , {7,685,325} , {4,725,325} , {1,765,365} , {2,765,405} , {1,765,445} , {1,765,485} , {1,765,525} , {8,485,285} , {9,125,85} , {14,525,85} , {10,165,565} , {11,485,565} , {12,965,405} , {13,965,85} , {0,0,0} , {0,0,0} , {0,0,0} , {0,765,605} };
    private int tab[][] = { {  1,  2,  3,  4,  5,  6, -1, -1, -1, -1, -1, 63, 67, 68, 69, 70, 71, -1, -1, -1, -1, -1, 87, 93, 92, 91, 90, -1} , 
                        { -1, 11, -1, 18, -1,  7, -1, -1, -1, -1, -1, 62, -1, -1, -1, 72, -1, -1, -1, -1, -1, -1, 86, -1, 94, -1, 89, -1} , 
                        { -1, 12, -1,169, -1,  8, -1, -1, 57, 59, 60, 61, -1,170, 74, 73, 79, 80, 81, 82, 83, 84, 85, -1,174, -1, 88, -1} ,
                        { -1, 13, -1, -1, -1,  9, -1, -1, 56, -1, -1, 64, -1, -1, -1, 75, -1, -1, -1, -1, -1, -1, 99, -1, -1, -1, 95, -1} , 
                        { -1, 14, 15, 16, 17, 10, -1, -1, 55, -1, -1, 65, 66, 78, 77, 76, -1, -1, -1, -1, -1, -1,100,101,102, 98, 96, 97} ,
                        { -1, -1, -1, 19, -1, -1, -1, -1, 54, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,103, -1, -1, -1} , 
                        { -1, -1, -1, 20, -1, -1, -1, -1, 53, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,104, -1, -1, -1} , 
                        { -1, -1, -1, 21, -1, -1, -1, -1, 52, -1, -1, -1,168, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,105, -1, -1, -1} , 
                        { -1, -1, -1, 22, -1, -1, -1, -1, 51,152,153,154,155,156,157,158,159,161,162,160, -1, -1,108,107,106,109,110,111} , 
                        { -1, -1, -1, 23, -1, -1, -1, -1, 46, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,163, -1, -1,117, -1, -1, -1,112, -1} ,  
                        { -1, -1, -1, 24, -1, -1, 43, 44, 45, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,164, -1, -1,118, -1,173,116,113, -1} , 
                        { -1, -1, -1, 25, -1, -1, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,165, -1, -1,119, -1, -1, -1,114, -1} , 
                        { -1, 26, 31, 28, 27, 29, 42, -1, -1, -1,133,137,138,139,140, -1, -1, -1, -1,166, -1, -1,120,121,122,123,115, -1} , 
                        { -1, -1, 32, -1, -1, -1, 41, -1, -1, -1,132, -1, -1, -1,144, -1, -1, -1, -1,167, -1, -1, -1, -1, -1,124, -1, -1} , 
                        { -1, -1, 33, 37,171, -1, 40, 48, 49, 50,131, -1,172, -1,146, -1, -1, -1,  -1,  175,  -1, -1, -1, -1, -1,125, -1, -1} ,                                   
                        { -1, -1, 34, -1, -1, -1, 47, -1, -1, -1,134, -1,148, -1,147,149,151,150,  176,  178,  177,130,129,128,127,126, -1, -1} , 
                        { -1, -1, 58, 35, 36, 38, 39, -1, -1,136,135,141,142,143,145, -1, -1, -1,  -1,  -1,  -1, -1, -1, -1, -1, -1, -1, -1} };
    
    private ColorAdjust color, blancoynegro;
    private int maxTurno = 0, numeroJugador;
    @FXML
    private ImageView cBruja = new ImageView();
    @FXML
    private ImageView cCreeper = new ImageView();
    @FXML
    private ImageView cGhast = new ImageView();
    @FXML
    private ImageView cSkeleton = new ImageView();
    @FXML
    private ImageView cZombie = new ImageView();
    @FXML
    private ImageView cSpider = new ImageView();
    @FXML
    private ImageView posib6;
    @FXML
    private ImageView posib7;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cSpider.setImage(new Image("Proyect/imagenes/cabspider.png"));
        cBruja.setImage(new Image("Proyect/imagenes/cabbruja.png"));
        cCreeper.setImage(new Image("Proyect/imagenes/cabcreeper.png"));
        cSkeleton.setImage(new Image("Proyect/imagenes/cabskeleton.png"));
        cZombie.setImage(new Image("Proyect/imagenes/cabzombie.png"));
        cGhast.setImage(new Image("Proyect/imagenes/cabghast.png"));
        
         
        for(int i = 0; i < (jugadores.size() - 1); i++){
            if(Cliente.getNombre().equals(jugadores.get(i).getNombre())){
                numeroJugador = i;
                break;
            }
        }
        
        
        blancoynegro = new ColorAdjust();
        blancoynegro.setSaturation(-1.0);
        
        color = new ColorAdjust();
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
        
        Thread inventarios = new Thread(juego);
        inventarios.setName("Hilo actualiza inventarios");
        inventarios.start();
        
        Thread update = new Thread(this);
        update.setName("Hilo Update");
        update.start();
        
    }   
    
    private void enviarPaquete(Packet paquete){
        try {
            Socket socket = new Socket(Conexion.getIpServer(), 7700);
            
            ObjectOutputStream flujo = new ObjectOutputStream(socket.getOutputStream());
            flujo.writeObject(paquete);
            flujo.close();
            socket.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    @FXML
    private void clickposib1(MouseEvent event) {
        if (ficha.getLayoutX() == 485 && ficha.getLayoutY() == 285){
            tienda1.setEffect(blancoynegro);
            tienda2.setEffect(blancoynegro);
            tienda3.setEffect(blancoynegro);
        }
        int x = (int) posib1.getLayoutX();
        int y = (int) posib1.getLayoutY();
        enviarPaquete(new Packet( x, y, juego.numPlayer));
        posib1.setVisible(false);
        posib2.setVisible(false);
        posib3.setVisible(false);
        posib4.setVisible(false);
        posib5.setVisible(false);
        posib6.setVisible(false);
        posib7.setVisible(false);
        llegada(obtenerNum(x,y, casillas, tab));
        enviarPaquete(new Packet(juego.estadoEspeciales));
        actualizarInventario(new Inventario(jugadores.get(juego.numPlayer).getInventario().getArrayInventario(), juego.numPlayer));
        
        if(maxTurno < 2) enviarPaquete(new Packet(juego.numPlayer, 0, numdado, nbestia, null, juego.primerTiro));
    }

    @FXML
    private void clickposib3(MouseEvent event) {
        if (ficha.getLayoutX() == 485 && ficha.getLayoutY() == 285){
            tienda1.setEffect(blancoynegro);
            tienda2.setEffect(blancoynegro);
            tienda3.setEffect(blancoynegro);
        }
        int x = (int) posib3.getLayoutX();
        int y = (int) posib3.getLayoutY();
        enviarPaquete(new Packet( x, y, juego.numPlayer));
        posib1.setVisible(false);
        posib2.setVisible(false);
        posib3.setVisible(false);
        posib4.setVisible(false);
        posib5.setVisible(false);
        posib6.setVisible(false);
        posib7.setVisible(false);
        llegada(obtenerNum(x,y, casillas, tab));
        enviarPaquete(new Packet(juego.estadoEspeciales));
        actualizarInventario(new Inventario(jugadores.get(juego.numPlayer).getInventario().getArrayInventario(), juego.numPlayer));
        if(maxTurno < 2) enviarPaquete(new Packet(juego.numPlayer, 0, numdado, nbestia, null, juego.primerTiro));
    }

    @FXML
    private void clickposib2(MouseEvent event) {
        if (ficha.getLayoutX() == 485 && ficha.getLayoutY() == 285){
            tienda1.setEffect(blancoynegro);
            tienda2.setEffect(blancoynegro);
            tienda3.setEffect(blancoynegro);
        }
        int x = (int) posib2.getLayoutX();
        int y = (int) posib2.getLayoutY();
        enviarPaquete(new Packet( x, y, juego.numPlayer));
        posib1.setVisible(false);
        posib2.setVisible(false);
        posib3.setVisible(false);
        posib4.setVisible(false);
        posib5.setVisible(false);
        posib6.setVisible(false);
        posib7.setVisible(false);
        llegada(obtenerNum(x,y, casillas, tab));
        enviarPaquete(new Packet(juego.estadoEspeciales));
        actualizarInventario(new Inventario(jugadores.get(juego.numPlayer).getInventario().getArrayInventario(), juego.numPlayer));
        if(maxTurno < 2) enviarPaquete(new Packet(juego.numPlayer, 0, numdado, nbestia, null, juego.primerTiro));
    }

    @FXML
    private void clickposib4(MouseEvent event) {
        if (ficha.getLayoutX() == 485 && ficha.getLayoutY() == 285){
            tienda1.setEffect(blancoynegro);
            tienda2.setEffect(blancoynegro);
            tienda3.setEffect(blancoynegro);
        }
        int x = (int) posib4.getLayoutX();
        int y = (int) posib4.getLayoutY();
        enviarPaquete(new Packet( x, y, juego.numPlayer));
        posib1.setVisible(false);
        posib2.setVisible(false);
        posib3.setVisible(false);
        posib4.setVisible(false);
        posib5.setVisible(false);
        posib6.setVisible(false);
        posib7.setVisible(false);
        llegada(obtenerNum(x,y, casillas, tab));
        enviarPaquete(new Packet(juego.estadoEspeciales));
        actualizarInventario(new Inventario(jugadores.get(juego.numPlayer).getInventario().getArrayInventario(), juego.numPlayer));
        if(maxTurno < 2) enviarPaquete(new Packet(juego.numPlayer, 0, numdado, nbestia, null, juego.primerTiro));
    }

    @FXML
    private void clickposib5(MouseEvent event) {
        if (ficha.getLayoutX() == 485 && ficha.getLayoutY() == 285){
            tienda1.setEffect(blancoynegro);
            tienda2.setEffect(blancoynegro);
            tienda3.setEffect(blancoynegro);
        }
        int x = (int) posib5.getLayoutX();
        int y = (int) posib5.getLayoutY();
        enviarPaquete(new Packet( x, y, juego.numPlayer));
        posib1.setVisible(false);
        posib2.setVisible(false);
        posib3.setVisible(false);
        posib4.setVisible(false);
        posib5.setVisible(false);
        posib6.setVisible(false);
        posib7.setVisible(false);
        llegada(obtenerNum(x,y, casillas, tab));
        enviarPaquete(new Packet(juego.estadoEspeciales));
        actualizarInventario(new Inventario(jugadores.get(juego.numPlayer).getInventario().getArrayInventario(), juego.numPlayer));
        if(maxTurno < 2) enviarPaquete(new Packet(juego.numPlayer, 0, numdado, nbestia, null, juego.primerTiro));
    }

    @FXML
    private void clicklapiznegro(MouseEvent event) {
        if(Objects.equals(fichainv.getImage(), new Image(jugadores.get(numeroJugador).getSkin()))){
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
            try {
                numdado = (int)(Math.floor(Math.random() * 6) + 1);
                nbestia = (int) (Math.floor(Math.random() * 6) + 1);
                Socket socket = new Socket(Conexion.getIpServer(), 7700);
                System.out.println("Enviando Informacion oks?");
                //Envia informacion actualizada al servidor
                Packet paquete = new Packet(juego.numPlayer, 0, numdado, 0, null, juego.primerTiro);
                ObjectOutputStream flujo = new ObjectOutputStream(socket.getOutputStream());
                flujo.writeObject(paquete);
                flujo.close();
                socket.close();
                
                juego.tiro = true;
                juego.primerTiro = false;
                
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
    
    private Timeline animacionBestia(int num){
        Timeline t = new Timeline();
        t.setCycleCount(3);
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(0),
                (ActionEvent event) -> {
                    cZombie.setVisible(true);
                    cSkeleton.setVisible(false);
                    cBruja.setVisible(false);
                    cGhast.setVisible(false);
                    cSpider.setVisible(false);
                    cCreeper.setVisible(false);
                }
        ));
        
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(200),
                (ActionEvent event) -> {
                    cZombie.setVisible(false);
                    cSkeleton.setVisible(true);
                    cBruja.setVisible(false);
                    cGhast.setVisible(false);
                    cSpider.setVisible(false);
                    cCreeper.setVisible(false);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(400),
                (ActionEvent event) -> {
                    cZombie.setVisible(false);
                    cSkeleton.setVisible(false);
                    cBruja.setVisible(true);
                    cGhast.setVisible(false);
                    cSpider.setVisible(false);
                    cCreeper.setVisible(false);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(600),
                (ActionEvent event) -> {
                    cZombie.setVisible(false);
                    cSkeleton.setVisible(false);
                    cBruja.setVisible(false);
                    cGhast.setVisible(true);
                    cSpider.setVisible(false);
                    cCreeper.setVisible(false);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(800),
                (ActionEvent event) -> {
                    cZombie.setVisible(false);
                    cSkeleton.setVisible(false);
                    cBruja.setVisible(false);
                    cGhast.setVisible(false);
                    cSpider.setVisible(true);
                    cCreeper.setVisible(false);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1000),
                (ActionEvent event) -> {
                    cZombie.setVisible(false);
                    cSkeleton.setVisible(false);
                    cBruja.setVisible(false);
                    cGhast.setVisible(false);
                    cSpider.setVisible(false);
                    cCreeper.setVisible(true);
                }
        )); 
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1200),
                (ActionEvent event) -> {
                    
                    switch(num){
                        case 1:
                            cZombie.setVisible(true);
                            cSkeleton.setVisible(false);
                            cBruja.setVisible(false);
                            cGhast.setVisible(false);
                            cSpider.setVisible(false);
                            cCreeper.setVisible(false);
                            break;
                            
                        case 2:
                            cZombie.setVisible(false);
                            cSkeleton.setVisible(true);
                            cBruja.setVisible(false);
                            cGhast.setVisible(false);
                            cSpider.setVisible(false);
                            cCreeper.setVisible(false);
                            break;
                            
                        case 3:
                            cZombie.setVisible(false);
                            cSkeleton.setVisible(false);
                            cBruja.setVisible(true);
                            cGhast.setVisible(false);
                            cSpider.setVisible(false);
                            cCreeper.setVisible(false);
                            break;
                          
                        case 4:
                            cZombie.setVisible(false);
                            cSkeleton.setVisible(false);
                            cBruja.setVisible(false);
                            cGhast.setVisible(true);
                            cSpider.setVisible(false);
                            cCreeper.setVisible(false);
                            break;
                          
                        case 5:
                            cZombie.setVisible(false);
                            cSkeleton.setVisible(false);
                            cBruja.setVisible(false);
                            cGhast.setVisible(false);
                            cSpider.setVisible(true);
                            cCreeper.setVisible(false);
                            break;
                          
                        case 6:
                            cZombie.setVisible(false);
                            cSkeleton.setVisible(false);
                            cBruja.setVisible(false);
                            cGhast.setVisible(false);
                            cSpider.setVisible(false);
                            cCreeper.setVisible(true);
                            break;
                            
                    }
                }
        ));
        
        return t;
    }
    
    private void meterEnInventario(Image image){
                if(Objects.equals(null, inv1.getImage())){
                    inv1.setImage(image);
                }
                else if(Objects.equals(null, inv2.getImage())) {
                    inv2.setImage(image);
                }
                else if(Objects.equals(null, inv3.getImage())){
                    inv3.setImage(image);
                }
                else if(Objects.equals(null, inv4.getImage())) {
                    inv4.setImage(image);
                }
                else if(Objects.equals(null, inv5.getImage())) {
                    inv5.setImage(image);
                }
                else if(Objects.equals(null, inv6.getImage())) {
                    inv6.setImage(image);
                }
                else if(Objects.equals(null, inv7.getImage())) {
                    inv7.setImage(image);
                }
                else if(Objects.equals(null, inv8.getImage())) {
                    inv8.setImage(image);
                }
                
            
            
        
    } 
    
    @FXML
    private void ficha1arriba(MouseEvent event) {
        inv1.setImage(null);
        inv2.setImage(null);
        inv3.setImage(null);
        inv4.setImage(null);
        inv5.setImage(null);
        inv6.setImage(null);
        inv7.setImage(null);
        inv8.setImage(null);
        cascoinv.setImage(null);
        petoinv.setImage(null);
        pantaloninv.setImage(null);
        botasinv.setImage(null);
        espadainv.setImage(null);
        lapiznegro.setVisible(true);
        lapizamarillo.setVisible(false);
        equisinv1.setVisible(false);
        equisinv2.setVisible(false);
        equisinv3.setVisible(false);
        equisinv4.setVisible(false);
        equisinv5.setVisible(false);
        equisinv6.setVisible(false);
        equisinv7.setVisible(false);
        equisinv8.setVisible(false);
        marco1.setVisible(false);
        marco2.setVisible(false);
        marco3.setVisible(false);
        marco4.setVisible(false);
        marco5.setVisible(false);
        marco6.setVisible(false);
        marco7.setVisible(false);
        marco8.setVisible(false);
        updateInventario(0);
    }

    @FXML
    private void ficha2arriba(MouseEvent event) {
        inv1.setImage(null);
        inv2.setImage(null);
        inv3.setImage(null);
        inv4.setImage(null);
        inv5.setImage(null);
        inv6.setImage(null);
        inv7.setImage(null);
        inv8.setImage(null);
        cascoinv.setImage(null);
        petoinv.setImage(null);
        pantaloninv.setImage(null);
        botasinv.setImage(null);
        espadainv.setImage(null);
        lapiznegro.setVisible(true);
        lapizamarillo.setVisible(false);
        equisinv1.setVisible(false);
        equisinv2.setVisible(false);
        equisinv3.setVisible(false);
        equisinv4.setVisible(false);
        equisinv5.setVisible(false);
        equisinv6.setVisible(false);
        equisinv7.setVisible(false);
        equisinv8.setVisible(false);
        marco1.setVisible(false);
        marco2.setVisible(false);
        marco3.setVisible(false);
        marco4.setVisible(false);
        marco5.setVisible(false);
        marco6.setVisible(false);
        marco7.setVisible(false);
        marco8.setVisible(false);
        updateInventario(1);
    }

    @FXML
    private void ficha3arriba(MouseEvent event) {
        inv1.setImage(null);
        inv2.setImage(null);
        inv3.setImage(null);
        inv4.setImage(null);
        inv5.setImage(null);
        inv6.setImage(null);
        inv7.setImage(null);
        inv8.setImage(null);
        cascoinv.setImage(null);
        petoinv.setImage(null);
        pantaloninv.setImage(null);
        botasinv.setImage(null);
        espadainv.setImage(null);
        lapiznegro.setVisible(true);
        lapizamarillo.setVisible(false);
        equisinv1.setVisible(false);
        equisinv2.setVisible(false);
        equisinv3.setVisible(false);
        equisinv4.setVisible(false);
        equisinv5.setVisible(false);
        equisinv6.setVisible(false);
        equisinv7.setVisible(false);
        equisinv8.setVisible(false);
        marco1.setVisible(false);
        marco2.setVisible(false);
        marco3.setVisible(false);
        marco4.setVisible(false);
        marco5.setVisible(false);
        marco6.setVisible(false);
        marco7.setVisible(false);
        marco8.setVisible(false);
        updateInventario(2);
    }

    @FXML
    private void ficha4arriba(MouseEvent event) {
        inv1.setImage(null);
        inv2.setImage(null);
        inv3.setImage(null);
        inv4.setImage(null);
        inv5.setImage(null);
        inv6.setImage(null);
        inv7.setImage(null);
        inv8.setImage(null);
        cascoinv.setImage(null);
        petoinv.setImage(null);
        pantaloninv.setImage(null);
        botasinv.setImage(null);
        espadainv.setImage(null);
        lapiznegro.setVisible(true);
        lapizamarillo.setVisible(false);
        equisinv1.setVisible(false);
        equisinv2.setVisible(false);
        equisinv3.setVisible(false);
        equisinv4.setVisible(false);
        equisinv5.setVisible(false);
        equisinv6.setVisible(false);
        equisinv7.setVisible(false);
        equisinv8.setVisible(false);
        marco1.setVisible(false);
        marco2.setVisible(false);
        marco3.setVisible(false);
        marco4.setVisible(false);
        marco5.setVisible(false);
        marco6.setVisible(false);
        marco7.setVisible(false);
        marco8.setVisible(false);
        updateInventario(3);
    }

    @FXML
    private void ficha5arriba(MouseEvent event) {
        inv1.setImage(null);
        inv2.setImage(null);
        inv3.setImage(null);
        inv4.setImage(null);
        inv5.setImage(null);
        inv6.setImage(null);
        inv7.setImage(null);
        inv8.setImage(null);
        cascoinv.setImage(null);
        petoinv.setImage(null);
        pantaloninv.setImage(null);
        botasinv.setImage(null);
        espadainv.setImage(null);
        lapiznegro.setVisible(true);
        lapizamarillo.setVisible(false);
        equisinv1.setVisible(false);
        equisinv2.setVisible(false);
        equisinv3.setVisible(false);
        equisinv4.setVisible(false);
        equisinv5.setVisible(false);
        equisinv6.setVisible(false);
        equisinv7.setVisible(false);
        equisinv8.setVisible(false);
        marco1.setVisible(false);
        marco2.setVisible(false);
        marco3.setVisible(false);
        marco4.setVisible(false);
        marco5.setVisible(false);
        marco6.setVisible(false);
        marco7.setVisible(false);
        marco8.setVisible(false);
        updateInventario(4);
    }
    
    @FXML
    private void ficha6arriba(MouseEvent event) {
        inv1.setImage(null);
        inv2.setImage(null);
        inv3.setImage(null);
        inv4.setImage(null);
        inv5.setImage(null);
        inv6.setImage(null);
        inv7.setImage(null);
        inv8.setImage(null);
        cascoinv.setImage(null);
        petoinv.setImage(null);
        pantaloninv.setImage(null);
        botasinv.setImage(null);
        espadainv.setImage(null);
        lapiznegro.setVisible(true);
        lapizamarillo.setVisible(false);
        equisinv1.setVisible(false);
        equisinv2.setVisible(false);
        equisinv3.setVisible(false);
        equisinv4.setVisible(false);
        equisinv5.setVisible(false);
        equisinv6.setVisible(false);
        equisinv7.setVisible(false);
        equisinv8.setVisible(false);
        marco1.setVisible(false);
        marco2.setVisible(false);
        marco3.setVisible(false);
        marco4.setVisible(false);
        marco5.setVisible(false);
        marco6.setVisible(false);
        marco7.setVisible(false);
        marco8.setVisible(false);
        updateInventario(5);
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
            fichainv.setVisible(false);
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
            fichainv.setVisible(true);
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
    private void finalizaTurnoclick(MouseEvent  event) {
        if(juego.tiro){
            
            if(juego.numPlayer + 1 > jugadores.size() - 1) juego.numPlayer = 0;
            else juego.numPlayer++;

            try {
                Socket socket = new Socket(Conexion.getIpServer(), 7700);
                Packet paquete = new Packet(juego.numPlayer, 0, 0, 0, null, juego.primerTiro);
                
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
                
                switch(paquete.getNumPlayer()){
                    case 0: 
                        ficha = ficha1;
                        break;
                    case 1: 
                        ficha = ficha2;
                        break;
                    case 2: 
                        ficha = ficha3;
                        break;
                    case 3: 
                        ficha = ficha4;
                        break;
                    case 4: 
                        ficha = ficha5;
                        break;
                    default: 
                        ficha = ficha6;
                }
                
                switch(paquete.getNbestia()){
                    case 1: 
                        fichaB = zombie;
                        break;
                    case 2: 
                        fichaB = skeleton;
                        break;
                    case 3: 
                        fichaB = bruja;
                        break;
                    case 4: 
                        fichaB = ghast;
                        break;
                    case 5: 
                        fichaB = spider;
                        break;
                    default: 
                        fichaB = creeper;
                }
                
                
                
                if(paquete.isPrimerTiro()){
                                
                    ficha.setLayoutX(765);
                    ficha.setLayoutY(605);
                }
                
                if(paquete.getDadoaux() == 0 && Objects.equals(null, paquete.getEstadoEspeciales()) && paquete.getX() == 0){   //si presiona finalizar turno
                    maxTurno = 0;
                    jugadores.get(juego.numPlayer).setTurno(false);
                    juego.tiro = false;
                    juego.numPlayer = paquete.getNumPlayer();
                    jugadores.get(juego.numPlayer).setTurno(true);
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
                            cCreeper.setVisible(false);
                            cZombie.setVisible(false);
                            cSpider.setVisible(false);
                            cBruja.setVisible(false);
                            cGhast.setVisible(false);
                            cSkeleton.setVisible(false);
                            nombreturno.setText(jugadores.get(juego.numPlayer).getNombre());
                            
                        }
                    });
                    
                }else if(paquete.getDadoaux() != 0 && paquete.getNbestia() == 0){                                  //si tira el dado
                    //Sprite del dado
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
                    
                    
                    //Movimiento del jugador y bestia
                    if(Cliente.getNombre().equals(nombreturno.getText())){
                        
                        Thread.sleep(7000);
                        
                        ArrayList<Integer> vector = new ArrayList<>();
                        
                        
                        
                        //Movimiento jugador
                        if(ficha.getLayoutX() == 765 && ficha.getLayoutY() == 605) paquete.setDadoaux(paquete.getDadoaux() + 1);
                        
                        posibilidades(obtenerI(obtenerNum((int)ficha.getLayoutX(),(int)ficha.getLayoutY(),casillas,tab)),obtenerJ(obtenerNum((int)ficha.getLayoutX(),(int)ficha.getLayoutY(),casillas,tab)),paquete.getDadoaux(),tab,vector);

                      
                        
                        Platform.runLater(new Runnable(){
                            @Override
                            public void run() {

                                switch(vector.size()){
                                    case 1: 
                                        posib1.setVisible(true);
                                        posib1.setLayoutX(casillas[vector.get(0)][1]);
                                        posib1.setLayoutY(casillas[vector.get(0)][2]);
                                        break;

                                    case 2: 
                                        posib1.setVisible(true);
                                        posib1.setLayoutX(casillas[vector.get(0)][1]);
                                        posib1.setLayoutY(casillas[vector.get(0)][2]);

                                        posib2.setVisible(true);
                                        posib2.setLayoutX(casillas[vector.get(1)][1]);
                                        posib2.setLayoutY(casillas[vector.get(1)][2]);
                                        break;

                                    case 3: 
                                        posib1.setVisible(true);
                                        posib1.setLayoutX(casillas[vector.get(0)][1]);
                                        posib1.setLayoutY(casillas[vector.get(0)][2]);

                                        posib2.setVisible(true);
                                        posib2.setLayoutX(casillas[vector.get(1)][1]);
                                        posib2.setLayoutY(casillas[vector.get(1)][2]);

                                        posib3.setVisible(true);
                                        posib3.setLayoutX(casillas[vector.get(2)][1]);
                                        posib3.setLayoutY(casillas[vector.get(2)][2]);
                                        break; 

                                    case 4:
                                        posib1.setVisible(true);
                                        posib1.setLayoutX(casillas[vector.get(0)][1]);
                                        posib1.setLayoutY(casillas[vector.get(0)][2]);

                                        posib2.setVisible(true);
                                        posib2.setLayoutX(casillas[vector.get(1)][1]);
                                        posib2.setLayoutY(casillas[vector.get(1)][2]);

                                        posib3.setVisible(true);
                                        posib3.setLayoutX(casillas[vector.get(2)][1]);
                                        posib3.setLayoutY(casillas[vector.get(2)][2]);

                                        posib4.setVisible(true);
                                        posib4.setLayoutX(casillas[vector.get(3)][1]);
                                        posib4.setLayoutY(casillas[vector.get(3)][2]);
                                        break;

                                    case 5:
                                        posib1.setVisible(true);
                                        posib1.setLayoutX(casillas[vector.get(0)][1]);
                                        posib1.setLayoutY(casillas[vector.get(0)][2]);

                                        posib2.setVisible(true);
                                        posib2.setLayoutX(casillas[vector.get(1)][1]);
                                        posib2.setLayoutY(casillas[vector.get(1)][2]);

                                        posib3.setVisible(true);
                                        posib3.setLayoutX(casillas[vector.get(2)][1]);
                                        posib3.setLayoutY(casillas[vector.get(2)][2]);

                                        posib4.setVisible(true);
                                        posib4.setLayoutX(casillas[vector.get(3)][1]);
                                        posib4.setLayoutY(casillas[vector.get(3)][2]);

                                        posib5.setVisible(true);
                                        posib5.setLayoutX(casillas[vector.get(4)][1]);
                                        posib5.setLayoutY(casillas[vector.get(4)][2]);
                                        break;
                                        
                                    case 6:
                                        posib1.setVisible(true);
                                        posib1.setLayoutX(casillas[vector.get(0)][1]);
                                        posib1.setLayoutY(casillas[vector.get(0)][2]);

                                        posib2.setVisible(true);
                                        posib2.setLayoutX(casillas[vector.get(1)][1]);
                                        posib2.setLayoutY(casillas[vector.get(1)][2]);

                                        posib3.setVisible(true);
                                        posib3.setLayoutX(casillas[vector.get(2)][1]);
                                        posib3.setLayoutY(casillas[vector.get(2)][2]);

                                        posib4.setVisible(true);
                                        posib4.setLayoutX(casillas[vector.get(3)][1]);
                                        posib4.setLayoutY(casillas[vector.get(3)][2]);

                                        posib5.setVisible(true);
                                        posib5.setLayoutX(casillas[vector.get(4)][1]);
                                        posib5.setLayoutY(casillas[vector.get(4)][2]);
                                        
                                        posib6.setVisible(true);
                                        posib6.setLayoutX(casillas[vector.get(5)][1]);
                                        posib6.setLayoutY(casillas[vector.get(5)][2]);
                                        break;
                                        
                                    case 7:
                                       posib1.setVisible(true);
                                        posib1.setLayoutX(casillas[vector.get(0)][1]);
                                        posib1.setLayoutY(casillas[vector.get(0)][2]);

                                        posib2.setVisible(true);
                                        posib2.setLayoutX(casillas[vector.get(1)][1]);
                                        posib2.setLayoutY(casillas[vector.get(1)][2]);

                                        posib3.setVisible(true);
                                        posib3.setLayoutX(casillas[vector.get(2)][1]);
                                        posib3.setLayoutY(casillas[vector.get(2)][2]);

                                        posib4.setVisible(true);
                                        posib4.setLayoutX(casillas[vector.get(3)][1]);
                                        posib4.setLayoutY(casillas[vector.get(3)][2]);

                                        posib5.setVisible(true);
                                        posib5.setLayoutX(casillas[vector.get(4)][1]);
                                        posib5.setLayoutY(casillas[vector.get(4)][2]);
                                        
                                        posib6.setVisible(true);
                                        posib6.setLayoutX(casillas[vector.get(5)][1]);
                                        posib6.setLayoutY(casillas[vector.get(5)][2]);
                                        
                                        posib7.setVisible(true);
                                        posib7.setLayoutX(casillas[vector.get(6)][1]);
                                        posib7.setLayoutY(casillas[vector.get(6)][2]);
                                        break; 
                                              
                                }

                            }

                        });
                        
                        
                    }
                    
                }else if(paquete.getNbestia() != 0){
                    
                    Thread hilobestia = new Thread(){
                        @Override
                        public void run(){
                            Timeline bestia = animacionBestia(paquete.getNbestia());
                            bestia.play();
                        }
                    };
                    
                    hilobestia.start();
                    
                    Thread.sleep(3000);
                    ArrayList<Integer> vector = new ArrayList<>();
                    posibilidades(obtenerI(obtenerNum((int)fichaB.getLayoutX(),(int)fichaB.getLayoutY(),casillas,tab)),obtenerJ(obtenerNum((int)fichaB.getLayoutX(),(int)fichaB.getLayoutY(),casillas,tab)),paquete.getDadoaux(),tab,vector);
                    int rand = (int) Math.floor(Math.random() * vector.size());
                    
                    fichaB.setLayoutX(casillas[vector.get(rand)][1]);
                    fichaB.setLayoutY(casillas[vector.get(rand)][2]);
                    
                    
                }else if(!Objects.equals(paquete.getEstadoEspeciales(), null)){
                    juego.estadoEspeciales = paquete.getEstadoEspeciales();
                    Platform.runLater(new Runnable(){
                        @Override
                        public void run() {
                            
                            if(juego.estadoEspeciales[0] == true) espada1.setVisible(true);
                            else espada1.setVisible(false);
                            
                            if(juego.estadoEspeciales[1] == true) espada2.setVisible(true);
                            else espada2.setVisible(false);
                            
                            if(juego.estadoEspeciales[2] == true) espada3.setVisible(true);
                            else espada3.setVisible(false);
                            
                            if(juego.estadoEspeciales[3] == true) espada4.setVisible(true);
                            else espada4.setVisible(false);
                            
                            if(juego.estadoEspeciales[4] == true) espada5.setVisible(true);
                            else espada5.setVisible(false);
                            
                            if(juego.estadoEspeciales[5] == true) espada6.setVisible(true);
                            else espada6.setVisible(false);
                            
                            if(juego.estadoEspeciales[6] == true) espada7.setVisible(true);
                            else espada7.setVisible(false);
                            
                            if(juego.estadoEspeciales[7] == true) espadaDiam.setVisible(true);
                            else espadaDiam.setVisible(false);
                            
                            if(juego.estadoEspeciales[8] == true) cascoDiam.setVisible(true);
                            else cascoDiam.setVisible(false);
                            
                            if(juego.estadoEspeciales[9] == true) pantalonDiam.setVisible(true);
                            else pantalonDiam.setVisible(false);
                            
                            if(juego.estadoEspeciales[10] == true) botasDiam.setVisible(true);
                            else botasDiam.setVisible(false);
                            
                            if(juego.estadoEspeciales[11] == true) petoDiam.setVisible(true);
                            else petoDiam.setVisible(false);
                            
                            if(juego.estadoEspeciales[12] == true) cuboagua1.setVisible(true);
                            else cuboagua1.setVisible(false);
                            
                            if(juego.estadoEspeciales[13] == true) cuboagua2.setVisible(true);
                            else cuboagua2.setVisible(false);
                            
                            if(juego.estadoEspeciales[14] == true) cuboagua3.setVisible(true);
                            else cuboagua3.setVisible(false);
                            
                            if(juego.estadoEspeciales[15] == true) cuboagua4.setVisible(true);
                            else cuboagua4.setVisible(false);
                            
                            if(juego.estadoEspeciales[16] == true) cuboagua5.setVisible(true);
                            else cuboagua5.setVisible(false);
                            
                            if(juego.estadoEspeciales[17] == true) cuboagua6.setVisible(true);
                            else cuboagua6.setVisible(false);
                            
                            if(juego.estadoEspeciales[18] == true) esmeralda1.setVisible(true);
                            else esmeralda1.setVisible(false);
                            
                            if(juego.estadoEspeciales[19] == true) esmeralda2.setVisible(true);
                            else esmeralda2.setVisible(false);
                            
                            if(juego.estadoEspeciales[20] == true) esmeralda3.setVisible(true);
                            else esmeralda3.setVisible(false);
                            
                            if(juego.estadoEspeciales[21] == true) esmeralda4.setVisible(true);
                            else esmeralda4.setVisible(false);
                            
                            if(juego.estadoEspeciales[22] == true) esmeralda5.setVisible(true);
                            else esmeralda5.setVisible(false);
                            
                            if(juego.estadoEspeciales[23] == true) esmeralda6.setVisible(true);
                            else esmeralda6.setVisible(false);
                            
                            if(juego.estadoEspeciales[24] == true) esmeralda7.setVisible(true);
                            else esmeralda7.setVisible(false);
                            
                            if(juego.estadoEspeciales[25] == true) esmeralda8.setVisible(true);
                            else esmeralda8.setVisible(false);
                        
                        }  
                        
                    });
                
                }else{  //Actualiza el movimiento del jugador
                    System.out.println("Entro a pintar jugador");
                    Platform.runLater(new Runnable(){
                        @Override
                        public void run() {
                            ficha.setLayoutX(paquete.getX());
                            ficha.setLayoutY(paquete.getY());
                        }
                        
                    });
                
                
            }
                
        }   
    } catch (IOException | ClassNotFoundException | InterruptedException ex) {
        System.out.println(ex);
    }
        
    }

    @FXML
    private void objtiendaclick1(MouseEvent event) {
        if(tienda1.getEffect()==color){
           if(verificarTradeo()==true){
               if(tienda1.getImage()==espada) tradear(1);
               if(tienda1.getImage()==esmeralda) tradear(2);
               if(tienda1.getImage()==cuboagua) tradear(3);
               if(tienda1.getImage()==cascoD) tradear(4);
               if(tienda1.getImage()==armaduraD) tradear(5);
               if(tienda1.getImage()==espadaD) tradear(6);
               if(tienda1.getImage()==pantalonD) tradear(7);
               if(tienda1.getImage()==botasD) tradear(8);
           } 
                      
        }
    }

    @FXML
    private void objtiendaclick2(MouseEvent event) {
    }

    @FXML
    private void objtiendaclick3(MouseEvent event) {
    }
    
    public void tradear(int num){
        switch(num){
            case 1:
                for(int i=0;i<8;i++){
                    if(tradeo[i]>0){
                      jugadores.get(juego.numPlayer).getInventario().eliminarObj(i+5); 
                      jugadores.get(juego.numPlayer).getInventario().addInv(-3);
                      tradeo[i]=0;
                    }
                }
            
            case 2:
                for(int i=0;i<8;i++){
                    if(tradeo[i]>0){
                      jugadores.get(juego.numPlayer).getInventario().eliminarObj(i+5); 
                      jugadores.get(juego.numPlayer).getInventario().addInv(-1);
                      tradeo[i]=0;
                    }
                }break;
                
            case 3:
                for(int i=0;i<8;i++){
                    if(tradeo[i]>0){
                      tradeo[i]=0;  
                      jugadores.get(juego.numPlayer).getInventario().eliminarObj(i+5); 
                      jugadores.get(juego.numPlayer).getInventario().addInv(-2);
                    }
                }break;
                
            case 4:
                if(numMarcos()==4){
                    if(jugadores.get(juego.numPlayer).getInventario().verificaCascoD()==false){
                        for(int i=0;i<8;i++){
                            if(tradeo[i]>0){
                                jugadores.get(juego.numPlayer).getInventario().eliminarObj(i+5); 
                            }
                        jugadores.get(juego.numPlayer).getInventario().addInv(-4);
                        }
                    }
                }break;
                
            case 5:
                if(numMarcos()==4){
                    if(jugadores.get(juego.numPlayer).getInventario().verificaPetoD()==false){
                        for(int i=0;i<8;i++){
                            if(tradeo[i]>0){
                                jugadores.get(juego.numPlayer).getInventario().eliminarObj(i+5); 
                            }
                        jugadores.get(juego.numPlayer).getInventario().addInv(-5);
                        }
                    }
                }break;
                
            case 6:
                if(numMarcos()==4){
                    if(jugadores.get(juego.numPlayer).getInventario().verificaEspadaD()==false){
                        for(int i=0;i<8;i++){
                            if(tradeo[i]>0){
                                jugadores.get(juego.numPlayer).getInventario().eliminarObj(i+5); 
                            }
                        jugadores.get(juego.numPlayer).getInventario().addInv(-6);
                        }
                    }
                }break;
                
            case 7:
                if(numMarcos()==4){
                    if(jugadores.get(juego.numPlayer).getInventario().verificaPantalonD()==false){
                        for(int i=0;i<8;i++){
                            if(tradeo[i]>0){
                                jugadores.get(juego.numPlayer).getInventario().eliminarObj(i+5); 
                            }
                        jugadores.get(juego.numPlayer).getInventario().addInv(-7);
                        }
                    }
                }break;
                
            case 8:
                if(numMarcos()==4){
                    if(jugadores.get(juego.numPlayer).getInventario().verificaBotasD()==false){
                        for(int i=0;i<8;i++){
                            if(tradeo[i]>0){
                                jugadores.get(juego.numPlayer).getInventario().eliminarObj(i+5); 
                            }
                        jugadores.get(juego.numPlayer).getInventario().addInv(-8);
                        }
                    }
                }break;
        }
    }
    
    public int numMarcos(){
        int aux=0;
        for(int i=0;i<8;i++){
            if(tradeo[i]>0) aux++;
        }return aux;
    }
    
    public boolean verificarTradeo(){
        int aux=0;
        for(int i=0;i<8;i++){
            if((tradeo[i]>0) && (aux==0)) aux=tradeo[i];
            else if((tradeo[i]>0) && (aux!=tradeo[i])){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setHeaderText(null);
                alert.setTitle("Se ha producido un error");
                alert.setContentText("El juego debe empezar con mínimo 2 jugadores.");
                alert.showAndWait();
                return false;
            }
        }return true;
    }

    private void actualizarInventario(Inventario inventario){
        try(Socket socket = new Socket(Conexion.getIpServer(), 9999)){
            ObjectOutputStream flujo = new ObjectOutputStream(socket.getOutputStream());
            flujo.writeObject(inventario);
            flujo.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    @FXML
    private void clickmarco1(MouseEvent event) {
        marco1.setVisible(false);
        tradeo[0]=0;
    }

    @FXML
    private void clickmarco2(MouseEvent event) {
        marco2.setVisible(false);
        tradeo[1]=0;
    }

    @FXML
    private void clickmarco3(MouseEvent event) {
        marco3.setVisible(false);
        tradeo[2]=0;
    }

    @FXML
    private void clickmarco4(MouseEvent event) {
        marco4.setVisible(false);
        tradeo[3]=0;
    }

    @FXML
    private void clickmarco5(MouseEvent event) {
        marco5.setVisible(false);
        tradeo[4]=0;
    }

    @FXML
    private void clickmarco6(MouseEvent event) {
        marco6.setVisible(false);
        tradeo[5]=0;
    }

    @FXML
    private void clickmarco7(MouseEvent event) {
        marco7.setVisible(false);
        tradeo[6]=0;
    }

    @FXML
    private void clickmarco8(MouseEvent event) {
        marco8.setVisible(false);
        tradeo[7]=0;
    }
    
    private int obtenerNum(int x, int y,int casillas[][], int tab[][]){
        if(x == 765 && y == 605) return 178;
            for(int i=0; i < 179; i++){
                if((casillas[i][1]==x) && (casillas[i][2]==y)) return i;
            }
            return -1;
        }
        
    private int obtenerI(int num){
        for(int i=0;i<17;i++){
            for(int j=0;j<28;j++){
                if(tab[i][j]==num) return i;
            }
        }
        return -1;
    }

    private int obtenerJ(int num){
        for(int i=0;i<17;i++){
            for(int j=0;j<28;j++){
                if(tab[i][j]==num) return j;
            }
        }
        return -1;
    }
    
    private int safe(int x, int y, int tab[][]){
        if((x<0) || (y<0) || (x>16) || (y>27) || (tab[x][y]<0)) return 0;
        return 1;
    }

    private void posibilidades(int x, int y, int dado,int[][] tab, ArrayList vector){
        if(safe(x,y,tab)==0){
            return;
        }
        if (dado==0){
            vector.add(tab[x][y]);
            return;
        }
        tab[x][y]*=-1;
        //arriba
        posibilidades(x-1,y,dado-1,tab,vector);

        //abajo
        posibilidades(x+1,y,dado-1,tab,vector);        

        //derecha
        posibilidades(x,y+1,dado-1,tab,vector);        

        //izquierda
        posibilidades(x,y-1,dado-1,tab,vector);
        tab[x][y]*=-1;
        return;
    }
    
    private void updateInventario(int player){
        int[] inventario = jugadores.get(player).getInventario().getArrayInventario();
        
        fichainv.setImage(new Image(jugadores.get(player).getSkin()));
        for(int i = 0; i < 13; i++){
            if((inventario[i] >0 && inventario[i] < 8) || inventario[i]==-3){
                meterEnInventario(espada); 
            }
            else if((inventario[i] > 12 && inventario[i] < 19) || inventario[i]==-2){
                meterEnInventario(cuboagua);  
            }
            else if((inventario[i] > 18 && inventario[i] < 27) || inventario[i]==-1){
                meterEnInventario(esmeralda); 
            }
            if(inventario[i]==8 || inventario[i]==-6) 
                Platform.runLater(new Runnable(){
                    @Override
                    public void run() {
                        espadainv.setImage(espadaD);
                    }
                });
            else if(inventario[i]==9 || inventario[i]==-4) 
                Platform.runLater(new Runnable(){
                    @Override
                    public void run() {
                        cascoinv.setImage(cascoD);
                    }
                });
                
            else if(inventario[i]==10 || inventario[i]==-7) 
                Platform.runLater(new Runnable(){
                    @Override
                    public void run() {
                        pantaloninv.setImage(pantalonD);
                    }
                });
            else if(inventario[i]==11 || inventario[i]==-8) 
                Platform.runLater(new Runnable(){
                    @Override
                    public void run() {
                        botasinv.setImage(botasD);
                    }
                });
            else if(inventario[i]==12 || inventario[i]==-5)
                Platform.runLater(new Runnable(){
                    @Override
                    public void run() {
                        petoinv.setImage(armaduraD);
                    }
                });
        } 
    }
    
    private void llegada(int num){
        System.out.println("LLEGUE Y MI NUMERO ES: " + num);
        switch (num){
            case 24:
                if(juego.estadoEspeciales[0]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(1)) {
                    juego.estadoEspeciales[0] = false;
                }
                break;

            case 30:
                if(juego.estadoEspeciales[1]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(2)) {
                    juego.estadoEspeciales[1] = false;
                }
                break;

            case 49:
                if(juego.estadoEspeciales[2]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(3)) {
                    juego.estadoEspeciales[2] = false;
                }
                break;

            case 57:
                if(juego.estadoEspeciales[3]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(4)) {
                    juego.estadoEspeciales[3] = false;
                }
                break;

            case 83:
                if(juego.estadoEspeciales[4]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(5)) {
                    juego.estadoEspeciales[4] = false;
                }
                break;

            case 125:
                if(juego.estadoEspeciales[5]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(6)) {
                    juego.estadoEspeciales[5] = false;
                }
                break;

            case 162:
                if(juego.estadoEspeciales[6]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(7)) {
                    juego.estadoEspeciales[6] = false;
                }
                break;

            case 174:
                if(juego.estadoEspeciales[7]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(8)) {
                    juego.estadoEspeciales[7] = false;
                }
                break;

            case 173:
                if(juego.estadoEspeciales[8]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(9)) {
                    juego.estadoEspeciales[8] = false;
                }
                break;

            case 170:
                if(juego.estadoEspeciales[9]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(10)){
                    juego.estadoEspeciales[9] = false;
                }
                break;

            case 172:
                if(juego.estadoEspeciales[10]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(11)){
                    juego.estadoEspeciales[10] = false;
                }
                break;

            case 171:
                if(juego.estadoEspeciales[11]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(12)){
                    juego.estadoEspeciales[11] = false;
                }
                break;

            case 32:
                if(juego.estadoEspeciales[12]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(13)) {
                    juego.estadoEspeciales[12] = false;
                }
                break;

            case 51:
                if(juego.estadoEspeciales[13]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(14)) {
                    juego.estadoEspeciales[13] = false;
                }
                break;

            case 141:
                if(juego.estadoEspeciales[14]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(15)){
                    juego.estadoEspeciales[14] = false;
                }
                break;

            case 119:
                if(juego.estadoEspeciales[15]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(16)) {
                    juego.estadoEspeciales[15] = false;
                }
                break;

            case 100:
                if(juego.estadoEspeciales[16]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(17)) {
                    juego.estadoEspeciales[16] = false;
                }
                break;

            case 79:
                if(juego.estadoEspeciales[17]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(18)) {
                    juego.estadoEspeciales[17] = false;
                }
                break;

            case 58:
                if(juego.estadoEspeciales[18]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(19)){
                    juego.estadoEspeciales[18] = false;
                }
                break;

            case 133:
                if(juego.estadoEspeciales[19]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(20)) {
                    juego.estadoEspeciales[19] = false;
                }
                break;

            case 128:
                if(juego.estadoEspeciales[20]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(21)) {
                    juego.estadoEspeciales[20] = false;
                }
                break;

            case 108:
                if(juego.estadoEspeciales[21]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(22)) {
                    juego.estadoEspeciales[21] = false;
                }
                break;

            case 90:
                if(juego.estadoEspeciales[22]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(23)) {
                    juego.estadoEspeciales[22] = false;
                }
                break;

            case 63:
                if(juego.estadoEspeciales[23]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(24)){
                    juego.estadoEspeciales[23] = false;
                }
                break;

            case 54:
                if(juego.estadoEspeciales[24]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(25)) {
                    juego.estadoEspeciales[24] = false;
                }
                break;

            case 154:
                if(juego.estadoEspeciales[25]==false) break;
                if(jugadores.get(juego.numPlayer).getInventario().addInv(26)) {
                    juego.estadoEspeciales[25] = false;
                }
                break;

            case 161:
                maxTurno++;
                if(maxTurno < 2){
                    posib1.setLayoutX(685);  //80
                    posib1.setLayoutY(85);
                    posib1.setVisible(true);

                    posib2.setLayoutX(965);  //104
                    posib2.setLayoutY(245);
                    posib2.setVisible(true);

                    posib3.setLayoutX(645);  //151
                    posib3.setLayoutY(605);
                    posib3.setVisible(true);

                    posib4.setLayoutX(325);  //45
                    posib4.setLayoutY(405);
                    posib4.setVisible(true);
                }
                break;

            case 45:
                maxTurno++;
                if(maxTurno < 2){
                    posib1.setLayoutX(685);  //161
                    posib1.setLayoutY(325);
                    posib1.setVisible(true);

                    posib2.setLayoutX(645);  //151
                    posib2.setLayoutY(605);
                    posib2.setVisible(true);
                    
                }
                break;

            case 80:
                maxTurno++;
                if(maxTurno < 2){
                    posib1.setLayoutX(685);  //161
                    posib1.setLayoutY(325);
                    posib1.setVisible(true);

                    posib2.setLayoutX(965);  //104
                    posib2.setLayoutY(245);
                    posib2.setVisible(true);
                }
                break;

            case 151:
                maxTurno++;
                if(maxTurno < 2){
                    posib1.setLayoutX(685);  //161
                    posib1.setLayoutY(325);
                    posib1.setVisible(true);

                    posib2.setLayoutX(325);  //45
                    posib2.setLayoutY(405);
                    posib2.setVisible(true);
                }
                
                break;

            case 104:
                maxTurno++;
                if(maxTurno < 2){
                    posib1.setLayoutX(685);  //161
                    posib1.setLayoutY(325);
                    posib1.setVisible(true);

                    posib2.setLayoutX(685);  //80
                    posib2.setLayoutY(85);
                    posib2.setVisible(true);
                }
                
                break;

            case 1:
                if(jugadores.get(juego.numPlayer).getInventario().verificarAgua()){
                    jugadores.get(juego.numPlayer).getInventario().eliminarAgua(juego.estadoEspeciales);
                }else{
                    muere();
                }break;

            case 12:
                if(jugadores.get(juego.numPlayer).getInventario().verificarAgua()){
                    jugadores.get(juego.numPlayer).getInventario().eliminarAgua(juego.estadoEspeciales);
                }else{
                    muere();
                }break;

            case 17:
                if(jugadores.get(juego.numPlayer).getInventario().verificarAgua()){
                    jugadores.get(juego.numPlayer).getInventario().eliminarAgua(juego.estadoEspeciales);
                }else{
                    muere();
                }break;

            case 36:
                if(jugadores.get(juego.numPlayer).getInventario().verificarAgua()){
                    jugadores.get(juego.numPlayer).getInventario().eliminarAgua(juego.estadoEspeciales);
                }else{
                    muere();
                }break;

            case 66:
                if(jugadores.get(juego.numPlayer).getInventario().verificarAgua()){
                    jugadores.get(juego.numPlayer).getInventario().eliminarAgua(juego.estadoEspeciales);
                }else{
                    muere();
                }break;

            case 87:
                if(jugadores.get(juego.numPlayer).getInventario().verificarAgua()){
                    jugadores.get(juego.numPlayer).getInventario().eliminarAgua(juego.estadoEspeciales);
                }else{
                    muere();
                }break;

            case 114:
                if(jugadores.get(juego.numPlayer).getInventario().verificarAgua()){
                    jugadores.get(juego.numPlayer).getInventario().eliminarAgua(juego.estadoEspeciales);
                }else{
                    muere();
                }break;

            case 145:
                if(jugadores.get(juego.numPlayer).getInventario().verificarAgua()){
                    jugadores.get(juego.numPlayer).getInventario().eliminarAgua(juego.estadoEspeciales);
                }else{
                    muere();
                }break;

            case 152:
                if(jugadores.get(juego.numPlayer).getInventario().verificarAgua()){
                    jugadores.get(juego.numPlayer).getInventario().eliminarAgua(juego.estadoEspeciales);
                }else{
                    muere();
                }break;

            case 164:
                if(jugadores.get(juego.numPlayer).getInventario().verificarAgua()){
                    jugadores.get(juego.numPlayer).getInventario().eliminarAgua(juego.estadoEspeciales);
                }else{
                    muere();
                }break;

            case 168:
                tienda1.setEffect(color);
                tienda2.setEffect(color);
                tienda3.setEffect(color);
                break;

            case 169:
                //CARGAR VISTA
                break;
        }
    }

    private void muere(){
        ficha.setVisible(false);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        ficha.setLayoutX(765);
        ficha.setLayoutY(605);
        ficha.setVisible(true);
        juego.primerTiro = true;
        jugadores.get(juego.numPlayer).getInventario().borrar(juego.estadoEspeciales);
        enviarPaquete(new Packet(765,605, juego.numPlayer));
    }

    @FXML
    private void clickposib6(MouseEvent event) {
        if (ficha.getLayoutX() == 485 && ficha.getLayoutY() == 285){
            tienda1.setEffect(blancoynegro);
            tienda2.setEffect(blancoynegro);
            tienda3.setEffect(blancoynegro);
        }
        int x = (int) posib6.getLayoutX();
        int y = (int) posib6.getLayoutY();
        enviarPaquete(new Packet( x, y, juego.numPlayer));
        posib1.setVisible(false);
        posib2.setVisible(false);
        posib3.setVisible(false);
        posib4.setVisible(false);
        posib5.setVisible(false);
        posib6.setVisible(false);
        posib7.setVisible(false);
        llegada(obtenerNum(x,y, casillas, tab));
        enviarPaquete(new Packet(juego.estadoEspeciales));
        actualizarInventario(new Inventario(jugadores.get(juego.numPlayer).getInventario().getArrayInventario(), juego.numPlayer));
        if(maxTurno < 2) enviarPaquete(new Packet(juego.numPlayer, 0, numdado, nbestia, null, juego.primerTiro));
    }

    @FXML
    private void clickposib7(MouseEvent event) {
        if (ficha.getLayoutX() == 485 && ficha.getLayoutY() == 285){
            tienda1.setEffect(blancoynegro);
            tienda2.setEffect(blancoynegro);
            tienda3.setEffect(blancoynegro);
        }
        int x = (int) posib7.getLayoutX();
        int y = (int) posib7.getLayoutY();
        enviarPaquete(new Packet( x, y, juego.numPlayer));
        posib1.setVisible(false);
        posib2.setVisible(false);
        posib3.setVisible(false);
        posib4.setVisible(false);
        posib5.setVisible(false);
        posib6.setVisible(false);
        posib7.setVisible(false);
        llegada(obtenerNum(x,y, casillas, tab));
        enviarPaquete(new Packet(juego.estadoEspeciales));
        actualizarInventario(new Inventario(jugadores.get(juego.numPlayer).getInventario().getArrayInventario(), juego.numPlayer));
        if(maxTurno < 2) enviarPaquete(new Packet(juego.numPlayer, 0, numdado, nbestia, null, juego.primerTiro));
    }

    @FXML
    private void ficha1abajo(MouseEvent event) {
    }

    @FXML
    private void ficha2abajo(MouseEvent event) {
    }

    @FXML
    private void ficha3abajo(MouseEvent event) {
    }

    @FXML
    private void ficha4abajo(MouseEvent event) {
    }

    @FXML
    private void ficha5abajo(MouseEvent event) {
    }

    @FXML
    private void ficha6abajo(MouseEvent event) {
    }

    @FXML
    private void suelta1click(MouseEvent event) {
    }

    @FXML
    private void suelta2click(MouseEvent event) {
    }

    @FXML
    private void suelta3click(MouseEvent event) {
    }

    @FXML
    private void suelta4click(MouseEvent event) {
    }

    @FXML
    private void suelta5click(MouseEvent event) {
    }

    @FXML
    private void suelta6click(MouseEvent event) {
    }

    @FXML
    private void suelta7click(MouseEvent event) {
    }

    @FXML
    private void suelta8click(MouseEvent event) {
    }

    @FXML
    private void suelta9click(MouseEvent event) {
    }

    @FXML
    private void suelta10click(MouseEvent event) {
    }

    @FXML
    private void suelta11click(MouseEvent event) {
    }

    @FXML
    private void suelta12click(MouseEvent event) {
    }

    @FXML
    private void suelta13click(MouseEvent event) {
    }

    @FXML
    private void clickinv1(MouseEvent event) {
        if((tienda1.getEffect()==color) && (inv1.getImage()!=null) && numMarcos()<4){
            marco1.setVisible(true);
            if(inv1.getImage()==espada) tradeo[0]=1;
            else if(inv1.getImage()==esmeralda) tradeo[0]=2;
            else if(inv1.getImage()==cuboagua) tradeo[0]=3;
        }
    }

    @FXML
    private void clickinv2(MouseEvent event) {
        if((tienda1.getEffect()==color) && (inv2.getImage()!=null) && numMarcos()<4){
            marco2.setVisible(true);
            if(inv2.getImage()==espada) tradeo[1]=1;
            else if(inv2.getImage()==esmeralda) tradeo[1]=2;
            else if(inv2.getImage()==cuboagua) tradeo[1]=3;
        }
    }

    @FXML
    private void clickinv3(MouseEvent event) {
        if((tienda1.getEffect()==color) && (inv3.getImage()!=null) && numMarcos()<4){
            marco3.setVisible(true);
            if(inv3.getImage()==espada) tradeo[2]=1;
            else if(inv3.getImage()==esmeralda) tradeo[2]=2;
            else if(inv3.getImage()==cuboagua) tradeo[2]=3;
        }
    }

    @FXML
    private void clickinv4(MouseEvent event) {
        if((tienda1.getEffect()==color) && (inv4.getImage()!=null) && numMarcos()<4){
            marco4.setVisible(true);
            if(inv4.getImage()==espada) tradeo[3]=1;
            else if(inv4.getImage()==esmeralda) tradeo[3]=2;
            else if(inv4.getImage()==cuboagua) tradeo[3]=3;
        }
    }

    @FXML
    private void clickinv5(MouseEvent event) {
        if((tienda1.getEffect()==color) && (inv5.getImage()!=null) && numMarcos()<4){
            marco5.setVisible(true);
            if(inv5.getImage()==espada) tradeo[4]=1;
            else if(inv5.getImage()==esmeralda) tradeo[4]=2;
            else if(inv5.getImage()==cuboagua) tradeo[4]=3;
        }
    }

    @FXML
    private void clickinv6(MouseEvent event) {
        if((tienda1.getEffect()==color) && (inv6.getImage()!=null) && numMarcos()<4){
            marco6.setVisible(true);
            if(inv6.getImage()==espada) tradeo[5]=1;
            else if(inv6.getImage()==esmeralda) tradeo[5]=2;
            else if(inv6.getImage()==cuboagua) tradeo[5]=3;
        }
    }

    @FXML
    private void clickinv7(MouseEvent event) {
        if((tienda1.getEffect()==color) && (inv7.getImage()!=null) && numMarcos()<4){
            marco7.setVisible(true);
            if(inv7.getImage()==espada) tradeo[6]=1;
            else if(inv7.getImage()==esmeralda) tradeo[6]=2;
            else if(inv7.getImage()==cuboagua) tradeo[6]=3;
        }
    }

    @FXML
    private void clickinv8(MouseEvent event) {
        if((tienda1.getEffect()==color) && (inv8.getImage()!=null) && numMarcos()<4){
            marco8.setVisible(true);
            if(inv8.getImage()==espada) tradeo[7]=1;
            else if(inv8.getImage()==esmeralda) tradeo[7]=2;
            else if(inv8.getImage()==cuboagua) tradeo[7]=3;
        }
    }
    


    
    //////////////////////Clase Juego//////////////////////////////
    
    class Juego implements Runnable, Serializable{

            
        private int numPlayer, s; //segundos del timer
        private int ganador;   //tiene que ser 1 si alguien gana
        private boolean tiro, primerTiro; //Si primerTiro = true, se lleva al centro del mapa cuando sea su turno;
        private boolean[] estadoEspeciales; //True en las que se muestran y false en las que no
        
        public Juego(){ 
            jugadores.get(0).setTurno(true);
            ganador = -1;
            numPlayer = 0;
            tiro = false;
            primerTiro = true;
            estadoEspeciales = new boolean[26];
            for(int i = 0; i < 26; i++) estadoEspeciales[i] = true;
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
            try {
                ServerSocket server = new ServerSocket(5555);
                while(true){
                    Socket socket = server.accept();
                    ObjectInputStream flujo = new ObjectInputStream(socket.getInputStream());
                    Inventario paquete = (Inventario) flujo.readObject();
                    flujo.close();
                    socket.close();
                    
                    jugadores.get(paquete.getNumPlayer()).setInventario(paquete);
                }
                
            } catch (IOException | ClassNotFoundException ex) {
                System.out.println(ex);
            }
        }
    
    }
    
}
