package rebotes;

import javax.swing.JFrame;
import modelos.Circulos;
import vistas.PanelDibujable;

/**
 *
 * @author LENOVO
 */
public class Rebotes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circulos circulos = new Circulos();
        PanelDibujable panel = new PanelDibujable(circulos);
        OyenteRebotes oyente = new OyenteRebotes(circulos, panel);
        panel.addEventos(oyente);
        JFrame f = new JFrame("Rebotes");
        f.setSize(800,600);
        f.setLocation(100,100);
        f.add(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
}
