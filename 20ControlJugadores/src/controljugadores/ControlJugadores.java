package controljugadores;

import modelos.Jugadores;

/**
 *
 * @author LENOVO
 */
public class ControlJugadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jugadores modelo = new Jugadores();
        VentanaJugadores f = new VentanaJugadores(modelo);
        OyenteJugadores oyente = new OyenteJugadores(modelo, f);
        f.addEventos(oyente);
        f.setSize(800,600);
        f.setLocation(100,100);
        f.setVisible(true);
        
    }
    
}
