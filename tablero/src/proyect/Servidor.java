package proyect;


public class Servidor{

    
    public static void main(String[] args) {
        
        ServerInicio inicio = new ServerInicio(7777);
        Thread hilo = new Thread(inicio);
        hilo.setName("Hilo servidor");
        hilo.start();
        inicio.abrirRecibirJugador();   //Abre el servidor en el puerto 7777
        
        
        
    }
    
    
    
    
}




