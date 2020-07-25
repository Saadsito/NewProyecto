package proyect;

import java.util.ArrayList;

/**
 *
 * @author migue
 */
public class JugadorConexion extends Conexion implements Runnable{
    
    private ArrayList<Player> jugadores;

    @Override
    public ArrayList<Player> getJugadores() {
        return jugadores;
    }
    
    public JugadorConexion(int puerto) {
        super(puerto);
    }
    
    @Override
    public void run(){  //Recibir actualizado lista de jugadores 
        Conexion conexion = new Conexion(7000);
        while(true){
            jugadores = conexion.actualizarListaRecibir();
        }
        
    }
    
}
