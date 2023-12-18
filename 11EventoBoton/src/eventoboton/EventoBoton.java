package eventoboton;

import javax.swing.JFrame;

/**
 *
 * @author Handry Serrano Fabela
 */
public class EventoBoton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame f = new JFrame("Eventos de Botón");
        PanelEventoBoton panel = new PanelEventoBoton();
        OyenteEventoBoton oyente = new OyenteEventoBoton(panel);
        panel.addEventos(oyente);
        f.setSize(800,600);
        f.setLocation(100,100);
        f.add(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
}
