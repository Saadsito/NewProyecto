package proyect;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Servidor{

    
    public static void main(String[] args) {
        
        ServerInicio inicio = new ServerInicio(7777);
        
        Thread hilo = new Thread(inicio);
        hilo.setName("Hilo servidor");
        hilo.start();   //Abre el servidor en el puerto 7777
        
        inicio.actualizarJugador();   
        
        Thread hiloInventario = new Thread(){
            @Override
            public void run(){
                try {
                    inicio.updateInventario();
                } catch (IOException | ClassNotFoundException ex) {
                    System.out.println(ex);
                }
            }
        };
        
        hiloInventario.start();
        
        System.out.println("Iniciando Tablero");
        try {
            inicio.updateTablero();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    
    
    
}




