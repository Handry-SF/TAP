package panelesconherencia;

import javax.swing.JFrame;

/**
 *
 * @author LENOVO
 */
public class PanelesConHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame f = new JFrame("Constructores y Paneles");
        PanelHerencia panel = new PanelHerencia();
        f.setSize(800, 600);
        f.setLocation(100, 100);
        f.add(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
}
