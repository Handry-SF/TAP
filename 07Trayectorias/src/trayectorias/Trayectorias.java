package trayectorias;

import javax.swing.JFrame;
import modelos.Planetas;

/**
 *
 * @author LENOVO
 */
public class Trayectorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Planetas planetas = new Planetas();
        PanelTrayectorias panel = new PanelTrayectorias(planetas);
        JFrame f = new JFrame("Trayectorias");
        f.setSize(800,600);
        f.setLocation(100,100);
        f.add(panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    
}
